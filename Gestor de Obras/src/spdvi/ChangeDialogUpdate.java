/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package spdvi;

import com.google.gson.Gson;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author alexi
 */
public class ChangeDialogUpdate extends javax.swing.JDialog {//Clase update para cuando pulsamos el boton

    MainForm mainF;
    Gson gson = new Gson();
    JFileChooser fchImagenChooser;
    String nombre;
    
    public ChangeDialogUpdate(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        fchImagenChooser = new JFileChooser();
        mainF = (MainForm) this.getParent();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRegistro = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        lblRegistro = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        lblFormato = new javax.swing.JLabel();
        txtFormato = new javax.swing.JTextField();
        lblAutor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        lblImagenLink = new javax.swing.JLabel();
        txtImagen = new javax.swing.JTextField();
        lblPerfil = new javax.swing.JLabel();
        btnCargarImagen = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtRegistro.setEditable(false);
        txtRegistro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtTitulo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblRegistro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblRegistro.setText("Registro");
        lblRegistro.setToolTipText("");

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTitulo.setText("Titulo");

        txtYear.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblYear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblYear.setText("Año");

        lblFormato.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFormato.setText("Formato");

        txtFormato.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblAutor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAutor.setText("Autor");

        txtAutor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblImagenLink.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblImagenLink.setText("Imagen");

        txtImagen.setEditable(false);
        txtImagen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnCargarImagen.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCargarImagen.setText("Cargar Imagen");
        btnCargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarImagenActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUpdate.setText("Actualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblImagenLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAutor)
                    .addComponent(lblAutor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFormato)
                    .addComponent(lblFormato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRegistro, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(txtYear)
                    .addComponent(txtImagen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addGap(16, 16, 16)
                        .addComponent(btnCargarImagen)
                        .addGap(83, 83, 83))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblImagenLink, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarImagen)
                    .addComponent(btnUpdate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Cargamos la imagen desde un fileChooser
    private void btnCargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarImagenActionPerformed
        // TODO add your handling code here:
        
        int result = fchImagenChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage bufferedImage = ImageIO.read(new File(fchImagenChooser.getSelectedFile().getAbsolutePath()));
                ImageIcon icon = mainF.resizeImageIcon(bufferedImage, lblPerfil.getWidth(), lblPerfil.getHeight());
                nombre = fchImagenChooser.getSelectedFile().getAbsolutePath();
                lblPerfil.setIcon(icon);
                txtImagen.setText(fchImagenChooser.getSelectedFile().getName());
            }
            catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        else if(result == JFileChooser.CANCEL_OPTION){
            try {
                BufferedImage bufferedImage = ImageIO.read(new File("src\\spdvi\\ImagenesDefecto\\Defecto.jpg"));
                ImageIcon icon = mainF.resizeImageIcon(bufferedImage, lblPerfil.getWidth(), lblPerfil.getHeight());
                nombre = "src\\spdvi\\ImagenesDefecto\\Defecto.jpg";
                lblPerfil.setIcon(icon);
                txtImagen.setText("Defecto.jpg");
            } catch (IOException ex) {
                Logger.getLogger(ChangeDialogUpdate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnCargarImagenActionPerformed

    //Cambiamos los valores de la obra que equivale al registro escrito en BuscarDialog
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        for (Obra o: mainF.getLista()) {
            if (o.getRegistre().equals(txtRegistro.getText())) {
                try {
                    o.setTitol(txtTitulo.getText());
                    o.setAny(txtYear.getText());
                    o.setFormat(txtFormato.getText());
                    o.setAutor(txtAutor.getText());
                    o.setImagen(txtImagen.getText());
                    BufferedImage imagen = ImageIO.read(new File(nombre));
                    ImageIO.write(imagen, "jpg", new File(System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\images\\" + o.getImagen()));
                } 
                catch (IOException ex) {
                    Logger.getLogger(ChangeDialogUpdate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        this.setVisible(false);
        mainF.actualizador();
    }//GEN-LAST:event_btnUpdateActionPerformed

    //Cuando la ventana se abre settearemos el txtRegistro con el valor escrito en BuscarDialog y posteriormente si coincide con alguno, sacará la información de este objeto en los txt
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        txtRegistro.setText(mainF.getRegistroPasa());//Getter del valor que hemos escrito en BuscarDialog        
        try {
        for (Obra o: mainF.getLista()) {
            if (o.getRegistre().equals(txtRegistro.getText())) {
                txtImagen.setText(o.getImagen());
                txtRegistro.setText(o.getRegistre());
                txtYear.setText(o.getAny());
                txtAutor.setText(o.getAutor());
                txtTitulo.setText(o.getTitol());
                txtFormato.setText(o.getFormat());
                BufferedImage bufferedImage = ImageIO.read(new File(System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\images\\" + o.getImagen()));
                ImageIcon icon = resizeImageIcon(bufferedImage, lblPerfil.getWidth(), lblPerfil.getHeight());
                lblPerfil.setIcon(icon);
            }
        }
        } 
        catch (IOException ex) {
            Logger.getLogger(ChangeDialogUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_formWindowOpened
        
    public ImageIcon resizeImageIcon (BufferedImage originalImage, int desiredWidth, int desiredHeight) {
        int newHeight = 0;    
        int newWidth = 0;
        float aspectRatio = (float)originalImage.getWidth() / originalImage.getHeight();
        if (originalImage.getWidth() > originalImage.getHeight()) {
            newWidth = desiredWidth;
            newHeight = Math.round( desiredWidth / aspectRatio);    
        }
        else {
            newHeight = desiredHeight;
            newWidth = Math.round(desiredHeight * aspectRatio);
        }
        Image resultingImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        BufferedImage outputImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
        outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);
        ImageIcon imageIcon = new ImageIcon(outputImage);
        return imageIcon;
    }
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
            java.util.logging.Logger.getLogger(ChangeDialogUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeDialogUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeDialogUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeDialogUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChangeDialogUpdate dialog = new ChangeDialogUpdate(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCargarImagen;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblFormato;
    private javax.swing.JLabel lblImagenLink;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtFormato;
    private javax.swing.JTextField txtImagen;
    private javax.swing.JTextField txtRegistro;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
