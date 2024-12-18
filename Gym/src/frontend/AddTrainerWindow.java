/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.Entity; 

import backend.AdminRole;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AddTrainerWindow extends javax.swing.JFrame {

    private AdminRole admin;
  JFrame parent;

    public AddTrainerWindow(JFrame parent,AdminRole admin) {
        setTitle("Add Trainer");
        this.admin = admin;
       this.parent = parent;
    
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameLabel = new javax.swing.JLabel();
        Idlabel = new javax.swing.JLabel();
        PhoneNumberLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        SpecialityLabel = new javax.swing.JLabel();
        InputSpeciality = new javax.swing.JTextField();
        InputEmail = new javax.swing.JTextField();
        InputId = new javax.swing.JTextField();
        InputName = new javax.swing.JTextField();
        InputPhoneNumber = new javax.swing.JTextField();
        AddingTrainerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        NameLabel.setBackground(new java.awt.Color(204, 255, 204));
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel.setText("Name");
        NameLabel.setOpaque(true);

        Idlabel.setBackground(new java.awt.Color(204, 255, 204));
        Idlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Idlabel.setText("Id");
        Idlabel.setOpaque(true);

        PhoneNumberLabel.setBackground(new java.awt.Color(204, 255, 204));
        PhoneNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PhoneNumberLabel.setText("Phone Number");
        PhoneNumberLabel.setOpaque(true);

        EmailLabel.setBackground(new java.awt.Color(204, 255, 204));
        EmailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmailLabel.setText("Email");
        EmailLabel.setOpaque(true);

        SpecialityLabel.setBackground(new java.awt.Color(204, 255, 204));
        SpecialityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SpecialityLabel.setText("Speciality");
        SpecialityLabel.setOpaque(true);

        AddingTrainerButton.setBackground(new java.awt.Color(0, 0, 0));
        AddingTrainerButton.setForeground(new java.awt.Color(255, 255, 255));
        AddingTrainerButton.setText("Add");
        AddingTrainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddingTrainerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Idlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpecialityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputId, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputName, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddingTrainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Idlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputId, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputName, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpecialityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(AddingTrainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddingTrainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddingTrainerButtonActionPerformed
        String id = InputId.getText().trim();
        String name = InputName.getText().trim();
        String email = InputEmail.getText().trim();
        String speciality = InputSpeciality.getText().trim();
        String phoneNumber = InputPhoneNumber.getText().trim();

        if (id.isEmpty() || name.isEmpty() || email.isEmpty() || speciality.isEmpty() || phoneNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Some fields are Empty!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
       if(TrainerRoleWindow.contains(this.admin.getListofTrainers(), id)){
            JOptionPane.showMessageDialog(this, "The Trainer with ID = " + id + " already exists!");
            InputId.setText("");
        } else {
            admin.addTrainer(id, name, email, speciality, phoneNumber);
            JOptionPane.showMessageDialog(this, "The Trainer with ID " + id + " has been successfully added.", "Success", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            this.parent.setVisible(true);
        }
    }//GEN-LAST:event_AddingTrainerButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      this.parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddingTrainerButton;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel Idlabel;
    private javax.swing.JTextField InputEmail;
    private javax.swing.JTextField InputId;
    private javax.swing.JTextField InputName;
    private javax.swing.JTextField InputPhoneNumber;
    private javax.swing.JTextField InputSpeciality;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PhoneNumberLabel;
    private javax.swing.JLabel SpecialityLabel;
    // End of variables declaration//GEN-END:variables
}
