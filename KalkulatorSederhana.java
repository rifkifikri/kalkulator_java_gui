
import javax.swing.JTextField;


public class KalkulatorSederhana extends javax.swing.JFrame {
    
    String angka;
    int pilih,nilai1,nilai2,jumlah;
    
    public KalkulatorSederhana() {
        initComponents();
        angka="";
    }
    void angka0 (){
        angka +="0";
        isiData_282.setText(angka);
    }
     void angka1 (){
        angka +="1";
        isiData_282.setText(angka);
    }
      void angka2 (){
        angka +="2";
        isiData_282.setText(angka);
    }
       void angka3 (){
        angka +="3";
        isiData_282.setText(angka);
    }
        void angka4 (){
        angka +="4";
        isiData_282.setText(angka);
    }
     void angka5 (){
        angka +="5";
        isiData_282.setText(angka);
    }
      void angka6 (){
        angka +="6";
        isiData_282.setText(angka);
    }
       void angka7 (){
        angka +="7";
        isiData_282.setText(angka);
    }
        void angka8 (){
        angka +="8";
        isiData_282.setText(angka);
    }
         void angka9 (){
        angka +="9";
        isiData_282.setText(angka);
    }
         void koma (){
        angka +=".";
        isiData_282.setText(angka);
    }
        
