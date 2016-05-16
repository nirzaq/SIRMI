package id.arief.sirmi.master.mobil;

import id.arief.sirmi.util.IconUtil;
import id.arief.sirmi.util.MessageUtil;
import id.arief.sirmi.util.ViewUtil;
import static id.arief.sirmi.home.HomeView.desktopPaneUtama;
import static id.arief.sirmi.home.HomeView.menuItemMasterMobil;
import id.arief.sirmi.util.TableUtil;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import org.jdesktop.xswingx.PromptSupport;

/**
 *
 * @author arief-asus
 */
public class MobilView extends javax.swing.JInternalFrame {

    MobilTableModel mobilTableModel = new MobilTableModel();
    MobilController mobilPresenter = new MobilController();
    MobilTambahUbah mobilTambahUbah = new MobilTambahUbah();

    public MobilView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textNopol = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboCariMobil = new javax.swing.JComboBox<>();
        textCariMobil = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMobil = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        buttonTambah = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();

        textNopol.setText("jTextField1");

        setTitle("Master Mobil");
        setAutoscrolls(true);
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

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+13));
        jLabel1.setText("MASTER MOBIL");
        jPanel1.add(jLabel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Cari");

        comboCariMobil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nama Mobil", "Merk", "Nopol", "Jenis", "Tahun Buat", "Kode Mobil" }));
        comboCariMobil.setToolTipText("Cari Mobil Berdasarkan");

        textCariMobil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textCariMobilFocusGained(evt);
            }
        });
        textCariMobil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCariMobilKeyReleased(evt);
            }
        });

        tableMobil.setAutoCreateRowSorter(true);
        tableMobil.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tableMobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableMobil.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableMobil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableMobil.setEditingColumn(1);
        tableMobil.setEditingRow(1);
        tableMobil.setFocusTraversalPolicyProvider(true);
        tableMobil.setGridColor(new java.awt.Color(0, 0, 0));
        tableMobil.setName(""); // NOI18N
        jScrollPane1.setViewportView(tableMobil);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        buttonTambah.setText("Tambah");
        buttonTambah.setToolTipText("Tambah Mobil");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });
        jPanel3.add(buttonTambah);

        buttonUbah.setText("Ubah");
        buttonUbah.setToolTipText("Ubah Mobil");
        buttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahActionPerformed(evt);
            }
        });
        jPanel3.add(buttonUbah);

        buttonHapus.setText("Hapus");
        buttonHapus.setToolTipText("Hapus Mobil");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });
        jPanel3.add(buttonHapus);

        buttonClear.setText("Bersih");
        buttonClear.setToolTipText("Reset Form Master Mobil");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });
        jPanel3.add(buttonClear);

        buttonKeluar.setText("Keluar");
        buttonKeluar.setToolTipText("Tutup Form Master Mobil");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });
        jPanel3.add(buttonKeluar);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCariMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCariMobil))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboCariMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCariMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        PromptSupport.setPrompt("Masukkan Kata Kunci", textCariMobil);
        
        buttonTambah.setIcon(IconUtil.setIconTambah());
        buttonUbah.setIcon(IconUtil.setIconEdit());
        buttonHapus.setIcon(IconUtil.setIconHapus());
        buttonClear.setIcon(IconUtil.setIconReset());
        buttonKeluar.setIcon(IconUtil.setIconKeluar());
       
        tableMobil.setModel(mobilTableModel);
       
        TableUtil.kolomRataTengah(tableMobil, 1);
        TableUtil.kolomRataTengah(tableMobil, 6);
        TableUtil.tabelKosong(tableMobil, mobilTableModel);
        refresh();
        TableUtil.resizeColumnWidth(tableMobil);
      

        tableMobilAction();

    }//GEN-LAST:event_formInternalFrameOpened

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        refresh();
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        dispose();
        menuItemMasterMobil.setEnabled(true);
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        MobilTambahUbah.labelTitleTambahUbahMobil.setText("TAMBAH MOBIL");
        ViewUtil.showForm(desktopPaneUtama, this, mobilTambahUbah);
        MobilTambahUbah.textKodeMobil.setText("<Otomatis>");
        MobilTambahUbah.clearField();
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahActionPerformed
        MobilTambahUbah.labelTitleTambahUbahMobil.setText("UBAH MOBIL");
        ViewUtil.showForm(desktopPaneUtama, this, mobilTambahUbah);
    }//GEN-LAST:event_buttonUbahActionPerformed

    private void textCariMobilKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCariMobilKeyReleased
        try {
            String sqlParameter = null;
            String searchParameter;
            switch (comboCariMobil.getSelectedIndex()) {
                case 0:
                    sqlParameter = "nama_mobil";
                    break;
                case 1:
                    sqlParameter = "merk_mobil";
                    break;
                case 2:
                    sqlParameter = "nopol_mobil";
                    break;
                case 3:
                    sqlParameter = "jenis_mobil";
                    break;
                case 4:
                    sqlParameter = "tahun_pembuatan";
                    break;
                case 5:
                    sqlParameter = "kode_mobil";
                    break;
            }

            searchParameter = textCariMobil.getText();
            List<Mobil> list = mobilPresenter
                    .getMobilByParameter(sqlParameter, searchParameter);
            mobilTableModel.setData(list);
        } catch (Exception error) {
            System.out.println("Terjadi kesalahan : \n& " + error);
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan : ");
        }
    }//GEN-LAST:event_textCariMobilKeyReleased

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        int confirm = MessageUtil.
                showConfirmMessage("Apakah anda ingin menghapus mobil dengan nopol " + textNopol.getText() + " ?", this);
        if (confirm == JOptionPane.YES_OPTION) {
          
        } else if (confirm == JOptionPane.NO_OPTION) {
            
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void textCariMobilFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textCariMobilFocusGained
        buttonClear.doClick();
    }//GEN-LAST:event_textCariMobilFocusGained

    // <editor-fold defaultstate="collapsed" desc="Generated Code">           
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JComboBox<String> comboCariMobil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tableMobil;
    private javax.swing.JTextField textCariMobil;
    private javax.swing.JTextField textNopol;
    // End of variables declaration//GEN-END:variables
    public void tableMobilAction() {
        tableMobil
                .getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            int row = tableMobil.getSelectedRow();
            //Cek Baris, Apakah terseleksi?
            if (row != -1) {
                
                Mobil mobil = mobilTableModel.get(row);
                //Disable Button Tambah
                buttonTambah.setEnabled(false);
                buttonUbah.setEnabled(true);
                buttonHapus.setEnabled(true);
                //set textNopol
                textNopol.setText(mobil.getNopol_mobil());
                //Pass data ke MobilTambahUbah
                MobilTambahUbah.textKodeMobil.setText(mobil.getKode_mobil());
                MobilTambahUbah.textNopol.setText(mobil.getNopol_mobil());
                MobilTambahUbah.textMerk.setText(mobil.getMerk_mobil());
                MobilTambahUbah.textNamaMobil.setText(mobil.getNama_mobil());
                MobilTambahUbah.textJenisMobil.setText(mobil.getJenis_mobil());
                MobilTambahUbah.textTahunMobil.setText(mobil.getTahun_pembuatan());
            }
        });
    }
    
    /**
     * Method untuk mengambil data dari database
     * 
     */
    public void loadDatabase() {
        try {
            List<Mobil> list = mobilPresenter.getMobil();
            mobilTableModel.setData(list);
        } catch (Exception error) {
            System.out.println("Terjadi kesalahan : \n& " + error);
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan : ");
        }
    }

    private void refresh() {
        //Ambil Data dari Database
        loadDatabase();
        //Disable Button
        MobilTambahUbah.buttonSimpan.setEnabled(false);
        textCariMobil.setText("");
        tableMobil.clearSelection();
        buttonUbah.setEnabled(false);
        buttonHapus.setEnabled(false);
        buttonTambah.setEnabled(true);
    }
}