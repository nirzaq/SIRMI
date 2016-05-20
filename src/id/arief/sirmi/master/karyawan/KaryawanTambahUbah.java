package id.arief.sirmi.master.karyawan;

import id.arief.sirmi.home.HomeView;
import static id.arief.sirmi.home.HomeView.desktopPaneUtama;
import id.arief.sirmi.transaksi.penyewaan.TransaksiPenyewaanView;
import id.arief.sirmi.util.BatasKarakter;
import id.arief.sirmi.util.IconUtil;
import id.arief.sirmi.util.InputUtil;
import id.arief.sirmi.util.MessageUtil;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author arief-asus
 */
public class KaryawanTambahUbah extends javax.swing.JInternalFrame {
    
    KaryawanController controller = new KaryawanController();
    
    public KaryawanTambahUbah() {
        initComponents();
        viewSetup();
        setBatasKarakter();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        labelTitleTambahUbahKaryawan = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textKodeKaryawan = new javax.swing.JTextField();
        Nama = new javax.swing.JLabel();
        textNamaKaryawan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textTeleponKaryawan = new javax.swing.JTextField();
        buttons = new javax.swing.JPanel();
        buttonSimpan = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();
        labelNamaError = new javax.swing.JLabel();
        textTanggalLahirKaryawan = new com.toedter.calendar.JDateChooser();
        labelTelponError = new javax.swing.JLabel();
        labelUmurError = new javax.swing.JLabel();

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

        labelTitleTambahUbahKaryawan.setFont(labelTitleTambahUbahKaryawan.getFont().deriveFont(labelTitleTambahUbahKaryawan.getFont().getStyle() | java.awt.Font.BOLD, labelTitleTambahUbahKaryawan.getFont().getSize()+13));
        labelTitleTambahUbahKaryawan.setText("MASTER KARYAWAN");
        jPanel2.add(labelTitleTambahUbahKaryawan);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Kode Karyawan");

        textKodeKaryawan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textKodeKaryawanKeyReleased(evt);
            }
        });

        Nama.setText("Nama");

        textNamaKaryawan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textNamaKaryawanKeyReleased(evt);
            }
        });

        jLabel3.setText("Tanggal Lahir");

        jLabel4.setText("No Telepon");

        textTeleponKaryawan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textTeleponKaryawanKeyReleased(evt);
            }
        });

        buttons.setPreferredSize(new java.awt.Dimension(355, 25));
        buttons.setLayout(new java.awt.GridLayout(1, 0));

        buttonSimpan.setText("Simpan");
        buttonSimpan.setToolTipText("Simpan");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });
        buttons.add(buttonSimpan);

        buttonReset.setText("Reset");
        buttonReset.setToolTipText("Bersihkan Field");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });
        buttons.add(buttonReset);

        buttonKeluar.setText("Keluar");
        buttonKeluar.setToolTipText("Tutup Form");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });
        buttons.add(buttonKeluar);

        labelNamaError.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelNamaError.setForeground(new java.awt.Color(255, 0, 0));
        labelNamaError.setText("LabelError");

        textTanggalLahirKaryawan.setDateFormatString("dd MMM yyyy");
        textTanggalLahirKaryawan.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                textTanggalLahirKaryawanPropertyChange(evt);
            }
        });

        labelTelponError.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelTelponError.setForeground(new java.awt.Color(255, 0, 0));
        labelTelponError.setText("Harap Masukkan Input Telepon Yang Benar");

        labelUmurError.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelUmurError.setForeground(new java.awt.Color(255, 0, 0));
        labelUmurError.setText("Umur Error");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(194, Short.MAX_VALUE)
                        .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(Nama)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textTeleponKaryawan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textTanggalLahirKaryawan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(textNamaKaryawan)
                            .addComponent(textKodeKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNamaError)
                                    .addComponent(labelTelponError)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelUmurError)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textKodeKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nama)
                            .addComponent(textNamaKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNamaError))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(textTanggalLahirKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelUmurError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textTeleponKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelponError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNamaKaryawanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNamaKaryawanKeyReleased
           cekField();
    }//GEN-LAST:event_textNamaKaryawanKeyReleased

    private void textTeleponKaryawanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTeleponKaryawanKeyReleased
        if (InputUtil.isTelpValid(textTeleponKaryawan)) {
            labelTelponError.setVisible(false);
            cekField();
        } else if (textTeleponKaryawan.getText().length() != 0 || textTeleponKaryawan.getText().length() == 0) {
            labelTelponError.setIcon(IconUtil.setIconError());
            labelTelponError.setText("Harap Masukkan Format Telp/HP yang benar!");
            labelTelponError.setVisible(true);
            cekField();
        } else {
            labelTelponError.setVisible(false);
            cekField();
            
        }
    }//GEN-LAST:event_textTeleponKaryawanKeyReleased

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
       if (labelTitleTambahUbahKaryawan.getText().equals("TAMBAH KARYAWAN")) {
           boolean adaKaryawan;
           SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
           String tanggalLahir = dateFormat.format(textTanggalLahirKaryawan.getDate());
           adaKaryawan = controller.cekKaryawan(textKodeKaryawan.getText(),tanggalLahir,textNamaKaryawan.getText());
           System.out.println(tanggalLahir);
           if (!adaKaryawan) {
               Karyawan karyawan = new Karyawan();
               karyawan.setKodeKaryawan(textKodeKaryawan.getText());
               karyawan.setNamaKaryawan(textNamaKaryawan.getText());
               karyawan.setTanggalLahirKaryawan(Date.valueOf(dateFormat.format(textTanggalLahirKaryawan.getDate())));
               karyawan.setKontakKaryawan(textTeleponKaryawan.getText());
               controller.tambahData(karyawan);
               MessageUtil.showInfoMessage("Karyawan dengan kode " + karyawan.getKodeKaryawan() + " telah ditambahkan", this);
               buttonReset.doClick();
           } else {
               showErrorAdaKaryawan();
           }
       } else {
           textKodeKaryawan.setEnabled(false);
           boolean adaKaryawan;
           SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
           adaKaryawan = controller.cekKaryawan("TEST", dateFormat.format(textTanggalLahirKaryawan.getDate()),textNamaKaryawan.getText());
           
           if (!adaKaryawan) {
               Karyawan karyawan = new Karyawan();
               karyawan.setKodeKaryawan(textKodeKaryawan.getText());
               karyawan.setNamaKaryawan(textNamaKaryawan.getText());
               karyawan.setTanggalLahirKaryawan(Date.valueOf(dateFormat.format(textTanggalLahirKaryawan.getDate())));
               karyawan.setKontakKaryawan(textTeleponKaryawan.getText());
               controller.ubahData(karyawan);
               MessageUtil.showInfoMessage("Karyawan dengan kode " + karyawan.getKodeKaryawan() + " telah diubah", this);
               buttonReset.doClick();
               buttonKeluar.doClick();
       } else {
              showErrorAdaKaryawan();
       }
       }
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
       textKodeKaryawan.setEnabled(true);
        textKodeKaryawan.setText("");
       textNamaKaryawan.setText("");
       textTanggalLahirKaryawan.setDate(null);
       textTeleponKaryawan.setText("");
       labelUmurError.setVisible(false);
       labelNamaError.setVisible(false);
       labelTelponError.setVisible(false);
    }//GEN-LAST:event_buttonResetActionPerformed

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        KaryawanView karyawanView = new KaryawanView();
        desktopPaneUtama.add(karyawanView);
        HomeView.menuItemKaryawan.setEnabled(false);
        karyawanView.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void textKodeKaryawanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textKodeKaryawanKeyReleased
        cekField();
    }//GEN-LAST:event_textKodeKaryawanKeyReleased

    private void textTanggalLahirKaryawanPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_textTanggalLahirKaryawanPropertyChange
        if (textTanggalLahirKaryawan.getDate()!=null) {
            int sekarang = Calendar.getInstance().get(Calendar.YEAR);
            int input = textTanggalLahirKaryawan.getCalendar().get(Calendar.YEAR);
            int selisih = sekarang - input;
            if (selisih<18||selisih>=35) {
                labelUmurError.setText("Minimal 18 Tahun dan Maksimal 35 Tahun!");
                labelUmurError.setVisible(true);
            } else {
                labelUmurError.setVisible(false);
            }
                    
        }
    }//GEN-LAST:event_textTanggalLahirKaryawanPropertyChange

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cekField();
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nama;
    private javax.swing.JButton buttonKeluar;
    private static javax.swing.JButton buttonReset;
    public static javax.swing.JButton buttonSimpan;
    private javax.swing.JPanel buttons;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelNamaError;
    private javax.swing.JLabel labelTelponError;
    public static javax.swing.JLabel labelTitleTambahUbahKaryawan;
    private javax.swing.JLabel labelUmurError;
    public static javax.swing.JTextField textKodeKaryawan;
    public static javax.swing.JTextField textNamaKaryawan;
    public static com.toedter.calendar.JDateChooser textTanggalLahirKaryawan;
    public static javax.swing.JTextField textTeleponKaryawan;
    // End of variables declaration//GEN-END:variables
