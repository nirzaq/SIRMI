package id.arief.sirmi.transaksi.penyewaan;

import com.sun.glass.events.KeyEvent;
import id.arief.sirmi.home.HomeView;
import id.arief.sirmi.transaksi.penyewaan.carimobil.CariMobilView;
import id.arief.sirmi.transaksi.tarifmobil.*;
import id.arief.sirmi.util.BatasKarakter;
import id.arief.sirmi.util.IconUtil;
import id.arief.sirmi.util.InputUtil;
import id.arief.sirmi.util.TabIndex;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arief-asus
 */
public class TransaksiPenyewaanView extends javax.swing.JInternalFrame {

    TarifController tarifController = new TarifController();
    boolean valid;
    public static double biayaSewa;

    public TransaksiPenyewaanView() {
        initComponents();
        viewSetup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupJenisSewa = new javax.swing.ButtonGroup();
        textBiayaSewa = new javax.swing.JTextField();
        Container = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        panelInput = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textKodeTransaksi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textNamaPenyewa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaAlamat = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        textNoTelp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        radioPer12 = new javax.swing.JRadioButton();
        radioPerHari = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        textCariMobil = new javax.swing.JTextField();
        buttonCariMobil = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        comboJaminan = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        textLamaSewa = new javax.swing.JTextField();
        labelLamaSewa = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelBiayaSewa = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textBayar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        labelKembalian = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        buttonSimpan = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        buttonTabelTransaksi = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();
        labelErrorInput = new javax.swing.JLabel();

        textBiayaSewa.setText("jTextField1");

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(645, 480));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelTitle.setFont(labelTitle.getFont().deriveFont(labelTitle.getFont().getStyle() | java.awt.Font.BOLD, labelTitle.getFont().getSize()+13));
        labelTitle.setText("TRANSAKSI PENYEWAAN");
        jPanel2.add(labelTitle);

        panelInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Kode Transaksi");

        textKodeTransaksi.setText("<Otomatis>");
        textKodeTransaksi.setEnabled(false);

        jLabel2.setText("Nama");

        jLabel3.setText("Alamat");

        textAreaAlamat.setColumns(20);
        textAreaAlamat.setRows(5);
        textAreaAlamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textAreaAlamatKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textAreaAlamatKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(textAreaAlamat);

        jLabel4.setText("Telp/HP");

        textNoTelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textNoTelpKeyReleased(evt);
            }
        });

        jLabel5.setText("Jenis Sewa");

        radioPer12.setMnemonic('J');
        radioPer12.setText("Per 12 Jam");
        radioPer12.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioPer12ItemStateChanged(evt);
            }
        });

        radioPerHari.setText("Per Hari");
        radioPerHari.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioPerHariItemStateChanged(evt);
            }
        });

        jLabel6.setText("Mobil");

        textCariMobil.setEnabled(false);

        buttonCariMobil.setText("Cari");
        buttonCariMobil.setEnabled(false);
        buttonCariMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariMobilActionPerformed(evt);
            }
        });

        jLabel7.setText("Jaminan");

        comboJaminan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KTP", "SIM", "KTM", "STNK", "BPKB", "MOTOR", "MOBIL" }));
        comboJaminan.setSelectedIndex(-1);
        comboJaminan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboJaminanItemStateChanged(evt);
            }
        });
        comboJaminan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboJaminanKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboJaminanKeyReleased(evt);
            }
        });

        jLabel8.setText("Lama Sewa");

        textLamaSewa.setEnabled(false);
        textLamaSewa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textLamaSewaKeyReleased(evt);
            }
        });

        labelLamaSewa.setText("Jam");

        jLabel10.setText("Biaya Sewa");

        labelBiayaSewa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelBiayaSewa.setText("-");

        jLabel11.setText("Bayar");

        textBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textBayarKeyReleased(evt);
            }
        });

        jLabel12.setText("Kembalian");

        labelKembalian.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelKembalian.setText("-");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(355, 23));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        buttonSimpan.setText("Simpan");
        buttonSimpan.setEnabled(false);
        jPanel3.add(buttonSimpan);

        buttonReset.setText("Reset");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });
        jPanel3.add(buttonReset);

        buttonTabelTransaksi.setText("Tabel Transaksi");
        jPanel3.add(buttonTabelTransaksi);

        buttonKeluar.setText("Keluar");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });
        jPanel3.add(buttonKeluar);

        labelErrorInput.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelErrorInput.setForeground(new java.awt.Color(255, 0, 0));
        labelErrorInput.setText("Harap Masukkan Data Dengan Benar!");

        javax.swing.GroupLayout panelInputLayout = new javax.swing.GroupLayout(panelInput);
        panelInput.setLayout(panelInputLayout);
        panelInputLayout.setHorizontalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textKodeTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1)
                            .addComponent(textNamaPenyewa)
                            .addComponent(textNoTelp)
                            .addGroup(panelInputLayout.createSequentialGroup()
                                .addComponent(radioPer12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioPerHari)
                                .addGap(30, 30, 30)))
                        .addGap(18, 21, Short.MAX_VALUE)
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInputLayout.createSequentialGroup()
                                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboJaminan, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelInputLayout.createSequentialGroup()
                                        .addComponent(textLamaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelLamaSewa))
                                    .addGroup(panelInputLayout.createSequentialGroup()
                                        .addComponent(textCariMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonCariMobil))))
                            .addGroup(panelInputLayout.createSequentialGroup()
                                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelBiayaSewa)
                                    .addComponent(labelKembalian)
                                    .addComponent(textBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(labelErrorInput)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelInputLayout.setVerticalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textKodeTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(textCariMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCariMobil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(textNamaPenyewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(comboJaminan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(textLamaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelLamaSewa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(labelBiayaSewa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(textBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12)
                    .addComponent(labelKembalian))
                .addGap(22, 22, 22)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(radioPer12)
                    .addComponent(radioPerHari))
                .addGap(18, 18, 18)
                .addComponent(labelErrorInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(Container, java.awt.BorderLayout.CENTER);
        Container.getAccessibleContext().setAccessibleName("");
        Container.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        if (textNamaPenyewa.getText().equals("")
                || textAreaAlamat.getText().equals("")
                || textNoTelp.getText().equals("")
                || textCariMobil.getText().equals("")
                || textBayar.getText().equals("")
                || labelBiayaSewa.getText().equals("-")
                || labelKembalian.getText().equals("-")) {

            buttonSimpan.setEnabled(false);

        } else if (comboJaminan.getSelectedIndex() == -1) {

            buttonSimpan.setEnabled(false);

        } else {
            buttonSimpan.setEnabled(true);
        }

    }//GEN-LAST:event_formInternalFrameOpened

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        HomeView.menuItemPenyewaan.setEnabled(true);
        dispose();
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void radioPer12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioPer12ItemStateChanged
        textLamaSewa.setText("12");
        textLamaSewa.setEnabled(false);
        labelLamaSewa.setText("Jam");
        labelLamaSewa.setVisible(true);
        buttonCariMobil.setEnabled(true);
        CariMobilView.jenisTarif = "Per 12 Jam";
    }//GEN-LAST:event_radioPer12ItemStateChanged

    private void radioPerHariItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioPerHariItemStateChanged
        textLamaSewa.setEnabled(true);
        textLamaSewa.setText("");
        textLamaSewa.setDocument(new BatasKarakter(2));
        labelLamaSewa.setText("Hari");
        labelLamaSewa.setVisible(true);
        buttonCariMobil.setEnabled(true);
        CariMobilView.jenisTarif = "Per Hari";
    }//GEN-LAST:event_radioPerHariItemStateChanged

    private void textAreaAlamatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaAlamatKeyReleased

    }//GEN-LAST:event_textAreaAlamatKeyReleased

    private void textAreaAlamatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaAlamatKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_TAB) {
            textNoTelp.requestFocus();
        }
    }//GEN-LAST:event_textAreaAlamatKeyPressed

    private void comboJaminanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboJaminanKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_TAB) {
            //textNoTelp.requestFocus();
            System.out.println("ComboJaminanKeyPressed");
        }
    }//GEN-LAST:event_comboJaminanKeyPressed

    private void comboJaminanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboJaminanKeyReleased

        if (evt.getKeyChar() == KeyEvent.VK_TAB) {
            //textNoTelp.requestFocus();
            System.out.println("ComboJaminanKeyPressed");
        }

    }//GEN-LAST:event_comboJaminanKeyReleased

    private void comboJaminanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboJaminanItemStateChanged
        if (radioPerHari.isSelected()) {
            textLamaSewa.requestFocus();
        } else {
            textBayar.requestFocus();
        }
    }//GEN-LAST:event_comboJaminanItemStateChanged

    private void buttonCariMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariMobilActionPerformed
        radioPer12.setEnabled(false);
        radioPerHari.setEnabled(false);
        buttonCariMobil.setEnabled(false);

        CariMobilView cmv = new CariMobilView();
        HomeView.desktopPaneUtama.add(cmv);
        cmv.setVisible(true);
    }//GEN-LAST:event_buttonCariMobilActionPerformed

    private void textNoTelpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNoTelpKeyReleased

        if (InputUtil.isTelpValid(textNoTelp)) {
            labelErrorInput.setVisible(false);
        } else if (textNoTelp.getText().length() != 0) {

            labelErrorInput.setIcon(IconUtil.setIconError());
            labelErrorInput.setText("Harap Masukkan Format Telp/HP yang benar!");
            labelErrorInput.setVisible(true);

        } else {
            labelErrorInput.setVisible(false);
        }

    }//GEN-LAST:event_textNoTelpKeyReleased

    private void textBayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBayarKeyReleased
        if (textBayar.getText().length() > 0 && textLamaSewa.getText() != null) {
            double lamaSewa = Double.parseDouble(textLamaSewa.getText());
            double totalBiayaSewa = biayaSewa * lamaSewa;
            double bayar = Double.parseDouble(textBayar.getText());
            double kembali = bayar - totalBiayaSewa;
            if (kembali < 0) {
                labelErrorInput.setText("Bayar Kurang dari Biaya Sewa!");
                labelErrorInput.setVisible(true);
                labelKembalian.setText("-");
                cekField();
            } else {
                labelErrorInput.setVisible(false);
                labelKembalian.setText("Rp." + String.valueOf(kembali));
                cekField();
            }
        }
    }//GEN-LAST:event_textBayarKeyReleased

    private void textLamaSewaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textLamaSewaKeyReleased
        if (textLamaSewa.getText().length() != 0 && Integer.parseInt(textLamaSewa.getText()) <= 7) {
            double hari = Double.parseDouble(textLamaSewa.getText());
            double totalBayar = biayaSewa * hari;
            labelBiayaSewa.setText("Rp."+String.valueOf(totalBayar));
            labelErrorInput.setVisible(false);
            cekField();
        } else {
            textBayar.setText("");
            labelErrorInput.setText("Maksimal Peminjaman 7 Hari!");
            labelErrorInput.setVisible(true);
            labelBiayaSewa.setText("-");
            cekField();
        }


    }//GEN-LAST:event_textLamaSewaKeyReleased

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        buttonSimpan.setEnabled(false);
        labelErrorInput.setVisible(false);
        labelBiayaSewa.setText("-");
        labelLamaSewa.setVisible(false);
        textLamaSewa.setText("");
        labelKembalian.setText("-");
        textBayar.setText("");
        comboJaminan.setSelectedIndex(-1);
        buttonCariMobil.setEnabled(true);
        textCariMobil.setText("");
        radioPer12.setEnabled(true);
        radioPer12.setSelected(true);
        radioPerHari.setEnabled(true);
        radioPerHari.setSelected(false);
        textNoTelp.setText("");
        textAreaAlamat.setText("");
        textNamaPenyewa.setText("");
        textNamaPenyewa.requestFocus();
    }//GEN-LAST:event_buttonResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    public static javax.swing.JButton buttonCariMobil;
    private javax.swing.ButtonGroup buttonGroupJenisSewa;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JButton buttonTabelTransaksi;
    private javax.swing.JComboBox<String> comboJaminan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel labelBiayaSewa;
    private javax.swing.JLabel labelErrorInput;
    private javax.swing.JLabel labelKembalian;
    private javax.swing.JLabel labelLamaSewa;
    public static javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelInput;
    public static javax.swing.JRadioButton radioPer12;
    public static javax.swing.JRadioButton radioPerHari;
    private javax.swing.JTextArea textAreaAlamat;
    private javax.swing.JTextField textBayar;
    public static javax.swing.JTextField textBiayaSewa;
    public static javax.swing.JTextField textCariMobil;
    private javax.swing.JTextField textKodeTransaksi;
    private javax.swing.JTextField textLamaSewa;
    private javax.swing.JTextField textNamaPenyewa;
    private javax.swing.JTextField textNoTelp;
    // End of variables declaration//GEN-END:variables
