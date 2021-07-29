package TokoAlat;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import koneksi.Konfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Locale;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class user extends javax.swing.JFrame {
    ResultSet rs = null;
    
    public void kosongkanFormPenjualan(){
        txtidnota.setText(null);
        txtnamapelanggan.setText(null);
        txtidalat.setText(null);
        txtnamaalat.setText(null);
        txthargaalat.setText(null);
        txtjumlahalat.setText(null);
        txttotalharga.setText(null);
        txtjumlahbayar.setText(null);
        txtkembalian.setText(null);
        txttanggalpesan.setText(null);
        txttanggalambil.setText(null);
    }

    public user() {
        initComponents();
        
        kosongkanFormPenjualan();
        showDaftarKueTableData();
        showDaftarPenjualanTableData();
        
        //tidak bisa di resize
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);

        //tampil tengah
        setLocationRelativeTo(null);

    }

    public void showMessage(String message, int type){
        if (type == 1){
            JOptionPane.showMessageDialog(this, message, "Sukses!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, message, "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void showDaftarPenjualanTableData(){
        try{
            java.sql.Connection conn = (Connection)Konfig.configDB();
            String sql = "SELECT * FROM penjualan";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            penjualantable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void showDaftarKueTableData(){
        try{
            java.sql.Connection conn = (Connection)Konfig.configDB();
            String sql = "SELECT * FROM alat";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            kueTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // tampil data table pengguna

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        logoToko = new javax.swing.JLabel();
        namaToko1 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        btnPenjualan = new javax.swing.JPanel();
        lblPenjualan = new javax.swing.JLabel();
        btnInfoAplikasi = new javax.swing.JPanel();
        lblInfoAplikasi = new javax.swing.JLabel();
        btnLogout = new javax.swing.JPanel();
        lblLogout = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        penjualanPanel = new javax.swing.JPanel();
        lblPenjualanView = new javax.swing.JLabel();
        lblIDNota = new javax.swing.JLabel();
        txttotalharga = new javax.swing.JTextField();
        lblTanggalPesan = new javax.swing.JLabel();
        lblTanggalAmbil = new javax.swing.JLabel();
        lblIDPelanggan = new javax.swing.JLabel();
        lblIDKue = new javax.swing.JLabel();
        lblNamaKue = new javax.swing.JLabel();
        lblHargaKue = new javax.swing.JLabel();
        lblJumlahKue = new javax.swing.JLabel();
        lblTotalHarga = new javax.swing.JLabel();
        txtidnota = new javax.swing.JTextField();
        txttanggalpesan = new javax.swing.JTextField();
        txttanggalambil = new javax.swing.JTextField();
        txtnamapelanggan = new javax.swing.JTextField();
        txtnamaalat = new javax.swing.JTextField();
        txthargaalat = new javax.swing.JTextField();
        txtjumlahalat = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        kueTable = new javax.swing.JTable();
        txtidalat = new javax.swing.JTextField();
        btnhitung = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        penjualantable = new javax.swing.JTable();
        txtjumlahbayar = new javax.swing.JTextField();
        lblTotalHarga1 = new javax.swing.JLabel();
        lblTotalHarga2 = new javax.swing.JLabel();
        txtkembalian = new javax.swing.JTextField();
        btnbayar = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        btnhapuspenjualan = new javax.swing.JButton();
        btnbayar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Alat Elektronik");

        bodyPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));

        menuPanel.setBackground(new java.awt.Color(0, 0, 0));
        menuPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));
        menuPanel.setToolTipText("");

        namaToko1.setBackground(new java.awt.Color(87, 95, 207));
        namaToko1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        namaToko1.setForeground(new java.awt.Color(255, 255, 255));
        namaToko1.setText("Vivi Electronic");
        namaToko1.setToolTipText("");

        lblUserName.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(87, 95, 207));

        btnPenjualan.setBackground(new java.awt.Color(255, 255, 255));
        btnPenjualan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));
        btnPenjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPenjualanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPenjualanMouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPenjualanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPenjualanMouseExited(evt);
            }
        });

        lblPenjualan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPenjualan.setText("PENJUALAN");
        lblPenjualan.setToolTipText("");

        javax.swing.GroupLayout btnPenjualanLayout = new javax.swing.GroupLayout(btnPenjualan);
        btnPenjualan.setLayout(btnPenjualanLayout);
        btnPenjualanLayout.setHorizontalGroup(
            btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnPenjualanLayout.createSequentialGroup()
                    .addGap(0, 38, Short.MAX_VALUE)
                    .addComponent(lblPenjualan)
                    .addGap(0, 38, Short.MAX_VALUE)))
        );
        btnPenjualanLayout.setVerticalGroup(
            btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
            .addGroup(btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnPenjualanLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblPenjualan)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnInfoAplikasi.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoAplikasi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));
        btnInfoAplikasi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfoAplikasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInfoAplikasiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnInfoAplikasiMouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInfoAplikasiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInfoAplikasiMouseExited(evt);
            }
        });

        lblInfoAplikasi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblInfoAplikasi.setText("INFO APLIKASI");
        lblInfoAplikasi.setToolTipText("");

        javax.swing.GroupLayout btnInfoAplikasiLayout = new javax.swing.GroupLayout(btnInfoAplikasi);
        btnInfoAplikasi.setLayout(btnInfoAplikasiLayout);
        btnInfoAplikasiLayout.setHorizontalGroup(
            btnInfoAplikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnInfoAplikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnInfoAplikasiLayout.createSequentialGroup()
                    .addGap(0, 29, Short.MAX_VALUE)
                    .addComponent(lblInfoAplikasi)
                    .addGap(0, 29, Short.MAX_VALUE)))
        );
        btnInfoAplikasiLayout.setVerticalGroup(
            btnInfoAplikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
            .addGroup(btnInfoAplikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnInfoAplikasiLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblInfoAplikasi)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogoutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLogoutMouseReleased(evt);
            }
        });

        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogout.setText("LOG OUT");
        lblLogout.setToolTipText("");

        javax.swing.GroupLayout btnLogoutLayout = new javax.swing.GroupLayout(btnLogout);
        btnLogout.setLayout(btnLogoutLayout);
        btnLogoutLayout.setHorizontalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnLogoutLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblLogout)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnLogoutLayout.setVerticalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
            .addGroup(btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnLogoutLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblLogout)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("M:\\Malamo\\Data\\Download\\VE Logo New.jpg")); // NOI18N

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addGap(0, 206, Short.MAX_VALUE)
                                .addComponent(logoToko))
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addComponent(namaToko1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuPanelLayout.createSequentialGroup()
                                .addComponent(lblUserName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnInfoAplikasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(56, 56, 56))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(namaToko1))
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(logoToko)
                        .addGap(302, 302, 302)
                        .addComponent(lblUserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInfoAplikasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177)))
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));
        mainPanel.setLayout(new java.awt.CardLayout());

        penjualanPanel.setBackground(new java.awt.Color(0, 0, 0));
        penjualanPanel.setToolTipText("");

        lblPenjualanView.setBackground(new java.awt.Color(87, 95, 207));
        lblPenjualanView.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        lblPenjualanView.setForeground(new java.awt.Color(255, 255, 255));
        lblPenjualanView.setText("PENJUALAN");
        lblPenjualanView.setToolTipText("");

        lblIDNota.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIDNota.setForeground(new java.awt.Color(255, 255, 255));
        lblIDNota.setText("ID Nota");
        lblIDNota.setToolTipText("");

        txttotalharga.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txttotalharga.setForeground(new java.awt.Color(87, 95, 207));

        lblTanggalPesan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTanggalPesan.setForeground(new java.awt.Color(255, 255, 255));
        lblTanggalPesan.setText("Tanggal Pesan");
        lblTanggalPesan.setToolTipText("");

        lblTanggalAmbil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTanggalAmbil.setForeground(new java.awt.Color(255, 255, 255));
        lblTanggalAmbil.setText("Tanggal Ambil");
        lblTanggalAmbil.setToolTipText("");

        lblIDPelanggan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIDPelanggan.setForeground(new java.awt.Color(255, 255, 255));
        lblIDPelanggan.setText("Nama Pelanggan");
        lblIDPelanggan.setToolTipText("");

        lblIDKue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIDKue.setForeground(new java.awt.Color(255, 255, 255));
        lblIDKue.setText("ID Alat");
        lblIDKue.setToolTipText("");

        lblNamaKue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNamaKue.setForeground(new java.awt.Color(255, 255, 255));
        lblNamaKue.setText("Nama Alat");
        lblNamaKue.setToolTipText("");

        lblHargaKue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHargaKue.setForeground(new java.awt.Color(255, 255, 255));
        lblHargaKue.setText("Harga Alat");
        lblHargaKue.setToolTipText("");

        lblJumlahKue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblJumlahKue.setForeground(new java.awt.Color(255, 255, 255));
        lblJumlahKue.setText("Jumlah Alat");
        lblJumlahKue.setToolTipText("");

        lblTotalHarga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalHarga.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalHarga.setText("Total Harga");
        lblTotalHarga.setToolTipText("");

        txtidnota.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtidnota.setForeground(new java.awt.Color(87, 95, 207));

        txttanggalpesan.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txttanggalpesan.setForeground(new java.awt.Color(87, 95, 207));

        txttanggalambil.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txttanggalambil.setForeground(new java.awt.Color(87, 95, 207));

        txtnamapelanggan.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtnamapelanggan.setForeground(new java.awt.Color(87, 95, 207));

        txtnamaalat.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtnamaalat.setForeground(new java.awt.Color(87, 95, 207));

        txthargaalat.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txthargaalat.setForeground(new java.awt.Color(87, 95, 207));

        txtjumlahalat.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtjumlahalat.setForeground(new java.awt.Color(87, 95, 207));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));
        jScrollPane2.setForeground(new java.awt.Color(87, 95, 207));
        jScrollPane2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        kueTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        kueTable.setForeground(new java.awt.Color(87, 95, 207));
        kueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Alat", "Nama Alat", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        kueTable.setGridColor(new java.awt.Color(87, 95, 207));
        kueTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kueTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(kueTable);

        txtidalat.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtidalat.setForeground(new java.awt.Color(87, 95, 207));

        btnhitung.setText("HITUNG");
        btnhitung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });

        jScrollPane5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane5MouseClicked(evt);
            }
        });

        penjualantable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id_nota", "nama_pelanggan", "id_alat", "nama_alat", "harga_alat", "jumlah_alat", "total_harga", "jumlah_bayar", "kembalian", "tanggal_pesan", "tanggal_ambil"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        penjualantable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                penjualantableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(penjualantable);

        txtjumlahbayar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtjumlahbayar.setForeground(new java.awt.Color(87, 95, 207));

        lblTotalHarga1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalHarga1.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalHarga1.setText("Jumlah Bayar");
        lblTotalHarga1.setToolTipText("");

        lblTotalHarga2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalHarga2.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalHarga2.setText("Kembalian");
        lblTotalHarga2.setToolTipText("");

        txtkembalian.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtkembalian.setForeground(new java.awt.Color(87, 95, 207));

        btnbayar.setText("BAYAR");
        btnbayar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbayarActionPerformed(evt);
            }
        });

        btnsimpan.setText("SIMPAN");
        btnsimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnhapuspenjualan.setText("HAPUS DATA");
        btnhapuspenjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnhapuspenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapuspenjualanActionPerformed(evt);
            }
        });

        btnbayar1.setText("HAPUS FORM");
        btnbayar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbayar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbayar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout penjualanPanelLayout = new javax.swing.GroupLayout(penjualanPanel);
        penjualanPanel.setLayout(penjualanPanelLayout);
        penjualanPanelLayout.setHorizontalGroup(
            penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penjualanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, penjualanPanelLayout.createSequentialGroup()
                        .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(penjualanPanelLayout.createSequentialGroup()
                                .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(penjualanPanelLayout.createSequentialGroup()
                                        .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblJumlahKue)
                                            .addComponent(lblTotalHarga)
                                            .addComponent(lblTotalHarga1)
                                            .addComponent(lblTotalHarga2))
                                        .addGap(18, 18, 18)
                                        .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txttotalharga, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                            .addComponent(txtjumlahalat)
                                            .addComponent(txtjumlahbayar)
                                            .addComponent(txtkembalian)))
                                    .addGroup(penjualanPanelLayout.createSequentialGroup()
                                        .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNamaKue)
                                            .addComponent(lblIDKue)
                                            .addComponent(lblHargaKue))
                                        .addGap(37, 37, 37)
                                        .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txthargaalat)
                                            .addComponent(txtnamaalat)
                                            .addComponent(txtidalat))))
                                .addGap(18, 18, 18)
                                .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(penjualanPanelLayout.createSequentialGroup()
                                        .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnbayar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnhitung, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(85, 85, 85)
                                        .addComponent(btnsimpan))
                                    .addGroup(penjualanPanelLayout.createSequentialGroup()
                                        .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblIDNota)
                                            .addComponent(lblTanggalPesan)
                                            .addComponent(lblTanggalAmbil)
                                            .addComponent(lblIDPelanggan))
                                        .addGap(22, 22, 22)
                                        .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtnamapelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txttanggalambil)
                                                .addComponent(txtidnota)
                                                .addComponent(txttanggalpesan, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, penjualanPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnbayar1)
                                .addGap(70, 70, 70)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(penjualanPanelLayout.createSequentialGroup()
                        .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnhapuspenjualan)
                            .addComponent(lblPenjualanView))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        penjualanPanelLayout.setVerticalGroup(
            penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penjualanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPenjualanView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(penjualanPanelLayout.createSequentialGroup()
                        .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(penjualanPanelLayout.createSequentialGroup()
                                .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtidalat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIDKue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtnamaalat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNamaKue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txthargaalat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHargaKue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblJumlahKue)
                                    .addComponent(txtjumlahalat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(penjualanPanelLayout.createSequentialGroup()
                                .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtidnota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIDNota))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txttanggalpesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTanggalPesan))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txttanggalambil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTanggalAmbil))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtnamapelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIDPelanggan))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttotalharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotalHarga)
                            .addComponent(btnhitung))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtjumlahbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotalHarga1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotalHarga2)
                            .addComponent(btnbayar)
                            .addComponent(btnsimpan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbayar1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnhapuspenjualan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(penjualanPanel, "card3");

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        btnLogout.setBackground(new Color(89, 95, 207));
        lblLogout.setForeground(new Color(230, 230, 230));
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited
        btnLogout.setBackground(new Color(255, 255, 255));
        lblLogout.setForeground(new Color(89, 95, 207));
    }//GEN-LAST:event_btnLogoutMouseExited

    private void btnLogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMousePressed
        btnLogout.setBackground(new Color(62, 70, 182));
        lblLogout.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLogoutMousePressed

    private void btnLogoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseReleased
        btnLogout.setBackground(new Color(255, 255, 255));
        lblLogout.setForeground(new Color(62, 70, 182));

        new login_multiuser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutMouseReleased

    private void btnPenjualanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenjualanMouseEntered
        btnPenjualan.setBackground(new Color(89, 95, 207));
        lblPenjualan.setForeground(new Color(230, 230, 230));
    }//GEN-LAST:event_btnPenjualanMouseEntered

    private void btnPenjualanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenjualanMouseExited
        btnPenjualan.setBackground(new Color(255, 255, 255));
        lblPenjualan.setForeground(new Color(89, 95, 207));
    }//GEN-LAST:event_btnPenjualanMouseExited

    private void btnPenjualanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenjualanMousePressed
        btnPenjualan.setBackground(new Color(62, 70, 182));
        lblPenjualan.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnPenjualanMousePressed

    private void btnPenjualanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenjualanMouseReleased
        btnPenjualan.setBackground(new Color(255, 255, 255));
        lblPenjualan.setForeground(new Color(62, 70, 182));

        // remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        // add panel
        mainPanel.add(penjualanPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnPenjualanMouseReleased

    private void btnInfoAplikasiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoAplikasiMouseEntered
        btnInfoAplikasi.setBackground(new Color(89, 95, 207));
        lblInfoAplikasi.setForeground(new Color(230, 230, 230));
    }//GEN-LAST:event_btnInfoAplikasiMouseEntered

    private void btnInfoAplikasiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoAplikasiMouseExited
        btnInfoAplikasi.setBackground(new Color(255, 255, 255));
        lblInfoAplikasi.setForeground(new Color(89, 95, 207));
    }//GEN-LAST:event_btnInfoAplikasiMouseExited

    private void btnInfoAplikasiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoAplikasiMousePressed
        btnInfoAplikasi.setBackground(new Color(62, 70, 182));
        lblInfoAplikasi.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnInfoAplikasiMousePressed

    private void btnInfoAplikasiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoAplikasiMouseReleased
        btnInfoAplikasi.setBackground(new Color(255, 255, 255));
        lblInfoAplikasi.setForeground(new Color(62, 70, 182));

        InfoAppView n = new InfoAppView();
        n.setVisible(true);
    }//GEN-LAST:event_btnInfoAplikasiMouseReleased

    private void kueTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kueTableMouseClicked
        int baris = kueTable.rowAtPoint(evt.getPoint());

        String id_kue = kueTable.getValueAt(baris, 0).toString();
        txtidalat.setText(id_kue);
        String nama = kueTable.getValueAt(baris, 1).toString();
        txtnamaalat.setText(nama);
        String harga = kueTable.getValueAt(baris, 2).toString();
        txthargaalat.setText(harga);
    }//GEN-LAST:event_kueTableMouseClicked

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        try{
            String sql = "INSERT INTO penjualan VALUES ('"
                    +txtidnota.getText()+"','"
                    +txtnamapelanggan.getText()+"','"
                    +txtidalat.getText()+"','"
                    +txtnamaalat.getText()+"','"
                    +txthargaalat.getText()+"','"
                    +txtjumlahalat.getText()+"','"
                    +txttotalharga.getText()+"','"
                    +txtjumlahbayar.getText()+"','"
                    +txtkembalian.getText()+"','"
                    +txttanggalpesan.getText()+"','"
                    +txttanggalambil.getText()+"')";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Simpan data BERHASIL!");
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, "Simpan data GAGAL, isi data kolom dengan benar!");
        }
        showDaftarPenjualanTableData();
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
        //menghitung total belanja
        if(txtjumlahalat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Hitung GAGAL, isi form terlebih dahulu!");
        }else{
            int hasil = 0;
            String angka1 = txthargaalat.getText();
            String angka2 = txtjumlahalat.getText();
            int ke1 = Integer.parseInt(angka1);
            int ke2 = Integer.parseInt(angka2);
            hasil = ke1 * ke2;
            txttotalharga.setText(""+hasil);
        }
    }//GEN-LAST:event_btnhitungActionPerformed

    private void btnbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbayarActionPerformed
        //menghitung uang kembalian
        if(txtjumlahbayar.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Hitung GAGAL, isi form terlebih dahulu!");
        }else{
            int hasil = 0;
            String angka1 = txttotalharga.getText();
            String angka2 = txtjumlahbayar.getText();
            int ke1 = Integer.parseInt(angka1);
            int ke2 = Integer.parseInt(angka2);
            hasil = ke2 - ke1;
            txtkembalian.setText(""+hasil);
        } 
    }//GEN-LAST:event_btnbayarActionPerformed

    private void btnhapuspenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapuspenjualanActionPerformed
        try {
            int selectedRow = penjualantable.getSelectedRow();
            if(selectedRow == -1){
            showMessage("pilih baris dulu", 2);
            }else{
                int pilihan = JOptionPane.showConfirmDialog(this," Apakah anda yakin ingin menghapus data ini ?",
                    "Konfirmasi",JOptionPane.WARNING_MESSAGE);
                if(pilihan == JOptionPane.YES_OPTION){
                    String sql = "DELETE FROM penjualan WHERE id_nota =?";
                    java.sql.Connection conn = (Connection)Konfig.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setString(1, txtidnota.getText());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Hapus sukses!");
                }else{
                    System.out.println("Salah");
                }  
            } 
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        showDaftarPenjualanTableData();
    }//GEN-LAST:event_btnhapuspenjualanActionPerformed

    private void btnbayar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbayar1ActionPerformed
        kosongkanFormPenjualan();
    }//GEN-LAST:event_btnbayar1ActionPerformed

    private void jScrollPane5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane5MouseClicked

    private void penjualantableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penjualantableMouseClicked
        int baris = penjualantable.rowAtPoint(evt.getPoint());

        String id_nota = penjualantable.getValueAt(baris, 0).toString();
        txtidnota.setText(id_nota);

    }//GEN-LAST:event_penjualantableMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel btnInfoAplikasi;
    private javax.swing.JPanel btnLogout;
    private javax.swing.JPanel btnPenjualan;
    private javax.swing.JButton btnbayar;
    private javax.swing.JButton btnbayar1;
    private javax.swing.JButton btnhapuspenjualan;
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable kueTable;
    private javax.swing.JLabel lblHargaKue;
    private javax.swing.JLabel lblIDKue;
    private javax.swing.JLabel lblIDNota;
    private javax.swing.JLabel lblIDPelanggan;
    private javax.swing.JLabel lblInfoAplikasi;
    private javax.swing.JLabel lblJumlahKue;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblNamaKue;
    private javax.swing.JLabel lblPenjualan;
    private javax.swing.JLabel lblPenjualanView;
    private javax.swing.JLabel lblTanggalAmbil;
    private javax.swing.JLabel lblTanggalPesan;
    private javax.swing.JLabel lblTotalHarga;
    private javax.swing.JLabel lblTotalHarga1;
    private javax.swing.JLabel lblTotalHarga2;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel logoToko;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel namaToko1;
    private javax.swing.JPanel penjualanPanel;
    private javax.swing.JTable penjualantable;
    private javax.swing.JTextField txthargaalat;
    private javax.swing.JTextField txtidalat;
    private javax.swing.JTextField txtidnota;
    private javax.swing.JTextField txtjumlahalat;
    private javax.swing.JTextField txtjumlahbayar;
    private javax.swing.JTextField txtkembalian;
    private javax.swing.JTextField txtnamaalat;
    private javax.swing.JTextField txtnamapelanggan;
    private javax.swing.JTextField txttanggalambil;
    private javax.swing.JTextField txttanggalpesan;
    private javax.swing.JTextField txttotalharga;
    // End of variables declaration//GEN-END:variables
}
