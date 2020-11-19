/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionescompetencias;

/**
 *
 * @author jeans
 */
public class dekker {
//algoritmo triple de dekker
               public int[] turno= {0,0};
               public boolean []flag ={false,false};
               public String turn;
                //-----------------------------------------------------
                //dekker 1
public String turnos(){
    
      try{
                if(flag[0]==false){
                    if(turno[0]==0){
                            Thread.sleep(60);
                            flag[0]=true;
                            //seccion critica
                            turn="perrito1";
                            dekker3(turn);
                            //
                            turno[0]=1;
                            flag[0]=false;
                            Thread.sleep(60);
                    }
                }
                if(flag[0]==false){
                    if(turno[0]==1){
                            Thread.sleep(60);
                            flag[0]=true;
                            //seccion critica
                            turn="perrito2";
                            dekker3(turn);
                            //
                            turno[0]=0;
                            flag[0]=false;
                            Thread.sleep(60);
                    }
                }
                //--------------------------------------
                 //dekker 2
                if(flag[1]==false){
                    if(turno[1]==0){
                            Thread.sleep(60);
                            flag[0]=true;
                            //seccion critica
                            turn="perrito3";
                            dekker3(turn);
                            //
                            turno[1]=1;
                            flag[1]=false;
                            Thread.sleep(60);
                    }
                }
                if(flag[1]==false){
                    if(turno[1]==1){
                            Thread.sleep(60);
                            flag[0]=true;
                            //seccion critica
                            turn="perrito4";
                            dekker3(turn);
                            //
                            turno[1]=0;
                            flag[1]=false;
                            Thread.sleep(60);
                    }
                }
        
    }catch(Exception e){e.printStackTrace();}
                //--------------------------------------
return turn;
}
 public void dekker3(String ganador){
        try{
     //--------------------------------------
                 //dekker 3
                 int turno=0;
                 boolean flag = false;
                if(flag==false){
                    if(turno==0){
                            Thread.sleep(60);
                            flag=true;
                            //seccion critica
                            if(ganador=="perrito1"){
                            }
                            else if(ganador=="perrito2"){
                                
                            }
                            //
                            turno=1;
                            flag=false;
                            Thread.sleep(60);
                    }
                }
                if(flag==false){
                    if(turno==1){
                            Thread.sleep(60);
                            flag=true;
                            //seccion critica
                             if(ganador=="perrito3"){
                            }
                            else if(ganador=="perrito4"){
                                
                            }
                            //
                            turno=0;
                            flag=false;
                            Thread.sleep(60);
                    }
                }
                //--------------------------------------
                
    
     }catch(Exception e){e.printStackTrace();}
    }

}
