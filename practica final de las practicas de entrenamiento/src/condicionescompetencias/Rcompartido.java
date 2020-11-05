
package condicionescompetencias;
import java.util.ArrayList;

public class Rcompartido {
    private String  datoCompartido;
    private ArrayList<Interrupcion> interrupciones;
    Rcompartido()
    {
        datoCompartido="";
        interrupciones= new ArrayList<Interrupcion>();
        for(int i=0;i<10;i++){
            //for(Interrupcion i:interrupciones){//es lo mismo que un for(int=0:i<interrupcionnes.size();i++)
            interrupciones.add(new Interrupcion());//se le agrega una interrupocion al arraylist
            
        }
    }

   
    public String getDatoCompartido() {
       // String aux= "en espera";
         //   if (isEntra()){//i no ees entero es objeto con metodos
           //    bloquea();
             //   aux=datoCompartido;
             //  desbloquea();
            //}
        //return aux;
        //se puso en comentarios para ahora hacerlo dentro del hilo 
        return datoCompartido;
    }

    public void setDatoCompartido(String datoCompartido) {
        for(Interrupcion i:interrupciones)
            if (i.isInter())
                this.datoCompartido = datoCompartido;
    }

    public ArrayList<Interrupcion> getInterrupciones() {
        return interrupciones;
    }

    public void setInterrupciones(ArrayList<Interrupcion> interrupciones) {
        this.interrupciones = interrupciones;
    }
  
    public void bloquea(){
        for(Interrupcion inter:interrupciones){
            inter.setInter(false);
        }
    }
    public void desbloquea(){
         for(Interrupcion inter:interrupciones){
            inter.setInter(true);
        }
    }
    public boolean isEntra(){
        boolean ban=false;
        for(Interrupcion inter:interrupciones)
            if(inter.isInter())
                ban=true;
            else return false;
        return ban;
    }
}

