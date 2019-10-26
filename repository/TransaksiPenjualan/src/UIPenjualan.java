import java.awt.event.KeyEvent;
import java.text.NumberFormat;

public class UIPenjualan extends javax.swing.JFrame {
    ModelBarang barang;
    ModelPenjualan penjualan=new ModelPenjualan();
    
    /**
     * Creates new form UIPenjualan
     */
    public UIPenjualan() {
        initComponents();
        fillComboBarang();
        tblBarang.setModel(penjualan.getTabel());
        
    }
    
    private void fillComboBarang(){
        ModelBarang barang1 = new ModelBarang("Susu", "Kaleng", 11000);
        ModelBarang barang2 = new ModelBarang("Rokok", "Bungkus", 16000);
        ModelBarang barang3 = new ModelBarang("Snack", "Bungkus", 6500);
        ModelBarang barang4 = new ModelBarang("Sabun", "Batang", 2000);
        ModelBarang barang5 = new ModelBarang("Buah","Kaleng",15000);
        ModelBarang barang6 = new ModelBarang("Mainan","Plastik",45000);
        
        cboBarang.addItem(barang1);
        cboBarang.addItem(barang2);
        cboBarang.addItem(barang3);
        cboBarang.addItem(barang4);
        cboBarang.addItem(barang5);
        cboBarang.addItem(barang6);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboBarang = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblHarga = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSatuan = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        chkPPN = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        lblPPN = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Program Transaksi Penjualan Toko Banyak Macam");

        jLabel2.setText("Barang");

        cboBarang.setNextFocusableComponent(txtQuantity);
        cboBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBarangActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantity");

        jLabel4.setText("Harga");

        lblHarga.setText("00");

        jLabel5.setText("Rp.");

        lblSatuan.setText("jLabel6");

        txtQuantity.setNextFocusableComponent(btnSimpan);
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantityKeyPressed(evt);
            }
        });

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblBarang);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel6.setText("Subtotal :");

        jLabel7.setText("Rp.");

        lblSubtotal.setText("00");

        chkPPN.setText("PPN");
        chkPPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPPNActionPerformed(evt);
            }
        });

        jLabel8.setText("Rp.");

        lblPPN.setText("00");

        jLabel9.setText("Total");

        jLabel10.setText("Rp.");

        lblTotal.setText("00");

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cboBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblSatuan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSimpan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnHapus))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(chkPPN))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblPPN, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnHapus, btnSimpan});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblHarga)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblSatuan)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus)
                    .addComponent(btnSimpan))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblSubtotal)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPPN)
                    .addComponent(lblPPN)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblTotal)
                    .addComponent(jLabel10))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }

    private void txtQuantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            btnSimpan.requestFocus();
    }

    private void cboBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBarangActionPerformed
        barang = (ModelBarang)cboBarang.getSelectedItem();
        lblHarga.setText(NumberFormat.getNumberInstance().format(barang.getHarga()));
        lblSatuan.setText(barang.getSatuan());
    }

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String[] data = new String[5];
        double harga, jumlah=0;
        int qty=0;
        
        data[0]=barang.getNamaBarang();
        harga=barang.getHarga();
        data[1]=String.valueOf(barang.getHarga());
        qty=Integer.parseInt(txtQuantity.getText());
        data[2]=txtQuantity.getText();
        data[3]=barang.getSatuan();
        jumlah=harga*qty;
        data[4]=String.valueOf(jumlah);
        
        penjualan.getTabel().addRow(data);
        lblSubtotal.setText(NumberFormat.getNumberInstance().format(penjualan.countSubtotal()));
        chkPPNActionPerformed(null);
        
        cboBarang.requestFocus();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void chkPPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPPNActionPerformed
        if (chkPPN.isSelected())
            lblPPN.setText(NumberFormat.getNumberInstance().format(penjualan.countPPN()));
        else{
            lblPPN.setText("0");
            penjualan.setPpn(0);
        }
        
        lblTotal.setText(NumberFormat.getNumberInstance().format(penjualan.countTotal()));
    }//GEN-LAST:event_chkPPNActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        penjualan.getTabel().removeRow(tblBarang.getSelectedRow());
        lblSubtotal.setText(NumberFormat.getNumberInstance().format(penjualan.countSubtotal()));
        chkPPNActionPerformed(null);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new UIPenjualan().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox cboBarang;
    private javax.swing.JCheckBox chkPPN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JLabel lblPPN;
    private javax.swing.JLabel lblSatuan;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextField txtQuantity;

}
