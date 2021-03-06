/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formulario;

import javax.swing.JOptionPane;

/**
 *
 * @author vr
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mbPrincipal = new javax.swing.JMenuBar();
        mInicio = new javax.swing.JMenu();
        miSalir = new javax.swing.JMenuItem();
        mMantenimiento = new javax.swing.JMenu();
        miSensor = new javax.swing.JMenuItem();
        miActuador = new javax.swing.JMenuItem();
        mAcercaDe = new javax.swing.JMenu();
        miAutores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mInicio.setText("Inicio");

        miSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        mInicio.add(miSalir);

        mbPrincipal.add(mInicio);

        mMantenimiento.setText("Mantenimiento");

        miSensor.setText("Sensor");
        miSensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSensorActionPerformed(evt);
            }
        });
        mMantenimiento.add(miSensor);

        miActuador.setText("Actuador");
        miActuador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miActuadorActionPerformed(evt);
            }
        });
        mMantenimiento.add(miActuador);

        mbPrincipal.add(mMantenimiento);

        mAcercaDe.setText("Acerca de..");

        miAutores.setText("Autores");
        mAcercaDe.add(miAutores);

        mbPrincipal.add(mAcercaDe);

        setJMenuBar(mbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        // TODO add your handling code here:
        
        int op = JOptionPane.showConfirmDialog(this, "Está seguro de finalizar la aplicación?","Salir",JOptionPane.YES_NO_OPTION);
        if(op==0)
            System.exit(0);
    }//GEN-LAST:event_miSalirActionPerformed

    private void miSensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSensorActionPerformed
        // TODO add your handling code here:
        FrmMantenimientoSensor frm = new FrmMantenimientoSensor();
        frm.setVisible(true);
    }//GEN-LAST:event_miSensorActionPerformed

    private void miActuadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miActuadorActionPerformed
        // TODO add your handling code here:
        FrmMantenimientoActuador frm = new FrmMantenimientoActuador();
        frm.setVisible(true);
    }//GEN-LAST:event_miActuadorActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu mAcercaDe;
    private javax.swing.JMenu mInicio;
    private javax.swing.JMenu mMantenimiento;
    private javax.swing.JMenuBar mbPrincipal;
    private javax.swing.JMenuItem miActuador;
    private javax.swing.JMenuItem miAutores;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JMenuItem miSensor;
    // End of variables declaration//GEN-END:variables
}
