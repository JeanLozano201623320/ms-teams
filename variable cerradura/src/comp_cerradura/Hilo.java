package comp_cerradura;
import static java.lang.Thread.sleep;
import javax.swing.JTextArea;

public class Hilo extends Thread {
    private JTextArea area;
    private cerradura cr;
    private Rcompartido rc;
    private boolean dead=false;//variable para la muerte del hilo/
    Hilo(JTextArea area, Rcompartido rc, cerradura cr){
        this.area=area;
        this.rc=rc;
        this.cr=cr;
    }
    public void run (){
        
        while(true){
           
                if(!cr.isBand()){
                    cr.setBand(true);  
                    rc.setDatoCompartido(this.getName()); //(()(Math.random()*100));//random de 0 a100
                    area.append(rc.getDatoCompartido()+"esta comiendo\n");//(this.getName() + ",  Dato"+ rc.getDatoCompartido()+"\n");//imprime el dato  e imprime el dato que el mismo escribio
                    if(isDead()){//condicion para matar hilo cuando esta trabajando hecha en clase 
                          this.stop();//se usa stop para detener el hilo
                       }
                    cr.setBand(false);
                }   
                  try{
                    sleep((long)(Math.random()*1000));//el sleep con el random hace que cada perrito coma de su plato
            }catch(Exception e){e.printStackTrace();}
        }
    }
    public boolean isDead(){
        return dead;
    }
    public void setDead(boolean d){
        dead=d;
    }
}
