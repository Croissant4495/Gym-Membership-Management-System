/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;
import backend.*;
import backend.TrainerRole;
import java.util.ArrayList;

/**
 *
 * @author Abdel
 */
public class TrainerRoleWindow extends javax.swing.JFrame {
    /**
     * Creates new form TrainerRoleWindow
     */
    public TrainerRoleWindow() {
        setLocationRelativeTo(null);
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

        TrainerContainer = new javax.swing.JPanel();
        addMemberButton = new javax.swing.JButton();
        ViewMembersButton = new javax.swing.JButton();
        addClassButton = new javax.swing.JButton();
        viewClassesButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        cancelRegistrationButton = new javax.swing.JButton();
        viewRegistrationsButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 500));
        setResizable(false);

        TrainerContainer.setPreferredSize(new java.awt.Dimension(350, 400));

        addMemberButton.setText("Add Member");
        addMemberButton.setAlignmentX(0.5F);
        addMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberButtonActionPerformed(evt);
            }
        });

        ViewMembersButton.setText("View Members");
        ViewMembersButton.setAlignmentX(0.5F);
        ViewMembersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewMembersButtonActionPerformed(evt);
            }
        });

        addClassButton.setText("Add Class");
        addClassButton.setAlignmentX(0.5F);
        addClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassButtonActionPerformed(evt);
            }
        });

        viewClassesButton.setText("View Classes");
        viewClassesButton.setAlignmentX(0.5F);
        viewClassesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewClassesButtonActionPerformed(evt);
            }
        });

        registerButton.setText("Register Member for Class");
        registerButton.setAlignmentX(0.5F);
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        cancelRegistrationButton.setText("Cancel Registration");
        cancelRegistrationButton.setAlignmentX(0.5F);
        cancelRegistrationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelRegistrationButtonActionPerformed(evt);
            }
        });

        viewRegistrationsButton.setText("View Registrations");
        viewRegistrationsButton.setAlignmentX(0.5F);
        viewRegistrationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRegistrationsButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.setAlignmentX(0.5F);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TrainerContainerLayout = new javax.swing.GroupLayout(TrainerContainer);
        TrainerContainer.setLayout(TrainerContainerLayout);
        TrainerContainerLayout.setHorizontalGroup(
            TrainerContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrainerContainerLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(TrainerContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewRegistrationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelRegistrationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewClassesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewMembersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );
        TrainerContainerLayout.setVerticalGroup(
            TrainerContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrainerContainerLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(addMemberButton)
                .addGap(18, 18, 18)
                .addComponent(ViewMembersButton)
                .addGap(18, 18, 18)
                .addComponent(addClassButton)
                .addGap(18, 18, 18)
                .addComponent(viewClassesButton)
                .addGap(18, 18, 18)
                .addComponent(registerButton)
                .addGap(18, 18, 18)
                .addComponent(cancelRegistrationButton)
                .addGap(18, 18, 18)
                .addComponent(viewRegistrationsButton)
                .addGap(18, 18, 18)
                .addComponent(logoutButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TrainerContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(TrainerContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Temp
    public static <T extends Entity> void printElements(ArrayList<T> myList){
        for(T i : myList){
            System.out.println(i.LineRepresentation());
        }
    }
    
    private void addMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberButtonActionPerformed
        this.setVisible(false);
        addMemberWindow myWindow = new addMemberWindow(this);
        myWindow.setVisible(true);
    }//GEN-LAST:event_addMemberButtonActionPerformed

    private void ViewMembersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewMembersButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("Pringin");
    }//GEN-LAST:event_ViewMembersButtonActionPerformed

    private void addClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addClassButtonActionPerformed

    private void viewClassesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewClassesButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("Pringin");
    }//GEN-LAST:event_viewClassesButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonActionPerformed

    private void cancelRegistrationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelRegistrationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelRegistrationButtonActionPerformed

    private void viewRegistrationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRegistrationsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewRegistrationsButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TrainerRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainerRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainerRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainerRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainerRoleWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TrainerContainer;
    private javax.swing.JButton ViewMembersButton;
    private javax.swing.JButton addClassButton;
    private javax.swing.JButton addMemberButton;
    private javax.swing.JButton cancelRegistrationButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton viewClassesButton;
    private javax.swing.JButton viewRegistrationsButton;
    // End of variables declaration//GEN-END:variables
}
