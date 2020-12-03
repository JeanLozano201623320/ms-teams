package JDrones;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.util.ArrayList;
public class JDrones extends javax.swing.JFrame {
    private DibujaDrones panel;
   private gPerformed panelG;
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
     public static boolean semaf =false;
     public static boolean monif =false;
     public static boolean vcf =false;
     public static boolean barf =false;
     public static double[] datosX1;
    public static  double[] datosY1;
    public static double[] datosX2;
    public static  double[] datosY2;
    public static double[] datosX3;
    public static  double[] datosY3;
    public static double[] datosX4;
    public static  double[] datosY4;
    public static double[] datosX5;
    public static  double[] datosY5;
      public static double[] datosX6;
    public static  double[] datosY6;
    public static double[] datosX7;
    public static  double[] datosY7;
    public static double[] datosX8;
    public static  double[] datosY8;
    public static double[] datosX9;
    public static  double[] datosY9;
    public static double[] datosX10;
    public static  double[] datosY10;
  
    public static String str = "";
    
    
    public JDrones() {
        initComponents();
        try{                                        
            ima = ImageIO.read(new File("mapaCU.png"));
        }catch(IOException e){e.printStackTrace();}
        datosX1 = new double[100000];
        datosY1 = new double[100000];
        datosX2 = new double[100000];
        datosY2 = new double[100000];
        datosX3 = new double[100000];
        datosY3 = new double[100000];
        datosX4 = new double[100000];
        datosY4 = new double[100000];
        datosX5 = new double[100000];
        datosY5 = new double[100000];
        datosX6 = new double[100000];
        datosY6 = new double[100000];
        datosX7 = new double[100000];
        datosY7 = new double[100000];
        datosX8 = new double[100000];
        datosY8 = new double[100000];
        datosX9 = new double[100000];
        datosY9 = new double[100000];
        datosX10 = new double[100000];
        datosY10 = new double[100000];
        
        
        drones =new ArrayList<Dron>();
        panel= new DibujaDrones(ima);
        panel.setBounds(0, 0, 1344, 599);
        add(panel);
        //panelG= new gPerformed();
        //panelG.setBounds(1345,0,570,600);
       //add(panelG);
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
        jMenu5 = new javax.swing.JMenu();
        sinal = new javax.swing.JRadioButtonMenuItem();
        mute = new javax.swing.JRadioButtonMenuItem();
        sema = new javax.swing.JRadioButtonMenuItem();
        vc = new javax.swing.JRadioButtonMenuItem();
        moni = new javax.swing.JRadioButtonMenuItem();
        bar = new javax.swing.JRadioButtonMenuItem();
        jMenu6 = new javax.swing.JMenu();
        graficar = new javax.swing.JMenuItem();
        borrar = new javax.swing.JMenuItem();

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
        sema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semaActionPerformed(evt);
            }
        });
        jMenu5.add(sema);

        algor.add(vc);
        vc.setText("Variable de Condición");
        jMenu5.add(vc);

        algor.add(moni);
        moni.setText("Monitores");
        jMenu5.add(moni);

        algor.add(bar);
        bar.setText("Barreras");
        bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barActionPerformed(evt);
            }
        });
        jMenu5.add(bar);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("JFree chart");

        graficar.setText("Graficar");
        graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficarActionPerformed(evt);
            }
        });
        jMenu6.add(graficar);

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        jMenu6.add(borrar);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1346, Short.MAX_VALUE)
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

    private void muteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_muteActionPerformed

    private void sinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sinalActionPerformed

    private void semaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semaActionPerformed

    private void graficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficarActionPerformed
        vgraf ventana = new vgraf();
        ventana.setVisible(true);
        
       // panelG.actualizar(datosX,datosY);
        
    }//GEN-LAST:event_graficarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
       // panelG.limpiar();
       Dron.iter=0;
       for(int i=0;i<JDrones.datosX1.length;i++){
              JDrones.datosX1[i]=0;
              JDrones.datosY1[i]=0;
              JDrones.datosX2[i]=0;
              JDrones.datosY2[i]=0;
              JDrones.datosX3[i]=0;
              JDrones.datosY3[i]=0;
              JDrones.datosX4[i]=0;
              JDrones.datosY4[i]=0;
              JDrones.datosX5[i]=0;
              JDrones.datosY5[i]=0;
              JDrones.datosX6[i]=0;
              JDrones.datosY6[i]=0;
              JDrones.datosX7[i]=0;
              JDrones.datosY7[i]=0;
              JDrones.datosX8[i]=0;
              JDrones.datosY8[i]=0;
              JDrones.datosX9[i]=0;
              JDrones.datosY9[i]=0;
              JDrones.datosX10[i]=0;
              JDrones.datosY10[i]=0;
       }
    }//GEN-LAST:event_borrarActionPerformed

    private void barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        if(mute.isSelected()){
            mutecs =true;
            sin =false;
            semaf=false;
            vcf=false;
            monif=false;
            barf=false;
            str = "mutex";
        }
        if(sinal.isSelected()){
            sin =true;
            mutecs =false;
            semaf=false;
            vcf=false;
            monif=false;
            barf=false;
            str = "ninguno";
        }
        if(sema.isSelected()){
            semaf=true;
            mutecs =false;
            sin =false;
            vcf=false;
            monif=false;
            barf=false;
            str = "semaforos";
        }
        if(vc.isSelected()){
            vcf=true;
            mutecs =false;
            sin =false;
            semaf=false;
            monif=false;
            barf=false;
            str = "variable de confdicion";
        }
        if(moni.isSelected()){
            monif=true;
            mutecs =false;
            sin =false;
            semaf=false;
            vcf=false;
            barf=false;
            str = "monitores";
        }
        if(bar.isSelected()){
            barf=true;
            mutecs =false;
            sin =false;
            semaf=false;
            vcf=false;
            monif=false;
            str = "barreras";
        }
        Dron.numCalls=0;
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
            //Barrier.maxNumThreads=nu;
            nu++;

            System.out.println("n"+nu);

        }System.out.println("conta"+contador);
        Dron.iter=0;
        for(int i=0;i<JDrones.datosX1.length;i++){
            JDrones.datosX1[i]=0;
            JDrones.datosY1[i]=0;
            JDrones.datosX2[i]=0;
            JDrones.datosY2[i]=0;
            JDrones.datosX3[i]=0;
            JDrones.datosY3[i]=0;
            JDrones.datosX4[i]=0;
            JDrones.datosY4[i]=0;
            JDrones.datosX5[i]=0;
            JDrones.datosY5[i]=0;
            JDrones.datosX6[i]=0;
            JDrones.datosY6[i]=0;
            JDrones.datosX7[i]=0;
            JDrones.datosY7[i]=0;
            JDrones.datosX8[i]=0;
            JDrones.datosY8[i]=0;
            JDrones.datosX9[i]=0;
            JDrones.datosY9[i]=0;
            JDrones.datosX10[i]=0;
            JDrones.datosY10[i]=0;
        }
    }//GEN-LAST:event_nuevoActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JDrones().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup algor;
    private javax.swing.JRadioButtonMenuItem bar;
    private javax.swing.JMenuItem borrar;
    private javax.swing.JMenuItem graficar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButtonMenuItem moni;
    private javax.swing.JRadioButtonMenuItem mute;
    private javax.swing.JMenuItem nuevo;
    private javax.swing.JRadioButtonMenuItem sema;
    private javax.swing.JRadioButtonMenuItem sinal;
    private javax.swing.JRadioButtonMenuItem vc;
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
     coord.x2=673;
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
     coord.x4=673;
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
     coord.x4=673;
     coord.y4=200;
     Dron.a4=1;
     Dron.b4=1;
     //para bola 5
     coord.x5=0;
     coord.y5=400;
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
     coord.x4=673;
     coord.y4=200;
     Dron.a4=1;
     Dron.b4=1;
     //para bola 5
     coord.x5=0;
     coord.y5=400;
     Dron.a5=1;
     Dron.b5=1;
      //para bola 6
     coord.x6=673;
     coord.y6=400;
     Dron.a6=1;
     Dron.b6=1;
    }
      //-------------------
      if(nu==6){
        //para bola 3
     coord.x3=0;
     coord.y3=150;
     Dron.a3=1;
     Dron.b3=1;
     //para bola 4
     coord.x4=673;
     coord.y4=150;
     Dron.a4=1;
     Dron.b4=1;
     //para bola 5
     coord.x5=0;
     coord.y5=300;
     Dron.a5=1;
     Dron.b5=1;
      //para bola 6
     coord.x6=673;
     coord.y6=300;
     Dron.a6=1;
     Dron.b6=1;
      //para bola 7
     coord.x7=0;
     coord.y7=450;
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
     coord.x4=673;
     coord.y4=150;
     Dron.a4=1;
     Dron.b4=1;
     
     //para bola 5
     coord.x5=0;
     coord.y5=300;
     Dron.a5=1;
     Dron.b5=1;
      //para bola 6
     coord.x6=673;
     coord.y6=300;
     Dron.a6=1;
     Dron.b6=1;
      //para bola 7
     coord.x7=0;
     coord.y7=450;
     Dron.a7=1;
     Dron.b7=1;
     //para bola 8
     coord.x8=673;
     coord.y8=450;
     Dron.a8=1;
     Dron.b8=1;
  
    }
     //-------------------
     if(nu==8){
           //para bola 3
     coord.x3=0;
     coord.y3=120;
     Dron.a3=1;
     Dron.b3=1;
     //para bola 4
     coord.x4=673;
     coord.y4=120;
     Dron.a4=1;
     Dron.b4=1;
     
     //para bola 5
     coord.x5=0;
     coord.y5=240;
     Dron.a5=1;
     Dron.b5=1;
      //para bola 6
     coord.x6=673;
     coord.y6=240;
     Dron.a6=1;
     Dron.b6=1;
      //para bola 7
     coord.x7=0;
     coord.y7=360;
     Dron.a7=1;
     Dron.b7=1;
     //para bola 8
     coord.x8=673;
     coord.y8=360;
     Dron.a8=1;
     Dron.b8=1;
     //para bola 9
     coord.x9=0;
     coord.y9=480;
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
     coord.x4=673;
     coord.y4=120;
     Dron.a4=1;
     Dron.b4=1;
     //para bola 5
     coord.x5=0;
     coord.y5=240;
     Dron.a5=1;
     Dron.b5=1;
      //para bola 6
     coord.x6=673;
     coord.y6=240;
     Dron.a6=1;
     Dron.b6=1;
      //para bola 7
     coord.x7=0;
     coord.y7=360;
     Dron.a7=1;
     Dron.b7=1;
     //para bola 8
     coord.x8=673;
     coord.y8=360;
     Dron.a8=1;
     Dron.b8=1;
      //para bola 9
     coord.x9=0;
     coord.y9=480;
     Dron.a9=1;
     Dron.b9=1;
      //para bola 10
     coord.x10=673;
     coord.y10=480;
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
     coord.x4=673;
     coord.y4=120;
     Dron.a4=1;
     Dron.b4=1;
     //para bola 5
     coord.x5=0;
     coord.y5=240;
     Dron.a5=1;
     Dron.b5=1;
      //para bola 6
     coord.x6=673;
     coord.y6=240;
     Dron.a6=1;
     Dron.b6=1;
      //para bola 7
     coord.x7=0;
     coord.y7=360;
     Dron.a7=1;
     Dron.b7=1;
     //para bola 8
     coord.x8=673;
     coord.y8=360;
     Dron.a8=1;
     Dron.b8=1;
      //para bola 9
     coord.x9=0;
     coord.y9=480;
     Dron.a9=1;
     Dron.b9=1;
      //para bola 10
     coord.x10=673;
     coord.y10=480;
     Dron.a10=1;
     Dron.b10=1;
    }
        
    }
}
