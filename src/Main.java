import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        PanelDibujo panel=new PanelDibujo();
        JFrame aplicacion=new JFrame();
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplicacion.add(panel);
        aplicacion.setSize(250,250);
        aplicacion.setVisible(true);
    }
}
