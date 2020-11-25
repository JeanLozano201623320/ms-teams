package JDrones;
import javax.swing.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Semaphore;
public class Dron extends Thread{
    private int x;
    private int y;
    private DibujaDrones panel;
    //variables para las coordenadas
    public static  int a1=1;
    public static  int b1=1;
    public static  int a2=1;
    public static  int b2=1;
    public static  int a3=1;
    public static  int b3=1;
    public static  int a4=1;
    public static  int b4=1;
    public static  int a5=1;
    public static  int b5=1;
    public static  int a6=1;
    public static  int b6=1;
    public static  int a7=1;
    public static  int b7=1;
    public static  int a8=1;
    public static  int b8=1;
    public static  int a9=1;
    public static  int b9=1;
    public static  int a10=1;
    public static  int b10=1;
    
   
    private Lock mutex;
    private Semaphore semaf;
    private int numd=0;
    Dron(int x, int y, DibujaDrones panel /*, double[] datosX,double[] datosY*/){
        this.panel=panel;
        mutex = new ReentrantLock();
        semaf= new Semaphore(1);
    }
    public synchronized  void run(){
        int iter=0;
        while(true){
            try{
 //vanilla------------------------------------------------               
             if(JDrones.sin==true){
                if (this.getName()=="1"){
                            coord.y1+=b1;// = y+b;
                            coord.x1+=a1;//;=x+a;
                        }
                        else if (this.getName()=="2"){
                            coord.y2+=b2;// = y+b;
                            coord.x2+=a2;//;=x+a;
                           // System.out.println("x2= "+coord.y2);
                        }
                        else if (this.getName()=="3"){
                           coord.y3+=b3;// = y+b;
                           coord.x3+=a3;//;=x+a;
                        }
                        else if (this.getName()=="4"){
                           coord.y4+=b4;// = y+b;
                           coord.x4+=a4;//;=x+a;
                        }
                        else if (this.getName()=="5"){
                           coord.y5+=b5;// = y+b;
                           coord.x5+=a5;//;=x+a;
                        }
                        else if (this.getName()=="6"){
                           coord.y6+=b6;// = y+b;
                           coord.x6+=a6;//;=x+a;
                        }
                        else if (this.getName()=="7"){
                           coord.y7+=b7;// = y+b;
                           coord.x7+=a7;//;=x+a;
                        }
                        else if (this.getName()=="8"){
                           coord.y8+=b8;// = y+b;
                           coord.x8+=a8;//;=x+a;
                        }
                        else if (this.getName()=="9"){
                           coord.y9+=b9;// = y+b;
                           coord.x9+=a9;//;=x+a;
                        }
                        else if (this.getName()=="10"){
                           coord.y10+=b10;// = y+b;
                           coord.x10+=a10;//;=x+a;
                        } 
             }
//mutex---------------------------------------------------------        
             else if(JDrones.mutecs==true){
                    
                    if(mutex.tryLock()){
                        mutex.lock();
                        if (this.getName()=="1"){
                            coord.y1+=b1;// = y+b;
                            coord.x1+=a1;//;=x+a;
                        }
                        else if (this.getName()=="2"){
                            coord.y2+=b2;// = y+b;
                            coord.x2+=a2;//;=x+a;
                           // System.out.println("x2= "+coord.y2);
                        }
                        else if (this.getName()=="3"){
                           coord.y3+=b3;// = y+b;
                           coord.x3+=a3;//;=x+a;
                        }
                        else if (this.getName()=="4"){
                           coord.y4+=b4;// = y+b;
                           coord.x4+=a4;//;=x+a;
                        }
                        else if (this.getName()=="5"){
                           coord.y5+=b5;// = y+b;
                           coord.x5+=a5;//;=x+a;
                        }
                        else if (this.getName()=="6"){
                           coord.y6+=b6;// = y+b;
                           coord.x6+=a6;//;=x+a;
                        }
                        else if (this.getName()=="7"){
                           coord.y7+=b7;// = y+b;
                           coord.x7+=a7;//;=x+a;
                        }
                        else if (this.getName()=="8"){
                           coord.y8+=b8;// = y+b;
                           coord.x8+=a8;//;=x+a;
                        }
                        else if (this.getName()=="9"){
                           coord.y9+=b9;// = y+b;
                           coord.x9+=a9;//;=x+a;
                        }
                        else if (this.getName()=="10"){
                           coord.y10+=b10;// = y+b;
                           coord.x10+=a10;//;=x+a;
                        }     
                         mutex.unlock();
                    }
                }
  //semaforo---------------------------------------------------------  
             else if (JDrones.semaf==true){
                 semaf.acquire();//<----------------semaforo
                        if (this.getName()=="1"){
                            coord.y1+=b1;// = y+b;
                            coord.x1+=a1;//;=x+a;
                        }
                        else if (this.getName()=="2"){
                            coord.y2+=b2;// = y+b;
                            coord.x2+=a2;//;=x+a;
                           // System.out.println("x2= "+coord.y2);
                        }
                        else if (this.getName()=="3"){
                           coord.y3+=b3;// = y+b;
                           coord.x3+=a3;//;=x+a;
                        }
                        else if (this.getName()=="4"){
                           coord.y4+=b4;// = y+b;
                           coord.x4+=a4;//;=x+a;
                        }
                        else if (this.getName()=="5"){
                           coord.y5+=b5;// = y+b;
                           coord.x5+=a5;//;=x+a;
                        }
                        else if (this.getName()=="6"){
                           coord.y6+=b6;// = y+b;
                           coord.x6+=a6;//;=x+a;
                        }
                        else if (this.getName()=="7"){
                           coord.y7+=b7;// = y+b;
                           coord.x7+=a7;//;=x+a;
                        }
                        else if (this.getName()=="8"){
                           coord.y8+=b8;// = y+b;
                           coord.x8+=a8;//;=x+a;
                        }
                        else if (this.getName()=="9"){
                           coord.y9+=b9;// = y+b;
                           coord.x9+=a9;//;=x+a;
                        }
                        else if (this.getName()=="10"){
                           coord.y10+=b10;// = y+b;
                           coord.x10+=a10;//;=x+a;
                        }
                 
                 semaf.release();//<----------------semaforo
                 
             }
                //--------------------b1----------------------
               if (this.getName()=="1"){
                   if(JDrones.nu==1){
                        if (coord.y1==576)
                             b1=-b1;
                         if (coord.y1==0)
                             b1=-b1;
                         if (coord.x1==1325)
                             a1=-a1;
                         if (coord.x1==-2)
                             a1=-a1;
                   }else if(JDrones.nu==2){
                       if (coord.y1==576)
                             b1=-b1;
                         if (coord.y1==0)
                             b1=-b1;
                         if (coord.x1==657)
                             a1=-a1;
                         if (coord.x1==-2)
                             a1=-a1;
                   }else if(JDrones.nu==3||JDrones.nu==4){
                       if (coord.y1==284)
                             b1=-b1;
                         if (coord.y1==0)
                             b1=-b1;
                         if (coord.x1==657)
                             a1=-a1;
                         if (coord.x1==-2)
                             a1=-a1;
                   }else if(JDrones.nu==5||JDrones.nu==6){
                       if (coord.y1==184)
                             b1=-b1;
                         if (coord.y1==0)
                             b1=-b1;
                         if (coord.x1==657)
                             a1=-a1;
                         if (coord.x1==-2)
                             a1=-a1;
                   }else if(JDrones.nu==7||JDrones.nu==8){
                       if (coord.y1==134)
                             b1=-b1;
                         if (coord.y1==0)
                             b1=-b1;
                         if (coord.x1==657)
                             a1=-a1;
                         if (coord.x1==-2)
                             a1=-a1;
                   }else if(JDrones.nu==9||JDrones.nu==10||JDrones.nu==9){
                       if (coord.y1==104)
                             b1=-b1;
                         if (coord.y1==0)
                             b1=-b1;
                         if (coord.x1==657)
                             a1=-a1;
                         if (coord.x1==-2)
                             a1=-a1;
                   }
                         numd=1;
                         panel.ActuaslizaXY(coord.x1,coord.y1,numd);
                          panel.repaint();  
                   }
                //--------------------b2----------------------
            if (this.getName()=="2"){
                if(JDrones.nu==2){   
                    if (coord.y2==576)
                         b2=-b2;
                     if (coord.y2==0)
                         b2=-b2;
                     if (coord.x2==1325)
                         a2=-a2;
                     if (coord.x2==672)
                         a2=-a2;
               }if(JDrones.nu==3||JDrones.nu==4){   
                    if (coord.y2==284)
                         b2=-b2;
                     if (coord.y2==0)
                         b2=-b2;
                     if (coord.x2==1325)
                         a2=-a2;
                     if (coord.x2==672)
                         a2=-a2;
               }if(JDrones.nu==5||JDrones.nu==6){   
                    if (coord.y2==184)
                         b2=-b2;
                     if (coord.y2==0)
                         b2=-b2;
                     if (coord.x2==1325)
                         a2=-a2;
                     if (coord.x2==672)
                         a2=-a2;
               }if(JDrones.nu==7||JDrones.nu==8){   
                    if (coord.y2==134)
                         b2=-b2;
                     if (coord.y2==0)
                         b2=-b2;
                     if (coord.x2==1325)
                         a2=-a2;
                     if (coord.x2==672)
                         a2=-a2;
               }if(JDrones.nu==9||JDrones.nu==10){   
                    if (coord.y2==104)
                         b2=-b2;
                     if (coord.y2==0)
                         b2=-b2;
                     if (coord.x2==1325)
                         a2=-a2;
                     if (coord.x2==672)
                         a2=-a2;
               }
                numd=2;
                panel.ActuaslizaXY(coord.x2,coord.y2,numd);
                 panel.repaint();
               }
                //--------------------b3----------------------
            if (this.getName()=="3"){
               if(JDrones.nu==3||JDrones.nu==4){   
                    if (coord.y3==576)
                         b3=-b3;
                     if (coord.y3==300)
                         b3=-b3;
                     if (coord.x3==657)
                         a3=-a3;
                     if (coord.x3==-2)
                         a3=-a3;
               }if(JDrones.nu==5||JDrones.nu==6){ 
                    if (coord.y3==384)
                         b3=-b3;
                     if (coord.y3==200)
                         b3=-b3;
                     if (coord.x3==657)
                         a3=-a3;
                     if (coord.x3==-2)
                         a3=-a3;
               }if(JDrones.nu==7||JDrones.nu==8){   
                    if (coord.y3==280)
                         b3=-b3;
                     if (coord.y3==150)
                         b3=-b3;
                     if (coord.x3==657)
                         a3=-a3;
                     if (coord.x3==-2)
                         a3=-a3;
               }if(JDrones.nu==9||JDrones.nu==10){   
                    if (coord.y3==224)
                         b3=-b3;
                     if (coord.y3==120)
                         b3=-b3;
                     if (coord.x3==657)
                         a3=-a3;
                     if (coord.x3==-2)
                         a3=-a3;
               }
                numd=3;
                panel.ActuaslizaXY(coord.x2,coord.y2,numd);
                 panel.repaint();
               }
                //--------------------b4----------------------
            if (this.getName()=="4"){
               if(JDrones.nu==3||JDrones.nu==4){   
                    if (coord.y4==576)
                         b4=-b4;
                     if (coord.y4==300)
                         b4=-b4;
                     if (coord.x4==1325)
                         a4=-a4;
                     if (coord.x4==657)
                         a4=-a4;
               }if(JDrones.nu==5||JDrones.nu==6){ 
                    if (coord.y4==384)
                         b4=-b4;
                     if (coord.y4==200)
                         b4=-b4;
                     if (coord.x4==1325)
                         a4=-a4;
                     if (coord.x4==657)
                         a4=-a4;
               }if(JDrones.nu==7||JDrones.nu==8){   
                    if (coord.y4==280)
                         b4=-b4;
                     if (coord.y4==150)
                         b4=-b4;
                     if (coord.x4==1325)
                         a4=-a4;
                     if (coord.x4==657)
                         a4=-a4;
               }if(JDrones.nu==9||JDrones.nu==10){   
                    if (coord.y4==224)
                         b4=-b4;
                     if (coord.y4==120)
                         b4=-b4;
                     if (coord.x4==1325)
                         a4=-a4;
                     if (coord.x4==657)
                         a4=-a4;
               }
                numd=4;
                panel.ActuaslizaXY(coord.x2,coord.y2,numd);
                 panel.repaint();
               }
                
                //--------------------b5----------------------
            if (this.getName()=="5"){
               if(JDrones.nu==5||JDrones.nu==6){ 
                    if (coord.y5==576)
                         b5=-b5;
                     if (coord.y5==399)
                         b5=-b5;
                     if (coord.x5==657)
                         a5=-a5;
                     if (coord.x5==-2)
                         a5=-a5;
               }if(JDrones.nu==7||JDrones.nu==8){   
                    if (coord.y5==433)
                         b5=-b5;
                     if (coord.y5==299)
                         b5=-b5;
                     if (coord.x5==657)
                         a5=-a5;
                     if (coord.x5==-2)
                         a5=-a5;
               }if(JDrones.nu==9||JDrones.nu==10){   
                    if (coord.y5==343)
                         b5=-b5;
                     if (coord.y5==239)
                         b5=-b5;
                     if (coord.x5==657)
                         a5=-a5;
                     if (coord.x5==-2)
                         a5=-a5;
               }
                numd=5;
                panel.ActuaslizaXY(coord.x2,coord.y2,numd);
                 panel.repaint();
               }
                //--------------------b6----------------------
                if (this.getName()=="6"){
               if(JDrones.nu==5||JDrones.nu==6){ 
                    if (coord.y6==576)
                         b6=-b6;
                     if (coord.y6==399)
                         b6=-b6;
                     if (coord.x6==1325)
                         a6=-a6;
                     if (coord.x6==657)
                         a6=-a6;
               }if(JDrones.nu==7||JDrones.nu==8){   
                    if (coord.y6==433)
                         b6=-b6;
                     if (coord.y6==299)
                         b6=-b6;
                     if (coord.x6==1325)
                         a6=-a6;
                     if (coord.x6==657)
                         a6=-a6;
               }if(JDrones.nu==9||JDrones.nu==10){   
                    if (coord.y6==343)
                         b6=-b6;
                     if (coord.y6==239)
                         b6=-b6;
                     if (coord.x6==1325)
                         a6=-a6;
                     if (coord.x6==657)
                         a6=-a6;
               }
                numd=6;
                panel.ActuaslizaXY(coord.x2,coord.y2,numd);
                 panel.repaint();
               }
                //--------------------b7----------------------
                if (this.getName()=="7"){
               if(JDrones.nu==7||JDrones.nu==8){   
                    if (coord.y7==576)
                         b7=-b7;
                     if (coord.y7==448)
                         b7=-b7;
                     if (coord.x7==657)
                         a7=-a7;
                     if (coord.x7==-2)
                         a7=-a7;
               }if(JDrones.nu==9||JDrones.nu==10){   
                    if (coord.y7==463)
                         b7=-b7;
                     if (coord.y7==358)
                         b7=-b7;
                     if (coord.x7==657)
                         a7=-a7;
                     if (coord.x7==-2)
                         a7=-a7;
               }
                numd=7;
                panel.ActuaslizaXY(coord.x2,coord.y2,numd);
                 panel.repaint();
               }
                //--------------------b8----------------------
                if (this.getName()=="8"){
               if(JDrones.nu==7||JDrones.nu==8){   
                    if (coord.y8==576)
                         b8=-b8;
                     if (coord.y8==448)
                         b8=-b8;
                     if (coord.x8==1325)
                         a8=-a8;
                     if (coord.x8==657)
                         a8=-a8;
               }if(JDrones.nu==9||JDrones.nu==10){   
                    if (coord.y8==463)
                         b8=-b8;
                     if (coord.y8==358)
                         b8=-b8;
                     if (coord.x8==1325)
                         a8=-a8;
                     if (coord.x8==657)
                         a8=-a8;
               }
                numd=8;
                panel.ActuaslizaXY(coord.x2,coord.y2,numd);
                 panel.repaint();
               }
                //--------------------b9----------------------
                if (this.getName()=="9"){
               if(JDrones.nu==9||JDrones.nu==10){   
                    if (coord.y9==576)
                         b9=-b9;
                     if (coord.y9==478)
                         b9=-b9;
                     if (coord.x9==657)
                         a9=-a9;
                     if (coord.x9==-2)
                         a9=-a9;
               }
                numd=9;
                panel.ActuaslizaXY(coord.x2,coord.y2,numd);
                 panel.repaint();
               }
                
                //--------------------b10----------------------
                   if (this.getName()=="10"){
              if(JDrones.nu==9||JDrones.nu==10){   
                    if (coord.y10==576)
                         b10=-b10;
                     if (coord.y10==478)
                         b10=-b10;
                     if (coord.x10==1325)
                         a10=-a10;
                     if (coord.x10==657)
                         a10=-a10;
               }
                numd=10;
                panel.ActuaslizaXY(coord.x2,coord.y2,numd);
                 panel.repaint();
               }   
                
                Thread.sleep((int)(Math.random()*10));//<-------------sleep random
              // Thread.sleep(6);
            }catch(Exception e){e.printStackTrace();}
            iter++;
        }
    }
}
