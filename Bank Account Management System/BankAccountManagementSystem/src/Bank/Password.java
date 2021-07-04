/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nahiyan H Khan
 */
public class Password extends javax.swing.JFrame {

    /**
     * Creates new form Password
     */
    String username;
    
    public Password() {
        initComponents();
    }
    
    public Password(String username) {
        initComponents();
        this.username = username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        crntPassFld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        newPassFld = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        newPassFld2 = new javax.swing.JTextField();
        SubmitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(400, 100));
        setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Current Password : ");

        crntPassFld.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        crntPassFld.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        crntPassFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crntPassFldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Change Password");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("New Password : ");

        newPassFld.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        newPassFld.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        newPassFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPassFldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Retype New Password : ");

        newPassFld2.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        newPassFld2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        newPassFld2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPassFld2ActionPerformed(evt);
            }
        });
        newPassFld2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newPassFld2KeyPressed(evt);
            }
        });

        SubmitBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        SubmitBtn.setText("Submit");
        SubmitBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(crntPassFld, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newPassFld, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(newPassFld2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crntPassFld, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPassFld, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPassFld2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crntPassFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crntPassFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crntPassFldActionPerformed

    private void newPassFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPassFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPassFldActionPerformed

    private void newPassFld2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPassFld2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPassFld2ActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        try {
            Conn c = new Conn();
            String q1 = "SELECT acc_password FROM user_info WHERE acc_username='"+username+"'";
            ResultSet rs = c.s.executeQuery(q1);
            if (rs.next()) {
                if (crntPassFld.getText().equals(rs.getString("acc_password"))) {
                    if (newPassFld.getText().equals("") || newPassFld2.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Please fill up the blank fields correctly!");
                    }else{
                        if (newPassFld.getText().equals(newPassFld2.getText())) {
                            String q2 = "UPDATE user_info SET acc_password='"+newPassFld.getText()+"' WHERE acc_username='"+username+"'";
                            c.s.executeUpdate(q2);
                            JOptionPane.showMessageDialog(null, "Password changed successfully!");
                            this.dispose();
                        }else{
                            JOptionPane.showMessageDialog(null, "New Passwords doesn't match!");
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Current Password is incorrect!");
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Password.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void newPassFld2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newPassFld2KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            try {
                Conn c = new Conn();
                String q1 = "SELECT acc_password FROM user_info WHERE acc_username='"+username+"'";
                ResultSet rs = c.s.executeQuery(q1);
                if (rs.next()) {
                    if (crntPassFld.getText().equals(rs.getString("acc_password"))) {
                        if (newPassFld.getText().equals("") || newPassFld2.getText().equals("")) {
                            JOptionPane.showMessageDialog(null, "Please fill up the blank fields correctly!");
                        }else{
                            if (newPassFld.getText().equals(newPassFld2.getText())) {
                                String q2 = "UPDATE user_info SET acc_password='"+newPassFld.getText()+"' WHERE acc_username='"+username+"'";
                                c.s.executeUpdate(q2);
                                JOptionPane.showMessageDialog(null, "Password changed successfully!");
                                this.dispose();
                            }else{
                                JOptionPane.showMessageDialog(null, "New Passwords doesn't match!");
                            }
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Current Password is incorrect!");
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(Password.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_newPassFld2KeyPressed

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
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JTextField crntPassFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField newPassFld;
    private javax.swing.JTextField newPassFld2;
    // End of variables declaration//GEN-END:variables
}
