package id.arief.sirmi.transaksi.tambahuser;

import id.arief.sirmi.home.HomeView;
import static id.arief.sirmi.home.HomeView.desktopPaneUtama;
import id.arief.sirmi.util.IconUtil;
import id.arief.sirmi.util.MessageUtil;
import id.arief.sirmi.util.TableUtil;
import id.arief.sirmi.util.ViewUtil;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import org.jdesktop.xswingx.PromptSupport;

/**
 *
 * @author arief-asus
 */
public class TambahUserView extends javax.swing.JInternalFrame {
    
    UserController controller = new UserController();
    TambahUserTU tambahUbah = new TambahUserTU();
    UserTableModel tableModel = new UserTableModel();
    
    public TambahUserView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textKodeUser = new javax.swing.JTextField();
        textUsername = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        comboCari = new javax.swing.JComboBox<>();
        textCari = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        buttonTambah = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();

        textKodeUser.setText("jTextField1");

        textUsername.setText("jTextField1");

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
        jLabel1.setText("DATA USER");
        jPanel1.add(jLabel1);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Cari");

        comboCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Username", "Kode User" }));
        comboCari.setToolTipText("Cari Mobil Berdasarkan");

        textCari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textCariFocusGained(evt);
            }
        });
        textCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCariKeyReleased(evt);
            }
        });

        tableData.setAutoCreateRowSorter(true);
        tableData.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tableData.setModel(new javax.swing.table.DefaultTableModel(
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
        tableData.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableData.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableData.setEditingColumn(1);
        tableData.setEditingRow(1);
        tableData.setFocusTraversalPolicyProvider(true);
        tableData.setGridColor(new java.awt.Color(0, 0, 0));
        tableData.setName(""); // NOI18N
        jScrollPane2.setViewportView(tableData);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        buttonTambah.setText("Tambah");
        buttonTambah.setToolTipText("Tambah Mobil");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });
        jPanel5.add(buttonTambah);

        buttonUbah.setText("Ubah");
        buttonUbah.setToolTipText("Ubah Mobil");
        buttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahActionPerformed(evt);
            }
        });
        jPanel5.add(buttonUbah);

        buttonHapus.setText("Hapus");
        buttonHapus.setToolTipText("Hapus Mobil");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });
        jPanel5.add(buttonHapus);

        buttonClear.setText("Bersih");
        buttonClear.setToolTipText("Reset Form Master Mobil");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });
        jPanel5.add(buttonClear);

        buttonKeluar.setText("Keluar");
        buttonKeluar.setToolTipText("Tutup Form Master Mobil");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });
        jPanel5.add(buttonKeluar);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCari, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCari))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textCariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textCariFocusGained
        buttonClear.doClick();
    }//GEN-LAST:event_textCariFocusGained

    private void textCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCariKeyReleased
        try {
            String sqlParameter = null;
            String searchParameter;
            switch (comboCari.getSelectedIndex()) {
                case 0:
                sqlParameter = "username";
                break;
                case 1:
                sqlParameter = "kode_user";
                break;
            }

            searchParameter = textCari.getText();
            List<User> list = controller.getDataByParameter(sqlParameter, searchParameter);
            tableModel.setData(list);
        } catch (Exception error) {
            System.out.println("Terjadi kesalahan : \n& " + error);
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan : "+error.getMessage());
        }
    }//GEN-LAST:event_textCariKeyReleased

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        TambahUserTU.labelTitle.setText("TAMBAH USER");
        TambahUserTU.buttonCariKaryawan.setEnabled(true);
        ViewUtil.showForm(desktopPaneUtama, this, tambahUbah);
        TambahUserTU.textKodeUser.setText("<Otomatis>");
        TambahUserTU.textKodeKaryawan.setText("");
        TambahUserTU.textUsername.setText("");
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahActionPerformed
        TambahUserTU.labelTitle.setText("UBAH USER");
        ViewUtil.showForm(desktopPaneUtama, this, tambahUbah);
    }//GEN-LAST:event_buttonUbahActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        int confirm = MessageUtil.
        showConfirmMessage("Apakah anda ingin menghapus user dengan username " + textKodeUser.getText() + " ?", this);
        if (confirm == JOptionPane.YES_OPTION) {

        } else if (confirm == JOptionPane.NO_OPTION) {

        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        refresh();
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        dispose();
        HomeView.menuItemTambahUser.setEnabled(true);
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        PromptSupport.setPrompt("Masukkan Kata Kunci", textCari);
        
        buttonTambah.setIcon(IconUtil.setIconTambah());
        buttonUbah.setIcon(IconUtil.setIconEdit());
        buttonHapus.setIcon(IconUtil.setIconHapus());
        buttonClear.setIcon(IconUtil.setIconReset());
        buttonKeluar.setIcon(IconUtil.setIconKeluar());
       
        tableData.setModel(tableModel);
       
        TableUtil.kolomRataTengah(tableData, 1);
        TableUtil.tabelKosong(tableData, tableModel);
        refresh();
        TableUtil.resizeColumnWidth(tableData);
      

        tableAction();
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JComboBox<String> comboCari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tableData;
    private javax.swing.JTextField textCari;
    private javax.swing.JTextField textKodeUser;
    private javax.swing.JTextField textUsername;
    // End of variables declaration//GEN-END:variables
    public void tableAction() {
        tableData
                .getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            int row = tableData.getSelectedRow();
            //Cek Baris, Apakah terseleksi?
            if (row != -1) {
               
                User user = tableModel.get(row);
               
                //Disable Button Tambah
                buttonTambah.setEnabled(false);
                buttonUbah.setEnabled(true);
                buttonHapus.setEnabled(true);
                textKodeUser.setText(user.getKode_user());
                
                //Pass data ke TambahUbah
                TambahUserTU.buttonCariKaryawan.setEnabled(false);
                TambahUserTU.textKodeKaryawan.setText(user.getKodeKaryawan());
                TambahUserTU.textKodeUser.setText(user.getKode_user());
                TambahUserTU.textUsername.setText(user.getUsername());
                
            }
        });
    }
    
    /**
     * Method untuk mengambil data dari database
     * 
     */
    public void loadDatabase() {
        try {
            List<User> list = controller.getData();
            tableModel.setData(list);
        } catch (Exception error) {
            System.out.println("Terjadi kesalahan : \n& " + error);
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan : ");
        }
    }
    public void viewSetup() {
        
    }
    
    public void refresh() {
        loadDatabase();
        
        TambahUserTU.buttonSimpan.setEnabled(false);
        textCari.setText("");
        tableData.clearSelection();
        buttonUbah.setEnabled(false);
        buttonHapus.setEnabled(false);
        buttonTambah.setEnabled(true);
    }
}
