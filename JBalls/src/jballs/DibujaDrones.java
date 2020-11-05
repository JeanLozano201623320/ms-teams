package jballs;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
   
public class DibujaDrones extends JPanel{  
    private int x;
    private int y;
    private NumDron n;
    private BufferedImage ima;
    DibujaDrones(int x,int y,NumDron n, BufferedImage ima){
        setBackground(Color.WHITE);
        this.ima=ima;
        this.x=x;
        this.y=y;
        this.n=n;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(ima, 0, 0, this);
        g2.setColor(Color.black);
        g2.fill(new Rectangle2D.Double(600,0,10,700));
        g2.fill(new Ellipse2D.Double(x,y, 20, 20));
        g2.setColor(Color.white);
        g2.drawString(String.valueOf(n.getConta()),x+8,y+12);
        
    }
}
