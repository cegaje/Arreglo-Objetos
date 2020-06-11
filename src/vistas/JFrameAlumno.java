
package vistas;

import control.ArregloAlumno;
import javax.swing.JOptionPane;

public class JFrameAlumno extends javax.swing.JFrame {

    ArregloAlumno obj = new ArregloAlumno();
    
    //VENTANAS
    JInternalFrameIngresar VI = new JInternalFrameIngresar();
    JInternalFrameAprobados VA = new JInternalFrameAprobados();
    JInternalFrameDesaprobados VD = new JInternalFrameDesaprobados();
    JInternalFrameEliminar VE = new JInternalFrameEliminar();
    JInternalFrameModificar VM = new JInternalFrameModificar();
    
    public JFrameAlumno() {
        initComponents();
        setLocationRelativeTo(null);
        dktpfondo.add(VI);
        dktpfondo.add(VA);
        dktpfondo.add(VD);
        dktpfondo.add(VE);
        dktpfondo.add(VM);
    }

    public void mensaje(String msn){
        JOptionPane.showMessageDialog(this, msn); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dktpfondo = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItemSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuItemIngresar = new javax.swing.JMenuItem();
        MenuItemModificar = new javax.swing.JMenuItem();
        MenuItemEliminar = new javax.swing.JMenuItem();
        MenuItemAprobados = new javax.swing.JMenuItem();
        MenuItemDesaprobados = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dktpfondoLayout = new javax.swing.GroupLayout(dktpfondo);
        dktpfondo.setLayout(dktpfondoLayout);
        dktpfondoLayout.setHorizontalGroup(
            dktpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        dktpfondoLayout.setVerticalGroup(
            dktpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        jMenu1.setText("Sistema");

        MenuItemSalir.setText("Salir");
        MenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Alumno");

        MenuItemIngresar.setText("Ingresar");
        MenuItemIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemIngresarActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemIngresar);

        MenuItemModificar.setText("Modificar");
        MenuItemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemModificarActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemModificar);

        MenuItemEliminar.setText("Eliminar");
        MenuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemEliminarActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemEliminar);

        MenuItemAprobados.setText("Aprobados");
        MenuItemAprobados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAprobadosActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemAprobados);

        MenuItemDesaprobados.setText("Desaprobados");
        MenuItemDesaprobados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemDesaprobadosActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemDesaprobados);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dktpfondo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dktpfondo)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemIngresarActionPerformed
        if(VI.isVisible()){
            mensaje("Ya se encuentra en la ventana");
        }else{
            VI.setVisible(true);
            VI.obtenerArreglo(obj);
            
            VD.setVisible(false);
            VA.setVisible(false);
            VM.setVisible(false);
            VE.setVisible(false);
        }
    }//GEN-LAST:event_MenuItemIngresarActionPerformed

    private void MenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MenuItemSalirActionPerformed

    private void MenuItemAprobadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAprobadosActionPerformed
        if(VA.isVisible()){
            mensaje("Ya se encuentra en la ventana");
        }else{
            VA.setVisible(true);
            VA.obtenerArreglo(obj);
            VI.setVisible(false);
            VD.setVisible(false);
            VM.setVisible(false);
            VE.setVisible(false);
        }
        
    }//GEN-LAST:event_MenuItemAprobadosActionPerformed

    private void MenuItemDesaprobadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemDesaprobadosActionPerformed
        if(VD.isVisible()){
            mensaje("Ya se encuentra en la ventana");
        }else{
            VD.setVisible(true);
            VD.obtenerArreglo(obj);
            VI.setVisible(false);
            VA.setVisible(false);
            VM.setVisible(false);
            VE.setVisible(false);
        }
    }//GEN-LAST:event_MenuItemDesaprobadosActionPerformed

    private void MenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemEliminarActionPerformed
        if(VE.isVisible()){
            mensaje("Ya se encuentra en la ventana");
        }else{
            VE.setVisible(true);
            VE.obtenerArreglo(obj);
            VI.setVisible(false);
            VA.setVisible(false);
            VD.setVisible(false);
            VM.setVisible(false);
        }
    }//GEN-LAST:event_MenuItemEliminarActionPerformed

    private void MenuItemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemModificarActionPerformed
        if(VM.isVisible()){
            mensaje("Ya se encuentra en la ventana");
        }else{
            VM.setVisible(true);
            VM.obtenerArreglo(obj);
            VI.setVisible(false);
            VA.setVisible(false);
            VD.setVisible(false);
            VE.setVisible(false);
        }
    }//GEN-LAST:event_MenuItemModificarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemAprobados;
    private javax.swing.JMenuItem MenuItemDesaprobados;
    private javax.swing.JMenuItem MenuItemEliminar;
    private javax.swing.JMenuItem MenuItemIngresar;
    private javax.swing.JMenuItem MenuItemModificar;
    private javax.swing.JMenuItem MenuItemSalir;
    private javax.swing.JDesktopPane dktpfondo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
