
package condicionescompetencias;
import static java.lang.Thread.sleep;
import javax.swing.JTextArea;
/**
 *
 * @author jeans
 */

public class Hilo extends Thread {
    private JTextArea area;
    private cerradura cr;
    private Rcompartido rc;
     private Mute_x mx;
     //--------para dekker-----------------
     public boolean cajero= false;
     public String []turn={"a","b","c"};
     public String winner1;
     public String winner2;
     public int[] turno= {0,0,0};
     public boolean []flag ={false,false,false};
    //--------para matar-----------
     private boolean dead=false;//variable para la muerte del hilo/
     private  final static int inic=195;
    private final static int fin=200;
    //--------para dijkstra-----------
       public boolean []b ={false,false,false,false};
       public boolean []c ={false,false,false,false};
       public int n=3;
       public int i=0;//perritos
       public int k=0;
       public int j=0;
       public boolean loop2=true;
    //-----------------------------------------------------
    Hilo(JTextArea area, Rcompartido rc, cerradura cr, Mute_x mx){
        this.area=area;
        this.rc=rc;
        this.cr=cr;
        this.mx=mx;
        //this.dek=dek;
        
    }
    public void run (){
       
        while(true){
            try{
                  String aux= "en espera";
                  //------------condiciones (sin algoritmo)------------------
            if (CondicionesCompetencias.cond==true){
                rc.setDatoCompartido(this.getName());
                area.append(rc.getDatoCompartido()+"'cn' esta comiendo\n");
                    if(isDead()){ 
                          this.stop();
                       }
            Thread.sleep(500);
            }
            //----------------cerradura (sin exclusion mutua)-------------------       
            else if (CondicionesCompetencias.piter==true){
               
                if(!cr.isBand()){
                    cr.setBand(true);  
                    rc.setDatoCompartido(this.getName()); 
                    area.append(rc.getDatoCompartido()+" 'pr' esta comiendo\n");
                    if(isDead()){ 
                          this.stop();
                       }
                    cr.setBand(false);
                     }else area.append(aux+"\n");
                Thread.sleep((int)(inic+Math.random()*fin));
                }
            //------------dessact de interrupciones (sin exclusion mutua)----------------------
             else if (CondicionesCompetencias.intre==true){ 
                    if (rc.isEntra()){//i no ees entero es objeto con metodos
                       rc.setDatoCompartido(this.getName()); //(()(Math.random()*100));//random de 0 a100
                       area.append(rc.getDatoCompartido()+" 'int' come \n");//(this.getName() + ",  Dato"+ rc.getDatoCompartido()+"\n");//imprime el dato  e imprime el dato que el mismo escribio
                        rc.bloquea();
                      
                       if(isDead()){
                           this.stop();
                       }
                       //aaqui debe morir
                    rc.desbloquea();
                    }else area.append(aux+"\n");   
                    Thread.sleep((int)(inic+Math.random()*fin));
             }
            //------------dijstra(exclusion mutua)------------------------
            else if (CondicionesCompetencias.dijk==true){ 
                            dijkst();
                         }

            
            //------------dekker  (exclusion mutua)-------------------------
            else if (CondicionesCompetencias.dekk==true){ 
            //algoritmo triple de dekker
            System.out.println("dekker");
            dekker_12();
            }  
            //------------mutex  (exclusion mutua)-------------------------
               else if (CondicionesCompetencias.mute==true){
               if(this.isDead()==false)
                       {
                        if(mx.is_lock()==false){
                            
                            mx.lock(); 
                            if(isDead()){ 

                                  this.stop();
                               }
                            else{
                                rc.setDatoCompartido(this.getName()); 
                            area.append(rc.getDatoCompartido()+" 'mx' esta comiendo\n");
                            }
                            mx.unlock();
                            
                             }else {area.append(aux+"\n");
                        }
                       }
               Thread.sleep((int)(inic+Math.random()*fin));
                }
           //---------------------------------------------------------
                   
            }catch(Exception e){e.printStackTrace();}
        }
    }
    public boolean isDead(){
        return dead;
    }
    public void setDead(boolean d){
        dead=d;
    }
 public void dekker_12(){
        try{   
            //-----------------------------------------------------              
                 //dekker 1
                 //proceso1
                if(flag[0]==false){
                    if(turno[0]==0){
                            Thread.sleep(60);
                            flag[0]=true;
                            //seccion critica
                            turn[0]="perrito1";
                            //System.out.println("perrito 1");
                            //
                            turno[0]=1;
                            flag[0]=false;
                            Thread.sleep(60);
                    }
                    //---------------------------------------
                     //dekker 2
                 //proceso3
                if(flag[1]==false){
                    if(turno[1]==0){
                            Thread.sleep(60);
                            flag[1]=true;
                            //seccion critica
                            turn[1]="perrito3";
                            //System.out.println("perrito 3");
                            dekker3(turn[0],turn[1]);
                            //
                            turno[1]=1;
                            flag[1]=false;
                            Thread.sleep(60);
                    }
                }
                //----------------------------------
                //dekker 1
                }//proceso2
                if(flag[0]==false){
                    if(turno[0]==1){
                            Thread.sleep(60);
                            flag[0]=true;
                            //seccion critica
                            turn[0]="perrito2";
                           // System.out.println("perrito 2");
                            //
                            turno[0]=0;
                            flag[0]=false;
                            Thread.sleep(60);
                    }
                }
                //----------------------------------
                //dekker 2
                //proceso4
                if(flag[1]==false){
                    if(turno[1]==1){
                            Thread.sleep(60);
                            flag[1]=true;
                            //seccion critica
                            turn[1] ="perrito4";
                            //System.out.println("perrito 4");
                             dekker3(turn[0],turn[1]);
                            //
                            turno[1]=0;
                            flag[1]=false;
                            Thread.sleep(60);
                    }
                } //----------------------------------
        }catch(Exception e){e.printStackTrace();}
    }
 
  
 

