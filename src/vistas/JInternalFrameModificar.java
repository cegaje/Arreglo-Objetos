
package vistas;

import control.ArregloAlumno;
import control.Validaciones;
import javax.swing.JOptionPane;
import modelo.Alumno;

public class JInternalFrameModificar extends javax.swing.JInternalFrame {

    ArregloAlumno obj;
    Validaciones value = new Validaciones();   
    
    public void obtenerArreglo(ArregloAlumno x){
        this.obj = x;
    }
    
    public JInternalFrameModificar() {
        initComponents();
    }

    public void buscar(){
        if(txtcode.getText().equals("")){
            mensaje("Ingrese el codigo del alumno a buscar");
        }else{
            int pos = obj.buscar(Integer.parseInt(txtcode.getText()));
            if(pos!=-1){
                Alumno x = obj.getAlumno(pos);
                txtname.setText(x.getNombre());
                txtfirstsurname.setText(x.getApellidopa());
                txtsecondsurname.setText(x.getApellidoma());
                txtsex.setText(x.getSexo()+"");
                txtaverage.setText(Double.toString(x.getPromedio()));
                txtcode.setEnabled(false);
            }else{
                mensaje("El Alumno con el codigo "+txtcode.getText()+" no existe");
            }
        }
    }
        
    public void editar(){
        if(txtcode.getText().equals("") || 
           txtname.getText().equals("") || 
           txtfirstsurname.getText().equals("") || 
           txtsecondsurname.getText().equals("") ||
           txtsex.getText().equals("") ||
           txtaverage.getText().equals("")){
            mensaje("Rellene todos los cuadros de texto");
        }else{
            int pos = obj.buscar(Integer.parseInt(txtcode.getText()));
            if(pos!=-1){
                Alumno x = obj.getAlumno(pos);
                x.setNombre(txtname.getText());
                x.setApellidopa(txtfirstsurname.getText());
                x.setApellidoma(txtsecondsurname.getText());
                x.setSexo(txtsex.getText().toUpperCase().charAt(0));
                x.setPromedio(Double.parseDouble(txtaverage.getText()));
                mensaje("Modificacion exitoso");
            }
        }
    }
    
    public void borrar(){
        txtcode.setEnabled(true);
        txtcode.setText("");
        txtname.setText("");
        txtfirstsurname.setText("");
        txtsecondsurname.setText("");
        txtsex.setText("");
        txtaverage.setText("");
    }
    
    public void mensaje(String msn){
        JOptionPane.showMessageDialog(this, msn);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtcode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtfirstsurname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtsecondsurname = new javax.swing.JTextField();
        txtsex = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtaverage = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);

        txtcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodeKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Codigo:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnameKeyTyped(evt);
            }
        });

        txtfirstsurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfirstsurnameKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Apellido Paterno:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Apellido Materno:");

        txtsecondsurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsecondsurnameKeyTyped(evt);
            }
        });

        txtsex.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsexKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Sexo(M/F):");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Promedio:");

        txtaverage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtaverageKeyTyped(evt);
            }
        });

        btnbuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(88, 88, 88)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtfirstsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtsecondsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtsex, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtaverage, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(95, 95, 95)
                                .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(199, 199, 199))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnbuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtfirstsurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtsecondsurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtsex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtaverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        editar();
        borrar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtcodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodeKeyTyped
        value.soloNumero(evt.getKeyChar(), evt);
    }//GEN-LAST:event_txtcodeKeyTyped

    private void txtnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyTyped
        value.soloLetras(evt.getKeyChar(), evt);
    }//GEN-LAST:event_txtnameKeyTyped

    private void txtfirstsurnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfirstsurnameKeyTyped
        value.soloLetras(evt.getKeyChar(), evt);
    }//GEN-LAST:event_txtfirstsurnameKeyTyped

    private void txtsecondsurnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsecondsurnameKeyTyped
        value.soloLetras(evt.getKeyChar(), evt);
    }//GEN-LAST:event_txtsecondsurnameKeyTyped

    private void txtsexKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsexKeyTyped
        value.soloLetras(evt.getKeyChar(), evt);
    }//GEN-LAST:event_txtsexKeyTyped

    private void txtaverageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaverageKeyTyped
        value.soloNumero(evt.getKeyChar(), evt);
    }//GEN-LAST:event_txtaverageKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtaverage;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtfirstsurname;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsecondsurname;
    private javax.swing.JTextField txtsex;
    // End of variables declaration//GEN-END:variables

}
