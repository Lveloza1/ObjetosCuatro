/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Password;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class principal extends javax.swing.JFrame {

    Password m;
    Password p;

    public principal() {
        initComponents();
        cmdGuardar.setEnabled(true);
        cmdMostrar.setEnabled(false);
        cmdCambiar.setEnabled(false);
        cmdGuardarNueva.setEnabled(false);
        cmdBorrar.setEnabled(true);

        txtContrasena.setEditable(true);
        txtContrasenaNueva.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmdGuardar = new javax.swing.JButton();
        txtContrasenaNueva = new javax.swing.JPasswordField();
        txtContrasena = new javax.swing.JPasswordField();
        cmdGuardarNueva = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        cmdBorrar = new javax.swing.JButton();
        cmdCambiar = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ejercicio 4");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Contraseña"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdGuardar.setText("Guardar Contraseña");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 190, 30));

        txtContrasenaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaNuevaActionPerformed(evt);
            }
        });
        jPanel2.add(txtContrasenaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, 30));
        jPanel2.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 30));

        cmdGuardarNueva.setText("Guardar Nueva Contraseña");
        cmdGuardarNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarNuevaActionPerformed(evt);
            }
        });
        jPanel2.add(cmdGuardarNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 190, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 210, 190));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraseñas Guardadas"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 90));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 210, 140));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdBorrar.setText("Nuevo");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 100, 40));

        cmdCambiar.setText("Cambiar");
        cmdCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCambiarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 40));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 140, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed

        if (txtContrasenaNueva.getText().trim().isEmpty()) {
            txtResultado.setText("Su contraseña es: " + m.getContraseña() + "\n"
                    + m.NiveldeSeguridad());
        } else {
            txtResultado.setText("Su contraseña es: " + m.getContraseña() + "\n"
                    + m.NiveldeSeguridad() + "\n"
                    + "Su nueva contraseña es: " + p.getContraseña() + "\n"
                    + p.NiveldeSeguridad());
        }

        cmdMostrar.setEnabled(false);
        cmdGuardar.setEnabled(false);
        cmdCambiar.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCambiarActionPerformed
        txtContrasena.setEditable(false);
        txtContrasenaNueva.setEditable(true);
        cmdGuardarNueva.setEnabled(true);
        txtContrasenaNueva.requestFocusInWindow();
        txtContrasenaNueva.setText("");

        JOptionPane.showMessageDialog(this, "Digite una nueva contraseña");

        cmdMostrar.setEnabled(false);
        cmdGuardar.setEnabled(false);
        cmdCambiar.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_cmdCambiarActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtContrasena.setText("");
        txtContrasenaNueva.setText("");
        txtResultado.setText("");
        txtContrasena.requestFocusInWindow();

        cmdGuardar.setEnabled(true);
        cmdMostrar.setEnabled(false);
        cmdCambiar.setEnabled(false);
        cmdGuardarNueva.setEnabled(false);
        cmdBorrar.setEnabled(true);

        txtContrasena.setEditable(true);
        txtContrasenaNueva.setEditable(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        if (txtContrasena.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese la contraseña", "Error", JOptionPane.ERROR_MESSAGE);
            txtContrasena.requestFocusInWindow();
            txtContrasena.selectAll();
            cmdGuardar.setEnabled(true);
        } else {
            String cont;

            cont = txtContrasena.getText();
            m = new Password(cont);

            JOptionPane.showMessageDialog(this, "Contraseña Guardada");
            cmdMostrar.setEnabled(true);
            cmdCambiar.setEnabled(true);
            txtContrasena.setEditable(false);
            cmdGuardar.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void txtContrasenaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaNuevaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaNuevaActionPerformed

    private void cmdGuardarNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarNuevaActionPerformed
        if (txtContrasenaNueva.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese la nueva contraseña", "Error", JOptionPane.ERROR_MESSAGE);
            txtContrasenaNueva.requestFocusInWindow();
            txtContrasenaNueva.selectAll();
        } else {
            String contn;

            contn = txtContrasenaNueva.getText();
            p = new Password(contn);
            p.NiveldeSeguridad();
            JOptionPane.showMessageDialog(this, "Nueva contraseña guardada");

            cmdMostrar.setEnabled(true);
            cmdCambiar.setEnabled(true);
            txtContrasenaNueva.setEditable(false);
        }
        cmdGuardarNueva.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdGuardarNuevaActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCambiar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdGuardarNueva;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JPasswordField txtContrasenaNueva;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
