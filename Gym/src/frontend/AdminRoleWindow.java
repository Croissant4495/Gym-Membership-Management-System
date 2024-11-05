/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.AdminRole;
import backend.Entity;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AdminRoleWindow extends javax.swing.JFrame {

    private AdminRole admin;

    public AdminRoleWindow() {
        setTitle("Admin Role");
        admin = new AdminRole();
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

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

         this.setVisible(false);
         AddTrainerWindow trainerWindow = new AddTrainerWindow(this, this.admin);
               trainerWindow.setVisible(true);


       
    }//GEN-LAST:event_AddTrainerRoleActionPerformed

    private void RemovingTrainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovingTrainerActionPerformed
//       
           this.setVisible(false);
         RemoveTrainerWindow trainerWindow = new RemoveTrainerWindow(this,this.admin);
               trainerWindow.setVisible(true);
    }//GEN-LAST:event_RemovingTrainerActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
     admin.logout();
       this.setVisible(false);
       AdminLogin adminlogin=new AdminLogin();
         adminlogin.setVisible(true);
       
       
     
     
    }//GEN-LAST:event_LogoutActionPerformed

    private void ViewTrainersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTrainersActionPerformed
      ArrayList<Entity> TrainerList = this.admin.getListofTrainers();
        String[] columns = new String[]{" ID", " Name", "Email ", "Speciality", "Phone Number"};
        String[][] TrainerTable = new String[TrainerList.size()][columns.length];
        
        for(int i=0; i<TrainerList.size(); i++){
            TrainerTable[i] = TrainerList.get(i).LineRepresentation().split(",");
        }
        
       TableView myTable = new TableView(this,"View Trainers", columns);
       this.setVisible(false);
       myTable.setData(TrainerTable);
       myTable.setVisible(true);
    }//GEN-LAST:event_ViewTrainersActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                AdminRoleWindow adminRoleWindow = new AdminRoleWindow();
                adminRoleWindow.setVisible(true);

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
