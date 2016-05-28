package id.arief.sirmi.master.mobil;

import id.arief.sirmi.util.BatasKarakter;
import id.arief.sirmi.util.InputUtil;
import id.arief.sirmi.util.MessageUtil;
import static id.arief.sirmi.home.HomeView.desktopPaneUtama;
import static id.arief.sirmi.home.HomeView.menuItemMasterMobil;
import id.arief.sirmi.util.IconUtil;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import jiconfont.icons.GoogleMaterialDesignIcons;
import jiconfont.swing.IconFontSwing;

/**
 *
 * @author arief-asus
 */
public class MobilTambahUbah extends javax.swing.JInternalFrame {

    MobilController mobilPresenter = new MobilController();
    
    public MobilTambahUbah() {
        initComponents();
        IconFontSwing.register(GoogleMaterialDesignIcons.getIconFont());
        
        setBatasKarakter();
        Icon icon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.ERROR_OUTLINE, 20, new Color(255, 0, 0));
        labelTahunError.setIcon(icon);
        labelTahunError.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textKodeMobil = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textNopol = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textMerk = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textNamaMobil = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textJenisMobil = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textTahunMobil = new javax.swing.JTextField();
        buttons = new javax.swing.JPanel();
        buttonSimpan = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();
        labelTahunError = new javax.swing.JLabel();
        labelNopolError = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelTitleTambahUbahMobil = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(551, 432));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Kode Mobil");

        textKodeMobil.setText("<Otomatis>");
        textKodeMobil.setEnabled(false);

        jLabel2.setText("Nopol");

        textNopol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textNopolKeyReleased(evt);
            }
        });

        jLabel3.setText("Merk");

        textMerk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textMerkKeyReleased(evt);
            }
        });

        jLabel4.setText("Nama");

        textNamaMobil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textNamaMobilKeyReleased(evt);
            }
        });

        jLabel5.setText("Jenis");

        textJenisMobil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textJenisMobilKeyReleased(evt);
            }
        });

        jLabel6.setText("Tahun Pembuatan");

        textTahunMobil.setColumns(4);
        textTahunMobil.setName(""); // NOI18N
        textTahunMobil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textTahunMobilKeyReleased(evt);
            }
        });

        buttons.setPreferredSize(new java.awt.Dimension(355, 25));
        buttons.setLayout(new java.awt.GridLayout(1, 0));

        buttonSimpan.setText("Simpan");
        buttonSimpan.setToolTipText("Simpan");
        buttonSimpan.setEnabled(false);
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

        labelTahunError.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelTahunError.setForeground(new java.awt.Color(255, 0, 0));
        labelTahunError.setLabelFor(textTahunMobil);
        labelTahunError.setText("Hanya Angka!");

        labelNopolError.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelNopolError.setLabelFor(textTahunMobil);
        labelNopolError.setText("Format : DA 1234 ABC");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(textTahunMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelTahunError))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textKodeMobil, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textJenisMobil, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNamaMobil, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textMerk, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNopol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelNopolError)))
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textKodeMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textNopol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNopolError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textMerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textNamaMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textJenisMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textTahunMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTahunError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelTitleTambahUbahMobil.setFont(labelTitleTambahUbahMobil.getFont().deriveFont(labelTitleTambahUbahMobil.getFont().getStyle() | java.awt.Font.BOLD, labelTitleTambahUbahMobil.getFont().getSize()+13));
        labelTitleTambahUbahMobil.setText("Master Mobil");
        jPanel2.add(labelTitleTambahUbahMobil);

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(Container, java.awt.BorderLayout.CENTER);
        Container.getAccessibleContext().setAccessibleName("");
        Container.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cekFields();
        InputUtil.setNumericOnly(textTahunMobil,labelTahunError);
        buttonSimpan.setIcon(IconUtil.setIconSimpan());
        buttonReset.setIcon(IconUtil.setIconReset());
        buttonKeluar.setIcon(IconUtil.setIconKeluar());
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated

    }//GEN-LAST:event_formInternalFrameActivated

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        MobilView mobilView = new MobilView();
        desktopPaneUtama.add(mobilView);
        menuItemMasterMobil.setEnabled(false);
        mobilView.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        clearField();
        cekFields();
    }//GEN-LAST:event_buttonResetActionPerformed

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed

        if (labelTitleTambahUbahMobil.getText().equals("TAMBAH MOBIL")) {
            boolean adaMobil;
            adaMobil = mobilPresenter.cekMobil(textNopol.getText());

            if (!adaMobil) {
                String nomor = mobilPresenter.idMobil();
                Mobil mobil = new Mobil();
                mobil.setKode_mobil(generateKodeMobil() + nomor);
                mobil.setNopol_mobil(textNopol.getText());
                mobil.setMerk_mobil(textMerk.getText());
                mobil.setNama_mobil(textNamaMobil.getText());
                mobil.setJenis_mobil(textJenisMobil.getText());
                mobil.setTahun_pembuatan(textTahunMobil.getText());
                mobilPresenter.tambahMobil(mobil);
                MessageUtil.showInfoMessage("Mobil dengan nopol " + mobil.getNopol_mobil() + " telah ditambahkan", this);
                buttonReset.doClick();
            } else {
               showErrorAdaMobil();
            }

        } else {
            boolean adaMobil = mobilPresenter.cekNopol(textNopol.getText(),textKodeMobil.getText());

            if (!adaMobil) {
                Mobil mobil = new Mobil();
                mobil.setKode_mobil(textKodeMobil.getText());
                mobil.setNopol_mobil(textNopol.getText());
                mobil.setMerk_mobil(textMerk.getText());
                mobil.setNama_mobil(textNamaMobil.getText());
                mobil.setJenis_mobil(textJenisMobil.getText());
                mobil.setTahun_pembuatan(textTahunMobil.getText());
                mobilPresenter.UbahMobil(mobil);
                MessageUtil.showInfoMessage("Mobil dengan nopol " + mobil.getNopol_mobil() + " telah diubah", this);
                buttonReset.doClick();
                buttonKeluar.doClick();
            } else {
               showErrorAdaMobil();
            }
        }
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void textTahunMobilKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTahunMobilKeyReleased
        if (textTahunMobil.getText().length() == 4 && InputUtil.validasiTahun(textTahunMobil, Integer.valueOf(textTahunMobil.getText()))) {
            cekFields();
            cekValidField();
        } else if (textTahunMobil.getText().length() < 4) {
            buttonSimpan.setEnabled(false);
        } else {
            labelTahunError.setText("Tahun Salah!");
            labelTahunError.setVisible(true);
        }
    }//GEN-LAST:event_textTahunMobilKeyReleased

    private void textJenisMobilKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textJenisMobilKeyReleased
        InputUtil.toUpperCase(textJenisMobil);
        cekValidField();
    }//GEN-LAST:event_textJenisMobilKeyReleased

    private void textNamaMobilKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNamaMobilKeyReleased
        InputUtil.toUpperCase(textNamaMobil);
        cekValidField();
    }//GEN-LAST:event_textNamaMobilKeyReleased

    private void textMerkKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textMerkKeyReleased
        InputUtil.toUpperCase(textMerk);
        cekValidField();
    }//GEN-LAST:event_textMerkKeyReleased

    private void textNopolKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNopolKeyReleased
        InputUtil.toUpperCase(textNopol);
        if (InputUtil.isNopolValid(textNopol)) {
            labelNopolError.setVisible(false);
             labelNopolError.setText("Format : DA 1234 ABC");
            
        } else if(textNopol.getText().length() != 0) {
            labelNopolError.setText("Format Salah!");
            labelNopolError.setVisible(true);
        } else {
            labelNopolError.setText("Format : DA 1234 ABC");
        }
        
        cekValidField();
    }//GEN-LAST:event_textNopolKeyReleased

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JButton buttonKeluar;
    private static javax.swing.JButton buttonReset;
    public static javax.swing.JButton buttonSimpan;
    private javax.swing.JPanel buttons;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelNopolError;
    private javax.swing.JLabel labelTahunError;
    public static javax.swing.JLabel labelTitleTambahUbahMobil;
    public static javax.swing.JTextField textJenisMobil;
    public static javax.swing.JTextField textKodeMobil;
    public static javax.swing.JTextField textMerk;
    public static javax.swing.JTextField textNamaMobil;
    public static javax.swing.JTextField textNopol;
    public static javax.swing.JTextField textTahunMobil;
    // End of variables declaration//GEN-END:variables
