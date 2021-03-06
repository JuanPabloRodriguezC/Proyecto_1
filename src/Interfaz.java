import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.Observable;
import java.util.Observer;

public class Interfaz extends JFrame implements MouseListener, Observer {
    private JPanel panelPrincipal;
    private JLabel Card1;
    private JLabel Card2;
    private JLabel Card3;
    private JLabel Card4;
    private JLabel Card5;
    private JLabel Card6;
    private JLabel Card8;
    private JLabel Card9;
    private JLabel Card7;
    private JLabel Card12;
    private JLabel Card11;
    private JLabel Card10;

    public Interfaz(String titulo){
        //titulo de la ventana
        super(titulo);
        //protocolo de cerrado
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(800, 800));
        this.setContentPane(panelPrincipal);
        this.pack();

        Servidor s = new Servidor(40000);
        s.addObserver(this);
        Thread t = new Thread(s);
        t.start();


        //Crea una lista  de doble enlace de Nodos tipo files
        listaDblEnlace nLista = new listaDblEnlace();
        File dir = new File("/Users/juanpablorodriguez/IdeaProjects/CE1103-Proyecto_1/img/Rocketships");
        nLista.addFiles(dir.listFiles());
        nLista.cardStage();
        Matriz nuevaMatriz = new Matriz( 2, 5);

        //Node[][] matriz = nuevaMatriz.getMatrix(nLista);


        //Configura la imagen del label utilizando los files de la lista, convirtiendolos primero a Strings
        /*
        Card1.setIcon(new ImageIcon(matriz[0][0].getData().toString()));
        Card2.setIcon(new ImageIcon(matriz[0][1].getData().toString()));
        Card3.setIcon(new ImageIcon(matriz[0][2].getData().toString()));
        Card4.setIcon(new ImageIcon(matriz[0][3].getData().toString()));
        Card5.setIcon(new ImageIcon(matriz[0][4].getData().toString()));
        Card6.setIcon(new ImageIcon(matriz[1][0].getData().toString()));
        Card7.setIcon(new ImageIcon(matriz[1][1].getData().toString()));
        Card8.setIcon(new ImageIcon(matriz[1][2].getData().toString()));
        Card9.setIcon(new ImageIcon(matriz[1][3].getData().toString()));
        Card10.setIcon(new ImageIcon(matriz[1][4].getData().toString()));

         */
    }



    public static void main(String[] args){
        //se crea el frame que contiene el panel del juego
        JFrame frame = new Interfaz("Juego de Memoria");
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JLabel label = (JLabel) e.getSource();
        System.out.print("Mouse was clicked");
        label.setIcon(new ImageIcon("/Users/juanpablorodriguez/IdeaProjects/CE1103-Proyecto_1/img/doubts-button.png"));
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void update(Observable o, Object arg) {
        Card1 = (JLabel) arg;
        //.setIcon(new ImageIcon("/Users/juanpablorodriguez/IdeaProjects/CE1103-Proyecto_1/img/doubts-button.png"));
    }

}
