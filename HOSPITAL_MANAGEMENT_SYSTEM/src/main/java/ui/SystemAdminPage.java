
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shashank
 */
public class SystemAdminPage extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminPage
     */
    public SystemAdminPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        lblHospitalAdminPage = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblAddNewHospital = new javax.swing.JLabel();
        lblHospitalName = new javax.swing.JLabel();
        lblHospitalAddress = new javax.swing.JLabel();
        txtHospitalAddress = new javax.swing.JTextField();
        lblHospitalCity = new javax.swing.JLabel();
        txtHospitalCity = new javax.swing.JTextField();
        lblHospitalZipCode = new javax.swing.JLabel();
        txtHospitalZipCode = new javax.swing.JTextField();
        lblHospitalPhone = new javax.swing.JLabel();
        txtHospitalPhone = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtHospitalName = new javax.swing.JTextField();
        lblHospitalDetails = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospitalDetails = new javax.swing.JTable();
        lblHospitalEmail = new javax.swing.JLabel();
        txtHospitalEmail = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHospitalDetails1 = new javax.swing.JTable();
        btnView1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnView2 = new javax.swing.JButton();
        btnView3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblHospitalDetails3 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        lblHospitalAdminPage.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblHospitalAdminPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospitalAdminPage.setText("HOSPITAL PAGE");

        lblAddNewHospital.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblAddNewHospital.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddNewHospital.setText("Add New Hospital");

        lblHospitalName.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblHospitalName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospitalName.setText("Hospital Name");
        lblHospitalName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblHospitalAddress.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblHospitalAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospitalAddress.setText("Address");
        lblHospitalAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblHospitalCity.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblHospitalCity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospitalCity.setText("City");
        lblHospitalCity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblHospitalZipCode.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblHospitalZipCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospitalZipCode.setText("Zip Code");
        lblHospitalZipCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblHospitalPhone.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblHospitalPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospitalPhone.setText("Phone");
        lblHospitalPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSave.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblHospitalDetails.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblHospitalDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospitalDetails.setText("Hospital Details");

        tblHospitalDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblHospitalDetails.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblHospitalDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "City", "Zip Code", "Phone", "Email"
            }
        ));
        tblHospitalDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHospitalDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHospitalDetails);

        lblHospitalEmail.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblHospitalEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospitalEmail.setText("Email");
        lblHospitalEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtHospitalEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalEmailActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnView.setText("View");
        btnView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewMouseClicked(evt);
            }
        });
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblHospitalAdminPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jSeparator1)))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lblAddNewHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257)
                .addComponent(lblHospitalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblHospitalEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(369, 369, 369)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblHospitalCity, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtHospitalCity, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblHospitalZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtHospitalZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHospitalAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHospitalAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHospitalPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHospitalEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHospitalPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(224, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHospitalAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddNewHospital)
                    .addComponent(lblHospitalDetails))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHospitalName))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHospitalAddress)
                            .addComponent(lblHospitalAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHospitalCity)
                            .addComponent(lblHospitalCity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHospitalZipCode)
                            .addComponent(lblHospitalZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHospitalPhone)
                            .addComponent(lblHospitalPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHospitalEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHospitalEmail))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnView)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnClear))
                .addGap(319, 319, 319))
        );

        jTabbedPane2.addTab("Create Hospital", jPanel5);

        tblHospitalDetails1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblHospitalDetails1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblHospitalDetails1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "City", "Zip Code", "Phone", "Email"
            }
        ));
        tblHospitalDetails1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHospitalDetails1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblHospitalDetails1);

        btnView1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnView1.setText("View");
        btnView1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnView1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnView1MouseClicked(evt);
            }
        });
        btnView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView1ActionPerformed(evt);
            }
        });

        btnDelete1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnDelete1.setText("Delete");
        btnDelete1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(btnView1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView1)
                    .addComponent(btnDelete1))
                .addGap(0, 505, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("View/Delete Hospital", jPanel6);

        btnView2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnView2.setText("View");
        btnView2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnView2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnView2MouseClicked(evt);
            }
        });
        btnView2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView2ActionPerformed(evt);
            }
        });

        btnView3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnView3.setText("Update");
        btnView3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnView3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnView3MouseClicked(evt);
            }
        });
        btnView3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView3ActionPerformed(evt);
            }
        });

        tblHospitalDetails3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblHospitalDetails3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblHospitalDetails3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "City", "Zip Code", "Phone", "Email"
            }
        ));
        tblHospitalDetails3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHospitalDetails3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblHospitalDetails3);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(btnView2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(btnView3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView2)
                    .addComponent(btnView3))
                .addContainerGap(514, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Update Hospital", jPanel7);

        jTabbedPane1.addTab("Hospital", jTabbedPane2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1302, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 863, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Doctor", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1302, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 863, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Community", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1302, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 863, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Patient", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1302, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 863, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Person", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // DELETE functionality code here:
        int selectedRowIndex = tblHospitalDetails.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        // invoke the table model
        DefaultTableModel tblModel = (DefaultTableModel) tblHospitalDetails.getModel();
        //Hospital selectedHospital = (Hospital) tblModel.getValueAt(selectedRowIndex, 0);
        //directory.deleteHospital(selectedHospital);
        JOptionPane.showMessageDialog(this, "Hospital data successfully deleted from the hospital directory");

        //populateTable();
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView1ActionPerformed
        // VIEW button code here:
        //populateDetails(tblHospitalDetails);
    }//GEN-LAST:event_btnView1ActionPerformed

    private void btnView1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnView1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnView1MouseClicked

    private void tblHospitalDetails1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHospitalDetails1MouseClicked
        // Hospital details table mouse click event code here:
        // when row is selected, data will set to textfield for update
        //populateDetails(tblHospitalDetails);

        //        int selectedRowIndex = tblHospitalDetails.getSelectedRow();
        //        // invoke the table model
        //        DefaultTableModel tblModel = (DefaultTableModel) tblHospitalDetails.getModel();
        //        // get value from respective fields and set it to String Attributes
        //
        //        txtHospitalName.setText(tblModel.getValueAt(selectedRowIndex, 0).toString());
        //        txtHospitalAddress.setText(tblModel.getValueAt(selectedRowIndex, 1).toString());
        //        txtHospitalCity.setText(tblModel.getValueAt(selectedRowIndex, 2).toString());
        //        txtHospitalZipCode.setText(tblModel.getValueAt(selectedRowIndex, 3).toString());
        //        txtHospitalPhone.setText(tblModel.getValueAt(selectedRowIndex, 4).toString());
        //        txtHospitalEmail.setText(tblModel.getValueAt(selectedRowIndex, 5).toString());
    }//GEN-LAST:event_tblHospitalDetails1MouseClicked

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // VIEW button code here:
        //populateDetails(tblHospitalDetails);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // CANCEL or CLEAR button code here:
        // call function to clear input fields
        //clearfields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtHospitalEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalEmailActionPerformed

    private void tblHospitalDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHospitalDetailsMouseClicked
        // Hospital details table mouse click event code here:
        // when row is selected, data will set to textfield for update
        //populateDetails(tblHospitalDetails);

        //        int selectedRowIndex = tblHospitalDetails.getSelectedRow();
        //        // invoke the table model
        //        DefaultTableModel tblModel = (DefaultTableModel) tblHospitalDetails.getModel();
        //        // get value from respective fields and set it to String Attributes
        //
        //        txtHospitalName.setText(tblModel.getValueAt(selectedRowIndex, 0).toString());
        //        txtHospitalAddress.setText(tblModel.getValueAt(selectedRowIndex, 1).toString());
        //        txtHospitalCity.setText(tblModel.getValueAt(selectedRowIndex, 2).toString());
        //        txtHospitalZipCode.setText(tblModel.getValueAt(selectedRowIndex, 3).toString());
        //        txtHospitalPhone.setText(tblModel.getValueAt(selectedRowIndex, 4).toString());
        //        txtHospitalEmail.setText(tblModel.getValueAt(selectedRowIndex, 5).toString());
    }//GEN-LAST:event_tblHospitalDetailsMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //         SAVE button action performed code here:
