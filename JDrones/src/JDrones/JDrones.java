package JDrones;

//mport javax.swing.JFrame;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.util.ArrayList;
public class JDrones extends javax.swing.JFrame {
    private DibujaDrones panel;
    private int x;
    private int y;
    private int x1=0;
    private int y1=0;
    private NumDron n;
    private BufferedImage ima;
    private ArrayList<Dron> drones;
    public static int nu=0;
    public static int contador=0;//-----------contadior de lineas
    public static boolean mutecs =false;
    public static boolean sin =false;
    
    
    public JDrones() {
        //iniciar con pantalla completa
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        try{                                        // PASARLO a MENU
            ima = ImageIO.read(new File("mapaCU.png"));
        }catch(IOException e){e.printStackTrace();}
        drones =new ArrayList<Dron>();
        panel= new DibujaDrones(ima);
        panel.setBounds(0, 0, 1344, 599);
        add(panel);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        algor = new javax.swing.ButtonGroup();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        nuevo = new javax.swing.JMenuItem();
        eliminar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        sinal = new javax.swing.JRadioButtonMenuItem();
        mute = new javax.swing.JRadioButtonMenuItem();
        sema = new javax.swing.JRadioButtonMenuItem();
        cond = new javax.swing.JRadioButtonMenuItem();
        moni = new javax.swing.JRadioButtonMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Concurrente");

        jMenu1.setText("File");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Drones");

        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        jMenu2.add(nuevo);

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jMenu2.add(eliminar);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Sincronización");

        algor.add(sinal);
        sinal.setSelected(true);
        sinal.setText("sin algoritmo");
        sinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinalActionPerformed(evt);
            }
        });
        jMenu5.add(sinal);

        algor.add(mute);
        mute.setText("Mutex");
        mute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muteActionPerformed(evt);
            }
        });
        jMenu5.add(mute);

        algor.add(sema);
        sema.setText("Semáforo");
        jMenu5.add(sema);

        algor.add(cond);
        cond.setText("Variable de Condición");
        jMenu5.add(cond);

        algor.add(moni);
        moni.setText("Monitores");
        jMenu5.add(moni);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1345, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        if(mute.isSelected()){ 
           mutecs =true;  
        } 
        if(sinal.isSelected()){ 
           sin =true;  
        }
        if(contador<7&&nu<11){ 
           reincarneito();
            

            drones.add(new Dron(x,y,panel));
            panel.CreaCirculo();
            for(Dron d: drones){
                if(!d.isAlive())
                try{
                    if(nu==0){
                        d.setName("1");  contador++;}
                    if(nu==1){
                        d.setName("2");  contador++;}
                    if(nu==2){
                        d.setName("3");  contador++;}
                     if(nu==4){
                        d.setName("5");  contador++;}
                   if(nu==6){
                        d.setName("7");  contador++;}
                    if(nu==8){
                        d.setName("9");;contador++;}  
                    if(nu==3)
                        d.setName("4");
                    if(nu==5)
                        d.setName("6");
                     if(nu==7)
                        d.setName("8");
                   if(nu==9){
                        d.setName("10"); contador++;
                   }
                    
                        d.start();
                }catch(IllegalThreadStateException ex){ex.printStackTrace();}
            }
            nu++;
            
           System.out.println("n"+nu);
      
        }System.out.println("conta"+contador);
    }//GEN-LAST:event_nuevoActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int HiloRand=(int)(Math.random()*4);
        System.out.println("se va a morir el perrito "+ (HiloRand+1));
        switch(HiloRand){
            case 0:
                try{
                   
                   
                }catch(Exception e){e.printStackTrace();}
                break;
            case 1:
                 try{
                    
                }catch(Exception e){e.printStackTrace();}
                 break;
            case 2:
                 try{
                    
                }catch(Exception e){e.printStackTrace();}
                 break;
            case 3:
                 try{
                    
                }catch(Exception e){e.printStackTrace();}
                 break;
            default:break;
        }
            
    }//GEN-LAST:event_eliminarActionPerformed

    private void muteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_muteActionPerformed

    private void sinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sinalActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JDrones().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup algor;
    private javax.swing.JRadioButtonMenuItem cond;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButtonMenuItem moni;
    private javax.swing.JRadioButtonMenuItem mute;
    private javax.swing.JMenuItem nuevo;
    private javax.swing.JRadioButtonMenuItem sema;
    private javax.swing.JRadioButtonMenuItem sinal;
    // End of variables declaration//GEN-END:variables
