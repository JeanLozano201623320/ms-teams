
package condicionescompetencias;
import static java.lang.Thread.sleep;
import javax.swing.JTextArea;
/**
 *
 * @author jeans
 */
public class Hilo extends Thread {
    private JTextArea area;
    private Rcompartido rc;
    Hilo(JTextArea area, Rcompartido rc){
        this.area=area;
        this.rc=rc;
    }
    public void run (){
        while(true){
            try{
                rc.setDatoCompartido(this.getName()); //(()(Math.random()*100));//random de 0 a100
                area.append(rc.getDatoCompartido()+"\n");//(this.getName() + ",  Dato"+ rc.getDatoCompartido()+"\n");//imprime el dato  e imprime el dato que el mismo escribio
                sleep(1000);
            }catch(Exception e){e.printStackTrace();}
           // sleep(2000);//1000 unidades es un segundo en java
        }
    }
}
