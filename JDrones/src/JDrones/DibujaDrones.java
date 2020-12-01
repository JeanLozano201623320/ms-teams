package JDrones;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.util.ArrayList;
public class DibujaDrones extends JPanel{
    private int x;
    private int y;
    private boolean band= false;
    private NumDron n;
    private BufferedImage ima;
    private ArrayList<Ellipse2D> circulos;
    public static int opc;
    DibujaDrones(BufferedImage ima){
        setBackground(Color.GRAY);
        this.ima=ima;
        this.x=x;
        this.y=y;
        this.n=n;
        circulos= new ArrayList<Ellipse2D>();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(ima, 0, 0, this);
        g2.setColor(Color.gray);
        //rectangulos
        switch (JDrones.contador){
            case 2:
                g2.fill(new Rectangle2D.Double(672, 0, 5, 672));//horizontal
                    
            break;
            case 3:
                 g2.fill(new Rectangle2D.Double(672, 0, 5, 672));//horizontal
                
                g2.fill(new Rectangle2D.Double(0, 299, 1344, 5));
            break;
            case 4:
                 g2.fill(new Rectangle2D.Double(672, 0, 5, 672));//horizontal
                 
                g2.fill(new Rectangle2D.Double(0, 199, 1344, 5));
                g2.fill(new Rectangle2D.Double(0, 399, 1344, 5));

            break;
            case 5:
                 g2.fill(new Rectangle2D.Double(672, 0, 5, 672));//horizontal
                 
                g2.fill(new Rectangle2D.Double(0, 149, 1344, 5));
                g2.fill(new Rectangle2D.Double(0, 299, 1344, 5));
                g2.fill(new Rectangle2D.Double(0, 449, 1344, 5));
            break;
            case 6:
                 g2.fill(new Rectangle2D.Double(672, 0, 5, 672));//horizontal
                 
                g2.fill(new Rectangle2D.Double(0, 119, 1344, 5));
                g2.fill(new Rectangle2D.Double(0, 239, 1344, 5));
                g2.fill(new Rectangle2D.Double(0, 359, 1344, 5));
                g2.fill(new Rectangle2D.Double(0, 479, 1344, 5));
            break;
            case 7:
                 g2.fill(new Rectangle2D.Double(672, 0, 5, 672));//horizontal
                 
                g2.fill(new Rectangle2D.Double(0, 119, 1344, 5));
                g2.fill(new Rectangle2D.Double(0, 239, 1344, 5));
                g2.fill(new Rectangle2D.Double(0, 359, 1344, 5));
                g2.fill(new Rectangle2D.Double(0, 479, 1344, 5));
            break;
        }
       for(Ellipse2D c:circulos){ 
              g2.setColor(Color.BLUE);
                    c.setFrame(coord.x1, coord.y1, 20, 20);
                     g2.fill((Ellipse2D)c);
                if(JDrones.nu>=2){
                    g2.setColor(Color.RED);
                    c.setFrame(coord.x2, coord.y2, 20, 20);
                     g2.fill((Ellipse2D)c);
                      }
                if(JDrones.nu>=3){
                    g2.setColor(Color.YELLOW);
                    c.setFrame(coord.x3, coord.y3, 20, 20);
                     g2.fill((Ellipse2D)c);
                      }
                if(JDrones.nu>=4){
                    g2.setColor(Color.GREEN);
                    c.setFrame(coord.x4, coord.y4, 20, 20);
                     g2.fill((Ellipse2D)c);
                      }
                if(JDrones.nu>=5){
                    g2.setColor(Color.CYAN);
                    c.setFrame(coord.x5, coord.y5, 20, 20);
                     g2.fill((Ellipse2D)c);
                      }
                if(JDrones.nu>=6){
                    g2.setColor(Color.MAGENTA);
                    c.setFrame(coord.x6, coord.y6, 20, 20);
                     g2.fill((Ellipse2D)c);
                      }
                if(JDrones.nu>=7){
                    g2.setColor(Color.LIGHT_GRAY);
                    c.setFrame(coord.x7, coord.y7, 20, 20);
                     g2.fill((Ellipse2D)c);
                      }
                if(JDrones.nu>=8){
                    g2.setColor(Color.PINK);
                    c.setFrame(coord.x8, coord.y8, 20, 20);
                     g2.fill((Ellipse2D)c);
                      }
                if(JDrones.nu>=9){
                    g2.setColor(Color.ORANGE);
                    c.setFrame(coord.x9, coord.y9, 20, 20);
                     g2.fill((Ellipse2D)c);
                      }
                if(JDrones.nu>=10){
                    g2.setColor(Color.BLACK);
                    c.setFrame(coord.x10, coord.y10, 20, 20);
                     g2.fill((Ellipse2D)c);
                      }
            
        }
        
        //g2.setColor(Color.white);
        //g2.drawString(String.valueOf(n.getConta()),x.getX()+8
        //        ,y.getY()+12);
    }
    public void CreaCirculo(){
        circulos.add(new Ellipse2D.Double());
    }
    public void ActuaslizaXY(int a, int b, int numd){
        a=x;
        a=y;
        DibujaDrones.opc=numd; 
    }
    
    
}
