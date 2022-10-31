package ui;

/**
 *
 * @author Shashank
 */
public class DoctorHomePage extends javax.swing.JFrame {

    /**
     * Creates new form DoctorHomePage
     */
    public DoctorHomePage() {
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

        splitPane3 = new javax.swing.JPanel();
        jSplitPane4 = new javax.swing.JSplitPane();
        jPanel4 = new javax.swing.JPanel();
        BtnHome = new javax.swing.JButton();
        btnHospital = new javax.swing.JButton();
        btnDoctor = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        lblPatientPage = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblAddPatientVitals = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPatientDetails = new javax.swing.JTable();
        controlPanel = new javax.swing.JPanel();
        BtnHospitalAdmin = new javax.swing.JButton();
        BtnSystemAdmin = new javax.swing.JButton();
        BtnCommunityAdmin = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPatientDetails1 = new javax.swing.JTable();
        lblAddPatientVitals1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane3.setPreferredSize(new java.awt.Dimension(1223, 814));

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

        btnHospital.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnHospital.setText("Hospital ");
        btnHospital.setMaximumSize(new java.awt.Dimension(49, 26));
        btnHospital.setMinimumSize(new java.awt.Dimension(49, 26));
        btnHospital.setPreferredSize(new java.awt.Dimension(49, 26));
        btnHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalActionPerformed(evt);
            }
        });

        btnDoctor.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnDoctor.setText("Doctor");
        btnDoctor.setMaximumSize(new java.awt.Dimension(49, 26));
        btnDoctor.setMinimumSize(new java.awt.Dimension(49, 26));
        btnDoctor.setPreferredSize(new java.awt.Dimension(49, 26));
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(BtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(BtnHome)
                .addGap(47, 47, 47)
                .addComponent(btnHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(406, Short.MAX_VALUE))
        );

        jSplitPane4.setLeftComponent(jPanel4);

        jPanel7.setPreferredSize(new java.awt.Dimension(1032, 1253));

        lblPatientPage.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblPatientPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientPage.setText("DOCTOR HOME PAGE");

        lblAddPatientVitals.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblAddPatientVitals.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddPatientVitals.setText("View Patient Vitals");

        tblPatientDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Age", "Gender", "Temp", "Pulse", "SpO2", "BP", "Symptoms", "Diagnose/Leave"
            }
        ));
        jScrollPane2.setViewportView(tblPatientDetails);
        if (tblPatientDetails.getColumnModel().getColumnCount() > 0) {
            tblPatientDetails.getColumnModel().getColumn(4).setHeaderValue("Pulse");
            tblPatientDetails.getColumnModel().getColumn(5).setHeaderValue("SpO2");
            tblPatientDetails.getColumnModel().getColumn(6).setHeaderValue("BP");
            tblPatientDetails.getColumnModel().getColumn(7).setHeaderValue("Symptoms");
            tblPatientDetails.getColumnModel().getColumn(8).setHeaderValue("Diagnose/Leave");
        }

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
                    .addComponent(BtnCommunityAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnHospitalAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(BtnSystemAdmin)
                .addGap(35, 35, 35)
                .addComponent(BtnHospitalAdmin)
                .addGap(35, 35, 35)
                .addComponent(BtnCommunityAdmin)
                .addContainerGap(365, Short.MAX_VALUE))
        );

        tblPatientDetails1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Age", "Gender", "Date Time", "Visit Count"
            }
        ));
        jScrollPane3.setViewportView(tblPatientDetails1);

        lblAddPatientVitals1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblAddPatientVitals1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddPatientVitals1.setText("View Encounter Vitals");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(lblAddPatientVitals, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1048, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lblPatientPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
                            .addComponent(lblAddPatientVitals1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPatientPage, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAddPatientVitals)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(lblAddPatientVitals1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jSplitPane4.setRightComponent(jPanel7);

        javax.swing.GroupLayout splitPane3Layout = new javax.swing.GroupLayout(splitPane3);
        splitPane3.setLayout(splitPane3Layout);
        splitPane3Layout.setHorizontalGroup(
            splitPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1465, Short.MAX_VALUE)
        );
        splitPane3Layout.setVerticalGroup(
            splitPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 709, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1465, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splitPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCommunityAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCommunityAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCommunityAdminActionPerformed

    private void BtnSystemAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSystemAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSystemAdminActionPerformed

    private void BtnHospitalAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHospitalAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnHospitalAdminActionPerformed

    private void BtnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHomeMouseClicked
        // HOME button mouse clicked code here:
        MainJFrame obj = new MainJFrame();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnHomeMouseClicked

    private void BtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHomeActionPerformed
        // HOME button action performed code here:
        MainJFrame obj = new MainJFrame();
        obj.setVisible(true);
        //dispose();
    }//GEN-LAST:event_BtnHomeActionPerformed

    private void btnHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHospitalActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDoctorActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCommunityAdmin;
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnHospitalAdmin;
    private javax.swing.JButton BtnSystemAdmin;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnHospital;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JLabel lblAddPatientVitals;
    private javax.swing.JLabel lblAddPatientVitals1;
    private javax.swing.JLabel lblPatientPage;
    private javax.swing.JPanel splitPane3;
    private javax.swing.JTable tblPatientDetails;
    private javax.swing.JTable tblPatientDetails1;
    // End of variables declaration//GEN-END:variables
}