private void viewSetup() {
        setTabIndex();
        //Set Visible False Component
        labelErrorInput.setVisible(false);
        labelLamaSewa.setVisible(false);
        textNamaPenyewa.requestFocus();
        //Set Radio Ke Grup
        buttonGroupJenisSewa.add(radioPer12);
        buttonGroupJenisSewa.add(radioPerHari);
        InputUtil.setValidNama(textNamaPenyewa, labelErrorInput);
        InputUtil.setNumericOnlyNoError(textNoTelp);
        InputUtil.setNumericOnlyNoError(textLamaSewa);
        textNoTelp.setDocument(new BatasKarakter(13));
        textLamaSewa.setText("12");

        //Set Icon Button
    }

    private void setTabIndex() {
        TabIndex tabIndex = new TabIndex();
        tabIndex.addIndexedComponent(textNamaPenyewa);
        tabIndex.addIndexedComponent(textAreaAlamat);
        tabIndex.addIndexedComponent(textNoTelp);
        tabIndex.addIndexedComponent(radioPer12);
        tabIndex.addIndexedComponent(radioPerHari);
        tabIndex.addIndexedComponent(buttonCariMobil);
        tabIndex.addIndexedComponent(comboJaminan);
        //tabIndex.addIndexedComponent(textLamaSewa);

        //tabIndex.addIndexedComponent(textBayar);
        tabIndex.addIndexedComponent(buttonSimpan);
        tabIndex.addIndexedComponent(buttonReset);
        setFocusTraversalPolicy(tabIndex);

    }

    private void cekField() {
        if (textNamaPenyewa.getText().equals("")
                || textAreaAlamat.getText().equals("")
                || textNoTelp.getText().equals("")
                || textCariMobil.getText().equals("")
                || textBayar.getText().equals("")
                || labelBiayaSewa.getText().equals("-")
                || labelKembalian.getText().contains("-")) {

            buttonSimpan.setEnabled(false);

        } else if (comboJaminan.getSelectedIndex() == -1) {

            buttonSimpan.setEnabled(false);

        } else {
            buttonSimpan.setEnabled(true);
        }
    }
}
