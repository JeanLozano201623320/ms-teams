package proyectoconcurrente;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
public class PanelBall extends JPanel {
    private MiX x;
    private MiY y;
    private NumeroBall n;
    private BufferedImage ima;
   
    public PanelBall(MiX x,MiY y, NumeroBall n){
       this.ima=ima;
        this.x=x;
       this.y=y;
       this.n=n;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.white);
         g2.fill(new Ellipse2D.Double(x.getX(),y.getY(),20,20));
         g2.setColor(Color.black);
        g2.drawString(String.valueOf(n.getConta()), x.getX()+8, y.getY()+15);
        
       
    }
}