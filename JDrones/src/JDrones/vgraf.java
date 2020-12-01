/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDrones;

/**
 *
 * @author jeans
 */
public class vgraf extends javax.swing.JFrame {

    private gPerformed panelG;
    private gPerformed2 pane2G;
    private gPerformed2 pane3G;
    public vgraf() {
        initComponents();
       panelG= new gPerformed();
        panelG.setBounds(0,50,800,800);
       add(panelG);
      pane2G= new gPerformed2();
        pane2G.setBounds(800,50,800,400);
       add(pane2G);
       pane3G= new gPerformed2();
        pane3G.setBounds(800,450,800,400);
       add(pane3G);
           metodo.setText("numero de bolitas = "+ JDrones.nu +"    algoritmo= "+JDrones.str);
       switch (JDrones.nu){
            case 1:
                System.out.println("graf bola 1");
                panelG.actualizar(JDrones.datosX1,JDrones.datosY1,JDrones.datosX2,JDrones.datosY2,JDrones.datosX3,JDrones.datosY3,JDrones.datosX4,JDrones.datosY4,JDrones.datosX5,JDrones.datosY5,JDrones.datosX6,JDrones.datosY6,JDrones.datosX7,JDrones.datosY7,JDrones.datosX8,JDrones.datosY8,JDrones.datosX9,JDrones.datosY9,JDrones.datosX10,JDrones.datosY10);
                
            break;
            case 2:
                 panelG.limpiar();
                 panelG.actualizar(JDrones.datosX1,JDrones.datosY1,JDrones.datosX2,JDrones.datosY2,JDrones.datosX3,JDrones.datosY3,JDrones.datosX4,JDrones.datosY4,JDrones.datosX5,JDrones.datosY5,JDrones.datosX6,JDrones.datosY6,JDrones.datosX7,JDrones.datosY7,JDrones.datosX8,JDrones.datosY8,JDrones.datosX9,JDrones.datosY9,JDrones.datosX10,JDrones.datosY10);
                
                
            break;
            case 3:
                panelG.limpiar();
                 panelG.actualizar(JDrones.datosX1,JDrones.datosY1,JDrones.datosX2,JDrones.datosY2,JDrones.datosX3,JDrones.datosY3,JDrones.datosX4,JDrones.datosY4,JDrones.datosX5,JDrones.datosY5,JDrones.datosX6,JDrones.datosY6,JDrones.datosX7,JDrones.datosY7,JDrones.datosX8,JDrones.datosY8,JDrones.datosX9,JDrones.datosY9,JDrones.datosX10,JDrones.datosY10);
                
                
            break;
            case 4:
                panelG.limpiar();
                 panelG.actualizar(JDrones.datosX1,JDrones.datosY1,JDrones.datosX2,JDrones.datosY2,JDrones.datosX3,JDrones.datosY3,JDrones.datosX4,JDrones.datosY4,JDrones.datosX5,JDrones.datosY5,JDrones.datosX6,JDrones.datosY6,JDrones.datosX7,JDrones.datosY7,JDrones.datosX8,JDrones.datosY8,JDrones.datosX9,JDrones.datosY9,JDrones.datosX10,JDrones.datosY10);
                
                
            break;
            case 5:
                panelG.limpiar();
                 panelG.actualizar(JDrones.datosX1,JDrones.datosY1,JDrones.datosX2,JDrones.datosY2,JDrones.datosX3,JDrones.datosY3,JDrones.datosX4,JDrones.datosY4,JDrones.datosX5,JDrones.datosY5,JDrones.datosX6,JDrones.datosY6,JDrones.datosX7,JDrones.datosY7,JDrones.datosX8,JDrones.datosY8,JDrones.datosX9,JDrones.datosY9,JDrones.datosX10,JDrones.datosY10);
                
                
            break;
            case 6:
                panelG.limpiar();
                 panelG.actualizar(JDrones.datosX1,JDrones.datosY1,JDrones.datosX2,JDrones.datosY2,JDrones.datosX3,JDrones.datosY3,JDrones.datosX4,JDrones.datosY4,JDrones.datosX5,JDrones.datosY5,JDrones.datosX6,JDrones.datosY6,JDrones.datosX7,JDrones.datosY7,JDrones.datosX8,JDrones.datosY8,JDrones.datosX9,JDrones.datosY9,JDrones.datosX10,JDrones.datosY10);
                
                
            break;
            case 7:
                panelG.limpiar();
                 panelG.actualizar(JDrones.datosX1,JDrones.datosY1,JDrones.datosX2,JDrones.datosY2,JDrones.datosX3,JDrones.datosY3,JDrones.datosX4,JDrones.datosY4,JDrones.datosX5,JDrones.datosY5,JDrones.datosX6,JDrones.datosY6,JDrones.datosX7,JDrones.datosY7,JDrones.datosX8,JDrones.datosY8,JDrones.datosX9,JDrones.datosY9,JDrones.datosX10,JDrones.datosY10);
                
            break;
            case 8:
                panelG.limpiar();
                 panelG.actualizar(JDrones.datosX1,JDrones.datosY1,JDrones.datosX2,JDrones.datosY2,JDrones.datosX3,JDrones.datosY3,JDrones.datosX4,JDrones.datosY4,JDrones.datosX5,JDrones.datosY5,JDrones.datosX6,JDrones.datosY6,JDrones.datosX7,JDrones.datosY7,JDrones.datosX8,JDrones.datosY8,JDrones.datosX9,JDrones.datosY9,JDrones.datosX10,JDrones.datosY10);
                
            break;
            case 9:
                panelG.limpiar();
                 panelG.actualizar(JDrones.datosX1,JDrones.datosY1,JDrones.datosX2,JDrones.datosY2,JDrones.datosX3,JDrones.datosY3,JDrones.datosX4,JDrones.datosY4,JDrones.datosX5,JDrones.datosY5,JDrones.datosX6,JDrones.datosY6,JDrones.datosX7,JDrones.datosY7,JDrones.datosX8,JDrones.datosY8,JDrones.datosX9,JDrones.datosY9,JDrones.datosX10,JDrones.datosY10);
                
            break;
            case 10:
                panelG.limpiar();
                 panelG.actualizar(JDrones.datosX1,JDrones.datosY1,JDrones.datosX2,JDrones.datosY2,JDrones.datosX3,JDrones.datosY3,JDrones.datosX4,JDrones.datosY4,JDrones.datosX5,JDrones.datosY5,JDrones.datosX6,JDrones.datosY6,JDrones.datosX7,JDrones.datosY7,JDrones.datosX8,JDrones.datosY8,JDrones.datosX9,JDrones.datosY9,JDrones.datosX10,JDrones.datosY10);
                
            break;
        }
       
       switch (JDrones.nu){
            case 1:
                System.out.println("graf bola 1");
                pane2G.actualizar(JDrones.datosY1,JDrones.datosY3,JDrones.datosY5,JDrones.datosY7,JDrones.datosY9);
                pane3G.actualizar(JDrones.datosY2,JDrones.datosY4,JDrones.datosY6,JDrones.datosY8,JDrones.datosY10);
                
            break;
            case 2:
                 pane2G.limpiar();
                 pane2G.actualizar(JDrones.datosY1,JDrones.datosY3,JDrones.datosY5,JDrones.datosY7,JDrones.datosY9);
                pane3G.actualizar(JDrones.datosY2,JDrones.datosY4,JDrones.datosY6,JDrones.datosY8,JDrones.datosY10);
            break;
            case 3:
                pane2G.limpiar();
                 pane2G.actualizar(JDrones.datosY1,JDrones.datosY3,JDrones.datosY5,JDrones.datosY7,JDrones.datosY9);
                pane3G.actualizar(JDrones.datosY2,JDrones.datosY4,JDrones.datosY6,JDrones.datosY8,JDrones.datosY10);
            break;
            case 4:
                pane2G.limpiar();
                pane2G.actualizar(JDrones.datosY1,JDrones.datosY3,JDrones.datosY5,JDrones.datosY7,JDrones.datosY9);
                pane3G.actualizar(JDrones.datosY2,JDrones.datosY4,JDrones.datosY6,JDrones.datosY8,JDrones.datosY10);
            break;
            case 5:
                pane2G.limpiar();
                pane2G.actualizar(JDrones.datosY1,JDrones.datosY3,JDrones.datosY5,JDrones.datosY7,JDrones.datosY9);
                pane3G.actualizar(JDrones.datosY2,JDrones.datosY4,JDrones.datosY6,JDrones.datosY8,JDrones.datosY10);
            break;
            case 6:
                pane2G.limpiar();
                pane2G.actualizar(JDrones.datosY1,JDrones.datosY3,JDrones.datosY5,JDrones.datosY7,JDrones.datosY9);
                pane3G.actualizar(JDrones.datosY2,JDrones.datosY4,JDrones.datosY6,JDrones.datosY8,JDrones.datosY10);
            break;
            case 7:
                pane2G.limpiar();
                pane2G.actualizar(JDrones.datosY1,JDrones.datosY3,JDrones.datosY5,JDrones.datosY7,JDrones.datosY9);
                pane3G.actualizar(JDrones.datosY2,JDrones.datosY4,JDrones.datosY6,JDrones.datosY8,JDrones.datosY10);
            break;
            case 8:
                pane2G.limpiar();
                pane2G.actualizar(JDrones.datosY1,JDrones.datosY3,JDrones.datosY5,JDrones.datosY7,JDrones.datosY9);
                pane3G.actualizar(JDrones.datosY2,JDrones.datosY4,JDrones.datosY6,JDrones.datosY8,JDrones.datosY10);
            break;
            case 9:
                pane2G.limpiar();
                pane2G.actualizar(JDrones.datosY1,JDrones.datosY3,JDrones.datosY5,JDrones.datosY7,JDrones.datosY9);
                pane3G.actualizar(JDrones.datosY2,JDrones.datosY4,JDrones.datosY6,JDrones.datosY8,JDrones.datosY10);
            break;
            case 10:
                pane2G.limpiar();
                pane2G.actualizar(JDrones.datosY1,JDrones.datosY3,JDrones.datosY5,JDrones.datosY7,JDrones.datosY9);
                pane3G.actualizar(JDrones.datosY2,JDrones.datosY4,JDrones.datosY6,JDrones.datosY8,JDrones.datosY10);
            break;
        }
       
       

       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        metodo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        metodo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("drones 1 3 5 7 9");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("drones 2 4 6 8 10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(metodo, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(866, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(594, 594, 594))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(metodo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(374, 374, 374))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vgraf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vgraf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vgraf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vgraf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vgraf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel metodo;
    // End of variables declaration//GEN-END:variables
}
