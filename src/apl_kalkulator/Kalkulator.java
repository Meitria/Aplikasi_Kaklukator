
package apl_kalkulator;
public class Kalkulator extends javax.swing.JFrame {

    String angka;
    double jumlah,bil1, bil2;
    int pilih;
    public Kalkulator() {
        initComponents();
        setLocationRelativeTo(this);
        angka ="";
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        angka8 = new rojerusan.RSMaterialButtonCircle();
        TampilHasil = new javax.swing.JTextField();
        angka7 = new rojerusan.RSMaterialButtonCircle();
        angka6 = new rojerusan.RSMaterialButtonCircle();
        angka5 = new rojerusan.RSMaterialButtonCircle();
        angka3 = new rojerusan.RSMaterialButtonCircle();
        angka2 = new rojerusan.RSMaterialButtonCircle();
        angka9 = new rojerusan.RSMaterialButtonCircle();
        titik = new rojerusan.RSMaterialButtonCircle();
        angka4 = new rojerusan.RSMaterialButtonCircle();
        angak1 = new rojerusan.RSMaterialButtonCircle();
        angka0 = new rojerusan.RSMaterialButtonCircle();
        tambah = new rojerusan.RSMaterialButtonRectangle();
        kurang = new rojerusan.RSMaterialButtonRectangle();
        samadengan = new rojerusan.RSMaterialButtonRectangle();
        persen = new rojerusan.RSMaterialButtonRectangle();
        kali = new rojerusan.RSMaterialButtonRectangle();
        akar = new rojerusan.RSMaterialButtonRectangle();
        bagi = new rojerusan.RSMaterialButtonRectangle();
        pangkat = new rojerusan.RSMaterialButtonRectangle();
        reset = new rojerusan.RSMaterialButtonRectangle();
        delete = new rojerusan.RSMaterialButtonRectangle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel1.setText("APLIKASI KALKULATOR");

        angka8.setBackground(new java.awt.Color(0, 0, 0));
        angka8.setText("8");
        angka8.setFont(new java.awt.Font("Roboto Medium", 1, 30)); // NOI18N
        angka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka8ActionPerformed(evt);
            }
        });

        TampilHasil.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        TampilHasil.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        angka7.setBackground(new java.awt.Color(0, 0, 0));
        angka7.setText("7");
        angka7.setFont(new java.awt.Font("Roboto Medium", 1, 30)); // NOI18N
        angka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka7ActionPerformed(evt);
            }
        });

        angka6.setBackground(new java.awt.Color(0, 0, 0));
        angka6.setText("6");
        angka6.setFont(new java.awt.Font("Roboto Medium", 1, 30)); // NOI18N
        angka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka6ActionPerformed(evt);
            }
        });

        angka5.setBackground(new java.awt.Color(0, 0, 0));
        angka5.setText("5");
        angka5.setFont(new java.awt.Font("Roboto Medium", 1, 30)); // NOI18N
        angka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka5ActionPerformed(evt);
            }
        });

        angka3.setBackground(new java.awt.Color(0, 0, 0));
        angka3.setText("3");
        angka3.setFont(new java.awt.Font("Roboto Medium", 1, 30)); // NOI18N
        angka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka3ActionPerformed(evt);
            }
        });

        angka2.setBackground(new java.awt.Color(0, 0, 0));
        angka2.setText("2");
        angka2.setFont(new java.awt.Font("Roboto Medium", 1, 30)); // NOI18N
        angka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka2ActionPerformed(evt);
            }
        });

        angka9.setBackground(new java.awt.Color(0, 0, 0));
        angka9.setText("9");
        angka9.setFont(new java.awt.Font("Roboto Medium", 1, 30)); // NOI18N
        angka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka9ActionPerformed(evt);
            }
        });

        titik.setBackground(new java.awt.Color(0, 0, 0));
        titik.setText(".");
        titik.setFont(new java.awt.Font("Roboto Medium", 1, 30)); // NOI18N
        titik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titikActionPerformed(evt);
            }
        });

        angka4.setBackground(new java.awt.Color(0, 0, 0));
        angka4.setText("4");
        angka4.setFont(new java.awt.Font("Roboto Medium", 1, 30)); // NOI18N
        angka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka4ActionPerformed(evt);
            }
        });

        angak1.setBackground(new java.awt.Color(0, 0, 0));
        angak1.setText("1");
        angak1.setFont(new java.awt.Font("Roboto Medium", 1, 30)); // NOI18N
        angak1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angak1ActionPerformed(evt);
            }
        });

        angka0.setBackground(new java.awt.Color(0, 0, 0));
        angka0.setText("0");
        angka0.setFont(new java.awt.Font("Roboto Medium", 1, 30)); // NOI18N
        angka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka0ActionPerformed(evt);
            }
        });

        tambah.setBackground(new java.awt.Color(51, 255, 255));
        tambah.setForeground(new java.awt.Color(0, 0, 0));
        tambah.setText("+");
        tambah.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        kurang.setBackground(new java.awt.Color(51, 255, 255));
        kurang.setForeground(new java.awt.Color(0, 0, 0));
        kurang.setText("-");
        kurang.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });

        samadengan.setBackground(new java.awt.Color(51, 255, 255));
        samadengan.setForeground(new java.awt.Color(0, 0, 0));
        samadengan.setText("=");
        samadengan.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        samadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samadenganActionPerformed(evt);
            }
        });

        persen.setBackground(new java.awt.Color(51, 255, 255));
        persen.setForeground(new java.awt.Color(0, 0, 0));
        persen.setText("%");
        persen.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        persen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persenActionPerformed(evt);
            }
        });

        kali.setBackground(new java.awt.Color(51, 255, 255));
        kali.setForeground(new java.awt.Color(0, 0, 0));
        kali.setText("x");
        kali.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });

        akar.setBackground(new java.awt.Color(51, 255, 255));
        akar.setForeground(new java.awt.Color(0, 0, 0));
        akar.setText("√");
        akar.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        akar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akarActionPerformed(evt);
            }
        });

        bagi.setBackground(new java.awt.Color(51, 255, 255));
        bagi.setForeground(new java.awt.Color(0, 0, 0));
        bagi.setText("/");
        bagi.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });

        pangkat.setBackground(new java.awt.Color(51, 255, 255));
        pangkat.setForeground(new java.awt.Color(0, 0, 0));
        pangkat.setText("^");
        pangkat.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        pangkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pangkatActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(51, 255, 255));
        reset.setForeground(new java.awt.Color(0, 0, 0));
        reset.setText("C");
        reset.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(51, 255, 255));
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("DEL");
        delete.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TampilHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(angka4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(angak1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(angka7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(angka6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(titik, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(angka8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(samadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(kali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(kurang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(angka0, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(akar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pangkat, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(persen, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(TampilHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pangkat, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(persen, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(akar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angak1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(samadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
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

    private void angak1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angak1ActionPerformed
angka += "1";
     TampilHasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_angak1ActionPerformed

    private void angka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka5ActionPerformed
angka += "5";
     TampilHasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_angka5ActionPerformed

    private void angka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka8ActionPerformed
angka += "8";
     TampilHasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_angka8ActionPerformed

    private void persenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persenActionPerformed
    bil1 = Double.parseDouble(angka);
TampilHasil.setText("%");
angka = "";
pilih = 5;        // TODO add your handling code here:
    }//GEN-LAST:event_persenActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
     bil1 = Double.parseDouble(angka);
TampilHasil.setText("*");
angka = "";
pilih = 3;     // TODO add your handling code here:
    }//GEN-LAST:event_kaliActionPerformed

    private void akarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akarActionPerformed
bil1 = Double.parseDouble(angka);
TampilHasil.setText("\u221A");
angka = "";
pilih = 7;        // TODO add your handling code here:
    }//GEN-LAST:event_akarActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
    bil1 = Double.parseDouble(angka);
TampilHasil.setText("/");
angka = "";
pilih = 4;        // TODO add your handling code here:
    }//GEN-LAST:event_bagiActionPerformed

    private void pangkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pangkatActionPerformed
bil1 = Double.parseDouble(angka);
TampilHasil.setText("^");
angka = "";
pilih = 6;          // TODO add your handling code here:
    }//GEN-LAST:event_pangkatActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
TampilHasil.setText(angka);
  bil1=0.0;
  bil2=0.0;
  jumlah=0.0;
  angka="";
  TampilHasil.setText("");         // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
 if (TampilHasil.getText().length()<=1){
    angka="";
    TampilHasil.setText("0");
}else{
  angka=TampilHasil.getText().substring(0, TampilHasil.getText().length()-1);
   TampilHasil.setText(angka);
}        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void angka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka7ActionPerformed
angka += "7";
     TampilHasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_angka7ActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
    bil1 = Double.parseDouble(angka);
TampilHasil.setText("-");
angka = "";
pilih = 2;       // TODO add your handling code here:
    }//GEN-LAST:event_kurangActionPerformed

    private void angka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka0ActionPerformed
     angka += "0";
     TampilHasil.setText(angka);
    }//GEN-LAST:event_angka0ActionPerformed

    private void titikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titikActionPerformed
angka += ".";
     TampilHasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_titikActionPerformed

    private void angka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka2ActionPerformed
angka += "2";
     TampilHasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_angka2ActionPerformed

    private void angka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka3ActionPerformed
angka += "3";
     TampilHasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_angka3ActionPerformed

    private void angka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka4ActionPerformed
angka += "4";
     TampilHasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_angka4ActionPerformed

    private void angka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka6ActionPerformed
angka += "6";
     TampilHasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_angka6ActionPerformed

    private void angka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka9ActionPerformed
angka += "9";
     TampilHasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_angka9ActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
    bil1 = Double.parseDouble(angka);
TampilHasil.setText("+");
angka = "";
pilih = 1;
    }//GEN-LAST:event_tambahActionPerformed

    private void samadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samadenganActionPerformed
switch (pilih){
    case 1:
       bil2 = Double.parseDouble(angka);
       jumlah = bil1+bil2;
       angka = Double.toString(jumlah);
       TampilHasil.setText(angka);
       break;
    case 2:
       bil2 = Double.parseDouble(angka);
       jumlah = bil1-bil2;
       angka = Double.toString(jumlah);
       TampilHasil.setText(angka);
       break;
       case 3:
       bil2 = Double.parseDouble(angka);
       jumlah = bil1*bil2;
       angka = Double.toString(jumlah);
       TampilHasil.setText(angka);
       break;
       case 4:
       bil2 = Double.parseDouble(angka);
       jumlah = bil1/bil2;
       angka = Double.toString(jumlah);
       TampilHasil.setText(angka);
       break;
       case 5:
       jumlah = (bil1)/100;
       angka = Double.toString(jumlah);
       TampilHasil.setText(angka);
       break;
       case 6:
       bil2 = Double.parseDouble(angka);
       jumlah = Math.pow(bil1,bil2);
       angka = Double.toString(jumlah);
       TampilHasil.setText(angka);
       break;
       case 7:
       jumlah = Math.sqrt(bil1);
       angka = Double.toString(jumlah);
       TampilHasil.setText(angka);
       break;
}        // TODO add your handling code here:
    }//GEN-LAST:event_samadenganActionPerformed

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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TampilHasil;
    private rojerusan.RSMaterialButtonRectangle akar;
    private rojerusan.RSMaterialButtonCircle angak1;
    private rojerusan.RSMaterialButtonCircle angka0;
    private rojerusan.RSMaterialButtonCircle angka2;
    private rojerusan.RSMaterialButtonCircle angka3;
    private rojerusan.RSMaterialButtonCircle angka4;
    private rojerusan.RSMaterialButtonCircle angka5;
    private rojerusan.RSMaterialButtonCircle angka6;
    private rojerusan.RSMaterialButtonCircle angka7;
    private rojerusan.RSMaterialButtonCircle angka8;
    private rojerusan.RSMaterialButtonCircle angka9;
    private rojerusan.RSMaterialButtonRectangle bagi;
    private rojerusan.RSMaterialButtonRectangle delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private rojerusan.RSMaterialButtonRectangle kali;
    private rojerusan.RSMaterialButtonRectangle kurang;
    private rojerusan.RSMaterialButtonRectangle pangkat;
    private rojerusan.RSMaterialButtonRectangle persen;
    private rojerusan.RSMaterialButtonRectangle reset;
    private rojerusan.RSMaterialButtonRectangle samadengan;
    private rojerusan.RSMaterialButtonRectangle tambah;
    private rojerusan.RSMaterialButtonCircle titik;
    // End of variables declaration//GEN-END:variables
}
