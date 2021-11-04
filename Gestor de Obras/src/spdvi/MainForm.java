package spdvi;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import static java.lang.System.out;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;


public class MainForm extends javax.swing.JFrame {
    private static final java.lang.reflect.Type LIST_OF_OBRA_TYPE = new TypeToken<List<Obra>>() {}.getType();
    private ArrayList<Obra> lista = new ArrayList<>();
    private List imagenesDeMas = new ArrayList();
    private JList<Obra> lstObras;
    final static String imagesFolder = System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\images\\";
    ChangeDialogUpdate cdu;
    BuscarDialog bd;
    String NombreRegistro = "";//String que usaré para poder pasar el registro de BuscaDialog a ChangeDialogUpdate

    
    public MainForm() {
        initComponents();
        
        lstObras = new JList<Obra>();
        jspObras.setViewportView(lstObras);
        lstObras.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
            lstObrasValueChanged(evt);
            }
        });
        
        lstObras.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                lstObrasMouse(evt);
            }
        });
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImagen = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jspObras = new javax.swing.JScrollPane();
        btnSave = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiInsert = new javax.swing.JMenuItem();
        jmiUpdate = new javax.swing.JMenuItem();
        jmiDelete = new javax.swing.JMenuItem();
        jmiLimpiar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiSave = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Guardar");
        btnSave.setToolTipText("");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jMenu1.setText("Inserciones");

        jmiInsert.setText("Insert");
        jmiInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInsertActionPerformed(evt);
            }
        });
        jMenu1.add(jmiInsert);

        jmiUpdate.setText("Update");
        jmiUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUpdateActionPerformed(evt);
            }
        });
        jMenu1.add(jmiUpdate);

        jmiDelete.setText("Delete");
        jmiDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDeleteActionPerformed(evt);
            }
        });
        jMenu1.add(jmiDelete);

        jmiLimpiar.setText("LimpiarImagenes");
        jmiLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLimpiarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiLimpiar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Guardar");

        jmiSave.setText("Save");
        jmiSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSaveActionPerformed(evt);
            }
        });
        jMenu2.add(jmiSave);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspObras, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jspObras)
                    .addComponent(lblImagen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnInsert)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        InsertDialog insertDialog = new InsertDialog(this, true);
        insertDialog.setVisible(true);
        
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        DeleteDialog deleteDialog = new DeleteDialog(this, true);
        deleteDialog.setVisible(true);
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        bd = new BuscarDialog(this, true);
        bd.setVisible(true);
        changeDialog();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void lstObrasValueChanged(javax.swing.event.ListSelectionEvent evt) {//Usamos este metodo para poder cambiar las imagenes a medida que vayamos cambiado valores en la lista
            Obra selectedUser = lstObras.getSelectedValue();
            if (selectedUser != null) {
                for (Obra o: lista) {
                    if (o.getRegistre().equals(selectedUser.getRegistre())) {
                        try {
                            BufferedImage bufferedImage = ImageIO.read(new File(System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\images\\" + o.getImagen()));
                            ImageIcon icon = resizeImageIcon(bufferedImage, lblImagen.getWidth(), lblImagen.getHeight());
                            lblImagen.setIcon(icon);
                        }
                        catch (IOException ioe) {
                            ioe.printStackTrace();
                        }
                }
            }            
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Gson gson = new Gson();
        try {
            JsonReader reader = new JsonReader(new FileReader(System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\data\\obres.json"));
            ArrayList<Obra> obras = gson.fromJson(reader, LIST_OF_OBRA_TYPE);
            for (Obra o: obras) {
                lista.add(o);
            }
            
            DefaultListModel<Obra> listaObras = new DefaultListModel<>();
            for(Obra o: lista) {
                listaObras.addElement(o);
            }
            lstObras.setModel(listaObras);
            }
            catch (FileNotFoundException fnfe) {
                fnfe.printStackTrace();
            }
    }//GEN-LAST:event_formWindowOpened

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try (Writer writer = new FileWriter(System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\data\\obres.json")) {
            
            Gson gson = new GsonBuilder().create();
            gson.toJson(lista, writer);
        
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jmiInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInsertActionPerformed
        // TODO add your handling code here:
        
        btnInsert.doClick();
    }//GEN-LAST:event_jmiInsertActionPerformed

    private void jmiDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDeleteActionPerformed
        // TODO add your handling code here:
        
        btnDelete.doClick();
    }//GEN-LAST:event_jmiDeleteActionPerformed

    private void jmiUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUpdateActionPerformed
        // TODO add your handling code here:
        
        btnUpdate.doClick();
    }//GEN-LAST:event_jmiUpdateActionPerformed

    private void jmiSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSaveActionPerformed
        // TODO add your handling code here:
        
        btnSave.doClick();
    }//GEN-LAST:event_jmiSaveActionPerformed

    private void jmiLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLimpiarActionPerformed
        // TODO add your handling code here:
        
            comprobante();//Comprueba si tienes imagenes sin usar
            if(!imagenesDeMas.isEmpty()){//Llamamos a LimpiarDialog en caso de que tengas imagenes en la Carpeta image de OpusList que no uses
                LimpiarDialog limpiarDialog = new LimpiarDialog(this, true);
                limpiarDialog.setVisible(true);
            }
    }//GEN-LAST:event_jmiLimpiarActionPerformed

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
        
        public List<Obra> getLista(){//Getter de lista que contiene las obras
            return lista;
        }
        
        public void addToLista(Obra obra){//Setter de lista
            lista.add(obra);
        }
        
        public Obra getSelectedObra(){//Un getter para poder acceder a lstObras
            return lstObras.getSelectedValue();
        }
        
        public void lstObrasMouse(java.awt.event.MouseEvent evt){//Comprobante de dobleClick
            ChangeDialog dialogC = new ChangeDialog(this, true);
            if (evt.getClickCount() == 2){
                dialogC.setVisible(true);
            }
        }
        
        public void actualizador(){//Hace un refresh del menu principal
            
            DefaultListModel<Obra> listaObras = new DefaultListModel<>();
            for(Obra o: lista) {
                listaObras.addElement(o);
            }
            lstObras.setModel(listaObras);
        }
        
        public void comprobante(){//Comprueba si tienes imagenes sin usar
        File imagesFolder = new File(System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\images");
        File[] imageFiles = imagesFolder.listFiles();
        
            for(int i = 0; i < imageFiles.length;i++){//For que recorre las imagenes y mete sus titulos dentro de una lista
                imagenesDeMas.add(imageFiles[i].getAbsoluteFile().getName());
            }

            for(int i = 0; i < lista.size();i++){//Elimina las imagenes que se usan de la lista y deja solo las que no se están usando
                for(int j = 0; j < imageFiles.length; j++){
                    if(lista.get(i).getImagen().equals(imageFiles[j].getAbsoluteFile().getName())){
                        imagenesDeMas.remove(lista.get(i).getImagen());
                        imagenesDeMas.remove("desktop.ini");
                    }
                }
            }
        }
        
        public void changeDialog(){//Lo usamos para abrir ChangeDialogUpdate
            cdu = new ChangeDialogUpdate(this, true);
            cdu.setVisible(true);
        }
        public String getRegistroPasa(){//Getter del Registro que busquemos en BuscarDialog
            return NombreRegistro;
        }
        public void setRegistroNombre(String nombre){//Setter del Registro que busquemos en BuscarDialog
            this.NombreRegistro = nombre;
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiDelete;
    private javax.swing.JMenuItem jmiInsert;
    private javax.swing.JMenuItem jmiLimpiar;
    private javax.swing.JMenuItem jmiSave;
    private javax.swing.JMenuItem jmiUpdate;
    private javax.swing.JScrollPane jspObras;
    private javax.swing.JLabel lblImagen;
    // End of variables declaration//GEN-END:variables
}