public void reincarneito(){
    //para bola 1 
    if(nu>-1){
    //para bola 1
     coord.x1=0;
     coord.y1=0;
     Dron.a1=1;
     Dron.b1=1;
    }if(nu>0){
     //para bola 2
     coord.x2=672;
     coord.y2=0;
     Dron.a2=1;
     Dron.b2=1;
      //-------------------
    }if(nu==2){
     //para bola 3
     coord.x3=0;
     coord.y3=300;
     Dron.a3=1;
     Dron.b3=1;
      //-------------------
    }if(nu==3){
     //para bola 3
     coord.x3=0;
     coord.y3=300;
     Dron.a3=1;
     Dron.b3=1;
     //para bola 4
     coord.x4=672;
     coord.y4=300;
     Dron.a4=1;
     Dron.b4=1;
    
     //-------------------
     }if(nu==4){
     //para bola 3
     coord.x3=0;
     coord.y3=200;
     Dron.a3=1;
     Dron.b3=1;
     //para bola 4
     coord.x4=672;
     coord.y4=200;
     Dron.a4=1;
     Dron.b4=1;
     //para bola 5
     coord.x5=0;
     coord.y5=399;
     Dron.a5=1;
     Dron.b5=1;
     //-------------------
    }
    if(nu==5){
        //para bola 3
     coord.x3=0;
     coord.y3=200;
     Dron.a3=1;
     Dron.b3=1;
     //para bola 4
     coord.x4=672;
     coord.y4=200;
     Dron.a4=1;
     Dron.b4=1;
     //para bola 5
     coord.x5=0;
     coord.y5=399;
     Dron.a5=1;
     Dron.b5=1;
      //para bola 6
     coord.x6=672;
     coord.y6=399;
     Dron.a6=1;
     Dron.b6=1;
    }
      //-------------------
      if(nu==6){
        //para bola 3
     coord.x3=0;
     coord.y3=200;
     Dron.a3=1;
     Dron.b3=1;
     //para bola 4
     coord.x4=672;
     coord.y4=200;
     Dron.a4=1;
     Dron.b4=1;
     //para bola 5
     coord.x5=0;
     coord.y5=399;
     Dron.a5=1;
     Dron.b5=1;
      //para bola 6
     coord.x6=672;
     coord.y6=399;
     Dron.a6=1;
     Dron.b6=1;
      //para bola 7
     coord.x7=0;
     coord.y7=448;
     Dron.a7=1;
     Dron.b7=1;
    }
       //-------------------
    if(nu==7){
           //para bola 3
     coord.x3=0;
     coord.y3=150;
     Dron.a3=1;
     Dron.b3=1;
     //para bola 4
     coord.x4=672;
     coord.y4=150;
     Dron.a4=1;
     Dron.b4=1;
     
     //para bola 5
     coord.x5=0;
     coord.y5=299;
     Dron.a5=1;
     Dron.b5=1;
      //para bola 6
     coord.x6=672;
     coord.y6=299;
     Dron.a6=1;
     Dron.b6=1;
      //para bola 7
     coord.x7=0;
     coord.y7=448;
     Dron.a7=1;
     Dron.b7=1;
     //para bola 8
     coord.x8=672;
     coord.y8=448;
     Dron.a8=1;
     Dron.b8=1;
  
    }
     //-------------------
     if(nu==8){
           //para bola 3
     coord.x3=0;
     coord.y3=150;
     Dron.a3=1;
     Dron.b3=1;
     //para bola 4
     coord.x4=672;
     coord.y4=150;
     Dron.a4=1;
     Dron.b4=1;
     
     //para bola 5
     coord.x5=0;
     coord.y5=299;
     Dron.a5=1;
     Dron.b5=1;
      //para bola 6
     coord.x6=672;
     coord.y6=299;
     Dron.a6=1;
     Dron.b6=1;
      //para bola 7
     coord.x7=0;
     coord.y7=448;
     Dron.a7=1;
     Dron.b7=1;
     //para bola 8
     coord.x8=672;
     coord.y8=448;
     Dron.a8=1;
     Dron.b8=1;
     //para bola 9
     coord.x9=0;
     coord.y9=478;
     Dron.a9=1;
     Dron.b9=1;
    }
      //-------------------
      if(nu==9){
        //para bola 3
     coord.x3=0;
     coord.y3=120;
     Dron.a3=1;
     Dron.b3=1;
     //para bola 4
     coord.x4=672;
     coord.y4=120;
     Dron.a4=1;
     Dron.b4=1;
     //para bola 5
     coord.x5=0;
     coord.y5=239;
     Dron.a5=1;
     Dron.b5=1;
      //para bola 6
     coord.x6=672;
     coord.y6=239;
     Dron.a6=1;
     Dron.b6=1;
      //para bola 7
     coord.x7=0;
     coord.y7=358;
     Dron.a7=1;
     Dron.b7=1;
     //para bola 8
     coord.x8=672;
     coord.y8=448;
     Dron.a8=1;
     Dron.b8=1;
      //para bola 9
     coord.x9=0;
     coord.y9=490;
     Dron.a9=1;
     Dron.b9=1;
      //para bola 10
     coord.x10=672;
     coord.y10=490;
     Dron.a10=1;
     Dron.b10=1;
    }
       //-------------------
        //-------------------
    if(nu==10){
        //para bola 3
     coord.x3=0;
     coord.y3=120;
     Dron.a3=1;
     Dron.b3=1;
     //para bola 4
     coord.x4=672;
     coord.y4=120;
     Dron.a4=1;
     Dron.b4=1;
     //para bola 5
     coord.x5=0;
     coord.y5=239;
     Dron.a5=1;
     Dron.b5=1;
      //para bola 6
     coord.x6=672;
     coord.y6=239;
     Dron.a6=1;
     Dron.b6=1;
      //para bola 7
     coord.x7=0;
     coord.y7=358;
     Dron.a7=1;
     Dron.b7=1;
     //para bola 8
     coord.x8=672;
     coord.y8=448;
     Dron.a8=1;
     Dron.b8=1;
      //para bola 9
     coord.x9=0;
     coord.y9=490;
     Dron.a9=1;
     Dron.b9=1;
      //para bola 10
     coord.x10=672;
     coord.y10=477;
     Dron.a10=1;
     Dron.b10=1;
    }
        
    }
}
