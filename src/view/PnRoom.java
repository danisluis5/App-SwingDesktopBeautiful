/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerLoaiPhong;
import controller.ControllerRoom;
import controller.ControllerTang;
import render.TinhTrangComboboxModel;
import render.TrangThaiComboboxModel;

/**
 *
 * @author vuongluis
 */
public class PnRoom extends javax.swing.JPanel {

    /**
     * Creates new form pnRoom
     */
    private ControllerRoom controller;
    private ControllerTang controllerTang;
    private ControllerLoaiPhong controllerLoaiPhong;
    
    public PnRoom() {
        initComponents();
        controller = new ControllerRoom(tbMain);
        controllerTang = new ControllerTang(tbMain);
        controllerLoaiPhong = new ControllerLoaiPhong(tbMain);
        
        controller.loadTable();
        controllerTang.loadCategory(this.cbTang, false, null);
        controllerTang.loadCategory(this.cbTangF, true, null);
        controllerLoaiPhong.loadCategory(this.cbLoaiPhong, false, null);
        controllerLoaiPhong.loadCategory(this.cbLoaiPhongF, true, null);
        
        this.cbTinhTrang.setModel(new TinhTrangComboboxModel());
        this.cbTrangThai.setModel(new TrangThaiComboboxModel());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        LeftRoom = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfSoPhong = new javax.swing.JTextField();
        tfId = new javax.swing.JTextField();
        cbTrangThai = new javax.swing.JComboBox<>();
        cbLoaiPhong = new javax.swing.JComboBox();
        cbTang = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfGhiChu = new javax.swing.JTextArea();
        cbTinhTrang = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnNhapLai = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        RightRoom = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        cbLoaiPhongF = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        cbTangF = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        closeF = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMain = new javax.swing.JTable();

        setBackground(new java.awt.Color(242, 242, 242));
        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBackground(new java.awt.Color(242, 242, 242));
        jSplitPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSplitPane1.setDividerSize(6);
        jSplitPane1.setForeground(new java.awt.Color(0, 102, 255));
        jSplitPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSplitPane1.setOneTouchExpandable(true);

        LeftRoom.setBackground(new java.awt.Color(242, 242, 242));
        LeftRoom.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin chi tiết phòng", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N
        LeftRoom.setMinimumSize(new java.awt.Dimension(325, 478));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Số thứ tự:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tình trạng:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Số phòng:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Trạng thái:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Loại phòng:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Chọn tầng:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Ghi chú:");

        tfSoPhong.setPreferredSize(new java.awt.Dimension(59, 24));

        tfId.setEditable(false);
        tfId.setPreferredSize(new java.awt.Dimension(59, 24));

        cbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTrangThai.setPreferredSize(new java.awt.Dimension(56, 24));

        cbLoaiPhong.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbLoaiPhong.setPreferredSize(new java.awt.Dimension(56, 24));

        cbTang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTang.setPreferredSize(new java.awt.Dimension(56, 24));

        tfGhiChu.setColumns(20);
        tfGhiChu.setLineWrap(true);
        tfGhiChu.setRows(5);
        tfGhiChu.setWrapStyleWord(true);
        jScrollPane2.setViewportView(tfGhiChu);

        cbTinhTrang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTinhTrang.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbTinhTrang.setPreferredSize(new java.awt.Dimension(56, 24));

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-icon.gif"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel6.add(btnThem);

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-icon.gif"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel6.add(btnSua);

        btnNhapLai.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNhapLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.gif"))); // NOI18N
        btnNhapLai.setText("Nhập lại");
        btnNhapLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapLaiActionPerformed(evt);
            }
        });
        jPanel6.add(btnNhapLai);

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del.gif"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel6.add(btnXoa);

        javax.swing.GroupLayout LeftRoomLayout = new javax.swing.GroupLayout(LeftRoom);
        LeftRoom.setLayout(LeftRoomLayout);
        LeftRoomLayout.setHorizontalGroup(
            LeftRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftRoomLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(LeftRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftRoomLayout.createSequentialGroup()
                        .addComponent(tfId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70))
                    .addComponent(tfSoPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbTrangThai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbLoaiPhong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbTang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbTinhTrang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
            .addGroup(LeftRoomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LeftRoomLayout.setVerticalGroup(
            LeftRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftRoomLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(LeftRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(LeftRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfSoPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(LeftRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(LeftRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(LeftRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(LeftRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbTang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane1.setLeftComponent(LeftRoom);

        RightRoom.setBackground(new java.awt.Color(242, 242, 242));
        RightRoom.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách phòng của khách sạn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N
        RightRoom.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(242, 242, 242));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm thông tin", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(242, 242, 242));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Mã phòng:");

        jTextField3.setPreferredSize(new java.awt.Dimension(59, 24));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Số phòng:");

        jTextField4.setPreferredSize(new java.awt.Dimension(59, 24));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Tình trạng:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Trạng thái:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Chọn loại phòng:");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox5.setPreferredSize(new java.awt.Dimension(56, 24));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox6.setPreferredSize(new java.awt.Dimension(56, 24));

        cbLoaiPhongF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbLoaiPhongF.setPreferredSize(new java.awt.Dimension(56, 24));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Chọn tầng:");

        cbTangF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTangF.setPreferredSize(new java.awt.Dimension(56, 24));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox5, 0, 267, Short.MAX_VALUE)
                            .addComponent(cbLoaiPhongF, 0, 1, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTangF, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbLoaiPhongF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cbTangF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(242, 242, 242));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(242, 242, 242)));
        jPanel5.setLayout(new java.awt.GridLayout(3, 1, 15, 15));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iSearch.png"))); // NOI18N
        jButton1.setText("Tìm kiếm ");
        jPanel5.add(jButton1);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iReset.png"))); // NOI18N
        jButton2.setText("Nhập lại");
        jPanel5.add(jButton2);

        closeF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        closeF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iClose.png"))); // NOI18N
        closeF.setText("Đóng");
        closeF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeFActionPerformed(evt);
            }
        });
        jPanel5.add(closeF);

        jPanel3.add(jPanel5, java.awt.BorderLayout.EAST);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        RightRoom.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tbMain.setAutoCreateRowSorter(true);
        tbMain.setModel(new javax.swing.table.DefaultTableModel(
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
        tbMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbMainMousePressed(evt);
            }
        });
        tbMain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbMainKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbMain);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        RightRoom.add(jPanel2, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(RightRoom);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void closeFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeFActionPerformed
        jPanel1.setVisible(false);
    }//GEN-LAST:event_closeFActionPerformed

    private void tbMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMainMousePressed
        // TODO add your handling code here:
        setForm();
    }//GEN-LAST:event_tbMainMousePressed

    private void tbMainKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbMainKeyReleased
        // TODO add your handling code here:
        setForm();
    }//GEN-LAST:event_tbMainKeyReleased

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnNhapLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapLaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNhapLaiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeftRoom;
    private javax.swing.JPanel RightRoom;
    private javax.swing.JButton btnNhapLai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox cbLoaiPhong;
    private javax.swing.JComboBox cbLoaiPhongF;
    private javax.swing.JComboBox cbTang;
    private javax.swing.JComboBox cbTangF;
    private javax.swing.JComboBox cbTinhTrang;
    private javax.swing.JComboBox<String> cbTrangThai;
    private javax.swing.JButton closeF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable tbMain;
    private javax.swing.JTextArea tfGhiChu;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfSoPhong;
    // End of variables declaration//GEN-END:variables

    private void setForm() {
        int row = tbMain.getSelectedRow();
        String id = tbMain.getValueAt(row, 0).toString();
        String name = tbMain.getValueAt(row, 1).toString();
        cbTinhTrang.setModel(new TinhTrangComboboxModel((String) tbMain.getValueAt(row, 2)));
        cbTrangThai.setModel(new TrangThaiComboboxModel((String) tbMain.getValueAt(row, 3)));
        
        tfId.setText(id);
        tfSoPhong.setText(name);
        tfGhiChu.setText(tbMain.getValueAt(row, 4).toString());
        
        
    }
}
