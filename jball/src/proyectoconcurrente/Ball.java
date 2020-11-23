package proyectoconcurrente;
import javax.swing.*;
public class Ball extends Thread {
    private PanelBall panel;
    private MiX x;
    private MiY y;
    int angulo_x;
    int angulo_y;
    int ancho = 600;
    int alto = 500;
    int band = 0;
    int bandy = 0;
    Ball(PanelBall panel, MiX x, MiY y){
        this.panel=panel;
        this.x=x;
        this.y=y;  
         }
        public void run(){//panel info 600*500  
            angulo_x=0;
            angulo_y=0; 
            angulo_x=x.getX();
            angulo_y=y.getY();
          
         x.setX(x.getX()+ 5);
          //y.setY(y.getY()+ 5);//y=y+10
            while (true){
                try{ 
                    //--------------------------------------------------- XBAND , X
                   if(angulo_x==0){//bandera que checa que x no vaya a numeros negaticos
                       band=1;
                   } //si la bandera es 1 x avanza hasta que la bamdera cambia a 0 y cambia a la direccion opuesta
                   if (angulo_x==ancho-20){
                       band=0;
                   }
                  
                   if(  band == 1){// si band es positiva avanza de manera positiva, si no lo hace de manera negativa
                    x.setX(x.getX()+ 5);
                    }
                else if(band==0){
                       x.setX(x.getX()- 5);  }
                   
                  //---------------------------------------------------YBAND , Y
                           if(angulo_y==0){//bandera que checa que y no vaya a numeros negaticos
                       bandy=1;
                   } //si la bandera es 1 y avanza hasta que la bandera cambia a 0 y cambia a la direccion opuesta
                   if (angulo_y==alto-20){
                       bandy=0;
                   }
                   
                   // si band es positiva avanza de manera positiva, si no lo hace de manera negativa
                   if(  bandy == 1){
                    y.setY(y.getY()+ 5);
                    }
                else if(bandy==0){
                       y.setY(y.getY()- 5);  }
                
                     angulo_x=x.getX();//se almacena la variable de los angulos
                     angulo_y=y.getY();
                   //---------------------------------------------------  
                    panel.repaint();
                    Thread.sleep(10);
                    System.out.println("x="+angulo_x);//anotan en la consola los valores de xy; solo para guiarme
                    System.out.println("y="+angulo_y);
                }catch(Exception e){e.printStackTrace();}
            }
    }  
}
