package vistas;

import entidades.Materia;
import javax.swing.JOptionPane;


public class vistaMateria extends javax.swing.JInternalFrame {

    public vistaMateria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jpDatos = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        jboxEstado = new javax.swing.JCheckBox();
        txtNombre = new javax.swing.JTextField();
        jpBuscar = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(this::btnModificarActionPerformed);

        jpDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblNombre.setText("Nombre:");

        lblEstado.setText("Estado:");

        javax.swing.GroupLayout jpDatosLayout = new javax.swing.GroupLayout(jpDatos);
        jpDatos.setLayout(jpDatosLayout);
        jpDatosLayout.setHorizontalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jboxEstado)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jpDatosLayout.setVerticalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(jboxEstado))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jpBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblID.setText("ID:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        javax.swing.GroupLayout jpBuscarLayout = new javax.swing.GroupLayout(jpBuscar);
        jpBuscar.setLayout(jpBuscarLayout);
        jpBuscarLayout.setHorizontalGroup(
            jpBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnBuscar)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jpBuscarLayout.setVerticalGroup(
            jpBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBuscarLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jpBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jpBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jpBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
            int id = Integer.parseInt(txtId.getText().trim());
            Materia mat = Principal.materiaData.buscarMateria(id);

            if (mat == null) {
                JOptionPane.showMessageDialog(this, "No se encontró una materia con ese ID");
                limpiarCampos();
            }else{
                txtNombre.setText(mat.getNombre());
                jboxEstado.setSelected(mat.getEstado());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"Ingresá un ID valido. Error: "+e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try{
            int id = Integer.parseInt(txtId.getText().trim());
            String nombre = txtNombre.getText().trim();
            boolean estado = jboxEstado.isSelected();
            
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese el nombre de la materia.");
                return;
            }
            
            Materia mat = Principal.materiaData.buscarMateria(id);
            
            if (mat == null) {
                JOptionPane.showMessageDialog(this, "No se encontro una materia con ese ID");
                return;
            }
            
            Principal.materiaData.actualizarMateria(id, nombre, estado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresá un ID valido. ERROR: "+e.getMessage());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre = txtNombre.getText().trim();
        boolean estado = jboxEstado.isSelected();
        
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre de la materia.");
            return;
        }
        
        Materia mat = new Materia(nombre, estado);
        
        Principal.materiaData.guardarMateria(mat);
        
        limpiarCampos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
            int id = Integer.parseInt(txtId.getText().trim());
            Materia mat = Principal.materiaData.buscarMateria(id);
            
            if (mat == null) {
                JOptionPane.showMessageDialog(this, "No se encontro una materia con ese ID");
                return;
            }
            
            Principal.materiaData.eliminarMateria(id);
            
            limpiarCampos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresá un ID valido. ERROR: "+e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JCheckBox jboxEstado;
    private javax.swing.JPanel jpBuscar;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
    
    private void limpiarCampos() {
        txtId.setText("");
        txtNombre.setText("");
        jboxEstado.setSelected(false);
    }
}
