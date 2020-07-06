package ec.edu.ups.vista;

import javax.swing.JOptionPane;
import ec.edu.ups.controlador.ControladorDirectorio;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
public class Interfaz extends javax.swing.JFrame {
ControladorDirectorio controladorDirectorio;
   
    public Interfaz() {
        initComponents();
        this.setTitle("Directorios");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Ruta = new javax.swing.JTextField();
        btnDirectorios = new javax.swing.JButton();
        btnArchivosOcultos = new javax.swing.JButton();
        btnDirectoriosOcultos = new javax.swing.JButton();
        btnInformacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jList1);

        btnDirectorios.setText("Listar Directorios");
        btnDirectorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDirectoriosActionPerformed(evt);
            }
        });

        btnArchivosOcultos.setText("Listar Archivos Ocultos");
        btnArchivosOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivosOcultosActionPerformed(evt);
            }
        });

        btnDirectoriosOcultos.setText("Listar Directorios Ocultos");
        btnDirectoriosOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDirectoriosOcultosActionPerformed(evt);
            }
        });

        btnInformacion.setText("Mostrar Informacion");
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });

        jButton1.setText("Listar Archivos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        fileMenu.setMnemonic('f');
        fileMenu.setText("Opciones");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Crear");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Eliminar");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Renombrar");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnDirectorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDirectoriosOcultos)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnArchivosOcultos)
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnInformacion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(Ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDirectorios)
                    .addComponent(btnArchivosOcultos)
                    .addComponent(btnDirectoriosOcultos)
                    .addComponent(jButton1))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnInformacion)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDirectoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDirectoriosActionPerformed
        String rut=Ruta.getText();
        controladorDirectorio=new ControladorDirectorio(rut);
        if(rut.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Incerte ruta");
        }else{
            List<String>Directorios=null;
            try{
                Directorios= controladorDirectorio.listarDirectorios();
            }catch(NullPointerException e){
                
                JOptionPane.showMessageDialog(this, "Ingrese ruta valida");
               
                   
               
            }
           
            
           DefaultListModel modelo= new DefaultListModel();
           
            for (String Directorio : Directorios) {
                modelo.addElement(Directorio);
            }
            jList1.setModel(modelo);
        }
        
    }//GEN-LAST:event_btnDirectoriosActionPerformed

    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed
        
        String seleccionado=jList1.getSelectedValue().toString();
        String info=controladorDirectorio.mostarInformacion(seleccionado);
        jLabel1.setText(info);
        
        
    }//GEN-LAST:event_btnInformacionActionPerformed

    private void btnArchivosOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivosOcultosActionPerformed
       String rut=Ruta.getText();
        controladorDirectorio=new ControladorDirectorio(rut);
        if(rut.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Incerte ruta");
        }else{
           List<String>Directorios=null;
            try{
                Directorios= controladorDirectorio.listarArchivosOcultos();
            }catch(NullPointerException e){
                
                JOptionPane.showMessageDialog(this, "Ingrese ruta valida");
               
                   
               
            }
           DefaultListModel modelo= new DefaultListModel();
           
            for (String Directorio : Directorios) {
                modelo.addElement(Directorio);
            }
            jList1.setModel(modelo);
        }
        
    }//GEN-LAST:event_btnArchivosOcultosActionPerformed

    private void btnDirectoriosOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDirectoriosOcultosActionPerformed
      String rut=Ruta.getText();
        controladorDirectorio=new ControladorDirectorio(rut);
        if(rut.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Incerte ruta");
        }else{
           List<String>Directorios= null;
           try{
               Directorios= controladorDirectorio.listarDirectoriosOcultos();
           }catch(NullPointerException e){
                
                JOptionPane.showMessageDialog(this, "Ingrese ruta valida");
               
                   
               
            }
           
           DefaultListModel modelo= new DefaultListModel();
           
            for (String Directorio : Directorios) {
                modelo.addElement(Directorio);
            }
            jList1.setModel(modelo);
        }
    }//GEN-LAST:event_btnDirectoriosOcultosActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        String rut=Ruta.getText();
        if(rut.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Incerte ruta");
        }else{
           
            controladorDirectorio=new ControladorDirectorio(rut);
       String nombre= JOptionPane.showInputDialog(this, "Ingrese nombre");
       
       
       
            try {
                controladorDirectorio.crearDirectorio(nombre);
                List<String>Directorios;
                if(nombre.contains(".")==true){
                    Directorios= controladorDirectorio.listarArchivos();
                }else{
                    Directorios= controladorDirectorio.listarDirectorios();
                }
                
            
           DefaultListModel modelo= new DefaultListModel();
           
            for (String Directorio : Directorios) {
                modelo.addElement(Directorio);
            }
            jList1.setModel(modelo);
                
                
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
        
        
        
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
      String rut=Ruta.getText();
        if(rut.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Incerte ruta");
        }else{
            String seleccionado=jList1.getSelectedValue().toString();
           int c= JOptionPane.showConfirmDialog(this, "Seguro desea eliminar", "opcion", JOptionPane.YES_NO_OPTION);
            if(c==0){     
                        controladorDirectorio.eliminarDirectorio(seleccionado); 
                        
                        
                        List<String>Directorios;
                if(seleccionado.contains(".")==true){
                    Directorios= controladorDirectorio.listarArchivos();
                }else{
                    Directorios= controladorDirectorio.listarDirectorios();
                }
            
                        DefaultListModel modelo= new DefaultListModel();
           
            for (String Directorio : Directorios) {
                modelo.addElement(Directorio);
            }
            jList1.setModel(modelo);
                        
                        
            }
            
        }
        
        
        
        
        
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        String rut=Ruta.getText();
        if(rut.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Incerte ruta");
        }else{
            String seleccionado=jList1.getSelectedValue().toString();
            if(seleccionado.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Selecione un directorio");
            }else{
            String nombre= JOptionPane.showInputDialog(this, "Ingrese nuevo nombre");
            
            controladorDirectorio.renombrarDirectorio(seleccionado,nombre);
            
             
            try {
                controladorDirectorio.crearDirectorio(nombre);
                List<String>Directorios;
                if(nombre.contains(".")==true){
                    Directorios= controladorDirectorio.listarArchivos();
                }else{
                    Directorios= controladorDirectorio.listarDirectorios();
                }
                
            
           DefaultListModel modelo= new DefaultListModel();
           
            for (String Directorio : Directorios) {
                modelo.addElement(Directorio);
            }
            jList1.setModel(modelo);
                
                
            } catch (IOException ex) {
                System.out.println("Error");
            }
            }
            
        }
        
        
        
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String rut=Ruta.getText();
        controladorDirectorio=new ControladorDirectorio(rut);
        if(rut.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Incerte ruta");
        }else{
           List<String>Directorios=null;
           try{
               Directorios= controladorDirectorio.listarArchivos();
           }catch(NullPointerException e){
                
                JOptionPane.showMessageDialog(this, "Ingrese ruta valida");
               
                   
               
            }
           
           
            
           DefaultListModel modelo= new DefaultListModel();
           
            for (String Directorio : Directorios) {
                modelo.addElement(Directorio);
            }
            jList1.setModel(modelo);
        }      
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ruta;
    private javax.swing.JButton btnArchivosOcultos;
    private javax.swing.JButton btnDirectorios;
    private javax.swing.JButton btnDirectoriosOcultos;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
