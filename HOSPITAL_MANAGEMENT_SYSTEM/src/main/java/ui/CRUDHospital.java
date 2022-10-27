
package ui;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shashank
 */
public class CRUDHospital extends javax.swing.JFrame {

    /**
     * Creates new form CRUDHospital
     */
    public CRUDHospital() {
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

        splitPane = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        controlPanel = new javax.swing.JPanel();
        BtnHome = new javax.swing.JButton();
        BtnHospitalAdmin = new javax.swing.JButton();
        BtnSystemAdmin = new javax.swing.JButton();
        BtnCommunityAdmin = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblHospitalAdminLogin = new javax.swing.JLabel();
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
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCreateDoctor = new javax.swing.JButton();
        btnViewDoctor = new javax.swing.JButton();
        btnCreatePatient = new javax.swing.JButton();
        btnViewPatient = new javax.swing.JButton();
        lblHospitalEmail = new javax.swing.JLabel();
        txtHospitalEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));

        BtnHome.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BtnHome.setText("Home");
        BtnHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnHomeMouseClicked(evt);
            }
        });
        BtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHomeActionPerformed(evt);
            }
        });

        BtnHospitalAdmin.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BtnHospitalAdmin.setText("Community Admin");
        BtnHospitalAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnHospitalAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHospitalAdminActionPerformed(evt);
            }
        });

        BtnSystemAdmin.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BtnSystemAdmin.setText("Hospital Admin");
        BtnSystemAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnSystemAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSystemAdminActionPerformed(evt);
            }
        });

        BtnCommunityAdmin.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BtnCommunityAdmin.setText("System Admin");
        BtnCommunityAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnCommunityAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCommunityAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnSystemAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCommunityAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnHospitalAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(BtnHome)
                .addGap(34, 34, 34)
                .addComponent(BtnSystemAdmin)
                .addGap(35, 35, 35)
                .addComponent(BtnHospitalAdmin)
                .addGap(35, 35, 35)
                .addComponent(BtnCommunityAdmin)
                .addContainerGap(365, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jSplitPane1.setLeftComponent(jPanel3);

        lblHospitalAdminLogin.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblHospitalAdminLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospitalAdminLogin.setText("HOSPITAL DATABASE");

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
        tblHospitalDetails.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        tblHospitalDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                " Name", "Address", "City", "Zip Code", "Phone", "Email"
            }
        ));
        tblHospitalDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHospitalDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHospitalDetails);

        btnUpdate.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCreateDoctor.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnCreateDoctor.setText("Create Doctor");
        btnCreateDoctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
            }
        });

        btnViewDoctor.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnViewDoctor.setText("View Doctor");
        btnViewDoctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnViewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDoctorActionPerformed(evt);
            }
        });

        btnCreatePatient.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnCreatePatient.setText("Create Patient");
        btnCreatePatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });

        btnViewPatient.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnViewPatient.setText("View Patient");
        btnViewPatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });

        lblHospitalEmail.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblHospitalEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospitalEmail.setText("Email");
        lblHospitalEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtHospitalEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblHospitalAdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jSeparator1)))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblAddNewHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257)
                .addComponent(lblHospitalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHospitalEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 289, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnCreatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnViewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnCreateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(98, 98, 98))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblHospitalCity, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtHospitalCity, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblHospitalZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtHospitalZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHospitalAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHospitalAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblHospitalPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHospitalEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHospitalPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHospitalAdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddNewHospital)
                    .addComponent(lblHospitalDetails))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHospitalName))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHospitalAddress)
                            .addComponent(lblHospitalAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHospitalCity)
                            .addComponent(lblHospitalCity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHospitalZipCode)
                            .addComponent(lblHospitalZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHospitalPhone)
                            .addComponent(lblHospitalPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHospitalEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHospitalEmail)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnSave))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreateDoctor)
                            .addComponent(btnViewDoctor))))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreatePatient)
                    .addComponent(btnViewPatient))
                .addGap(252, 252, 252))
        );

        jSplitPane1.setRightComponent(jPanel4);

        javax.swing.GroupLayout splitPaneLayout = new javax.swing.GroupLayout(splitPane);
        splitPane.setLayout(splitPaneLayout);
        splitPaneLayout.setHorizontalGroup(
            splitPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        splitPaneLayout.setVerticalGroup(
            splitPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHomeActionPerformed
        // HOME button action performed code here:
        MainJFrame obj = new MainJFrame();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_BtnHomeActionPerformed

    private void BtnHospitalAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHospitalAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnHospitalAdminActionPerformed

    private void BtnSystemAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSystemAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSystemAdminActionPerformed

    private void BtnCommunityAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCommunityAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCommunityAdminActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // SAVE button action performed code here:
        // code to load data into table with no null validations
        
        if (txtHospitalName.getText().equals(" ")|| txtHospitalAddress.getText().equals(" ") || txtHospitalCity.getText().equals(" ")|| txtHospitalZipCode.getText().equals(" ")|| txtHospitalPhone.getText().equals(" ")|| txtHospitalEmail.getText().equals(" ")){
            JOptionPane.showMessageDialog(this, "No field should be empty");
        }
        else{
                String data[] = {txtHospitalName.getText(), txtHospitalAddress.getText(), txtHospitalCity.getText(), txtHospitalZipCode.getText(), txtHospitalPhone.getText(), txtHospitalEmail.getText()};
                DefaultTableModel tblModel = (DefaultTableModel)tblHospitalDetails.getModel(); 
                // add string array data
                tblModel.addRow(data);
                JOptionPane.showMessageDialog(rootPane, "Hospital details added successfully!");
                
                
                //clear text for new entries
                
                txtHospitalName.setText(" ");
                txtHospitalAddress.setText(" ");
                txtHospitalCity.setText(" ");
                txtHospitalZipCode.setText(" ");
                txtHospitalPhone.setText(" ");
                txtHospitalEmail.setText(" ");
        
        }
        
        
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // UPDATE functionality code here:
        // once data is set on textfield apply update operation
        
        // Get table model
        DefaultTableModel tblModel = (DefaultTableModel)tblHospitalDetails.getModel();
        if(tblHospitalDetails.getSelectedRowCount()== 1){
            // if single row is selected
            String HospitalName = txtHospitalName.getText();
            String HospitalAddress = txtHospitalAddress.getText();
            String HospitalCity = txtHospitalCity.getText();
            String HospitalZipCode = txtHospitalZipCode.getText();
            String HospitalPhone = txtHospitalPhone.getText();
            String HospitalEmail = txtHospitalEmail.getText();
            
            // set updated value on the table row
            tblModel.setValueAt(HospitalName, tblHospitalDetails.getSelectedRow(), 0);
            tblModel.setValueAt(HospitalAddress, tblHospitalDetails.getSelectedRow(), 1);
            tblModel.setValueAt(HospitalCity, tblHospitalDetails.getSelectedRow(), 2);
            tblModel.setValueAt(HospitalZipCode, tblHospitalDetails.getSelectedRow(), 3);
            tblModel.setValueAt(HospitalPhone, tblHospitalDetails.getSelectedRow(), 4);
            tblModel.setValueAt(HospitalEmail, tblHospitalDetails.getSelectedRow(), 5);
            
            JOptionPane.showMessageDialog(this, "Data successfully updated!");
           
        }
        
        else {
            if (tblHospitalDetails.getSelectedRowCount()== 0){
                JOptionPane.showMessageDialog(this, "Table is empty");
            }
            else{
                JOptionPane.showMessageDialog(this, "Please select a single row to update");
            }
        }
        
       
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // DELETE functionality code here:
        int i = tblHospitalDetails.getSelectedRow();
        if(i>0){
            DefaultTableModel tblModel = (DefaultTableModel)tblHospitalDetails.getModel();
            tblModel.removeRow(i);
            JOptionPane.showMessageDialog(rootPane, "Data deletion successful!");
        
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row to delete");
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed
        // CREATE doctor directing to next page here:
        CreateDoctor obj = new CreateDoctor();
        obj.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_btnCreateDoctorActionPerformed

    private void btnViewDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewDoctorActionPerformed

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreatePatientActionPerformed

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewPatientActionPerformed

    private void txtHospitalEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalEmailActionPerformed

    private void BtnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHomeMouseClicked
        // HOME button mouse clicked code here:
        MainJFrame obj = new MainJFrame();
        obj.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_BtnHomeMouseClicked

    private void tblHospitalDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHospitalDetailsMouseClicked
        // TODO add your handling code here:
        // set data to textfield
        
        DefaultTableModel tblModel = (DefaultTableModel)tblHospitalDetails.getModel();
        // set data to text field when raw is selected
        
        String tblHospitalName = tblModel.getValueAt(tblHospitalDetails.getSelectedRow(), 0).toString();
        String tblAddress = tblModel.getValueAt(tblHospitalDetails.getSelectedRow(), 0).toString();
        String tblCity = tblModel.getValueAt(tblHospitalDetails.getSelectedRow(), 0).toString();
        String tblZipCode = tblModel.getValueAt(tblHospitalDetails.getSelectedRow(), 0).toString();
        String tblPhone = tblModel.getValueAt(tblHospitalDetails.getSelectedRow(), 0).toString();
        String tblEmail = tblModel.getValueAt(tblHospitalDetails.getSelectedRow(), 0).toString();
        
        //set to text field
        txtHospitalName.setText(tblHospitalName);
        txtHospitalAddress.setText(tblAddress);
        txtHospitalCity.setText(tblCity);
        txtHospitalZipCode.setText(tblZipCode);
        txtHospitalPhone.setText(tblPhone);
        txtHospitalEmail.setText(tblEmail);
       
    }//GEN-LAST:event_tblHospitalDetailsMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // UPDATE mouse click event code here:
        // when row is selected, data will set to textfield for update
        int i = tblHospitalDetails.getSelectedRow();
       
        DefaultTableModel tblModel = (DefaultTableModel)tblHospitalDetails.getModel();
        // 
        txtHospitalName.setText(tblModel.getValueAt(i, 0).toString());
        txtHospitalAddress.setText(tblModel.getValueAt(i, 1).toString());
        txtHospitalCity.setText(tblModel.getValueAt(i, 2).toString());
        txtHospitalZipCode.setText(tblModel.getValueAt(i, 3).toString());
        txtHospitalPhone.setText(tblModel.getValueAt(i, 4).toString());
        txtHospitalEmail.setText(tblModel.getValueAt(i, 5).toString());
        
    }//GEN-LAST:event_btnUpdateMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CRUDHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDHospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCommunityAdmin;
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnHospitalAdmin;
    private javax.swing.JButton BtnSystemAdmin;
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewDoctor;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblAddNewHospital;
    private javax.swing.JLabel lblHospitalAddress;
    private javax.swing.JLabel lblHospitalAdminLogin;
    private javax.swing.JLabel lblHospitalCity;
    private javax.swing.JLabel lblHospitalDetails;
    private javax.swing.JLabel lblHospitalEmail;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblHospitalPhone;
    private javax.swing.JLabel lblHospitalZipCode;
    private javax.swing.JPanel splitPane;
    private javax.swing.JTable tblHospitalDetails;
    private javax.swing.JTextField txtHospitalAddress;
    private javax.swing.JTextField txtHospitalCity;
    private javax.swing.JTextField txtHospitalEmail;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtHospitalPhone;
    private javax.swing.JTextField txtHospitalZipCode;
    // End of variables declaration//GEN-END:variables
}
