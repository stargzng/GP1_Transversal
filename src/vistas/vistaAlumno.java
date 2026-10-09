package vistas;

import entidades.Alumno;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import jdk.dynalink.linker.support.Guards;

public class vistaAlumno extends javax.swing.JInternalFrame {

    public vistaAlumno() {
        initComponents();
        limiarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        activoCheck = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        fechaJCC = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        buscarBTN = new javax.swing.JButton();
        IDtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        modificarBTN = new javax.swing.JButton();
        nuevoBTN = new javax.swing.JButton();
        eliminarBTN = new javax.swing.JButton();

        setClosable(true);
        setTitle("Alumnos");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Alumno"));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Activo:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Fec. Nacimiento:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("DNI:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtDNI.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(activoCheck)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtDNI, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                    .addComponent(fechaJCC, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaJCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(activoCheck))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Alumno"));

        buscarBTN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buscarBTN.setText("Buscar");
        buscarBTN.addActionListener(this::buscarBTNActionPerformed);

        IDtxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("ID:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscarBTN)
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        modificarBTN.setText("MODIFICAR");
        modificarBTN.addActionListener(this::modificarBTNActionPerformed);

        nuevoBTN.setText("NUEVO");
        nuevoBTN.addActionListener(this::nuevoBTNActionPerformed);

        eliminarBTN.setText("ELIMINAR");
        eliminarBTN.addActionListener(this::eliminarBTNActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevoBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificarBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarBTN))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBTNActionPerformed

        if (IDtxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID", "Error", 2);
            return;
        }

        Alumno al = Principal.alumnoData.buscarAlumno(Integer.valueOf(IDtxt.getText()));

        if (al == null) {
            JOptionPane.showMessageDialog(this, "No se encontro el alumno con el ID especificado", "Error", 2);
            return;
        } else {
            IDtxt.setText(al.getId()+"");
            txtNombre.setText(al.getNombre());
            txtDNI.setText(al.getDni() + "");
            fechaJCC.setDate(java.sql.Date.valueOf(al.getFechaNac()));
            activoCheck.setSelected(al.getActivo());
        }

    }//GEN-LAST:event_buscarBTNActionPerformed

    private void modificarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBTNActionPerformed

        if (!validarCamposID()) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID! y modifique uno de los campos!", "Error", 2);
            return;
        } else {
            Alumno a = extraerDatosID();
            Principal.alumnoData.actualizarDatos(a.getId(), a.getDni(), a.getNombre(), a.getFechaNac(), a.getActivo());
        }
        limiarCampos();
    }//GEN-LAST:event_modificarBTNActionPerformed

    private void nuevoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoBTNActionPerformed

        if (!validarCampos()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos!", "Error", 2);
            return;
        } else {
            Principal.alumnoData.guardarAlumno(extraerDatos());

        }
        limiarCampos();
    }//GEN-LAST:event_nuevoBTNActionPerformed

    private void eliminarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBTNActionPerformed

        if (IDtxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID!", "Error", 2);
            return;
        }

        Principal.alumnoData.eliminarAlumno(Integer.parseInt(IDtxt.getText()));
        limiarCampos();

    }//GEN-LAST:event_eliminarBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDtxt;
    private javax.swing.JCheckBox activoCheck;
    private javax.swing.JButton buscarBTN;
    private javax.swing.JButton eliminarBTN;
    private com.toedter.calendar.JDateChooser fechaJCC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton modificarBTN;
    private javax.swing.JButton nuevoBTN;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    public Alumno extraerDatos() {
        String nombre = txtNombre.getText();
        int dni = Integer.valueOf(txtDNI.getText());
        boolean activo = activoCheck.isSelected();
        LocalDate fechaN = fechaJCC.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); //se convierte el Date a "Instant", que dispone de un metodo de parseo a LocalDate (antes, hay que especificar al instant el ZoneId)

        Alumno al = new Alumno(dni, nombre, fechaN, activo);
        return al;
    }

    public Alumno extraerDatosID() {

        int ID = Integer.valueOf(IDtxt.getText());
        String nombre = txtNombre.getText();
        int DNI = Integer.valueOf(txtDNI.getText());
        boolean activo = activoCheck.isSelected();
        LocalDate fechaN = fechaJCC.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        Alumno al = new Alumno(ID, DNI, nombre, fechaN, activo);
        return al;
    }

    public void limiarCampos() {
        IDtxt.setText("");
        txtNombre.setText("");
        txtDNI.setText("");
        activoCheck.setSelected(false);
        fechaJCC.setDate(null);
    }

    public boolean validarCamposID() {

        if (IDtxt.getText().isEmpty() || txtNombre.getText().isEmpty() || txtDNI.getText().isEmpty()) {
            return false;
        }

        if (fechaJCC.getDate() == null) {
            return false;
        }

        return true;
    }

    public boolean validarCampos() {
        
        if (txtNombre.getText().isEmpty() || txtDNI.getText().isEmpty()) {
            return false;
        }

        if (fechaJCC.getDate() == null) {
            return false;
        }

        return true;
    }

}
