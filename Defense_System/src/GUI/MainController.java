/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author DIMA
 */
public class MainController extends javax.swing.JFrame {

    /**
     * Creates new form MainController
     */
    public MainController() {
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

        jComboBoxmain = new javax.swing.JComboBox<>();
        jButtonmain = new javax.swing.JButton();
        jLabel1main = new javax.swing.JLabel();
        jLabel2main = new javax.swing.JLabel();
        jLabel3main = new javax.swing.JLabel();
        jLabel4main = new javax.swing.JLabel();
        jSlidermain = new javax.swing.JSlider();
        jCheckBox1main = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1main = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3main = new javax.swing.JTextArea();
        jButtonmainsend = new javax.swing.JButton();
        jCheckBox2main = new javax.swing.JCheckBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2main = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Controller");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxmain.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence", "Helicopter", "Submarine", "Tank" }));
        jComboBoxmain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxmainActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxmain, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, -1, -1));

        jButtonmain.setBackground(new java.awt.Color(255, 153, 153));
        jButtonmain.setText("Collect Informations");
        getContentPane().add(jButtonmain, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 20, -1, -1));

        jLabel1main.setText("Soldier Count");
        getContentPane().add(jLabel1main, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 71, 85, -1));

        jLabel2main.setText("Fuel Amount");
        getContentPane().add(jLabel2main, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 93, 77, -1));

        jLabel3main.setText("Ammo Amount");
        getContentPane().add(jLabel3main, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 119, -1, -1));

        jLabel4main.setText("Position");
        getContentPane().add(jLabel4main, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 141, 53, -1));

        jSlidermain.setMajorTickSpacing(20);
        jSlidermain.setMinorTickSpacing(10);
        jSlidermain.setPaintLabels(true);
        jSlidermain.setPaintTicks(true);
        jSlidermain.setValue(100);
        getContentPane().add(jSlidermain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 169, 274, -1));

        jCheckBox1main.setText("Area Clear");
        getContentPane().add(jCheckBox1main, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 22, 85, -1));

        jTextArea1main.setColumns(20);
        jTextArea1main.setRows(5);
        jScrollPane3.setViewportView(jTextArea1main);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 251, 213, -1));

        jTextArea3main.setColumns(20);
        jTextArea3main.setRows(5);
        jScrollPane4.setViewportView(jTextArea3main);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 71, 213, -1));

        jButtonmainsend.setBackground(new java.awt.Color(255, 51, 51));
        jButtonmainsend.setText("Send");
        getContentPane().add(jButtonmainsend, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 211, -1, -1));

        jCheckBox2main.setText("Send Private");
        getContentPane().add(jCheckBox2main, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 169, -1, -1));

        jTextArea2main.setColumns(20);
        jTextArea2main.setRows(5);
        jScrollPane5.setViewportView(jTextArea2main);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 251, 213, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxmainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxmainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxmainActionPerformed

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
            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonmain;
    private javax.swing.JButton jButtonmainsend;
    private javax.swing.JCheckBox jCheckBox1main;
    private javax.swing.JCheckBox jCheckBox2main;
    private javax.swing.JComboBox<String> jComboBoxmain;
    private javax.swing.JLabel jLabel1main;
    private javax.swing.JLabel jLabel2main;
    private javax.swing.JLabel jLabel3main;
    private javax.swing.JLabel jLabel4main;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSlider jSlidermain;
    private javax.swing.JTextArea jTextArea1main;
    private javax.swing.JTextArea jTextArea2main;
    private javax.swing.JTextArea jTextArea3main;
    // End of variables declaration//GEN-END:variables
}
