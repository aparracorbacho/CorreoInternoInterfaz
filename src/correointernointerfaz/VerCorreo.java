/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correointernointerfaz;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author MotherFoquita
 */
public class VerCorreo extends javax.swing.JFrame {
    String uenviacorreo, titulocorreo, contenidocorreo;
    /**
     * Creates new form VerCorreo
     */
    public void setValores(String uenvia, String titulo, String contenido){
        this.uenviacorreo = uenvia;
        this.titulocorreo = titulo;
        this.contenidocorreo = contenido;
    }
   
    public VerCorreo() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
    public void colocar(){
        titulo.setText(titulocorreo);
        enviado.setText(uenviacorreo);
        contenido.setText(contenidocorreo);
        enviadopor.setText("Enviado por: ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        enviadopor = new javax.swing.JLabel();
        enviado = new javax.swing.JLabel();
        contenido = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        exportar = new javax.swing.JButton();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Correo interno - Leer correo");
        setBackground(new java.awt.Color(255, 255, 255));

        titulo.setText("titulo");

        enviadopor.setText("Enviado por:");

        enviado.setText("eviado");

        contenido.setText("texto");

        jLabel1.setText("Titulo:");

        exportar.setText("Exportar Correo");
        exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarActionPerformed(evt);
            }
        });

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenido)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enviadopor)
                            .addComponent(jLabel1))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo)
                            .addComponent(enviado)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exportar)
                                .addGap(35, 35, 35)
                                .addComponent(volver)))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviadopor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviado))
                .addGap(40, 40, 40)
                .addComponent(contenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exportar)
                    .addComponent(volver))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarActionPerformed
        // TODO add your handling code here:
        //Codigo para exportar correo a un TXT
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {   
            String correoexportado = "src/correointernointerfaz/exportado/" + titulocorreo.replace(" ","") + ".txt";
            fichero = new FileWriter(correoexportado);
            String fileLocal = new String(correoexportado);
            pw = new PrintWriter(fichero);

            pw.println("Titulo: " + titulocorreo);
            pw.println("Enviado por: " + uenviacorreo);
            pw.println("Contenido:\n" + contenidocorreo);
            JOptionPane.showMessageDialog(null, "Fichero exportado correctamente, acepta para abrir" , "Exportacion correcta",JOptionPane.PLAIN_MESSAGE);
            Runtime.getRuntime().exec("cmd /c start "+fileLocal);
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error",JOptionPane.ERROR_MESSAGE);
        } finally {
           try {
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              JOptionPane.showMessageDialog(null, e2.getMessage() , "Error",JOptionPane.ERROR_MESSAGE);
           }
        }
    }//GEN-LAST:event_exportarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_volverActionPerformed
   
     
    
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
            java.util.logging.Logger.getLogger(VerCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerCorreo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contenido;
    private javax.swing.JLabel enviado;
    private javax.swing.JLabel enviadopor;
    private javax.swing.JButton exportar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
