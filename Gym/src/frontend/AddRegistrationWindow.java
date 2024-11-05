/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.*;
import backend.*;
import backend.Class;

/**
 *
 * @author user
 */
public class AddRegistrationWindow extends javax.swing.JFrame {

    private TrainerRole myTrainer;
    JFrame parent;
    
    public AddRegistrationWindow(JFrame parent, TrainerRole myTrainer) {
        this.setTitle("Register Member");
        initComponents();
        this.parent = parent;
        this.myTrainer = myTrainer;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        classText = new javax.swing.JTextField();
        memberText = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registration Date");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Member ID");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Class ID");
        jLabel3.setOpaque(true);

        registerButton.setBackground(new java.awt.Color(0, 0, 0));
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(classText, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                        .addComponent(memberText, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(memberText, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classText, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(149, 149, 149))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        boolean valid = true;
        String memberID = memberText.getText();
        String classID = classText.getText();
        Date myDate = jDateChooser1.getDate();
        LocalDate date;
        
        System.out.println("ID: " + memberID + classID);
        if(myDate == null){
            date = LocalDate.now();
        }else{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            date = LocalDate.parse(sdf.format(myDate));
        }
        
        if(memberID.equals("") || classID.equals("")){
            JOptionPane.showMessageDialog(this, "Please fill all fields.");
            valid = false;
        }else if(!TrainerRoleWindow.contains(this.myTrainer.getListOfMembers(), memberID)){
            JOptionPane.showMessageDialog(this, "Member is not in the system.");
            memberText.setText("");
            valid = false;
        }else if(!TrainerRoleWindow.contains(this.myTrainer.getListOfClasses(), classID)){
            JOptionPane.showMessageDialog(this, "Class is not in the system.");
            classText.setText("");
            valid = false;
        }else if(TrainerRoleWindow.contains(this.myTrainer.getListOfRegistration(), memberID.concat(classID))){
            JOptionPane.showMessageDialog(this, "Member is already registered to this class.");
            memberText.setText("");
            classText.setText("");
            valid = false;
        }
        
        if(valid){
            Class tempClass = (Class) TrainerRoleWindow.getRecord(this.myTrainer.getListOfClasses(), classID);
            if (tempClass.getAvailableSeats() <= 0) {
                JOptionPane.showMessageDialog(this, "There are no avaliable seats.");
                memberText.setText("");
                classText.setText("");
                valid = false;
            }
        }
        
        if(valid){
            this.myTrainer.registerMemberForClass(memberID, classID, date);
            JOptionPane.showMessageDialog(this, "The Member with id = " + memberID + " has been successfully registered to class " + classID);
            this.myTrainer.logout();
            this.parent.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField classText;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField memberText;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
}
