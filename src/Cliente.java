import javax.swing.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente implements Runnable{
    private int puerto;
    private JLabel label;


    public Cliente(int puerto, JLabel label){
        this.puerto = puerto;
        this.label = label;
    }

    @Override
    public void run() {
        final String Host = "127.0.0.1";

        try{
            Socket sc = new Socket(Host, puerto);
            ObjectOutputStream oos = new ObjectOutputStream(sc.getOutputStream());
            oos.writeObject(label);
            oos.close();


            sc.close();
        }catch(IOException ex){
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
