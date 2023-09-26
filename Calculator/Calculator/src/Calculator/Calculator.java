/*
**********A Simple Calculator**********
            Name : Samius Sazin
            ID: 0242220005101236
            Batch_63
            Department of C.S.E
            Daffodil International University
            
            Date : September 26, 2023
*/

package Calculator;

import java.awt.Color;
import java.util.Random;
public class Calculator extends javax.swing.JFrame {
    
    double numb1, numb2;
    String operation;

    public Calculator() {
        initComponents();
        
        Color col = new Color(0, 0, 0);
        getContentPane().setBackground(col);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        result_box = new javax.swing.JTextField();
        digit8 = new javax.swing.JButton();
        digit7 = new javax.swing.JButton();
        operator_plus = new javax.swing.JButton();
        digit9 = new javax.swing.JButton();
        operator_minus = new javax.swing.JButton();
        digit5 = new javax.swing.JButton();
        digit4 = new javax.swing.JButton();
        digit6 = new javax.swing.JButton();
        operator_multi = new javax.swing.JButton();
        digit2 = new javax.swing.JButton();
        digit1 = new javax.swing.JButton();
        digit3 = new javax.swing.JButton();
        operator_dott = new javax.swing.JButton();
        operator_equal = new javax.swing.JButton();
        operator_div = new javax.swing.JButton();
        digit0 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        History = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        modulus = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULATOR");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        result_box.setBackground(new java.awt.Color(0, 0, 0));
        result_box.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        result_box.setForeground(new java.awt.Color(255, 255, 255));
        result_box.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        result_box.setBorder(null);
        result_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result_boxActionPerformed(evt);
            }
        });

        digit8.setBackground(new java.awt.Color(51, 51, 51));
        digit8.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        digit8.setForeground(new java.awt.Color(240, 240, 240));
        digit8.setText("8");
        digit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit8ActionPerformed(evt);
            }
        });

        digit7.setBackground(new java.awt.Color(51, 51, 51));
        digit7.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        digit7.setForeground(new java.awt.Color(240, 240, 240));
        digit7.setText("7");
        digit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit7ActionPerformed(evt);
            }
        });

        operator_plus.setBackground(new java.awt.Color(254, 149, 5));
        operator_plus.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        operator_plus.setForeground(new java.awt.Color(255, 255, 255));
        operator_plus.setText("+");
        operator_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operator_plusActionPerformed(evt);
            }
        });

        digit9.setBackground(new java.awt.Color(51, 51, 51));
        digit9.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        digit9.setForeground(new java.awt.Color(240, 240, 240));
        digit9.setText("9");
        digit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit9ActionPerformed(evt);
            }
        });

        operator_minus.setBackground(new java.awt.Color(254, 149, 5));
        operator_minus.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        operator_minus.setForeground(new java.awt.Color(255, 255, 255));
        operator_minus.setText("-");
        operator_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operator_minusActionPerformed(evt);
            }
        });

        digit5.setBackground(new java.awt.Color(51, 51, 51));
        digit5.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        digit5.setForeground(new java.awt.Color(240, 240, 240));
        digit5.setText("5");
        digit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit5ActionPerformed(evt);
            }
        });

        digit4.setBackground(new java.awt.Color(51, 51, 51));
        digit4.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        digit4.setForeground(new java.awt.Color(240, 240, 240));
        digit4.setText("4");
        digit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit4ActionPerformed(evt);
            }
        });

        digit6.setBackground(new java.awt.Color(51, 51, 51));
        digit6.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        digit6.setForeground(new java.awt.Color(240, 240, 240));
        digit6.setText("6");
        digit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit6ActionPerformed(evt);
            }
        });

        operator_multi.setBackground(new java.awt.Color(254, 149, 5));
        operator_multi.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        operator_multi.setForeground(new java.awt.Color(255, 255, 255));
        operator_multi.setText("*");
        operator_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operator_multiActionPerformed(evt);
            }
        });

        digit2.setBackground(new java.awt.Color(51, 51, 51));
        digit2.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        digit2.setForeground(new java.awt.Color(240, 240, 240));
        digit2.setText("2");
        digit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit2ActionPerformed(evt);
            }
        });

        digit1.setBackground(new java.awt.Color(51, 51, 51));
        digit1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        digit1.setForeground(new java.awt.Color(240, 240, 240));
        digit1.setText("1");
        digit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit1ActionPerformed(evt);
            }
        });

        digit3.setBackground(new java.awt.Color(51, 51, 51));
        digit3.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        digit3.setForeground(new java.awt.Color(240, 240, 240));
        digit3.setText("3");
        digit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit3ActionPerformed(evt);
            }
        });

        operator_dott.setBackground(new java.awt.Color(165, 165, 165));
        operator_dott.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        operator_dott.setText(".");
        operator_dott.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operator_dottActionPerformed(evt);
            }
        });

        operator_equal.setBackground(new java.awt.Color(254, 149, 5));
        operator_equal.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        operator_equal.setForeground(new java.awt.Color(255, 255, 255));
        operator_equal.setText("=");
        operator_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operator_equalActionPerformed(evt);
            }
        });

        operator_div.setBackground(new java.awt.Color(254, 149, 5));
        operator_div.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        operator_div.setForeground(new java.awt.Color(255, 255, 255));
        operator_div.setText("/");
        operator_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operator_divActionPerformed(evt);
            }
        });

        digit0.setBackground(new java.awt.Color(165, 165, 165));
        digit0.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        digit0.setText("0");
        digit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit0ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 149, 5));
        jLabel1.setText("Sam Mini Calculator");

        History.setBackground(new java.awt.Color(0, 0, 0));
        History.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        History.setForeground(new java.awt.Color(255, 255, 255));
        History.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        clear.setBackground(new java.awt.Color(51, 51, 51));
        clear.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("CE");
        clear.setMaximumSize(new java.awt.Dimension(70, 45));
        clear.setMinimumSize(new java.awt.Dimension(70, 45));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        modulus.setBackground(new java.awt.Color(254, 149, 5));
        modulus.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        modulus.setForeground(new java.awt.Color(255, 255, 255));
        modulus.setText("%");
        modulus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modulusActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 149, 5));
        jButton1.setText("Quick Answer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(History, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(digit4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(digit5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(digit6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(digit7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(digit8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(digit9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(digit1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(13, 13, 13)
                                                .addComponent(digit2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(digit3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(digit0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(operator_dott, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(operator_equal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(modulus, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(operator_div, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(operator_multi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(operator_plus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(operator_minus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(result_box))))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(History, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(result_box, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(digit7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(digit8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(digit9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(digit6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(digit5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(digit4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(digit1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(digit2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(digit3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(operator_equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1))
                            .addComponent(modulus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(operator_dott, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(digit0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(operator_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(operator_minus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(operator_multi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(operator_div)))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void digit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit9ActionPerformed
        String numb = result_box.getText();
        result_box.setText(numb + "9");
    }//GEN-LAST:event_digit9ActionPerformed

    private void operator_equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operator_equalActionPerformed
        History.setText(History.getText() + " " + result_box.getText());

        numb2 = Double.parseDouble(result_box.getText());

        double ans = 0;
        if(operation == "+"){
            ans = numb1+numb2;
        }
        else if(operation == "-"){
            ans = numb1-numb2;
        }
        else if(operation == "*"){
            ans = numb1*numb2;
        }
        else if(operation == "/"){
            ans = numb1/numb2;
        }
        else if(operation == "%"){
            ans = numb1%numb2;
        }

        String answer = Double.toString(ans);
        result_box.setText(answer);

        History.setText(History.getText() + " = " + answer);
    }//GEN-LAST:event_operator_equalActionPerformed

    private void operator_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operator_plusActionPerformed
        History.setText(result_box.getText() + " " + "+");
        numb1 = Double.parseDouble(result_box.getText());
        result_box.setText("");
        operation = "+";
    }//GEN-LAST:event_operator_plusActionPerformed

    private void digit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit7ActionPerformed
        String numb = result_box.getText();
        result_box.setText(numb + "7");
    }//GEN-LAST:event_digit7ActionPerformed

    private void digit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit8ActionPerformed
        String numb = result_box.getText();
        result_box.setText(numb + "8");
    }//GEN-LAST:event_digit8ActionPerformed

    private void result_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_result_boxActionPerformed

    }//GEN-LAST:event_result_boxActionPerformed

    private void operator_dottActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operator_dottActionPerformed
        result_box.setText(result_box.getText() + ".");
    }//GEN-LAST:event_operator_dottActionPerformed

    private void digit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit3ActionPerformed
        String numb = result_box.getText();
        result_box.setText(numb + "3");
    }//GEN-LAST:event_digit3ActionPerformed

    private void digit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit1ActionPerformed
        String numb = result_box.getText();
        result_box.setText(numb + "1");
    }//GEN-LAST:event_digit1ActionPerformed

    private void digit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit2ActionPerformed
        String numb = result_box.getText();
        result_box.setText(numb + "2");
    }//GEN-LAST:event_digit2ActionPerformed

    private void operator_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operator_multiActionPerformed
        History.setText(result_box.getText() + " " + "*");
        numb1 = Double.parseDouble(result_box.getText());
        result_box.setText("");
        operation = "*";
    }//GEN-LAST:event_operator_multiActionPerformed

    private void digit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit6ActionPerformed
        String numb = result_box.getText();
        result_box.setText(numb + "6");
    }//GEN-LAST:event_digit6ActionPerformed

    private void digit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit4ActionPerformed
        String numb = result_box.getText();
        result_box.setText(numb + "4");
    }//GEN-LAST:event_digit4ActionPerformed

    private void digit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit5ActionPerformed
        String numb = result_box.getText();
        result_box.setText(numb + "5");
    }//GEN-LAST:event_digit5ActionPerformed

    private void digit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit0ActionPerformed
        String numb = result_box.getText();
        result_box.setText(numb + "0");
    }//GEN-LAST:event_digit0ActionPerformed

    private void operator_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operator_minusActionPerformed
        History.setText(result_box.getText() + " " + "-");
        numb1 = Double.parseDouble(result_box.getText());
        result_box.setText("");
        operation = "-";
    }//GEN-LAST:event_operator_minusActionPerformed

    private void operator_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operator_divActionPerformed
        History.setText(result_box.getText() + " " + "/");
        numb1 = Double.parseDouble(result_box.getText());
        result_box.setText("");
        operation = "/";
    }//GEN-LAST:event_operator_divActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        numb1 = 0;
        numb2 = 0;
        result_box.setText("");
        History.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void modulusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modulusActionPerformed
        History.setText(result_box.getText() + " " + "%");
        numb1 = Double.parseDouble(result_box.getText());
        result_box.setText("");
        operation = "%";
    }//GEN-LAST:event_modulusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Random rn = new Random();
        int ran_num = rn.nextInt(10, 9999);
        result_box.setText(ran_num + "");
        History.setText("Kesa Laga Majak");
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Calculator().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel History;
    private javax.swing.JButton clear;
    private javax.swing.JButton digit0;
    private javax.swing.JButton digit1;
    private javax.swing.JButton digit2;
    private javax.swing.JButton digit3;
    private javax.swing.JButton digit4;
    private javax.swing.JButton digit5;
    private javax.swing.JButton digit6;
    private javax.swing.JButton digit7;
    private javax.swing.JButton digit8;
    private javax.swing.JButton digit9;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton modulus;
    private javax.swing.JButton operator_div;
    private javax.swing.JButton operator_dott;
    private javax.swing.JButton operator_equal;
    private javax.swing.JButton operator_minus;
    private javax.swing.JButton operator_multi;
    private javax.swing.JButton operator_plus;
    private javax.swing.JTextField result_box;
    // End of variables declaration//GEN-END:variables
}
