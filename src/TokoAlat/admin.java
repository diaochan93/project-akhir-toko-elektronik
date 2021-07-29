package TokoAlat;

import java.util.Scanner;
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

public class admin extends javax.swing.JFrame {
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
    
    public void kosongkanFormDaftarKue(){
        txtIDAlat1.setText(null);
        txtNamaAlat1.setText(null);
        txtHarga1.setText(null);
    }
    public void kosongkanFormPengguna() {
        txtpengguna.setText(null);
        txtuser.setText(null);
        txtpass.setText(null);
        txtnama.setText(null);
        cbuser.setSelectedIndex(0);
    }

    public admin() {
        initComponents();
        
        kosongkanFormPenjualan();
        kosongkanFormDaftarKue();
        kosongkanFormPengguna();
        showPenggunaTableData();
        showDaftarKueTableData();
        showDaftarKueTableData1();
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
    
    public void showDaftarKueTableData1(){
        try{
            java.sql.Connection conn = (Connection)Konfig.configDB();
            String sql = "SELECT * FROM alat";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            kueTable1.setModel(DbUtils.resultSetToTableModel(rs));
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
    public void showPenggunaTableData() {
        try {
            java.sql.Connection conn = (Connection)Konfig.configDB();
            String sql = "SELECT * FROM login_multiuser";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            penggunaTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        logoToko = new javax.swing.JLabel();
        namaToko1 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        btnPengguna = new javax.swing.JPanel();
        lblPengguna = new javax.swing.JLabel();
        btnDaftarKue = new javax.swing.JPanel();
        lblDaftarKue = new javax.swing.JLabel();
        btnPenjualan = new javax.swing.JPanel();
        lblPenjualan = new javax.swing.JLabel();
        btnInfoAplikasi = new javax.swing.JPanel();
        lblInfoAplikasi = new javax.swing.JLabel();
        btnLogout = new javax.swing.JPanel();
        lblLogout = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        penggunaPanel = new javax.swing.JPanel();
        lblPenggunaView = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        lblpassword = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        lbllevel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        penggunaTable = new javax.swing.JTable();
        btnSimpan = new javax.swing.JPanel();
        lblSimpan = new javax.swing.JLabel();
        btnHapus = new javax.swing.JPanel();
        lblHapus = new javax.swing.JLabel();
        btnEdit = new javax.swing.JPanel();
        lblEdit = new javax.swing.JLabel();
        cbuser = new javax.swing.JComboBox<>();
        lblnamalengkap = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        btnHapusText = new javax.swing.JPanel();
        lblHapusText = new javax.swing.JLabel();
        lbluser1 = new javax.swing.JLabel();
        txtpengguna = new javax.swing.JTextField();
        daftarkuePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        kueTable1 = new javax.swing.JTable();
        lblIDKue1 = new javax.swing.JLabel();
        lblNamaKue1 = new javax.swing.JLabel();
        lblHarga1 = new javax.swing.JLabel();
        txtIDAlat1 = new javax.swing.JTextField();
        txtNamaAlat1 = new javax.swing.JTextField();
        txtHarga1 = new javax.swing.JTextField();
        btnSimpan1 = new javax.swing.JPanel();
        lblSimpan1 = new javax.swing.JLabel();
        btnHapus1 = new javax.swing.JPanel();
        lblEdit1 = new javax.swing.JLabel();
        btnHapusText1 = new javax.swing.JPanel();
        lblRefresh1 = new javax.swing.JLabel();
        btnEdit1 = new javax.swing.JPanel();
        lblHapus1 = new javax.swing.JLabel();
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

        namaToko1.setBackground(new java.awt.Color(255, 255, 255));
        namaToko1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        namaToko1.setForeground(new java.awt.Color(255, 255, 255));
        namaToko1.setText("Vivi Electronic");

        lblUserName.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(87, 95, 207));

        btnPengguna.setBackground(new java.awt.Color(255, 255, 255));
        btnPengguna.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));
        btnPengguna.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPengguna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPenggunaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPenggunaMouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPenggunaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPenggunaMouseExited(evt);
            }
        });

        lblPengguna.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPengguna.setText("PENGGUNA");

        javax.swing.GroupLayout btnPenggunaLayout = new javax.swing.GroupLayout(btnPengguna);
        btnPengguna.setLayout(btnPenggunaLayout);
        btnPenggunaLayout.setHorizontalGroup(
            btnPenggunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
            .addGroup(btnPenggunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnPenggunaLayout.createSequentialGroup()
                    .addGap(0, 56, Short.MAX_VALUE)
                    .addComponent(lblPengguna)
                    .addGap(0, 55, Short.MAX_VALUE)))
        );
        btnPenggunaLayout.setVerticalGroup(
            btnPenggunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
            .addGroup(btnPenggunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnPenggunaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblPengguna)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnDaftarKue.setBackground(new java.awt.Color(255, 255, 255));
        btnDaftarKue.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));
        btnDaftarKue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDaftarKue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDaftarKueMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDaftarKueMouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDaftarKueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDaftarKueMouseExited(evt);
            }
        });

        lblDaftarKue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDaftarKue.setText("DAFTAR ALAT");

        javax.swing.GroupLayout btnDaftarKueLayout = new javax.swing.GroupLayout(btnDaftarKue);
        btnDaftarKue.setLayout(btnDaftarKueLayout);
        btnDaftarKueLayout.setHorizontalGroup(
            btnDaftarKueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnDaftarKueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnDaftarKueLayout.createSequentialGroup()
                    .addGap(0, 47, Short.MAX_VALUE)
                    .addComponent(lblDaftarKue)
                    .addGap(0, 46, Short.MAX_VALUE)))
        );
        btnDaftarKueLayout.setVerticalGroup(
            btnDaftarKueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
            .addGroup(btnDaftarKueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnDaftarKueLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblDaftarKue)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

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

        javax.swing.GroupLayout btnPenjualanLayout = new javax.swing.GroupLayout(btnPenjualan);
        btnPenjualan.setLayout(btnPenjualanLayout);
        btnPenjualanLayout.setHorizontalGroup(
            btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnPenjualanLayout.createSequentialGroup()
                    .addGap(0, 53, Short.MAX_VALUE)
                    .addComponent(lblPenjualan)
                    .addGap(0, 53, Short.MAX_VALUE)))
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

        javax.swing.GroupLayout btnInfoAplikasiLayout = new javax.swing.GroupLayout(btnInfoAplikasi);
        btnInfoAplikasi.setLayout(btnInfoAplikasiLayout);
        btnInfoAplikasiLayout.setHorizontalGroup(
            btnInfoAplikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnInfoAplikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnInfoAplikasiLayout.createSequentialGroup()
                    .addGap(0, 40, Short.MAX_VALUE)
                    .addComponent(lblInfoAplikasi)
                    .addGap(0, 40, Short.MAX_VALUE)))
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

        javax.swing.GroupLayout btnLogoutLayout = new javax.swing.GroupLayout(btnLogout);
        btnLogout.setLayout(btnLogoutLayout);
        btnLogoutLayout.setHorizontalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnLogoutLayout.createSequentialGroup()
                    .addGap(0, 64, Short.MAX_VALUE)
                    .addComponent(lblLogout)
                    .addGap(0, 64, Short.MAX_VALUE)))
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

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon("M:\\Malamo\\Data\\Download\\VE Logo New.jpg")); // NOI18N

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
                                .addComponent(namaToko1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addGap(0, 53, Short.MAX_VALUE)
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(logoToko)
                                    .addGroup(menuPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(31, 31, 31)))))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuPanelLayout.createSequentialGroup()
                                .addComponent(lblUserName)
                                .addGap(25, 25, 25)
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInfoAplikasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPengguna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDaftarKue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(12, 12, 12))))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(namaToko1))
                .addGap(38, 38, 38)
                .addComponent(logoToko)
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(lblUserName))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnPengguna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDaftarKue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInfoAplikasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));
        mainPanel.setLayout(new java.awt.CardLayout());

        penggunaPanel.setBackground(new java.awt.Color(0, 0, 0));

        lblPenggunaView.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        lblPenggunaView.setForeground(new java.awt.Color(255, 255, 255));
        lblPenggunaView.setText("PENGGUNA");

        lbluser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbluser.setForeground(new java.awt.Color(255, 255, 255));
        lbluser.setText("Username");
        lbluser.setToolTipText("");

        txtuser.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtuser.setForeground(new java.awt.Color(87, 95, 207));

        lblpassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(255, 255, 255));
        lblpassword.setText("Password");
        lblpassword.setToolTipText("");

        txtpass.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtpass.setForeground(new java.awt.Color(87, 95, 207));

        lbllevel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbllevel.setForeground(new java.awt.Color(255, 255, 255));
        lbllevel.setText("Level");
        lbllevel.setToolTipText("");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));
        jScrollPane1.setForeground(new java.awt.Color(87, 95, 207));
        jScrollPane1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        penggunaTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        penggunaTable.setForeground(new java.awt.Color(87, 95, 207));
        penggunaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id_pengguna", "username", "password", "nama_lengkap", "level"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        penggunaTable.setGridColor(new java.awt.Color(87, 95, 207));
        penggunaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                penggunaTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(penggunaTable);

        btnSimpan.setBackground(new java.awt.Color(255, 255, 255));
        btnSimpan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));
        btnSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSimpanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSimpanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSimpanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSimpanMouseReleased(evt);
            }
        });

        lblSimpan.setBackground(new java.awt.Color(87, 95, 207));
        lblSimpan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSimpan.setText("SAVE");

        javax.swing.GroupLayout btnSimpanLayout = new javax.swing.GroupLayout(btnSimpan);
        btnSimpan.setLayout(btnSimpanLayout);
        btnSimpanLayout.setHorizontalGroup(
            btnSimpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnSimpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnSimpanLayout.createSequentialGroup()
                    .addGap(0, 91, Short.MAX_VALUE)
                    .addComponent(lblSimpan)
                    .addGap(0, 92, Short.MAX_VALUE)))
        );
        btnSimpanLayout.setVerticalGroup(
            btnSimpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(btnSimpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnSimpanLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblSimpan)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnHapus.setBackground(new java.awt.Color(255, 255, 255));
        btnHapus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));
        btnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHapusMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHapusMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnHapusMouseReleased(evt);
            }
        });

        lblHapus.setBackground(new java.awt.Color(87, 95, 207));
        lblHapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHapus.setText("DELETE");

        javax.swing.GroupLayout btnHapusLayout = new javax.swing.GroupLayout(btnHapus);
        btnHapus.setLayout(btnHapusLayout);
        btnHapusLayout.setHorizontalGroup(
            btnHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnHapusLayout.createSequentialGroup()
                    .addGap(0, 83, Short.MAX_VALUE)
                    .addComponent(lblHapus)
                    .addGap(0, 84, Short.MAX_VALUE)))
        );
        btnHapusLayout.setVerticalGroup(
            btnHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(btnHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnHapusLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblHapus)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEditMouseReleased(evt);
            }
        });

        lblEdit.setBackground(new java.awt.Color(87, 95, 207));
        lblEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEdit.setText("UPDATE");

        javax.swing.GroupLayout btnEditLayout = new javax.swing.GroupLayout(btnEdit);
        btnEdit.setLayout(btnEditLayout);
        btnEditLayout.setHorizontalGroup(
            btnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnEditLayout.createSequentialGroup()
                    .addGap(0, 82, Short.MAX_VALUE)
                    .addComponent(lblEdit)
                    .addGap(0, 82, Short.MAX_VALUE)))
        );
        btnEditLayout.setVerticalGroup(
            btnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(btnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnEditLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblEdit)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        cbuser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbuser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Level ", "Admin", "Karyawan" }));
        cbuser.setToolTipText("");

        lblnamalengkap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblnamalengkap.setForeground(new java.awt.Color(255, 255, 255));
        lblnamalengkap.setText("Nama Lengkap");

        txtnama.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtnama.setForeground(new java.awt.Color(87, 95, 207));

        btnHapusText.setBackground(new java.awt.Color(255, 255, 255));
        btnHapusText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));
        btnHapusText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapusText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHapusTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHapusTextMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHapusTextMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnHapusTextMouseReleased(evt);
            }
        });

        lblHapusText.setBackground(new java.awt.Color(87, 95, 207));
        lblHapusText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHapusText.setText("DELETE TEXT");

        javax.swing.GroupLayout btnHapusTextLayout = new javax.swing.GroupLayout(btnHapusText);
        btnHapusText.setLayout(btnHapusTextLayout);
        btnHapusTextLayout.setHorizontalGroup(
            btnHapusTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
            .addGroup(btnHapusTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnHapusTextLayout.createSequentialGroup()
                    .addGap(0, 24, Short.MAX_VALUE)
                    .addComponent(lblHapusText)
                    .addGap(0, 25, Short.MAX_VALUE)))
        );
        btnHapusTextLayout.setVerticalGroup(
            btnHapusTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(btnHapusTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnHapusTextLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblHapusText)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        lbluser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbluser1.setForeground(new java.awt.Color(255, 255, 255));
        lbluser1.setText("ID Pengguna");
        lbluser1.setToolTipText("");

        txtpengguna.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtpengguna.setForeground(new java.awt.Color(87, 95, 207));

        javax.swing.GroupLayout penggunaPanelLayout = new javax.swing.GroupLayout(penggunaPanel);
        penggunaPanel.setLayout(penggunaPanelLayout);
        penggunaPanelLayout.setHorizontalGroup(
            penggunaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penggunaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(penggunaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(penggunaPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(penggunaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHapusText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(penggunaPanelLayout.createSequentialGroup()
                        .addGroup(penggunaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPenggunaView)
                            .addGroup(penggunaPanelLayout.createSequentialGroup()
                                .addGroup(penggunaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblpassword)
                                    .addComponent(lblnamalengkap)
                                    .addComponent(lbluser)
                                    .addComponent(lbllevel)
                                    .addComponent(lbluser1))
                                .addGap(64, 64, 64)
                                .addGroup(penggunaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtpengguna, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(txtpass)
                                    .addComponent(txtnama)
                                    .addComponent(txtuser)
                                    .addComponent(cbuser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        penggunaPanelLayout.setVerticalGroup(
            penggunaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penggunaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPenggunaView)
                .addGap(24, 24, 24)
                .addGroup(penggunaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbluser1)
                    .addComponent(txtpengguna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(penggunaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbluser)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(penggunaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(penggunaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnamalengkap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(penggunaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllevel)
                    .addComponent(cbuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(penggunaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(penggunaPanelLayout.createSequentialGroup()
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapusText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84))
        );

        mainPanel.add(penggunaPanel, "card2");

        daftarkuePanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DAFTAR ALAT");

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));
        jScrollPane4.setForeground(new java.awt.Color(87, 95, 207));
        jScrollPane4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        kueTable1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        kueTable1.setForeground(new java.awt.Color(87, 95, 207));
        kueTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id_alat", "nama", "harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kueTable1.setGridColor(new java.awt.Color(87, 95, 207));
        kueTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kueTable1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(kueTable1);

        lblIDKue1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIDKue1.setForeground(new java.awt.Color(255, 255, 255));
        lblIDKue1.setText("ID Alat:");

        lblNamaKue1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNamaKue1.setForeground(new java.awt.Color(255, 255, 255));
        lblNamaKue1.setText("Nama Alat:");

        lblHarga1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHarga1.setForeground(new java.awt.Color(255, 255, 255));
        lblHarga1.setText("Harga:");

        txtIDAlat1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtIDAlat1.setForeground(new java.awt.Color(87, 95, 207));

        txtNamaAlat1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtNamaAlat1.setForeground(new java.awt.Color(87, 95, 207));

        txtHarga1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtHarga1.setForeground(new java.awt.Color(87, 95, 207));

        btnSimpan1.setBackground(new java.awt.Color(255, 255, 255));
        btnSimpan1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));
        btnSimpan1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSimpan1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSimpan1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSimpan1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSimpan1MouseReleased(evt);
            }
        });

        lblSimpan1.setBackground(new java.awt.Color(87, 95, 207));
        lblSimpan1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSimpan1.setText("SAVE");

        javax.swing.GroupLayout btnSimpan1Layout = new javax.swing.GroupLayout(btnSimpan1);
        btnSimpan1.setLayout(btnSimpan1Layout);
        btnSimpan1Layout.setHorizontalGroup(
            btnSimpan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
            .addGroup(btnSimpan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnSimpan1Layout.createSequentialGroup()
                    .addGap(0, 59, Short.MAX_VALUE)
                    .addComponent(lblSimpan1)
                    .addGap(0, 59, Short.MAX_VALUE)))
        );
        btnSimpan1Layout.setVerticalGroup(
            btnSimpan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(btnSimpan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnSimpan1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblSimpan1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnHapus1.setBackground(new java.awt.Color(255, 255, 255));
        btnHapus1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));
        btnHapus1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHapus1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHapus1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHapus1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnHapus1MouseReleased(evt);
            }
        });

        lblEdit1.setBackground(new java.awt.Color(87, 95, 207));
        lblEdit1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEdit1.setText("DELETE");

        javax.swing.GroupLayout btnHapus1Layout = new javax.swing.GroupLayout(btnHapus1);
        btnHapus1.setLayout(btnHapus1Layout);
        btnHapus1Layout.setHorizontalGroup(
            btnHapus1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
            .addGroup(btnHapus1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnHapus1Layout.createSequentialGroup()
                    .addGap(0, 51, Short.MAX_VALUE)
                    .addComponent(lblEdit1)
                    .addGap(0, 51, Short.MAX_VALUE)))
        );
        btnHapus1Layout.setVerticalGroup(
            btnHapus1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(btnHapus1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnHapus1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblEdit1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnHapusText1.setBackground(new java.awt.Color(255, 255, 255));
        btnHapusText1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));
        btnHapusText1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapusText1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHapusText1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHapusText1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHapusText1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnHapusText1MouseReleased(evt);
            }
        });

        lblRefresh1.setBackground(new java.awt.Color(87, 95, 207));
        lblRefresh1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRefresh1.setText("DELETE TEXT");

        javax.swing.GroupLayout btnHapusText1Layout = new javax.swing.GroupLayout(btnHapusText1);
        btnHapusText1.setLayout(btnHapusText1Layout);
        btnHapusText1Layout.setHorizontalGroup(
            btnHapusText1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
            .addGroup(btnHapusText1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnHapusText1Layout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(lblRefresh1)
                    .addGap(0, 31, Short.MAX_VALUE)))
        );
        btnHapusText1Layout.setVerticalGroup(
            btnHapusText1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(btnHapusText1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnHapusText1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblRefresh1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnEdit1.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));
        btnEdit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEdit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEdit1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEdit1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEdit1MouseReleased(evt);
            }
        });

        lblHapus1.setBackground(new java.awt.Color(87, 95, 207));
        lblHapus1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHapus1.setText("UPDATE");

        javax.swing.GroupLayout btnEdit1Layout = new javax.swing.GroupLayout(btnEdit1);
        btnEdit1.setLayout(btnEdit1Layout);
        btnEdit1Layout.setHorizontalGroup(
            btnEdit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
            .addGroup(btnEdit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnEdit1Layout.createSequentialGroup()
                    .addGap(0, 49, Short.MAX_VALUE)
                    .addComponent(lblHapus1)
                    .addGap(0, 50, Short.MAX_VALUE)))
        );
        btnEdit1Layout.setVerticalGroup(
            btnEdit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(btnEdit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnEdit1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblHapus1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout daftarkuePanelLayout = new javax.swing.GroupLayout(daftarkuePanel);
        daftarkuePanel.setLayout(daftarkuePanelLayout);
        daftarkuePanelLayout.setHorizontalGroup(
            daftarkuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daftarkuePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(daftarkuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
                    .addGroup(daftarkuePanelLayout.createSequentialGroup()
                        .addGroup(daftarkuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(daftarkuePanelLayout.createSequentialGroup()
                                .addGroup(daftarkuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNamaKue1)
                                    .addComponent(lblHarga1)
                                    .addComponent(lblIDKue1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(daftarkuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNamaAlat1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(txtIDAlat1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHarga1))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, daftarkuePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(daftarkuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSimpan1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHapus1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHapusText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        daftarkuePanelLayout.setVerticalGroup(
            daftarkuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daftarkuePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(daftarkuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDKue1)
                    .addComponent(txtIDAlat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(daftarkuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaAlat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNamaKue1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(daftarkuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHarga1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHarga1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSimpan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHapus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHapusText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        mainPanel.add(daftarkuePanel, "card5");

        penjualanPanel.setBackground(new java.awt.Color(0, 0, 0));

        lblPenjualanView.setBackground(new java.awt.Color(87, 95, 207));
        lblPenjualanView.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblPenjualanView.setForeground(new java.awt.Color(255, 255, 255));
        lblPenjualanView.setText("PENJUALAN");

        lblIDNota.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIDNota.setForeground(new java.awt.Color(255, 255, 255));
        lblIDNota.setText("ID Nota");

        txttotalharga.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txttotalharga.setForeground(new java.awt.Color(87, 95, 207));

        lblTanggalPesan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTanggalPesan.setForeground(new java.awt.Color(255, 255, 255));
        lblTanggalPesan.setText("Tanggal Pesan");

        lblTanggalAmbil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTanggalAmbil.setForeground(new java.awt.Color(255, 255, 255));
        lblTanggalAmbil.setText("Tanggal Ambil");

        lblIDPelanggan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIDPelanggan.setForeground(new java.awt.Color(255, 255, 255));
        lblIDPelanggan.setText("Nama Pelanggan");

        lblIDKue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIDKue.setForeground(new java.awt.Color(255, 255, 255));
        lblIDKue.setText("ID Alat");

        lblNamaKue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNamaKue.setForeground(new java.awt.Color(255, 255, 255));
        lblNamaKue.setText("Nama Alat");

        lblHargaKue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHargaKue.setForeground(new java.awt.Color(255, 255, 255));
        lblHargaKue.setText("Harga Alat");

        lblJumlahKue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblJumlahKue.setForeground(new java.awt.Color(255, 255, 255));
        lblJumlahKue.setText("Jumlah Alat");

        lblTotalHarga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalHarga.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalHarga.setText("Total Harga");

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
        txtidalat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidalatActionPerformed(evt);
            }
        });

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

        lblTotalHarga2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalHarga2.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalHarga2.setText("Kembalian");

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
                                    .addComponent(lblJumlahKue)
                                    .addComponent(lblTotalHarga)
                                    .addComponent(lblTotalHarga1)
                                    .addComponent(lblTotalHarga2))
                                .addGap(18, 18, 18)
                                .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttotalharga, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
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
                                    .addComponent(btnbayar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnhitung, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(85, 85, 85)
                                .addComponent(btnsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(penjualanPanelLayout.createSequentialGroup()
                                .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(penjualanPanelLayout.createSequentialGroup()
                                            .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblIDNota)
                                                .addComponent(lblTanggalPesan)
                                                .addComponent(lblTanggalAmbil))
                                            .addGap(38, 38, 38)
                                            .addGroup(penjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txttanggalambil)
                                                .addComponent(txtidnota)
                                                .addComponent(txttanggalpesan, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(penjualanPanelLayout.createSequentialGroup()
                                            .addComponent(lblIDPelanggan)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtnamapelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(penjualanPanelLayout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(btnbayar1)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPenggunaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenggunaMouseEntered
        btnPengguna.setBackground(new Color(89, 95, 207));
        lblPengguna.setForeground(new Color(230, 230, 230));
    }//GEN-LAST:event_btnPenggunaMouseEntered

    private void btnPenggunaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenggunaMouseExited
        btnPengguna.setBackground(new Color(255, 255, 255));
        lblPengguna.setForeground(new Color(89, 95, 207));
    }//GEN-LAST:event_btnPenggunaMouseExited

    private void btnPenggunaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenggunaMousePressed
        btnPengguna.setBackground(new Color(62, 70, 182));
        lblPengguna.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnPenggunaMousePressed

    private void btnPenggunaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenggunaMouseReleased
        btnPengguna.setBackground(new Color(255, 255, 255));
        lblPengguna.setForeground(new Color(62, 70, 182));

        // remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        // add panel
        mainPanel.add(penggunaPanel);
        mainPanel.repaint();
        mainPanel.revalidate();

    }//GEN-LAST:event_btnPenggunaMouseReleased

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

    private void btnSimpanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseEntered
        btnSimpan.setBackground(new Color(89, 95, 207));
        lblSimpan.setForeground(new Color(230, 230, 230));
    }//GEN-LAST:event_btnSimpanMouseEntered

    private void btnSimpanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseExited
        btnSimpan.setBackground(new Color(255, 255, 255));
        lblSimpan.setForeground(new Color(89, 95, 207));
    }//GEN-LAST:event_btnSimpanMouseExited

    private void btnSimpanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMousePressed
        btnSimpan.setBackground(new Color(62, 70, 182));
        lblSimpan.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnSimpanMousePressed

    private void btnSimpanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseReleased
        btnSimpan.setBackground(new Color(255, 255, 255));
        lblSimpan.setForeground(new Color(62, 70, 182));
        
        try{
            String sql = "INSERT INTO login_multiuser VALUES ('"
                    +txtpengguna.getText()+"','"
                    +txtuser.getText()+"','"
                    +txtpass.getText()+"','"
                    +txtnama.getText()+"','"
                    +cbuser.getSelectedItem().toString()
                    +"')";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Simpan Data BERHASIL");
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, "Simpan Data GAGAL, Isi Data Kolom Dengan Benar!!!");
        }
        
        showPenggunaTableData();
        kosongkanFormPengguna();
    }//GEN-LAST:event_btnSimpanMouseReleased

    private void btnHapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseEntered
        btnHapus.setBackground(new Color(89, 95, 207));
        lblHapus.setForeground(new Color(230, 230, 230));
    }//GEN-LAST:event_btnHapusMouseEntered

    private void btnHapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseExited
        btnHapus.setBackground(new Color(255, 255, 255));
        lblHapus.setForeground(new Color(89, 95, 207));
    }//GEN-LAST:event_btnHapusMouseExited

    private void btnHapusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMousePressed
        btnHapus.setBackground(new Color(62, 70, 182));
        lblHapus.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnHapusMousePressed

    private void btnHapusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseReleased
        btnHapus.setBackground(new Color(255, 255, 255));
        lblHapus.setForeground(new Color(62, 70, 182));

        try {
            int selectedRow = penggunaTable.getSelectedRow();
            if(selectedRow == -1){
            showMessage("Pilih baris dahulu!", 2);
            }else{
                int pilihan = JOptionPane.showConfirmDialog(this," Apakah anda yakin ingin menghapus data ini?",
                    "Konfirmasi",JOptionPane.WARNING_MESSAGE);
                if(pilihan == JOptionPane.YES_OPTION){
                    String sql = "DELETE FROM login_multiuser WHERE username =?";
                    java.sql.Connection conn = (Connection)Konfig.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setString(1, txtuser.getText());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Hapus sukses!");
                }else{
                    System.out.println("Salah!");
                }
                
            } 
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        showPenggunaTableData();
        kosongkanFormPengguna();
    }//GEN-LAST:event_btnHapusMouseReleased

    private void btnEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseEntered
        btnEdit.setBackground(new Color(89, 95, 207));
        lblEdit.setForeground(new Color(230, 230, 230));
    }//GEN-LAST:event_btnEditMouseEntered

    private void btnEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseExited
        btnEdit.setBackground(new Color(255, 255, 255));
        lblEdit.setForeground(new Color(89, 95, 207));
    }//GEN-LAST:event_btnEditMouseExited

    private void btnEditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMousePressed
        btnEdit.setBackground(new Color(62, 70, 182));
        lblEdit.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnEditMousePressed

    private void btnEditMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseReleased
        btnEdit.setBackground(new Color(255, 255, 255));
        lblEdit.setForeground(new Color(62, 70, 182));

        try {
            int selectedRow = penggunaTable.getSelectedRow();
            if(selectedRow == -1){
            showMessage("Pilih baris dahulu!", 2);
            }else{
                String sql = "UPDATE login_multiuser SET username=?,password=?,nama_lengkap=?,level=? WHERE id_pengguna=?";
                java.sql.Connection conn = (Connection)Konfig.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(5, txtpengguna.getText());
                pst.setString(1, txtuser.getText());
                pst.setString(2, txtpass.getText());
                pst.setString(3, txtnama.getText());
                pst.setString(4, (String) cbuser.getSelectedItem());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Update sukses!");
            }
            
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        showPenggunaTableData();
        kosongkanFormPengguna();
    }//GEN-LAST:event_btnEditMouseReleased

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked

    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void penggunaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penggunaTableMouseClicked
        int baris = penggunaTable.rowAtPoint(evt.getPoint());

        String id_pengguna = penggunaTable.getValueAt(baris, 0).toString();
        txtpengguna.setText(id_pengguna);
        String username = penggunaTable.getValueAt(baris, 1).toString();
        txtuser.setText(username);
        String password = penggunaTable.getValueAt(baris, 2).toString();
        txtpass.setText(password);
        String nama = penggunaTable.getValueAt(baris, 3).toString();
        txtnama.setText(nama);
        String level = penggunaTable.getValueAt(baris, 4).toString();
        cbuser.setSelectedItem(level);
    }//GEN-LAST:event_penggunaTableMouseClicked

    private void btnDaftarKueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDaftarKueMouseEntered
        btnDaftarKue.setBackground(new Color(89, 95, 207));
        lblDaftarKue.setForeground(new Color(230, 230, 230));
    }//GEN-LAST:event_btnDaftarKueMouseEntered

    private void btnDaftarKueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDaftarKueMouseExited
        btnDaftarKue.setBackground(new Color(255, 255, 255));
        lblDaftarKue.setForeground(new Color(89, 95, 207));
    }//GEN-LAST:event_btnDaftarKueMouseExited

    private void btnDaftarKueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDaftarKueMousePressed
        btnDaftarKue.setBackground(new Color(62, 70, 182));
        lblDaftarKue.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnDaftarKueMousePressed

    private void btnDaftarKueMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDaftarKueMouseReleased
        btnDaftarKue.setBackground(new Color(255, 255, 255));
        lblDaftarKue.setForeground(new Color(62, 70, 182));

        // remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        // add panel
        mainPanel.add(daftarkuePanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnDaftarKueMouseReleased

    private void btnSimpan1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpan1MouseEntered
        btnSimpan1.setBackground(new Color(89, 95, 207));
        lblSimpan1.setForeground(new Color(230, 230, 230));
    }//GEN-LAST:event_btnSimpan1MouseEntered

    private void btnSimpan1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpan1MouseExited
        btnSimpan1.setBackground(new Color(255, 255, 255));
        lblSimpan1.setForeground(new Color(89, 95, 207));
    }//GEN-LAST:event_btnSimpan1MouseExited

    private void btnSimpan1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpan1MousePressed
        btnSimpan1.setBackground(new Color(62, 70, 182));
        lblSimpan1.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnSimpan1MousePressed

    private void btnSimpan1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpan1MouseReleased
        btnSimpan1.setBackground(new Color(255, 255, 255));
        lblSimpan1.setForeground(new Color(62, 70, 182));
        
        try{
            String sql = "INSERT INTO alat VALUES ('"+txtIDAlat1.getText()+"','"+txtNamaAlat1.getText()+"','"+txtHarga1.getText()+"')";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Simpan data BERHASIL!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, "Simpan data GAGAL, isi data kolom dengan benar!");
        }
        kosongkanFormDaftarKue();
        showDaftarKueTableData1();
        showDaftarKueTableData();
    }//GEN-LAST:event_btnSimpan1MouseReleased

    private void btnHapus1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapus1MouseEntered
        btnHapus1.setBackground(new Color(89, 95, 207));
        lblEdit1.setForeground(new Color(230, 230, 230));
    }//GEN-LAST:event_btnHapus1MouseEntered

    private void btnHapus1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapus1MouseExited
        btnHapus1.setBackground(new Color(255, 255, 255));
        lblEdit1.setForeground(new Color(89, 95, 207));
    }//GEN-LAST:event_btnHapus1MouseExited

    private void btnHapus1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapus1MousePressed
        btnHapus1.setBackground(new Color(62, 70, 182));
        lblEdit1.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnHapus1MousePressed

    private void btnHapus1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapus1MouseReleased
        btnHapus1.setBackground(new Color(255, 255, 255));
        lblEdit1.setForeground(new Color(62, 70, 182));
        
        try {
            int selectedRow = kueTable1.getSelectedRow();
            if(selectedRow == -1){
            showMessage("pilih baris dulu", 2);
            }else{
                int pilihan = JOptionPane.showConfirmDialog(this," Apakah anda yakin ingin menghapus data ini?",
                    "Konfirmasi",JOptionPane.WARNING_MESSAGE);
                if(pilihan == JOptionPane.YES_OPTION){
                    String sql = "DELETE FROM alat WHERE id_alat =?";
                    java.sql.Connection conn = (Connection)Konfig.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setString(1, txtIDAlat1.getText());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Hapus sukses!");
                }else{
                    System.out.println("Salah");
                }
                
            } 
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        showDaftarKueTableData1();
        kosongkanFormDaftarKue();
    }//GEN-LAST:event_btnHapus1MouseReleased

    private void btnHapusText1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusText1MouseEntered
        btnHapusText1.setBackground(new Color(89, 95, 207));
        lblRefresh1.setForeground(new Color(230, 230, 230));
    }//GEN-LAST:event_btnHapusText1MouseEntered

    private void btnHapusText1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusText1MouseExited
        btnHapusText1.setBackground(new Color(255, 255, 255));
        lblRefresh1.setForeground(new Color(89, 95, 207));
    }//GEN-LAST:event_btnHapusText1MouseExited

    private void btnHapusText1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusText1MousePressed
        btnHapusText1.setBackground(new Color(62, 70, 182));
        lblRefresh1.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnHapusText1MousePressed

    private void btnHapusText1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusText1MouseReleased
        btnHapusText1.setBackground(new Color(255, 255, 255));
        lblRefresh1.setForeground(new Color(62, 70, 182));
        
        showDaftarKueTableData1();
        kosongkanFormDaftarKue();
    }//GEN-LAST:event_btnHapusText1MouseReleased

    private void kueTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kueTable1MouseClicked
        int baris = kueTable1.rowAtPoint(evt.getPoint());

        String id_kue = kueTable1.getValueAt(baris, 0).toString();
        txtIDAlat1.setText(id_kue);
        String nama = kueTable1.getValueAt(baris, 1).toString();
        txtNamaAlat1.setText(nama);
        String harga = kueTable1.getValueAt(baris, 2).toString();
        txtHarga1.setText(harga);
        
    }//GEN-LAST:event_kueTable1MouseClicked

    private void btnEdit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEdit1MouseEntered
        btnEdit1.setBackground(new Color(89, 95, 207));
        lblHapus1.setForeground(new Color(230, 230, 230));
    }//GEN-LAST:event_btnEdit1MouseEntered

    private void btnEdit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEdit1MouseExited
        btnEdit1.setBackground(new Color(255, 255, 255));
        lblHapus1.setForeground(new Color(89, 95, 207));
    }//GEN-LAST:event_btnEdit1MouseExited

    private void btnEdit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEdit1MousePressed
        btnEdit1.setBackground(new Color(62, 70, 182));
        lblHapus1.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnEdit1MousePressed

    private void btnEdit1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEdit1MouseReleased
        btnEdit1.setBackground(new Color(255, 255, 255));
        lblHapus1.setForeground(new Color(62, 70, 182));
        
        try {
            int selectedRow = kueTable1.getSelectedRow();
            if(selectedRow == -1){
            showMessage("Pilih baris dahulu!", 2);
            }else{
                String sql = "UPDATE alat SET nama=?,harga=? WHERE id_alat=?";
                java.sql.Connection conn = (Connection)Konfig.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(3, txtIDAlat1.getText());
                pst.setString(1, txtNamaAlat1.getText());
                pst.setString(2, txtHarga1.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Update sukses!");
            } 
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        showDaftarKueTableData1();
        kosongkanFormDaftarKue();
    }//GEN-LAST:event_btnEdit1MouseReleased

    private void btnHapusTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusTextMouseEntered
        btnHapusText.setBackground(new Color(89, 95, 207));
        lblHapusText.setForeground(new Color(230, 230, 230));
    }//GEN-LAST:event_btnHapusTextMouseEntered

    private void btnHapusTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusTextMouseExited
        btnHapusText.setBackground(new Color(255, 255, 255));
        lblHapusText.setForeground(new Color(89, 95, 207));
    }//GEN-LAST:event_btnHapusTextMouseExited

    private void btnHapusTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusTextMousePressed
        btnHapusText.setBackground(new Color(62, 70, 182));
        lblHapusText.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnHapusTextMousePressed

    private void btnHapusTextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusTextMouseReleased
        btnHapusText.setBackground(new Color(255, 255, 255));
        lblHapusText.setForeground(new Color(62, 70, 182));

        kosongkanFormPengguna();
        showPenggunaTableData();
    }//GEN-LAST:event_btnHapusTextMouseReleased

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
            showMessage("Pilih baris dahulu!", 2);
            }else{
                int pilihan = JOptionPane.showConfirmDialog(this," Apakah anda yakin ingin menghapus data ini?",
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

    private void txtidalatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidalatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidalatActionPerformed

    private void penjualantableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penjualantableMouseClicked
        int baris = penjualantable.rowAtPoint(evt.getPoint());

        String id_nota = penjualantable.getValueAt(baris, 0).toString();
        txtidnota.setText(id_nota);

    }//GEN-LAST:event_penjualantableMouseClicked

    private void jScrollPane5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane5MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel btnDaftarKue;
    private javax.swing.JPanel btnEdit;
    private javax.swing.JPanel btnEdit1;
    private javax.swing.JPanel btnHapus;
    private javax.swing.JPanel btnHapus1;
    private javax.swing.JPanel btnHapusText;
    private javax.swing.JPanel btnHapusText1;
    private javax.swing.JPanel btnInfoAplikasi;
    private javax.swing.JPanel btnLogout;
    private javax.swing.JPanel btnPengguna;
    private javax.swing.JPanel btnPenjualan;
    private javax.swing.JPanel btnSimpan;
    private javax.swing.JPanel btnSimpan1;
    private javax.swing.JButton btnbayar;
    private javax.swing.JButton btnbayar1;
    private javax.swing.JButton btnhapuspenjualan;
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JComboBox<String> cbuser;
    private javax.swing.JPanel daftarkuePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable kueTable;
    private javax.swing.JTable kueTable1;
    private javax.swing.JLabel lblDaftarKue;
    private javax.swing.JLabel lblEdit;
    private javax.swing.JLabel lblEdit1;
    private javax.swing.JLabel lblHapus;
    private javax.swing.JLabel lblHapus1;
    private javax.swing.JLabel lblHapusText;
    private javax.swing.JLabel lblHarga1;
    private javax.swing.JLabel lblHargaKue;
    private javax.swing.JLabel lblIDKue;
    private javax.swing.JLabel lblIDKue1;
    private javax.swing.JLabel lblIDNota;
    private javax.swing.JLabel lblIDPelanggan;
    private javax.swing.JLabel lblInfoAplikasi;
    private javax.swing.JLabel lblJumlahKue;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblNamaKue;
    private javax.swing.JLabel lblNamaKue1;
    private javax.swing.JLabel lblPengguna;
    private javax.swing.JLabel lblPenggunaView;
    private javax.swing.JLabel lblPenjualan;
    private javax.swing.JLabel lblPenjualanView;
    private javax.swing.JLabel lblRefresh1;
    private javax.swing.JLabel lblSimpan;
    private javax.swing.JLabel lblSimpan1;
    private javax.swing.JLabel lblTanggalAmbil;
    private javax.swing.JLabel lblTanggalPesan;
    private javax.swing.JLabel lblTotalHarga;
    private javax.swing.JLabel lblTotalHarga1;
    private javax.swing.JLabel lblTotalHarga2;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lbllevel;
    private javax.swing.JLabel lblnamalengkap;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lbluser;
    private javax.swing.JLabel lbluser1;
    private javax.swing.JLabel logoToko;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel namaToko1;
    private javax.swing.JPanel penggunaPanel;
    private javax.swing.JTable penggunaTable;
    private javax.swing.JPanel penjualanPanel;
    private javax.swing.JTable penjualantable;
    private javax.swing.JTextField txtHarga1;
    private javax.swing.JTextField txtIDAlat1;
    private javax.swing.JTextField txtNamaAlat1;
    private javax.swing.JTextField txthargaalat;
    private javax.swing.JTextField txtidalat;
    private javax.swing.JTextField txtidnota;
    private javax.swing.JTextField txtjumlahalat;
    private javax.swing.JTextField txtjumlahbayar;
    private javax.swing.JTextField txtkembalian;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnamaalat;
    private javax.swing.JTextField txtnamapelanggan;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtpengguna;
    private javax.swing.JTextField txttanggalambil;
    private javax.swing.JTextField txttanggalpesan;
    private javax.swing.JTextField txttotalharga;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