//        hospital = directory.addNewHospital();
//
//        hospital.setHospitalName(txtHospitalName.getText());
//        hospital.setAddress(txtHospitalAddress.getText());
//        hospital.setCity(txtHospitalCity.getText());
//        hospital.setZipCode(txtHospitalZipCode.getText());
//        hospital.setPhone(txtHospitalPhone.getText());
//        hospital.setEmail(txtHospitalEmail.getText());
//
//        populateTable();

        //clear text for new entries
        txtHospitalName.setText("");
        txtHospitalAddress.setText("");
        txtHospitalCity.setText("");
        txtHospitalZipCode.setText("");
        txtHospitalPhone.setText("");
        txtHospitalEmail.setText("");
        JOptionPane.showMessageDialog(this, "Hospital details successfully added to the hospital directory");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnView2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnView2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnView2MouseClicked

    private void btnView2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnView2ActionPerformed

    private void btnView3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnView3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnView3MouseClicked

    private void btnView3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnView3ActionPerformed

    private void tblHospitalDetails3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHospitalDetails3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblHospitalDetails3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnView1;
    private javax.swing.JButton btnView2;
    private javax.swing.JButton btnView3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblAddNewHospital;
    private javax.swing.JLabel lblHospitalAddress;
    private javax.swing.JLabel lblHospitalAdminPage;
    private javax.swing.JLabel lblHospitalCity;
    private javax.swing.JLabel lblHospitalDetails;
    private javax.swing.JLabel lblHospitalEmail;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblHospitalPhone;
    private javax.swing.JLabel lblHospitalZipCode;
    private javax.swing.JTable tblHospitalDetails;
    private javax.swing.JTable tblHospitalDetails1;
    private javax.swing.JTable tblHospitalDetails3;
    private javax.swing.JTextField txtHospitalAddress;
    private javax.swing.JTextField txtHospitalCity;
    private javax.swing.JTextField txtHospitalEmail;
    public javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtHospitalPhone;
    private javax.swing.JTextField txtHospitalZipCode;
    // End of variables declaration//GEN-END:variables
}
