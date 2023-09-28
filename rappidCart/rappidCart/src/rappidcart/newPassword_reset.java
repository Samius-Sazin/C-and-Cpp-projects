package rappidcart;

import pop_up.unsuccessfull_window;
import pop_up.successfull_window;

public class newPassword_reset extends javax.swing.JFrame {
    private String newpas;
    private String retypeNewPass;
    public String usernameGmail_tofind;
    
    public newPassword_reset() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        resest_password = new javax.swing.JLabel();
        newpas_ = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cancel_ = new javax.swing.JButton();
        proceed_ = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        retypeNewPass_ = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        resest_password.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        resest_password.setForeground(new java.awt.Color(235, 83, 34));
        resest_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resest_password.setText("Reseting password");

        newpas_.setBackground(new java.awt.Color(204, 204, 204));
        newpas_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        newpas_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        newpas_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpas_ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("New password");

        cancel_.setBackground(new java.awt.Color(240, 85, 35));
        cancel_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancel_.setText("Cancel");
        cancel_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel_.setBorderPainted(false);
        cancel_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_ActionPerformed(evt);
            }
        });

        proceed_.setBackground(new java.awt.Color(240, 85, 35));
        proceed_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        proceed_.setText("Proceed");
        proceed_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        proceed_.setBorderPainted(false);
        proceed_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceed_ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(240, 85, 35));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        retypeNewPass_.setBackground(new java.awt.Color(204, 204, 204));
        retypeNewPass_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        retypeNewPass_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        retypeNewPass_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retypeNewPass_ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Re-enter new password");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resest_password, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel10))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newpas_, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(retypeNewPass_, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGap(53, 68, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(proceed_, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resest_password)
                .addGap(47, 47, 47)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newpas_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retypeNewPass_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proceed_)
                    .addComponent(cancel_))
                .addGap(99, 99, 99))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newpas_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpas_ActionPerformed
        newpas = newpas_.getText();
    }//GEN-LAST:event_newpas_ActionPerformed

    private void cancel_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_ActionPerformed
        newpas = "";
        retypeNewPass = "";
        
        new unsuccessfull_window().control_Unsuccessful_popUp_window_signUp_forgotPassword(); //Show "cancelation successfull"; and open login window

        dispose();
    }//GEN-LAST:event_cancel_ActionPerformed

    private void proceed_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceed_ActionPerformed
        if(newpas_.getText().isEmpty() || retypeNewPass_.getText().isEmpty()){
            new unsuccessfull_window().control_unsuccessful_popUp_window_proceed();
        }

        else{
            new database().replace_password(usernameGmail_tofind, retypeNewPass);
            
            dispose();
            new login().setVisible(true);
            
            new successfull_window().control_successful_popUp_window_proceed();
            
        }
    }//GEN-LAST:event_proceed_ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void retypeNewPass_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retypeNewPass_ActionPerformed
        retypeNewPass = retypeNewPass_.getText();
        if(newpas != retypeNewPass){
            new unsuccessfull_window().control_unsuccessful_popUp_window_retypeNewPass();
            newpas_.setText("");
            retypeNewPass_.setText("");
        }
    }//GEN-LAST:event_retypeNewPass_ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newPassword_reset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField newpas_;
    private javax.swing.JButton proceed_;
    private javax.swing.JLabel resest_password;
    private javax.swing.JTextField retypeNewPass_;
    // End of variables declaration//GEN-END:variables
}
