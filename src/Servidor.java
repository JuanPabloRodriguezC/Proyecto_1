import javax.swing.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor extends Observable implements Runnable{
    private int puerto;

    public Servidor(int puerto){
        this.puerto = puerto;
    }


    @Override
    public void run() {
        ServerSocket servidor = null;
        Socket sc = null;


        try{
            servidor = new ServerSocket(puerto);
            System.out.println("servidor iniciado");

            while(true){
                sc = servidor.accept();
                System.out.println("Servidor conectado");


                ObjectInputStream ois = new ObjectInputStream(sc.getInputStream());
                JLabel label = (JLabel) ois.readObject();


                sc.close();
                System.out.println("Servidor desconectado");
            }

        }catch(IOException ex){
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
