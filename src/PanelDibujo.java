import javax.swing.*;
import java.awt.*;

public class PanelDibujo extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int ancho=getWidth();
        int alto=getHeight();

        g.drawLine(0,0,ancho,alto);
        g.drawLine(50,alto,ancho,50);
        g.drawString("Francisco",20,20);
        g.fillOval(15,15,25,25);
        g.drawRect(25,30,150,150);
        g.drawArc(25,14,26,178,25,14);
        g.fillPolygon((2,6,43),3);
    }

}
