public class Calculator extends javax.swing.JFrame {
     double total,fdouble,sdouble;
     int p,m,mul,div,dec;

    public Calculator() {
        initComponents();
super.setTitle("Ankush's Calc");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        display = new javax.swing.JTextField();
        But1 = new javax.swing.JButton();
        But2 = new javax.swing.JButton();
        But3 = new javax.swing.JButton();
        But4 = new javax.swing.JButton();
        But5 = new javax.swing.JButton();
        But6 = new javax.swing.JButton();
        But7 = new javax.swing.JButton();
        But8 = new javax.swing.JButton();
        But9 = new javax.swing.JButton();
        But0 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        sign = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        display.setEditable(false);
        display.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        display.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        But1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        But1.setText("1");
        But1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But1ActionPerformed(evt);
            }
        });

        But2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        But2.setText("2");
        But2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But2ActionPerformed(evt);
            }
        });

        But3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        But3.setText("3");
        But3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But3ActionPerformed(evt);
            }
        });

        But4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        But4.setText("4");
        But4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But4ActionPerformed(evt);
            }
        });

        But5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        But5.setText("5");
        But5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But5ActionPerformed(evt);
            }
        });

        But6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        But6.setText("6");
        But6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But6ActionPerformed(evt);
            }
        });

        But7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        But7.setText("7");
        But7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But7ActionPerformed(evt);
            }
        });

        But8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        But8.setText("8");
        But8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But8ActionPerformed(evt);
            }
        });

        But9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        But9.setText("9");
        But9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But9ActionPerformed(evt);
            }
        });

        But0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        But0.setText("0");
        But0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But0ActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        dot.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dot.setText(".");
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });

        plus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        minus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        multiply.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        multiply.setText("*");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        divide.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        divide.setText("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        equals.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        equals.setText("=");
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        sign.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sign.setText("+/-");
        sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(But1)
                        .addGap(14, 14, 14)
                        .addComponent(But2)
                        .addGap(10, 10, 10)
                        .addComponent(But3)
                        .addGap(18, 18, 18)
                        .addComponent(plus))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(But4)
                        .addGap(11, 11, 11)
                        .addComponent(But5)
                        .addGap(13, 13, 13)
                        .addComponent(But6)
                        .addGap(18, 18, 18)
                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(But7)
                        .addGap(11, 11, 11)
                        .addComponent(But8)
                        .addGap(11, 11, 11)
                        .addComponent(But9)
                        .addGap(20, 20, 20)
                        .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(But0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(clear)
                        .addGap(11, 11, 11)
                        .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(sign, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(But1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(But2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(But3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(But5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(But4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(But6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(But8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(But9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(But7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(But0, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sign, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
display.setText("");
dec=0;
    }//GEN-LAST:event_clearActionPerformed

    private void But1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But1ActionPerformed
        display.setText(display.getText()+But1.getText());
    }//GEN-LAST:event_But1ActionPerformed

    private void But2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But2ActionPerformed
display.setText(display.getText()+But2.getText());
    }//GEN-LAST:event_But2ActionPerformed

    private void But3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But3ActionPerformed
display.setText(display.getText()+But3.getText());
    }//GEN-LAST:event_But3ActionPerformed

    private void But4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But4ActionPerformed
display.setText(display.getText()+But4.getText());
    }//GEN-LAST:event_But4ActionPerformed

    private void But5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But5ActionPerformed
display.setText(display.getText()+But5.getText());
    }//GEN-LAST:event_But5ActionPerformed

    private void But6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But6ActionPerformed
display.setText(display.getText()+But6.getText());
    }//GEN-LAST:event_But6ActionPerformed

    private void But7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But7ActionPerformed
display.setText(display.getText()+But7.getText());
    }//GEN-LAST:event_But7ActionPerformed

    private void But8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But8ActionPerformed
display.setText(display.getText()+But8.getText());
    }//GEN-LAST:event_But8ActionPerformed

    private void But9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But9ActionPerformed
display.setText(display.getText()+But9.getText());
    }//GEN-LAST:event_But9ActionPerformed

    private void But0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But0ActionPerformed
display.setText(display.getText()+But0.getText());
    }//GEN-LAST:event_But0ActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
if(dec==0)
{
 display.setText(display.getText()+dot.getText());
}
       
dec=1;

    }//GEN-LAST:event_dotActionPerformed

    private void signActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signActionPerformed
double sign=Double.parseDouble(String.valueOf(display.getText()));
sign=sign*(-1);        
display.setText(String.valueOf(sign));
    }//GEN-LAST:event_signActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
 fdouble=Double.parseDouble(display.getText());
display.setText("");
 p=1;
 dec=0;
    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
fdouble=Double.parseDouble(display.getText());
display.setText("");
 m=1;
 dec=0;
    }//GEN-LAST:event_minusActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
 fdouble=Double.parseDouble(display.getText());
display.setText("");
 mul=1;
 dec=0;
    }//GEN-LAST:event_multiplyActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
 fdouble=Double.parseDouble(display.getText());
display.setText("");
 div=1;
 dec=0;
    }//GEN-LAST:event_divideActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
 sdouble=Double.parseDouble(display.getText());
if(p>0)
{
total=fdouble+sdouble;
display.setText(String.valueOf(total));
fdouble=0;
sdouble=0;
p=0;
}
if(m>0)
{
total=fdouble-sdouble;
display.setText(String.valueOf(total));
fdouble=0;
sdouble=0;
m=0;
}
if(mul>0)
{
total=fdouble*sdouble;
display.setText(String.valueOf(total));
fdouble=0;
sdouble=0;
mul=0;
}
if(div>0)
{
total=fdouble/sdouble;
display.setText(String.valueOf(total));
fdouble=0;
sdouble=0;
div=0;
}



    }//GEN-LAST:event_equalsActionPerformed

    
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
   
    private javax.swing.JButton But0;
    private javax.swing.JButton But1;
    private javax.swing.JButton But2;
    private javax.swing.JButton But3;
    private javax.swing.JButton But4;
    private javax.swing.JButton But5;
    private javax.swing.JButton But6;
    private javax.swing.JButton But7;
    private javax.swing.JButton But8;
    private javax.swing.JButton But9;
    private javax.swing.JButton clear;
    private javax.swing.JTextField display;
    private javax.swing.JButton divide;
    private javax.swing.JButton dot;
    private javax.swing.JButton equals;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiply;
    private javax.swing.JButton plus;
    private javax.swing.JButton sign;
   
}