private void viewSetup() {
    labelNamaError.setVisible(false);
    labelTelponError.setVisible(false);
    labelUmurError.setVisible(false);
    
    buttonSimpan.setIcon(IconUtil.setIconSimpan());
    buttonReset.setIcon(IconUtil.setIconReset());
    buttonKeluar.setIcon(IconUtil.setIconKeluar());
    
    InputUtil.setValidNama(textNamaKaryawan, labelNamaError);
    InputUtil.setNumericOnlyNoError(textTeleponKaryawan);
    
}

private void setBatasKarakter() {
    textKodeKaryawan.setDocument(new BatasKarakter(4));
    textNamaKaryawan.setDocument(new BatasKarakter(45));
    textTeleponKaryawan.setDocument(new BatasKarakter(13));
}

public void cekField() {
   if (textKodeKaryawan.getText().equals("")
           || textNamaKaryawan.getText().equals("")
           || textTanggalLahirKaryawan.getDate() == null
           || textTeleponKaryawan.getText().equals("")
           || labelNamaError.isVisible()
           || labelTelponError.isVisible()
           || labelUmurError.isVisible()) {
       
       buttonSimpan.setEnabled(false);
   } else {
       buttonSimpan.setEnabled(true);
   }
}

private void showErrorAdaKaryawan() {
        MessageUtil.showErrorMessage("Data Sudah Ada!", this);
        cekField();    
}
}
