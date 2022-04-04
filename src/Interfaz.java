import javax.swing.*;
import java.awt.*;

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

        Image img = new ImageIcon("img/Farm animals/animal.png").getImage();
        Card1.setIcon(new ImageIcon(img));

        Image img2 = new ImageIcon("img/Farm animals/chicken.png").getImage();
        Card2.setIcon(new ImageIcon(img2));

        Image img3 = new ImageIcon("img/Farm animals/cow.png").getImage();
        Card3.setIcon(new ImageIcon(img3));

        Image img4 = new ImageIcon("img/Farm animals/duck.png").getImage();
        Card4.setIcon(new ImageIcon(img4));

        Image img5 = new ImageIcon("img/Farm animals/farm.png").getImage();
        Card5.setIcon(new ImageIcon(img5));



    }

    public static void main(String[] args){
        //se crea el frame que contiene el panel del juego
        JFrame frame = new Interfaz("Juego de Memoria");
        frame.setVisible(true);


    }

}
