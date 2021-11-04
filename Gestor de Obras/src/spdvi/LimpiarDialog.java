/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package spdvi;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexi
 */
public class LimpiarDialog extends javax.swing.JDialog {

    MainForm mainF;
        
    public LimpiarDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mainF = (MainForm) this.getParent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAviso = new javax.swing.JLabel();
        lblAviso2 = new javax.swing.JLabel();
        btnYes = new javax.swing.JButton();
        btnNo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblAviso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAviso.setText("Aviso importante! tienes fotos en la carpeta images de OpusList que no usas! ");

        lblAviso2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAviso2.setText("Deseas limpiarlo?");

        btnYes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnYes.setText("Obvio");
        btnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesActionPerformed(evt);
            }
        });

        btnNo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNo.setText("No, gracias");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAviso))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(lblAviso2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btnYes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(lblAviso2)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnYes)
                    .addComponent(btnNo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesActionPerformed
        // TODO add your handling code here:
        comprobante();
        this.setVisible(false);
    }//GEN-LAST:event_btnYesActionPerformed

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnNoActionPerformed

    public void comprobante(){
        List imagenesDeMas = new ArrayList();
        File imagesFolder = new File(System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\images");
        File[] imageFiles = imagesFolder.listFiles();
        
            for(int i = 0; i < imageFiles.length;i++){
                imagenesDeMas.add(imageFiles[i].getAbsoluteFile().getName());
            }

            for(int i = 0; i < mainF.getLista().size();i++){
                for(int j = 0; j < imageFiles.length; j++){
                    if(mainF.getLista().get(i).getImagen().equals(imageFiles[j].getAbsoluteFile().getName())){
                        imagenesDeMas.remove(mainF.getLista().get(i).getImagen());
                        imagenesDeMas.remove("desktop.ini");
                    }
                }
            }
            for(int i = 0;i < imagenesDeMas.size();i++){
                for (int j = 0;j < imageFiles.length; j++){
                    if(imagenesDeMas.get(i).equals(imageFiles[j].getAbsoluteFile().getName())){
                        File imagenBorrar = new File(System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\images\\"+imageFiles[j].getAbsoluteFile().getName());
                        imagenBorrar.delete();
                    }
                }
            }
        }
        
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
            java.util.logging.Logger.getLogger(LimpiarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LimpiarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LimpiarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LimpiarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LimpiarDialog dialog = new LimpiarDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnYes;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblAviso2;
    // End of variables declaration//GEN-END:variables
}
