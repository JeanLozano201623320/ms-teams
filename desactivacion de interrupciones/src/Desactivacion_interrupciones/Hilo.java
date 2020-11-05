
package Desactivacion_interrupciones;
import static java.lang.Thread.sleep;
import javax.swing.JTextArea;
/**
 *
 * @author jeans
 */
public class Hilo extends Thread {
    private JTextArea area;
    private Rcompartido rc;
     private sc sc;
    Hilo(JTextArea area, Rcompartido rc){
        this.area=area;
        this.rc=rc;
        
         //this.bn = bn;
    }

    public void run (){
       int x=0;
        while(true){
            

                try{
                  // if(!vc.isBand()){
        //         vc.setBand(true);
                    // sc.setSC(x);  
                    rc.setDatoCompartido(this.getName()); //(()(Math.random()*100));//random de 0 a100
                    area.append(rc.getDatoCompartido()+"\n");//(this.getName() + ",  Dato"+ rc.getDatoCompartido()+"\n");//imprime el dato  e imprime el dato que el mismo escribio
                    //bn.setBand(false);
                   //else
                    sleep((long)(Math.random()*1000));//el sleep con el random hace que cada perrito coma de su plato
                       
                }catch(Exception e){e.printStackTrace();}
                
            
            
            
           // sleep(2000);//1000 unidades es un segundo en java
        }
    }
    
}