public final void setBatasKarakter() {
        textTahunMobil.setDocument(new BatasKarakter(4));
        textNopol.setDocument(new BatasKarakter(11));
    }

    public void cekFields() {
        List<JTextField> fields = new ArrayList<>();
        fields.add(textNopol);
        fields.add(textMerk);
        fields.add(textNamaMobil);
        fields.add(textJenisMobil);
        fields.add(textTahunMobil);

        for (JTextField jTextField : fields) {
            if (jTextField.getText().equals("") || jTextField.getText().startsWith(" ")) {
                buttonSimpan.setEnabled(false);
                break;
            } else {
                buttonSimpan.setEnabled(true);
            }
        }

    }

    public static void clearField() {
        textNopol.setText("");
        textMerk.setText("");
        textJenisMobil.setText("");
        textNamaMobil.setText("");
        textTahunMobil.setText("");
        textNopol.requestFocus();
        buttonSimpan.setEnabled(false);
    }

    private String generateKodeMobil() {
        String kode_mobil = null;
        try {
            String merk = textMerk.getText(0, 3);
            String tahun = textTahunMobil.getText(2, 2);
            String nama = textNamaMobil.getText(0, 1);
            kode_mobil = "M" + merk + nama + tahun;

        } catch (BadLocationException ex) {
            Logger.getLogger(MobilTambahUbah.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kode_mobil;
    }
    
    private void showErrorAdaMobil() {
        MessageUtil.showErrorMessage("Mobil dengan nopol " + textNopol.getText() + " sudah ada!", this);
        cekFields();
        textNopol.requestFocus();
    }
    
    private void cekValidField() {
         if (labelTahunError.isVisible()) {
            buttonSimpan.setEnabled(false);
        } else if (!labelNopolError.getText().equals("Format : DA 1234 ABC")) {
            buttonSimpan.setEnabled(false);
        } else {
            cekFields();
        }
    }
}
