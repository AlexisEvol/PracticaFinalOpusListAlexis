
package spdvi;

import com.google.gson.Gson;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import static spdvi.MainForm.imagesFolder;

public class InsertDialog extends javax.swing.JDialog {

    MainForm mainF;
    Gson gson = new Gson();
    JFileChooser fchImagenChooser;
    String path;
    BufferedImage imagen;
    List imagenesDeMas = new ArrayList();//ArrayList para saber cuales son las imagenes repetidas

    
    public InsertDialog(java.awt.Frame parent, boolean modal) {
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
        btnInsert = new javax.swing.JButton();
        lblAviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        btnInsert.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInsert.setText("Insertar");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        lblAviso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(255, 0, 0));
        lblAviso.setToolTipText("");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargarImagen)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAviso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagenLink, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarImagen)
                    .addComponent(btnInsert))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton que usaremos para insertar una obra al ArrayList "lista" y guardar una imagen dentro de la carpeta images
    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        try {
            
            File imagesFolder = new File(System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\images");//path de la carpeta images
            File[] imageFiles = imagesFolder.listFiles();//Variable para leer y introducir dentro de un array las imagenes de la carpeta images
        
            for(int i = 0; i < imageFiles.length;i++){//for para añadir las imagenes de la carpeta images dentro de un ArrayList imagenesDeMas
                imagenesDeMas.add(imageFiles[i].getAbsoluteFile().getName());
            }
            
            //BufferedImage imagen = ImageIO.read(new File(path));//BufferedImage de la imagen seleccionada

            Obra obraNueva = new Obra (txtRegistro.getText(), txtTitulo.getText(), txtYear.getText(), txtFormato.getText(), txtAutor.getText(), txtImagen.getText());//Nuevo objeto Obra con los valores escritos
            
            if(imagenesDeMas.contains(obraNueva.getImagen())){//Si la imagen seleccionada ya está en la carpeta images
                lblAviso.setText("Error! La imagen ya existe, cambia el nombre.");
            }
             else{//Si no lo está
                if (obraNueva.getRegistre() != null) {//Si el valor no es nulo
                        mainF.addToLista(obraNueva);//Añadimos el nuevo objeto Obra al ArrayList "lista"
                        this.setVisible(false);
                        if (obraNueva.getImagen().equals("")){
                            BufferedImage imagenDefecto = ImageIO.read(new File(System.getProperty("user.home") + "\\Documents\\NetBeansProjects\\PracticaFinalOpusListAlexis-main\\Gestor de Obras\\src\\spdvi\\ImagenesDefecto\\Defecto.jpg"));//BufferedImage de la imagen seleccionada
                            ImageIO.write(imagenDefecto, "jpg", new File(System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\images\\Defecto.jpg"));//Guardamos la imagen en la carpeta images
                            obraNueva.setImagen("Defecto.jpg");
                        }
                        else{
                            String path = fchImagenChooser.getSelectedFile().getAbsolutePath();//El path de la imagen seleccionada
                            BufferedImage imagen = ImageIO.read(new File(path));//BufferedImage de la imagen seleccionada
                            ImageIO.write(imagen, "jpg", new File(System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\images\\" + obraNueva.getImagen()));//Guardamos la imagen en la carpeta images
                        }
                        mainF.actualizador();
                }                
            }
        } 
        catch (IOException ex) {
            Logger.getLogger(InsertDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnInsertActionPerformed
    //Cargamos la imagen seleccionada en el fileChooser
    private void btnCargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarImagenActionPerformed
        // TODO add your handling code here:
        
        int result = fchImagenChooser.showOpenDialog(this);
        String nombre = fchImagenChooser.getSelectedFile().getName();
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage bufferedImage = ImageIO.read(new File(fchImagenChooser.getSelectedFile().getAbsolutePath()));
                ImageIcon icon = mainF.resizeImageIcon(bufferedImage, lblPerfil.getWidth(), lblPerfil.getHeight());
                lblPerfil.setIcon(icon);
                txtImagen.setText(nombre);
            }
            catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_btnCargarImagenActionPerformed
   
    
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
            java.util.logging.Logger.getLogger(InsertDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InsertDialog dialog = new InsertDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnInsert;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblAviso;
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