     public void dekker3(String ganador1,String ganador2){
        try{
     //--------------------------------------
     //ganador de proceso (1vs2) VS (2vs3)
                 //dekker 3
                 int turno=0;
                 boolean flag = false;
                if(flag==false){
                    if(turno==0){
                            Thread.sleep(60);
                            flag=true;
                            //seccion critica
                            winner1=ganador1;
                            //System.out.println(ganador1);
                             if(winner1=="perrito1"){
                                if(this.getName()=="perrito1"){
                                    if(this.isDead()==false){
                                             if(isDead()){ 
                                                this.stop();
                                             }
                                               else{
                                                    rc.setDatoCompartido(this.getName()); 
                                                    area.append(rc.getDatoCompartido()+" 'dkk' esta comiendo\n");
                                                   }            
                                        }Thread.sleep((int)(inic+Math.random()*fin));
                                }
                            }
                             else if(winner1=="perrito2"){
                                 if(this.getName()=="perrito2"){
                                    if(this.isDead()==false){
                                             if(isDead()){ 
                                                this.stop();
                                             }
                                               else{
                                                    rc.setDatoCompartido(this.getName()); 
                                                    area.append(rc.getDatoCompartido()+" 'dkk' esta comiendo\n");
                                                   }            
                                        }Thread.sleep((int)(inic+Math.random()*fin));    
                                }         
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
                            //seccion critica-------------------------
                             winner2=ganador2;
                             // System.out.println(ganador2);
                              
                              
                              if(winner2=="perrito3"){
                        if(this.getName()=="perrito3"){
                                    if(this.isDead()==false){
                                             if(isDead()){ 
                                                this.stop();
                                             }
                                               else{
                                                    rc.setDatoCompartido(this.getName()); 
                                                    area.append(rc.getDatoCompartido()+" 'dkk' esta comiendo\n");
                                                   }            
                                        }Thread.sleep((int)(inic+Math.random()*fin));
                                    }
                                }   
                   else if(winner2=="perrito4"){
                         if(this.getName()=="perrito4"){
                                    if(this.isDead()==false){
                                             if(isDead()){ 
                                                this.stop();
                                             }
                                               else{
                                                    rc.setDatoCompartido(this.getName()); 
                                                    area.append(rc.getDatoCompartido()+" 'dkk' esta comiendo\n");
                                                   }            
                                        }Thread.sleep((int)(inic+Math.random()*fin));
                                    
                                }
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
    
 public void dijkst(){
    try{
        //------------------------------------------------
             if(this.getName()=="perrito1"){k=0;}
        else if(this.getName()=="perrito2"){k=1;}
        else if(this.getName()=="perrito3"){k=2;}
        else if(this.getName()=="perrito4"){k=3;}
            b[i]=false;
            do{
                do{
                    if(k!=i){
                        c[i]=true;
                    if(b[k]==true)
                         k=i;
                    }
                      i++; if(i==3){i=0;}
                    //System.out.println(i+" ciclo 1");
                   }while(k==i);
                    //System.out.println(i+" ciclo 2");
                   c[i]=false;
                   for(j=0;j<n;j++){
                       if(j!=i && c[j]==false){
                           loop2=false;
                       }
                   }
             }while(loop2=false);
            //----------------------------------SECCION CRITICA------------------------------------------------
            // System.out.println("perrito "+(k+1));
             if(k==0){
                                if(this.getName()=="perrito1"){
                                    if(this.isDead()==false){
                                             if(isDead()){ 
                                                this.stop();
                                             }
                                               else{
                                                    rc.setDatoCompartido(this.getName()); 
                                                    area.append(rc.getDatoCompartido()+" 'dkk' esta comiendo\n");
                                                   }            
                                        }Thread.sleep((int)(inic+Math.random()*fin));
                                }
                            }
                             else if(k==1){
                                 if(this.getName()=="perrito2"){
                                    if(this.isDead()==false){
                                             if(isDead()){ 
                                                this.stop();
                                             }
                                               else{
                                                    rc.setDatoCompartido(this.getName()); 
                                                    area.append(rc.getDatoCompartido()+" 'dkk' esta comiendo\n");
                                                   }            
                                        }Thread.sleep((int)(inic+Math.random()*fin));    
                                }         
                            }
                             else if(k==2){
                                    if(this.getName()=="perrito3"){
                                                if(this.isDead()==false){
                                                         if(isDead()){ 
                                                            this.stop();
                                                         }
                                                           else{
                                                                rc.setDatoCompartido(this.getName()); 
                                                                area.append(rc.getDatoCompartido()+" 'dkk' esta comiendo\n");
                                                               }            
                                                    }Thread.sleep((int)(inic+Math.random()*fin));
                                                }
                                            }   
                               else if(k==3){
                                     if(this.getName()=="perrito4"){
                                                if(this.isDead()==false){
                                                         if(isDead()){ 
                                                            this.stop();
                                                         }
                                                           else{
                                                                rc.setDatoCompartido(this.getName()); 
                                                                area.append(rc.getDatoCompartido()+" 'dkk' esta comiendo\n");
                                                               }            
                                                    }Thread.sleep((int)(inic+Math.random()*fin));

                                            }
                                        }   
            
            
            
            
            //------------------------------------------------------------------------------------------------
             c[i]=true;
             b[i]=true;
 
 
 
 
 
 
 
 
        //------------------------------------------------
     }catch(Exception e){e.printStackTrace();}
 }   
}