     void hasil(){
         switch(pilih){
             case 1:
                 nilai2=Integer.parseInt(angka);
                 jumlah=nilai1+nilai2;
                 angka=Integer.toString(jumlah);
                 isiData_282.setText(nilai1+"+"+nilai2+"="+angka);
                 break;
            case 2:
                 nilai2=Integer.parseInt(angka);
                 jumlah=nilai1-nilai2;
                 angka=Integer.toString(jumlah);
                 isiData_282.setText(nilai1+"-"+nilai2+"="+angka);
                 break;
            case 3:
                 nilai2=Integer.parseInt(angka);
                 jumlah=nilai1*nilai2;
                 angka=Integer.toString(jumlah);
                 isiData_282.setText(nilai1+"x"+nilai2+"="+angka);
                 break;
            case 4:
                 nilai2=Integer.parseInt(angka);
                 jumlah=nilai1/nilai2;
                 angka=Integer.toString(jumlah);
                 isiData_282.setText(nilai1+"/"+nilai2+"="+angka);
                 break;
         }         
     }
     void tambah (){
         nilai1=Integer.parseInt(angka);
         isiData_282.setText("+");
         angka="";
         pilih=1;
     }
     void kurang (){
         nilai1=Integer.parseInt(angka);
         isiData_282.setText("-");
         angka="";
         pilih=2;
     }
     void kali (){
         nilai1=Integer.parseInt(angka);
         isiData_282.setText("X");
         angka="";
         pilih=3;
     }
     void bagi (){
         nilai1=Integer.parseInt(angka);
         isiData_282.setText("/");
         angka="";
         pilih=4;
     }
     
         
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        isiData_282 = new javax.swing.JTextField();
        jButton0_282 = new javax.swing.JButton();
        jButton7_282 = new javax.swing.JButton();
        jButton8_282 = new javax.swing.JButton();
        jButton2_282 = new javax.swing.JButton();
        titik11_282 = new javax.swing.JButton();
        jButton9_282 = new javax.swing.JButton();
        jButton6_282 = new javax.swing.JButton();
        jButton3_282 = new javax.swing.JButton();
        jButton5_282 = new javax.swing.JButton();
        jButton4_282 = new javax.swing.JButton();
        jButton1_282 = new javax.swing.JButton();
        clear_282 = new javax.swing.JButton();
        kali_282 = new javax.swing.JButton();
        bagi_282 = new javax.swing.JButton();
        kurang_282 = new javax.swing.JButton();
        tambah_282 = new javax.swing.JButton();
        hasil_282 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton0_282.setText("0");
        jButton0_282.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0_282ActionPerformed(evt);
            }
        });

        jButton7_282.setText("7");
        jButton7_282.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7_282ActionPerformed(evt);
            }
        });

        jButton8_282.setText("8");
        jButton8_282.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8_282ActionPerformed(evt);
            }
        });

        jButton2_282.setText("2");
        jButton2_282.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_282ActionPerformed(evt);
            }
        });

        titik11_282.setText(".");
        titik11_282.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titik11_282ActionPerformed(evt);
            }
        });

        jButton9_282.setText("9");
        jButton9_282.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9_282ActionPerformed(evt);
            }
        });

        jButton6_282.setText("6");
        jButton6_282.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6_282ActionPerformed(evt);
            }
        });

        jButton3_282.setText("3");
        jButton3_282.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_282ActionPerformed(evt);
            }
        });

        jButton5_282.setText("5");
        jButton5_282.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_282ActionPerformed(evt);
            }
        });

        jButton4_282.setText("4");
        jButton4_282.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_282ActionPerformed(evt);
            }
        });

        jButton1_282.setText("1");
        jButton1_282.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_282ActionPerformed(evt);
            }
        });

        clear_282.setText("C");
        clear_282.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_282ActionPerformed(evt);
            }
        });

        kali_282.setText("X");
        kali_282.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kali_282ActionPerformed(evt);
            }
        });

        bagi_282.setText("/");
        bagi_282.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagi_282ActionPerformed(evt);
            }
        });

        kurang_282.setText("-");
        kurang_282.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurang_282ActionPerformed(evt);
            }
        });

        tambah_282.setText("+");
        tambah_282.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah_282ActionPerformed(evt);
            }
        });

        hasil_282.setText("=");
        hasil_282.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasil_282ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isiData_282, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton0_282, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4_282)
                                    .addComponent(jButton7_282)
                                    .addComponent(jButton1_282))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton8_282, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2_282, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton5_282))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titik11_282)
                            .addComponent(jButton9_282)
                            .addComponent(jButton6_282)
                            .addComponent(jButton3_282))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(hasil_282, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(kurang_282)
                                    .addGap(18, 18, 18)
                                    .addComponent(tambah_282)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(clear_282, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(kali_282)
                                    .addGap(18, 18, 18)
                                    .addComponent(bagi_282))))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(isiData_282, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton0_282)
                    .addComponent(titik11_282)
                    .addComponent(clear_282))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7_282)
                    .addComponent(jButton8_282)
                    .addComponent(jButton9_282)
                    .addComponent(kali_282)
                    .addComponent(bagi_282))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4_282)
                    .addComponent(jButton5_282)
                    .addComponent(jButton6_282)
                    .addComponent(kurang_282)
                    .addComponent(tambah_282))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_282)
                    .addComponent(jButton2_282)
                    .addComponent(jButton3_282)
                    .addComponent(hasil_282))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton0_282ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0_282ActionPerformed
        // TODO add your handling code here:
        angka0();
    }//GEN-LAST:event_jButton0_282ActionPerformed

    private void jButton1_282ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_282ActionPerformed
        // TODO add your handling code here:
        angka1();
    }//GEN-LAST:event_jButton1_282ActionPerformed

    private void jButton2_282ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_282ActionPerformed
        // TODO add your handling code here:
        angka2();
    }//GEN-LAST:event_jButton2_282ActionPerformed

    private void jButton3_282ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_282ActionPerformed
        // TODO add your handling code here:
        angka3();
    }//GEN-LAST:event_jButton3_282ActionPerformed

    private void jButton4_282ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_282ActionPerformed
        // TODO add your handling code here:
        angka4();
    }//GEN-LAST:event_jButton4_282ActionPerformed

    private void jButton5_282ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_282ActionPerformed
        // TODO add your handling code here:
        angka5();
    }//GEN-LAST:event_jButton5_282ActionPerformed

    private void jButton6_282ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6_282ActionPerformed
        // TODO add your handling code here:
        angka6();
    }//GEN-LAST:event_jButton6_282ActionPerformed

    private void jButton7_282ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7_282ActionPerformed
        // TODO add your handling code here:
        angka7();
    }//GEN-LAST:event_jButton7_282ActionPerformed

    private void jButton8_282ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8_282ActionPerformed
        // TODO add your handling code here:
        angka8();
    }//GEN-LAST:event_jButton8_282ActionPerformed

    private void jButton9_282ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9_282ActionPerformed
        // TODO add your handling code here:
        angka9();
    }//GEN-LAST:event_jButton9_282ActionPerformed

    private void tambah_282ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah_282ActionPerformed
        // TODO add your handling code here:
        tambah();
    }//GEN-LAST:event_tambah_282ActionPerformed

    private void hasil_282ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasil_282ActionPerformed
        // TODO add your handling code here:
        hasil();
    }//GEN-LAST:event_hasil_282ActionPerformed

    private void kali_282ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kali_282ActionPerformed
        // TODO add your handling code here:
        kali();
    }//GEN-LAST:event_kali_282ActionPerformed

    private void bagi_282ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagi_282ActionPerformed
        // TODO add your handling code here:
        bagi();
    }//GEN-LAST:event_bagi_282ActionPerformed

    private void kurang_282ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurang_282ActionPerformed
        // TODO add your handling code here:
        kurang();
    }//GEN-LAST:event_kurang_282ActionPerformed

    private void clear_282ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_282ActionPerformed
        // TODO add your handling code here:
        isiData_282.setText("");
        nilai1=(int) 0.0;
        nilai2=(int) 0.0;
          jumlah=(int) 0.0;
          angka="";
    }//GEN-LAST:event_clear_282ActionPerformed

    private void titik11_282ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titik11_282ActionPerformed
        // TODO add your handling code here:
        koma();
    }//GEN-LAST:event_titik11_282ActionPerformed

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
            java.util.logging.Logger.getLogger(KalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KalkulatorSederhana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bagi_282;
    private javax.swing.JButton clear_282;
    private javax.swing.JButton hasil_282;
    private javax.swing.JTextField isiData_282;
    private javax.swing.JButton jButton0_282;
    private javax.swing.JButton jButton1_282;
    private javax.swing.JButton jButton2_282;
    private javax.swing.JButton jButton3_282;
    private javax.swing.JButton jButton4_282;
    private javax.swing.JButton jButton5_282;
    private javax.swing.JButton jButton6_282;
    private javax.swing.JButton jButton7_282;
    private javax.swing.JButton jButton8_282;
    private javax.swing.JButton jButton9_282;
    private javax.swing.JButton kali_282;
    private javax.swing.JButton kurang_282;
    private javax.swing.JButton tambah_282;
    private javax.swing.JButton titik11_282;
    // End of variables declaration//GEN-END:variables
}
