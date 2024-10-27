package view;

public class HomepagePanel extends javax.swing.JPanel {

    private MainFrame mainFrame;

    public HomepagePanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHomepage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnUserManagement = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHomepage.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblHomepage.setText("Welcome to the Quiz Application!");
        add(lblHomepage, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUserManagement.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnUserManagement.setText("User Management");
        btnUserManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserManagementActionPerformed(evt);
            }
        });
        jPanel1.add(btnUserManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserManagementActionPerformed
        mainFrame.showQuizManagementPanel();
    }//GEN-LAST:event_btnUserManagementActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUserManagement;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHomepage;
    // End of variables declaration//GEN-END:variables
}
