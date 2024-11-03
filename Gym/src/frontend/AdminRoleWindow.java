/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.AdminRole;

/**
 *
 * @author user
 */
public class AdminRoleWindow extends javax.swing.JFrame {
 private AdminRole admin; 

    // Step 2: Modify constructor to accept Admin object
    public AdminRoleWindow(AdminRole admin) {
        this.admin = admin;
        initComponents();
    }
    public AdminRoleWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddTrainerRole = new javax.swing.JButton();
        RemovingTrainer = new javax.swing.JButton();
        ViewTrainers = new javax.swing.JButton();
        Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddTrainerRole.setBackground(new java.awt.Color(0, 0, 0));
        AddTrainerRole.setForeground(new java.awt.Color(255, 255, 255));
        AddTrainerRole.setText("Add Trainer");
        AddTrainerRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTrainerRoleActionPerformed(evt);
            }
        });

        RemovingTrainer.setBackground(new java.awt.Color(0, 0, 0));
        RemovingTrainer.setForeground(new java.awt.Color(255, 255, 255));
        RemovingTrainer.setText("Remove Trainer");
        RemovingTrainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovingTrainerActionPerformed(evt);
            }
        });

        ViewTrainers.setBackground(new java.awt.Color(0, 0, 0));
        ViewTrainers.setForeground(new java.awt.Color(255, 255, 255));
        ViewTrainers.setText("view Trainers");
        ViewTrainers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTrainersActionPerformed(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(0, 0, 0));
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(RemovingTrainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddTrainerRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewTrainers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(AddTrainerRole)
                .addGap(52, 52, 52)
                .addComponent(RemovingTrainer)
                .addGap(54, 54, 54)
                .addComponent(ViewTrainers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(Logout)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddTrainerRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTrainerRoleActionPerformed
        AddTrainerWindow trainerWindow = new AddTrainerWindow(admin);
        trainerWindow.setVisible(true);
    }//GEN-LAST:event_AddTrainerRoleActionPerformed

    private void RemovingTrainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovingTrainerActionPerformed
        RemoveTrainerWindow trainerWindow = new RemoveTrainerWindow();
        trainerWindow.setVisible(true);
    }//GEN-LAST:event_RemovingTrainerActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutActionPerformed

    private void ViewTrainersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTrainersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewTrainersActionPerformed

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
            java.util.logging.Logger.getLogger(AdminRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
AdminRole admin = new AdminRole(); 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 
                new AdminRoleWindow(admin).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTrainerRole;
    private javax.swing.JButton Logout;
    private javax.swing.JButton RemovingTrainer;
    private javax.swing.JButton ViewTrainers;
    // End of variables declaration//GEN-END:variables
}
