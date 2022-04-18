import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Interfaz extends JFrame{
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

        //Crea una lista  de doble enlace de Nodos tipo files
        listaDblEnlace nLista = new listaDblEnlace();
        File dir = new File("/Users/juanpablorodriguez/IdeaProjects/CE1103-Proyecto_1/img/Farm animals");
        Matriz nuevaMatriz = new Matriz( 5, 2);
        Node[][] matriz = nuevaMatriz.getMatrix(nLista.addFiles(dir.listFiles()));


        //Configura la imagen del label utilizando los files de la lista, convirtiendolos primero a Strings
        Card1.setIcon(new ImageIcon(matriz[0][1].getData().toString()));
        Card2.setIcon(new ImageIcon(matriz[1][0].getData().toString()));
        Card3.setIcon(new ImageIcon(matriz[0][1].getData().toString()));
        Card4.setIcon(new ImageIcon(matriz[0][0].getData().toString()));
        Card5.setIcon(new ImageIcon(matriz[0][0].getData().toString()));
        Card6.setIcon(new ImageIcon(matriz[0][0].getData().toString()));Card1.setIcon(new ImageIcon(matriz[0][0].getData().toString()));



    }

    public static void main(String[] args){
        //se crea el frame que contiene el panel del juego
        JFrame frame = new Interfaz("Juego de Memoria");
        frame.setVisible(true);
    }

}
