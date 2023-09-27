package rappidcart;

import pop_up.successfull_window;
import pop_up.unsuccessfull_window;

public class login extends javax.swing.JFrame {

    String usernameOrGmail;
    String password;
    
    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_1_ = new javax.swing.JPanel();
        panel_2_ = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cart_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_3_ = new javax.swing.JPanel();
        login_part_Panel_ = new javax.swing.JPanel();
        login_with_google = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        username_ = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        password_ = new javax.swing.JPasswordField();
        remember_me = new javax.swing.JCheckBox();
        login = new javax.swing.JButton();
        signup = new javax.swing.JTextField();
        login_with_fb = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        signUp_ = new javax.swing.JButton();
        logo_panel_ = new javax.swing.JPanel();
        rappidcart_logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panel_1_.setBackground(new java.awt.Color(255, 255, 255));

        panel_2_.setBackground(new java.awt.Color(240, 85, 35));

        jPanel4.setBackground(new java.awt.Color(240, 85, 35));

        cart_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cart_1.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("The Ultimate Solution");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cart_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(85, 85, 85))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(cart_logo)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_2_Layout = new javax.swing.GroupLayout(panel_2_);
        panel_2_.setLayout(panel_2_Layout);
        panel_2_Layout.setHorizontalGroup(
            panel_2_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_2_Layout.setVerticalGroup(
            panel_2_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2_Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_3_.setBackground(new java.awt.Color(255, 255, 255));

        login_part_Panel_.setBackground(new java.awt.Color(255, 255, 255));

        login_with_google.setBackground(new java.awt.Color(240, 85, 35));
        login_with_google.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login_with_google.setText("Login with google");
        login_with_google.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.setText("Username or Gmail");
        jTextField2.setBorder(null);

        username_.setBackground(new java.awt.Color(204, 204, 204));
        username_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        username_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField4.setText("Password");
        jTextField4.setBorder(null);

        password_.setBackground(new java.awt.Color(204, 204, 204));
        password_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        password_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_ActionPerformed(evt);
            }
        });

        remember_me.setBackground(new java.awt.Color(255, 255, 255));
        remember_me.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        remember_me.setText("Remember me");
        remember_me.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        login.setBackground(new java.awt.Color(240, 85, 35));
        login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login.setText("Login");
        login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        signup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signup.setText("Don't have an account?");
        signup.setBorder(null);

        login_with_fb.setBackground(new java.awt.Color(240, 85, 35));
        login_with_fb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login_with_fb.setText("Login with facebook");
        login_with_fb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setBackground(new java.awt.Color(240, 85, 35));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Forgot password?");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);

        signUp_.setBackground(new java.awt.Color(240, 85, 35));
        signUp_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signUp_.setText("Sign up");
        signUp_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signUp_.setBorderPainted(false);
        signUp_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUp_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout login_part_Panel_Layout = new javax.swing.GroupLayout(login_part_Panel_);
        login_part_Panel_.setLayout(login_part_Panel_Layout);
        login_part_Panel_Layout.setHorizontalGroup(
            login_part_Panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_part_Panel_Layout.createSequentialGroup()
                .addGroup(login_part_Panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login_part_Panel_Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(login_part_Panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(login_part_Panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(username_)
                                .addComponent(password_)
                                .addGroup(login_part_Panel_Layout.createSequentialGroup()
                                    .addComponent(remember_me)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(login_part_Panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(login_with_google, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(login_with_fb, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))))
                    .addGroup(login_part_Panel_Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signUp_, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        login_part_Panel_Layout.setVerticalGroup(
            login_part_Panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_part_Panel_Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(login_with_google, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_with_fb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(login_part_Panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remember_me)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(login_part_Panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUp_))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        logo_panel_.setBackground(new java.awt.Color(255, 255, 255));

        rappidcart_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout logo_panel_Layout = new javax.swing.GroupLayout(logo_panel_);
        logo_panel_.setLayout(logo_panel_Layout);
        logo_panel_Layout.setHorizontalGroup(
            logo_panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logo_panel_Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(rappidcart_logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logo_panel_Layout.setVerticalGroup(
            logo_panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logo_panel_Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rappidcart_logo)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout panel_3_Layout = new javax.swing.GroupLayout(panel_3_);
        panel_3_.setLayout(panel_3_Layout);
        panel_3_Layout.setHorizontalGroup(
            panel_3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3_Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(login_part_Panel_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo_panel_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panel_3_Layout.setVerticalGroup(
            panel_3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_3_Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(logo_panel_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(login_part_Panel_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_1_Layout = new javax.swing.GroupLayout(panel_1_);
        panel_1_.setLayout(panel_1_Layout);
        panel_1_Layout.setHorizontalGroup(
            panel_1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1_Layout.createSequentialGroup()
                .addComponent(panel_2_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_3_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_1_Layout.setVerticalGroup(
            panel_1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_2_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_3_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panel_1_, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void username_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_ActionPerformed
        usernameOrGmail = username_.getText();
    }//GEN-LAST:event_username_ActionPerformed

    private void signUp_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUp_ActionPerformed
        setVisible(false);
        dispose();
        
        signup s_g = new signup();
        s_g.setVisible(true);
    }//GEN-LAST:event_signUp_ActionPerformed

    private void password_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_ActionPerformed
        password = password_.getText();
    }//GEN-LAST:event_password_ActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        database d_b = new database();
        Boolean checked_username_pass = d_b.check_usernameOrGmail_password(usernameOrGmail, password);
        
        if(checked_username_pass){
            successfull_window sw = new successfull_window();
            sw.control_successful_popUp_window_login();
        }
        
        else{
            password_.setText("");
            unsuccessfull_window uw = new unsuccessfull_window();
            uw.control_Unsuccessful_popUp_window_login();
        }   
    }//GEN-LAST:event_loginActionPerformed

    
    
    public static void connect_login_page_From_RappidCart(){
        login lg = new login();
        lg.setVisible(true);
    }
    
    
//    public static void main(String args[]) {
//        login lg = new login();
//        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                lg.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cart_logo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton login;
    private javax.swing.JPanel login_part_Panel_;
    private javax.swing.JButton login_with_fb;
    private javax.swing.JButton login_with_google;
    private javax.swing.JPanel logo_panel_;
    private javax.swing.JPanel panel_1_;
    private javax.swing.JPanel panel_2_;
    private javax.swing.JPanel panel_3_;
    private javax.swing.JPasswordField password_;
    private javax.swing.JLabel rappidcart_logo;
    private javax.swing.JCheckBox remember_me;
    private javax.swing.JButton signUp_;
    private javax.swing.JTextField signup;
    private javax.swing.JTextField username_;
    // End of variables declaration//GEN-END:variables
}
