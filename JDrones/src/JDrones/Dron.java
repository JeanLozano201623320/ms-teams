package JDrones;
import javax.swing.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.CyclicBarrier;
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
    public static boolean vcerr=true;
    public static  int iter;
    
   //----------------mutex
    private Lock mutex;
    //----------------vcondicion
    private Lock mutexvc;
    private static Lock vcondition;
    private static Condition condition;
    //-----------------semafo
    private Semaphore semaf;
    //----------------barreras-----
     public static int numCalls = 0;
    private CyclicBarrier barrera;
    private CyclicBarrier barrera2;
    //-------------------------
    private int numd=0;
    Dron(int x, int y, DibujaDrones panel/*, double[] datosX,double[] datosY*/){
        this.panel=panel;
        mutex = new ReentrantLock();
        mutexvc = new ReentrantLock();
        vcondition=new ReentrantLock();
        condition= vcondition.newCondition();
        semaf= new Semaphore(1);
        barrera = new CyclicBarrier(1);
    }
    public   void run(){
        iter=0;
        while(true){
            try{
 //vanilla------------------------------------------------               
             if(JDrones.sin==true){
                if (this.getName()=="1"){
                            coord.y1+=b1;// = y+b;
                            coord.x1+=a1;//;=x+a;
                            check();
                        }
                        else if (this.getName()=="2"){
                            coord.y2+=b2;// = y+b;
                            coord.x2+=a2;//;=x+a;
                           // System.out.println("x2= "+coord.y2);
                           check();
                        }
                        else if (this.getName()=="3"){
                           coord.y3+=b3;// = y+b;
                           coord.x3+=a3;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="4"){
                           coord.y4+=b4;// = y+b;
                           coord.x4+=a4;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="5"){
                           coord.y5+=b5;// = y+b;
                           coord.x5+=a5;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="6"){
                           coord.y6+=b6;// = y+b;
                           coord.x6+=a6;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="7"){
                           coord.y7+=b7;// = y+b;
                           coord.x7+=a7;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="8"){
                           coord.y8+=b8;// = y+b;
                           coord.x8+=a8;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="9"){
                           coord.y9+=b9;// = y+b;
                           coord.x9+=a9;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="10"){
                           coord.y10+=b10;// = y+b;
                           coord.x10+=a10;//;=x+a;
                           check();
                        } 
             }
//mutex---------------------------------------------------------        
             else if(JDrones.mutecs==true){
                    
                    if(mutex.tryLock()){
                        mutex.lock();
                        if (this.getName()=="1"){
                            coord.y1+=b1;// = y+b;
                            coord.x1+=a1;//;=x+a;
                            check();
                        }
                        else if (this.getName()=="2"){
                            coord.y2+=b2;// = y+b;
                            coord.x2+=a2;//;=x+a;
                            check();
                           // System.out.println("x2= "+coord.y2);
                        }
                        else if (this.getName()=="3"){
                           coord.y3+=b3;// = y+b;
                           coord.x3+=a3;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="4"){
                           coord.y4+=b4;// = y+b;
                           coord.x4+=a4;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="5"){
                           coord.y5+=b5;// = y+b;
                           coord.x5+=a5;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="6"){
                           coord.y6+=b6;// = y+b;
                           coord.x6+=a6;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="7"){
                           coord.y7+=b7;// = y+b;
                           coord.x7+=a7;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="8"){
                           coord.y8+=b8;// = y+b;
                           coord.x8+=a8;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="9"){
                           coord.y9+=b9;// = y+b;
                           coord.x9+=a9;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="10"){
                           coord.y10+=b10;// = y+b;
                           coord.x10+=a10;//;=x+a;
                           check();
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
                            check();
                            
                        }
                        else if (this.getName()=="2"){
                            coord.y2+=b2;// = y+b;
                            coord.x2+=a2;//;=x+a;
                            check();
                           // System.out.println("x2= "+coord.y2);
                        }
                        else if (this.getName()=="3"){
                           coord.y3+=b3;// = y+b;
                           coord.x3+=a3;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="4"){
                           coord.y4+=b4;// = y+b;
                           coord.x4+=a4;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="5"){
                           coord.y5+=b5;// = y+b;
                           coord.x5+=a5;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="6"){
                           coord.y6+=b6;// = y+b;
                           coord.x6+=a6;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="7"){
                           coord.y7+=b7;// = y+b;
                           coord.x7+=a7;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="8"){
                           coord.y8+=b8;// = y+b;
                           coord.x8+=a8;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="9"){
                           coord.y9+=b9;// = y+b;
                           coord.x9+=a9;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="10"){
                           coord.y10+=b10;// = y+b;
                           coord.x10+=a10;//;=x+a;
                           check();
                        }
                 
                 semaf.release();//<----------------semaforo
                 
             }
             //variable de condicion ------------------------------------------------               
             if(JDrones.vcf==true){
                        signal();
                 
                        if (this.getName()=="1"){
                            coord.y1+=b1;// = y+b;
                            coord.x1+=a1;//;=x+a;
                            check();
                            
                        }
                        else if (this.getName()=="2"){
                            coord.y2+=b2;// = y+b;
                            coord.x2+=a2;//;=x+a;
                            check();
                           // System.out.println("x2= "+coord.y2);
                        }
                        else if (this.getName()=="3"){
                           coord.y3+=b3;// = y+b;
                           coord.x3+=a3;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="4"){
                           coord.y4+=b4;// = y+b;
                           coord.x4+=a4;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="5"){
                           coord.y5+=b5;// = y+b;
                           coord.x5+=a5;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="6"){
                           coord.y6+=b6;// = y+b;
                           coord.x6+=a6;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="7"){
                           coord.y7+=b7;// = y+b;
                           coord.x7+=a7;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="8"){
                           coord.y8+=b8;// = y+b;
                           coord.x8+=a8;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="9"){
                           coord.y9+=b9;// = y+b;
                           coord.x9+=a9;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="10"){
                           coord.y10+=b10;// = y+b;
                           coord.x10+=a10;//;=x+a;
                           check();
                        }
                       
                 await();
             }    
             //monitores ------------------------------------------------               
             if(JDrones.monif==true){
                 synchronized(panel){
                    if (this.getName()=="1"){
                            coord.y1+=b1;// = y+b;
                            coord.x1+=a1;//;=x+a;
                            check();
                            
                        }
                        else if (this.getName()=="2"){
                            coord.y2+=b2;// = y+b;
                            coord.x2+=a2;//;=x+a;
                            check();
                           // System.out.println("x2= "+coord.y2);
                        }
                        else if (this.getName()=="3"){
                           coord.y3+=b3;// = y+b;
                           coord.x3+=a3;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="4"){
                           coord.y4+=b4;// = y+b;
                           coord.x4+=a4;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="5"){
                           coord.y5+=b5;// = y+b;
                           coord.x5+=a5;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="6"){
                           coord.y6+=b6;// = y+b;
                           coord.x6+=a6;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="7"){
                           coord.y7+=b7;// = y+b;
                           coord.x7+=a7;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="8"){
                           coord.y8+=b8;// = y+b;
                           coord.x8+=a8;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="9"){
                           coord.y9+=b9;// = y+b;
                           coord.x9+=a9;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="10"){
                           coord.y10+=b10;// = y+b;
                           coord.x10+=a10;//;=x+a;
                           check();
                        }
                 }
             }
             //barreras------------------------------------------------               
             if(JDrones.barf==true){
                 //barrier.call();
                  barrera.await();
                   //System.out.println("posbar ");
                 if (this.getName()=="1"){
                            coord.y1+=b1;// = y+b;
                            coord.x1+=a1;//;=x+a;
                            check();

                        }
                        else if (this.getName()=="2"){
                            coord.y2+=b2;// = y+b;
                            coord.x2+=a2;//;=x+a;
                            check();
                           // System.out.println("x2= "+coord.y2);
                        }
                        else if (this.getName()=="3"){
                           coord.y3+=b3;// = y+b;
                           coord.x3+=a3;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="4"){
                           coord.y4+=b4;// = y+b;
                           coord.x4+=a4;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="5"){
                           coord.y5+=b5;// = y+b;
                           coord.x5+=a5;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="6"){
                           coord.y6+=b6;// = y+b;
                           coord.x6+=a6;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="7"){
                           coord.y7+=b7;// = y+b;
                           coord.x7+=a7;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="8"){
                           coord.y8+=b8;// = y+b;
                           coord.x8+=a8;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="9"){
                           coord.y9+=b9;// = y+b;
                           coord.x9+=a9;//;=x+a;
                           check();
                        }
                        else if (this.getName()=="10"){
                           coord.y10+=b10;// = y+b;
                           coord.x10+=a10;//;=x+a;
                           check();
                        }
                 berrier();
                 barrera.await();
                

             }
            /*aqui iba antes check a funcion
                fincheck */
                
                Thread.sleep((int)(3+Math.random()*3));//<-------------sleep random
              //Thread.sleep(1);
            }catch(Exception e){e.printStackTrace();}
             //jfree--------------------------------------
               if(iter<100000){
                   //System.out.println("llenando");
                JDrones.datosX1[iter]=coord.x1;
                JDrones.datosY1[iter]=coord.y1;
                JDrones.datosX2[iter]=coord.x2;
                JDrones.datosY2[iter]=coord.y2;
                JDrones.datosX3[iter]=coord.x3;
                JDrones.datosY3[iter]=coord.y3;
                JDrones.datosX4[iter]=coord.x4;
                JDrones.datosY4[iter]=coord.y4;
                JDrones.datosX5[iter]=coord.x5;
                JDrones.datosY5[iter]=coord.y5;
                JDrones.datosX6[iter]=coord.x6;
                JDrones.datosY6[iter]=coord.y6;
                JDrones.datosX7[iter]=coord.x7;
                JDrones.datosY7[iter]=coord.y7;
                JDrones.datosX8[iter]=coord.x8;
                JDrones.datosY8[iter]=coord.y8;
                JDrones.datosX9[iter]=coord.x9;
                JDrones.datosY9[iter]=coord.y9;
                JDrones.datosX10[iter]=coord.x10;
                JDrones.datosY10[iter]=coord.y10;
            }
            iter++;
        }
    }
    public void berrier(){
           numCalls++;
            try{
           if (numCalls == JDrones.nu) {
                
                this.notifyAll();
                
                  numCalls = 0;
            } else {
               
             this.wait();}
                }catch(Exception e){}
            
    }
    public  void signal(){
        mutexvc.lock();
        try{
            condition.signal();
        }catch(Exception e){}
        finally{
            mutexvc.unlock();
        }
    }
    public void await(){
     mutexvc.lock();
        try{
            condition.await();
        }catch(Exception e){}
        finally{
            mutexvc.unlock();
        }
    }
    public void check(){
        
    //--------------------b1----------------------
   if (this.getName()=="1"){
       if(JDrones.nu==1){
            if (coord.y1==579)
                 b1=-b1;
             if (coord.y1==0)
                 b1=-b1;
             if (coord.x1==1325)
                 a1=-a1;
             if (coord.x1==-2)
                 a1=-a1;
       }else if(JDrones.nu==2){
           if (coord.y1==579)
                 b1=-b1;
             if (coord.y1==0)
                 b1=-b1;
             if (coord.x1==652)
                 a1=-a1;
             if (coord.x1==-2)
                 a1=-a1;
       }else if(JDrones.nu==3||JDrones.nu==4){
           if (coord.y1==279)
                 b1=-b1;
             if (coord.y1==0)
                 b1=-b1;
             if (coord.x1==652)
                 a1=-a1;
             if (coord.x1==-2)
                 a1=-a1;
       }else if(JDrones.nu==5||JDrones.nu==6){
           if (coord.y1==179)
                 b1=-b1;
             if (coord.y1==0)
                 b1=-b1;
             if (coord.x1==652)
                 a1=-a1;
             if (coord.x1==-2)
                 a1=-a1;
       }else if(JDrones.nu==7||JDrones.nu==8){
           if (coord.y1==129)
                 b1=-b1;
             if (coord.y1==0)
                 b1=-b1;
             if (coord.x1==652)
                 a1=-a1;
             if (coord.x1==-2)
                 a1=-a1;
       }else if(JDrones.nu==9||JDrones.nu==10||JDrones.nu==9){
           if (coord.y1==99)
                 b1=-b1;
             if (coord.y1==0)
                 b1=-b1;
             if (coord.x1==652)
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
        if (coord.y2==579)
             b2=-b2;
         if (coord.y2==0)
             b2=-b2;
         if (coord.x2==1325)
             a2=-a2;
         if (coord.x2==673)
             a2=-a2;
   }if(JDrones.nu==3||JDrones.nu==4){   
        if (coord.y2==279)
             b2=-b2;
         if (coord.y2==0)
             b2=-b2;
         if (coord.x2==1325)
             a2=-a2;
         if (coord.x2==672)
             a2=-a2;
   }if(JDrones.nu==5||JDrones.nu==6){   
        if (coord.y2==179)
             b2=-b2;
         if (coord.y2==0)
             b2=-b2;
         if (coord.x2==1325)
             a2=-a2;
         if (coord.x2==673)
             a2=-a2;
   }if(JDrones.nu==7||JDrones.nu==8){   
        if (coord.y2==129)
             b2=-b2;
         if (coord.y2==0)
             b2=-b2;
         if (coord.x2==1325)
             a2=-a2;
         if (coord.x2==673)
             a2=-a2;
   }if(JDrones.nu==9||JDrones.nu==10){   
        if (coord.y2==99)
             b2=-b2;
         if (coord.y2==0)
             b2=-b2;
         if (coord.x2==1325)
             a2=-a2;
         if (coord.x2==673)
             a2=-a2;
   }
    numd=2;
    panel.ActuaslizaXY(coord.x2,coord.y2,numd);
     panel.repaint();
   }
    //--------------------b3----------------------
if (this.getName()=="3"){
   if(JDrones.nu==3||JDrones.nu==4){   
        if (coord.y3==579)
             b3=-b3;
         if (coord.y3==300)
             b3=-b3;
         if (coord.x3==652)
             a3=-a3;
         if (coord.x3==-2)
             a3=-a3;
   }if(JDrones.nu==5||JDrones.nu==6){ 
        if (coord.y3==379)
             b3=-b3;
         if (coord.y3==200)
             b3=-b3;
         if (coord.x3==652)
             a3=-a3;
         if (coord.x3==-2)
             a3=-a3;
   }if(JDrones.nu==7||JDrones.nu==8){   
        if (coord.y3==279)
             b3=-b3;
         if (coord.y3==150)
             b3=-b3;
         if (coord.x3==652)
             a3=-a3;
         if (coord.x3==-2)
             a3=-a3;
   }if(JDrones.nu==9||JDrones.nu==10){   
        if (coord.y3==219)
             b3=-b3;
         if (coord.y3==120)
             b3=-b3;
         if (coord.x3==652)
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
        if (coord.y4==579)
             b4=-b4;
         if (coord.y4==300)
             b4=-b4;
         if (coord.x4==1325)
             a4=-a4;
         if (coord.x4==673)
             a4=-a4;
   }if(JDrones.nu==5||JDrones.nu==6){ 
        if (coord.y4==379)
             b4=-b4;
         if (coord.y4==200)
             b4=-b4;
         if (coord.x4==1325)
             a4=-a4;
         if (coord.x4==673)
             a4=-a4;
   }if(JDrones.nu==7||JDrones.nu==8){   
        if (coord.y4==279)
             b4=-b4;
         if (coord.y4==150)
             b4=-b4;
         if (coord.x4==1325)
             a4=-a4;
         if (coord.x4==673)
             a4=-a4;
   }if(JDrones.nu==9||JDrones.nu==10){   
        if (coord.y4==219)
             b4=-b4;
         if (coord.y4==120)
             b4=-b4;
         if (coord.x4==1325)
             a4=-a4;
         if (coord.x4==673)
             a4=-a4;
   }
    numd=4;
    panel.ActuaslizaXY(coord.x2,coord.y2,numd);
     panel.repaint();
   }

    //--------------------b5----------------------
if (this.getName()=="5"){
   if(JDrones.nu==5||JDrones.nu==6){ 
        if (coord.y5==579)
             b5=-b5;
         if (coord.y5==400)
             b5=-b5;
         if (coord.x5==652)
             a5=-a5;
         if (coord.x5==-2)
             a5=-a5;
   }if(JDrones.nu==7||JDrones.nu==8){   
        if (coord.y5==429)
             b5=-b5;
         if (coord.y5==300)
             b5=-b5;
         if (coord.x5==652)
             a5=-a5;
         if (coord.x5==-2)
             a5=-a5;
   }if(JDrones.nu==9||JDrones.nu==10){   
        if (coord.y5==339)
             b5=-b5;
         if (coord.y5==240)
             b5=-b5;
         if (coord.x5==652)
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
        if (coord.y6==579)
             b6=-b6;
         if (coord.y6==400)
             b6=-b6;
         if (coord.x6==1325)
             a6=-a6;
         if (coord.x6==673)
             a6=-a6;
   }if(JDrones.nu==7||JDrones.nu==8){   
        if (coord.y6==429)
             b6=-b6;
         if (coord.y6==300)
             b6=-b6;
         if (coord.x6==1325)
             a6=-a6;
         if (coord.x6==673)
             a6=-a6;
   }if(JDrones.nu==9||JDrones.nu==10){   
        if (coord.y6==339)
             b6=-b6;
         if (coord.y6==240)
             b6=-b6;
         if (coord.x6==1325)
             a6=-a6;
         if (coord.x6==673)
             a6=-a6;
   }
    numd=6;
    panel.ActuaslizaXY(coord.x2,coord.y2,numd);
     panel.repaint();
   }
    //--------------------b7----------------------
    if (this.getName()=="7"){
   if(JDrones.nu==7||JDrones.nu==8){   
        if (coord.y7==579)
             b7=-b7;
         if (coord.y7==450)
             b7=-b7;
         if (coord.x7==652)
             a7=-a7;
         if (coord.x7==-2)
             a7=-a7;
   }if(JDrones.nu==9||JDrones.nu==10){   
        if (coord.y7==459)
             b7=-b7;
         if (coord.y7==360)
             b7=-b7;
         if (coord.x7==652)
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
        if (coord.y8==579)
             b8=-b8;
         if (coord.y8==450)
             b8=-b8;
         if (coord.x8==1325)
             a8=-a8;
         if (coord.x8==673)
             a8=-a8;
   }if(JDrones.nu==9||JDrones.nu==10){   
        if (coord.y8==459)
             b8=-b8;
         if (coord.y8==360)
             b8=-b8;
         if (coord.x8==1325)
             a8=-a8;
         if (coord.x8==673)
             a8=-a8;
   }
    numd=8;
    panel.ActuaslizaXY(coord.x2,coord.y2,numd);
     panel.repaint();
   }
    //--------------------b9----------------------
    if (this.getName()=="9"){
   if(JDrones.nu==9||JDrones.nu==10){   
        if (coord.y9==579)
             b9=-b9;
         if (coord.y9==480)
             b9=-b9;
         if (coord.x9==652)
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
        if (coord.y10==579)
             b10=-b10;
         if (coord.y10==480)
             b10=-b10;
         if (coord.x10==1325)
             a10=-a10;
         if (coord.x10==673)
             a10=-a10;
   }
    numd=10;
    panel.ActuaslizaXY(coord.x2,coord.y2,numd);
     panel.repaint();
   }  
  }
}


