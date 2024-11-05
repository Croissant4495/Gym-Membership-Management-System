/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 *
 * @author Abdel
 */
public class addMemberWindow extends javax.swing.JFrame {
    private TrainerRole myTrainer;
    JFrame parent;
    /**
     * Creates new form addMemberWindow
     */
    public addMemberWindow(JFrame parent, TrainerRole myTrainer) {
        setTitle("Add member");
        setLocationRelativeTo(null);
        initComponents();
        this.parent = parent;
        this.myTrainer = myTrainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Name = new javax.swing.JLabel();
        ID1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        NameText = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        IDText = new javax.swing.JTextPane();
        Name5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        EmailText = new javax.swing.JTextPane();
        Name6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        MembershipText = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        PhoneText = new javax.swing.JTextPane();
        Name7 = new javax.swing.JLabel();
        Name8 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        StatusText = new javax.swing.JTextPane();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Name.setBackground(new java.awt.Color(51, 255, 51));
        Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name.setText("Name");
        Name.setOpaque(true);
        Name.setPreferredSize(new java.awt.Dimension(120, 30));

        ID1.setBackground(new java.awt.Color(51, 255, 51));
        ID1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID1.setText("ID");
        ID1.setOpaque(true);
        ID1.setPreferredSize(new java.awt.Dimension(120, 30));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(200, 30));

        NameText.setMargin(new java.awt.Insets(6, 6, 2, 6));
        NameText.setMinimumSize(new java.awt.Dimension(100, 60));
        NameText.setName(""); // NOI18N
        NameText.setPreferredSize(new java.awt.Dimension(150, 24));
        NameText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        jScrollPane2.setViewportView(NameText);

        jScrollPane3.setPreferredSize(new java.awt.Dimension(200, 30));

        IDText.setMargin(new java.awt.Insets(6, 6, 2, 6));
        IDText.setMinimumSize(new java.awt.Dimension(100, 60));
        IDText.setName(""); // NOI18N
        NameText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        jScrollPane3.setViewportView(IDText);

        Name5.setBackground(new java.awt.Color(51, 255, 51));
        Name5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name5.setText("Email");
        Name5.setOpaque(true);
        Name5.setPreferredSize(new java.awt.Dimension(120, 30));

        jScrollPane4.setPreferredSize(new java.awt.Dimension(200, 30));

        EmailText.setMargin(new java.awt.Insets(6, 6, 2, 6));
        EmailText.setMinimumSize(new java.awt.Dimension(100, 60));
        EmailText.setName(""); // NOI18N
        NameText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        jScrollPane4.setViewportView(EmailText);

        Name6.setBackground(new java.awt.Color(51, 255, 51));
        Name6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name6.setText("Membership Type");
        Name6.setOpaque(true);
        Name6.setPreferredSize(new java.awt.Dimension(120, 30));

        jScrollPane5.setPreferredSize(new java.awt.Dimension(200, 30));

        MembershipText.setMargin(new java.awt.Insets(6, 6, 2, 6));
        MembershipText.setMinimumSize(new java.awt.Dimension(100, 60));
        MembershipText.setName(""); // NOI18N
        NameText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        jScrollPane5.setViewportView(MembershipText);

        jScrollPane6.setPreferredSize(new java.awt.Dimension(200, 30));

        PhoneText.setMargin(new java.awt.Insets(6, 6, 2, 6));
        PhoneText.setMinimumSize(new java.awt.Dimension(100, 60));
        PhoneText.setName(""); // NOI18N
        NameText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        jScrollPane6.setViewportView(PhoneText);

        Name7.setBackground(new java.awt.Color(51, 255, 51));
        Name7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name7.setText("Phone Number");
        Name7.setOpaque(true);
        Name7.setPreferredSize(new java.awt.Dimension(120, 30));

        Name8.setBackground(new java.awt.Color(51, 255, 51));
        Name8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name8.setText("Status");
        Name8.setOpaque(true);
        Name8.setPreferredSize(new java.awt.Dimension(120, 30));

        jScrollPane7.setPreferredSize(new java.awt.Dimension(200, 30));

        StatusText.setMargin(new java.awt.Insets(6, 6, 2, 6));
        StatusText.setMinimumSize(new java.awt.Dimension(100, 60));
        StatusText.setName(""); // NOI18N
        NameText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        jScrollPane7.setViewportView(StatusText);

        okButton.setText("Add");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Name5, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(Name6, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(Name7, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(Name8, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ID1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(Name5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(Name6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(Name7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(Name8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        boolean valid = true;
        String ID = IDText.getText();
        String name = NameText.getText();
        String email = EmailText.getText();
        String memberType = MembershipText.getText();
        String number = PhoneText.getText();
        String status = StatusText.getText();
             
        if(TrainerRoleWindow.contains(this.myTrainer.getListOfMembers(), ID)){
            JOptionPane.showMessageDialog(this, "The Member with ID = " + ID + " already exists!");
            IDText.setText("");
            valid = false;
        }else if(ID.equals("") || name.equals("") || email.equals("") || memberType.equals("") || number.equals("") || status.equals("")){
            JOptionPane.showMessageDialog(this, "Please fill all fields.");
            valid = false;
        }
        
        if(valid){
            this.myTrainer.addMember(ID, name, memberType, email, number, status);
            JOptionPane.showMessageDialog(this, "The Member with id = " + ID + " has been successfully added.");
            this.myTrainer.logout();
            this.parent.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane EmailText;
    private javax.swing.JLabel ID1;
    private javax.swing.JTextPane IDText;
    private javax.swing.JTextPane MembershipText;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name5;
    private javax.swing.JLabel Name6;
    private javax.swing.JLabel Name7;
    private javax.swing.JLabel Name8;
    private javax.swing.JTextPane NameText;
    private javax.swing.JTextPane PhoneText;
    private javax.swing.JTextPane StatusText;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}
