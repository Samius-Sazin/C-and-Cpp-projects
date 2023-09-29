package pop_up;

import rappidcart.signup;
import rappidcart.login;
import seller.dash_board;

public class successfull_window extends javax.swing.JFrame {
    
    Boolean signUp_check = false;
    Boolean login_check = false;
    Boolean newPassword_reset_check = false;
    
    public successfull_window() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        continuue_ = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        alert_box_ = new javax.swing.JLabel();
        cancel_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        continuue_.setBackground(new java.awt.Color(60, 184, 121));
        continuue_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        continuue_.setForeground(new java.awt.Color(255, 255, 255));
        continuue_.setText("Continue");
        continuue_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        continuue_.setBorderPainted(false);
        continuue_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continuue_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuue_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(continuue_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(continuue_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/right_picture.png"))); // NOI18N

        alert_box_.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        alert_box_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cancel_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancel_.setText("X");
        cancel_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancel_))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(127, 127, 127))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(alert_box_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(cancel_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alert_box_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void continuue_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuue_ActionPerformed
        if(signUp_check == true){
            signUp_check = false;
            
            alert_box_.setText("");
            dispose();
            
            login l_g = new login();
            l_g.setVisible(true);
        }
        
        if(login_check == true){
            login_check = false;
        
            alert_box_.setText("");
            dispose();

            dash_board d_b = new dash_board();
            d_b.setVisible(true);
        }
        
        if(newPassword_reset_check == true){
            newPassword_reset_check = false;
        
            alert_box_.setText("");
            dispose();
        }
    }//GEN-LAST:event_continuue_ActionPerformed

    private void cancel_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_ActionPerformed
        if(signUp_check == true){
            signUp_check = false;
            
            alert_box_.setText("");
            dispose();
            
            login l_g = new login();
            l_g.setVisible(true);
        }
        
        if(login_check == true){
            login_check = false;
        
            alert_box_.setText("");
            dispose();

            dash_board d_b = new dash_board();
            d_b.setVisible(true);
        }
        
        if(newPassword_reset_check == true){
            newPassword_reset_check = false;
        
            alert_box_.setText("");
            dispose();
        }
    }//GEN-LAST:event_cancel_ActionPerformed
    
    
    
    //called from newPassword_reset class & control the pop up successful_window for proceed
    public void control_successful_popUp_window_proceed(){
        newPassword_reset_check = true;
        alert_box_.setText(alert_box_.getText() + "Password Changed Successfully");
        setVisible(true);
    }
    
   
    //called from login class & control the pop up successful_window for signUp
    public void control_successful_popUp_window_login(){
        login_check = true;
        alert_box_.setText(alert_box_.getText() + "Login Successfully");
        setVisible(true);
    }
    
    
    
    //called from signup class(proceed button) & control the pop up successful_window for signUp
    public void control_successful_popUp_window_signUp(){
        signUp_check = true;
        alert_box_.setText(alert_box_.getText() + "Account Created Successfully");
        setVisible(true);
    }
    
    
    
//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new successfull_window().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert_box_;
    private javax.swing.JButton cancel_;
    private javax.swing.JButton continuue_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
