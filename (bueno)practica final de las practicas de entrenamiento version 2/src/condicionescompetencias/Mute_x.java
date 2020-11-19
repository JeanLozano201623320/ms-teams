package condicionescompetencias;

public class Mute_x {
 
      private boolean pase=false;//variable de pase
     
      public boolean is_lock() {
        return pase;
    }
   
       Mute_x(boolean pase) {
        this.pase=pase; }

    synchronized void  lock(){
        while (pase){

                try{
                    wait();
                }catch(InterruptedException e){e.printStackTrace();}
             }
        pase=true;
    }
    synchronized void  unlock(){
       pase=false;
       notify();
      //pase=false;
    }
    synchronized boolean obten_pase(){
        return pase;}
    synchronized void pon_pase(boolean pase){
        pase=pase;
    } 

      /*
      public boolean is_lock() {
        return pase;
    }
   
      public void lock(){//cierra el mutex
        try{
           pase=true;
          //  this.wait();
        }catch(Exception e){e.printStackTrace();}
    }
    //-------------------------------------------
    public void unlock(){//abre el mutex
        try{
            //this.notify();
          pase=false;
        }catch(Exception e){e.printStackTrace();}
    }
    //---------------------------------------------
    /*public void try_lock(){
        try{
            unlock();
        }catch(Exception e){e.printStackTrace();}
    }
*/
}
