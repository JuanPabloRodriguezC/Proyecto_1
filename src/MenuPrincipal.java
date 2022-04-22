import javax.swing.*;
import java.awt.*;

public class MenuPrincipal extends JFrame{

    private JPanel panelMenu;
    private JTextField textField1;
    private JButton jugarButton;

    public MenuPrincipal(String titulo){
        super(titulo);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(800, 800));
        this.setContentPane(panelMenu);
        this.pack();
    }

    public static void main(String[] args){
        //se crea el frame que contiene el panel del juego
        JFrame frame = new MenuPrincipal("Juego de Memoria");
        frame.setVisible(true);
    }
}
