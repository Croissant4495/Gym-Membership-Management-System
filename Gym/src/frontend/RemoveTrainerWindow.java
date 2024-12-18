/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.AdminRole;
import backend.Entity;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class RemoveTrainerWindow extends javax.swing.JFrame {

    private AdminRole admin;

    JFrame parent;

    public RemoveTrainerWindow(JFrame parent, AdminRole admin) {
        setTitle("Remove Trainer");
        this.admin = admin;
        this.parent = parent;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TrainerIdlabel = new javax.swing.JLabel();
        RemoveTrainerButton = new javax.swing.JButton();
        InputId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        TrainerIdlabel.setBackground(new java.awt.Color(204, 255, 204));
        TrainerIdlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TrainerIdlabel.setText("Trainer Id");
        TrainerIdlabel.setOpaque(true);

        RemoveTrainerButton.setBackground(new java.awt.Color(0, 0, 0));
        RemoveTrainerButton.setForeground(new java.awt.Color(255, 255, 255));
        RemoveTrainerButton.setText("Remove");
        RemoveTrainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveTrainerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TrainerIdlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(InputId, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(RemoveTrainerButton)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TrainerIdlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoveTrainerButton)
                    .addComponent(InputId, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RemoveTrainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveTrainerButtonActionPerformed
        String id = InputId.getText().trim();
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "The field is Empty!", " Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(TrainerRoleWindow.contains(this.admin.getListofTrainers(), id)){
             JOptionPane.showMessageDialog(this, "Trainer with Id= " + id + "has been deleted", "Message", JOptionPane.INFORMATION_MESSAGE);
                   admin.removeTrainer(id);
        } else {
                JOptionPane.showMessageDialog(this, " The Trainer with Id= " + id + " does not exist!", "Message", JOptionPane.ERROR_MESSAGE);
        }
        dispose();
        this.parent.setVisible(true);
    }//GEN-LAST:event_RemoveTrainerButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputId;
    private javax.swing.JButton RemoveTrainerButton;
    private javax.swing.JLabel TrainerIdlabel;
    // End of variables declaration//GEN-END:variables
}
