package jballs;
import javax.swing.*;
public class Dron extends Thread{
   
    private int x;
    private int y;
    private JPanel panel;
    private int a = 1;
    private int b = 1;
    private double[] datosX;
    private double[] datosY;
    Dron(int x,int y, DibujaDrones panel ,double[] datosX,double[] datosY ){
        this.x=x;
        this.y=y;
        this.datosX =  datosX;
        this.datosY =  datosY;
        this.panel=panel;
    }
    public void run(){
        int iter=0;
        while(true){

             try{
                          y=y+b;
                          x=x+a;
                         // datosX[iter]=x.getX();
                          //datosY[iter]=y.getY();
                          if (y==430){
                              b=-b;
                          }
                           if (y==0){

                              b=-b;
                          }
                          if (x==520){
                              a=-a;
                          }
                          if (x==-2){
                              a=-a;
                          }
                           panel.repaint();
                           Thread.sleep(8);
                           }catch(Exception e){e.printStackTrace();}
             iter++;
        /*while (true){
            try{
                x.setX(x.getX()+5);
                y.setY(y.getY()+5);// es decir x=x+1 
                panel.repaint();
                Thread.sleep(100);
            }catch(Exception e){e.printStackTrace();}
        }*/
    }
    
    }
}
