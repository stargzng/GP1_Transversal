package vistas;

import java.sql.Connection;
import entidades.Alumno;
import persistencia.AlumnoData;
import persistencia.InscripcionData;
import persistencia.MateriaData;
import persistencia.miConexion;

public class Principal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());
    public static miConexion connection;
    public static AlumnoData alumnoData;
    public static MateriaData materiaData;
    public static InscripcionData cursadaData;

    public Principal() {
        initComponents();
        connection = new miConexion("jdbc:mysql://localhost:3306/universidad", "root", "");
        alumnoData = new AlumnoData(connection);
        materiaData = new MateriaData(connection);
        cursadaData = new InscripcionData(connection);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAlumno = new javax.swing.JMenu();
        jmiFormAlumno = new javax.swing.JMenuItem();
        jMenuMateria = new javax.swing.JMenu();
        jmiFormMateria = new javax.swing.JMenuItem();
        jMenuInscripcion = new javax.swing.JMenu();
        jmiListaInscripcion = new javax.swing.JMenuItem();
        jMenuNotas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(796, 550));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        jMenuAlumno.setText("Alumnos");

        jmiFormAlumno.setText("Administrar Alumnos");
        jmiFormAlumno.addActionListener(this::jmiFormAlumnoActionPerformed);
        jMenuAlumno.add(jmiFormAlumno);

        jMenuBar1.add(jMenuAlumno);

        jMenuMateria.setText("Materias");

        jmiFormMateria.setText("Administrar Materias");
        jmiFormMateria.addActionListener(this::jmiFormMateriaActionPerformed);
        jMenuMateria.add(jmiFormMateria);

        jMenuBar1.add(jMenuMateria);

        jMenuInscripcion.setText("Administrar inscripciones");

        jmiListaInscripcion.setText("Lista de inscripciones");
        jmiListaInscripcion.addActionListener(this::jmiListaInscripcionActionPerformed);
        jMenuInscripcion.add(jmiListaInscripcion);

        jMenuBar1.add(jMenuInscripcion);

        jMenuNotas.setText("Notas");

        jMenuItem1.setText("Cargar Notas");
        jMenuItem1.addActionListener(this::jMenuItem1ActionPerformed);
        jMenuNotas.add(jMenuItem1);

        jMenuBar1.add(jMenuNotas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiFormAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormAlumnoActionPerformed
        vistaAlumno va  = new vistaAlumno();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(va);
        va.setVisible(true);
    }//GEN-LAST:event_jmiFormAlumnoActionPerformed

    private void jmiFormMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormMateriaActionPerformed
        vistaMateria vm = new vistaMateria();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(vm);
        vm.setVisible(true);
    }//GEN-LAST:event_jmiFormMateriaActionPerformed

    private void jmiListaInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListaInscripcionActionPerformed
        vistaListarInscripciones vli = new vistaListarInscripciones();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(vli);
        vli.setVisible(true);
    }//GEN-LAST:event_jmiListaInscripcionActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jDesktopPane1.removeAll();
        vistaCargarNotas vc = new vistaCargarNotas();
        jDesktopPane1.add(vc);
        vc.setVisible(true);
        jDesktopPane1.revalidate();
        jDesktopPane1.repaint();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new Principal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenuAlumno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuInscripcion;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuMateria;
    private javax.swing.JMenu jMenuNotas;
    private javax.swing.JMenuItem jmiFormAlumno;
    private javax.swing.JMenuItem jmiFormMateria;
    private javax.swing.JMenuItem jmiListaInscripcion;
    // End of variables declaration//GEN-END:variables
}
