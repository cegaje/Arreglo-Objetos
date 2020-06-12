
package vistas;

import control.ArregloAlumno;
import control.Validaciones;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Alumno;

public class JInternalFrameEliminar extends javax.swing.JInternalFrame {

    ArregloAlumno obj;
    Validaciones value = new Validaciones();
    
    public void obtenerArreglo(ArregloAlumno x){
        this.obj = x;
    }
    
    public JInternalFrameEliminar() {
        initComponents();
        lblimg.setIcon(new ImageIcon("src/img/CreateUser3.png"));
    }

    public void buscar(){
        if(txtbuscar.getText().equals("")){
            mensaje("Ingrese el codigo del alumno");
        }else{
            int pos = obj.buscar(Integer.parseInt(txtbuscar.getText()));
            if(pos!=-1){
                Alumno x = obj.getAlumno(pos);
                TextArea.setText("Codigo: "+x.getCodigo()+
                                "\n"+"Nombre: "+x.getNombre()+
                                "\n"+"Apellido paterno: "+x.getApellidopa()+
                                "\n"+"Apellido materno: "+x.getApellidoma()+
                                "\n"+"Sexo: "+x.getSexo()+
                                "\n"+"Promedio: "+x.getPromedio());
            }else{
                mensaje("El Alumno con el codigo "+txtbuscar.getText()+" no existe");
            }
        }
    }
    
    public void eliminar(){
        if(txtbuscar.getText().equals("")){
            mensaje("Llene el cuadro con el codigo del alumno a eliminar");
        }else{
            int pos = obj.buscar(Integer.parseInt(txtbuscar.getText()));
            if(pos!=-1){
                obj.eliminar(pos);
                mensaje("El alumno de codigo "+txtbuscar.getText()+" se ha eliminado de correctamente");
                txtbuscar.setText("");
                TextArea.setText("");
            }else{
                mensaje("El Alumno con el codigo "+txtbuscar.getText()+" no existe");
            }
        }
    }
    
    public void mensaje(String msn){
        JOptionPane.showMessageDialog(this, msn); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        btneliminar = new javax.swing.JButton();
        lblimg = new javax.swing.JLabel();

        setClosable(true);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Codigo del Alumno:");

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarKeyTyped(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btneliminar)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped
        value.soloNumero(evt.getKeyChar(), evt);
    }//GEN-LAST:event_txtbuscarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblimg;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
