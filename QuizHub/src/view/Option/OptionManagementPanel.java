package view.Option;

import controller.OptionController;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Option;

public class OptionManagementPanel extends javax.swing.JPanel {

    private final OptionController optionController;
    private int questionId;
    private String content;
    private boolean isCorrect;

    public OptionManagementPanel() {
        optionController = new OptionController();

        initComponents();

        loadOptionData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtQuestionId = new javax.swing.JTextField();
        txtContent = new javax.swing.JTextField();
        cbIsCorrect = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOption = new javax.swing.JTable();

        jTextField2.setText("jTextField2");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setPreferredSize(new java.awt.Dimension(1000, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("QuestionId:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Content:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("IsCorrect:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        btnAdd.setBackground(new java.awt.Color(0, 153, 51));
        btnAdd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add Option");
        btnAdd.setToolTipText("Click to add a new user");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 30));

        btnUpdate.setBackground(new java.awt.Color(0, 51, 204));
        btnUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update Option");
        btnUpdate.setToolTipText("Click to update a user");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, 30));

        btnDelete.setBackground(new java.awt.Color(153, 0, 0));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete Option");
        btnDelete.setToolTipText("Click to delete a user");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, 30));

        txtQuestionId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(txtQuestionId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 260, 30));

        txtContent.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(txtContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 260, 30));

        cbIsCorrect.setText("Is Correct");
        cbIsCorrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIsCorrectActionPerformed(evt);
            }
        });
        jPanel2.add(cbIsCorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 950, 240));
        jPanel2.getAccessibleContext().setAccessibleName("");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Option Management");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 37, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 100));

        tblOption.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblOption.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "QuestionId", "Content", "IsCorrect"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblOption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOptionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblOption);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 950, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteOption();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        questionId = Integer.parseInt(txtQuestionId.getText());
        content = txtContent.getText();
        isCorrect = Boolean.parseBoolean(cbIsCorrect.getText());

        if (questionId <= 0) {
            showErrorMessage("Question Id is required!");
            return;
        } else if (content.trim().isEmpty()) {
            showErrorMessage("Content is required!");
            return;
        }

        boolean isContentExists = this.optionController.isContentExists(content);
        if (isContentExists) {
            showErrorMessage("Content is exists!");
            return;
        }

        addOption(questionId, content, isCorrect);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selectedRow = tblOption.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user to update!");
            return;
        }

        questionId = Integer.parseInt(txtQuestionId.getText());
        content = txtContent.getText();
        isCorrect = Boolean.parseBoolean(cbIsCorrect.getText());

        if (questionId <= 0) {
            showErrorMessage("Question Id is required!");
            return;
        } else if (content.trim().isEmpty()) {
            showErrorMessage("Content is required!");
            return;
        }

        boolean isContentExists = this.optionController.isContentExists(content);
        if (isContentExists) {
            showErrorMessage("Content is exists!");
            return;
        }

        modifyOption(questionId, content, isCorrect);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblOptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOptionMouseClicked
        int row = tblOption.getSelectedRow();
        if (row != -1) {
            txtQuestionId.setText(tblOption.getValueAt(row, 0).toString());
            txtContent.setText(tblOption.getValueAt(row, 1).toString());
            cbIsCorrect.setText(tblOption.getValueAt(row, 2).toString());
        }
    }//GEN-LAST:event_tblOptionMouseClicked

    private void cbIsCorrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIsCorrectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbIsCorrectActionPerformed

    private void loadOptionData() {
        DefaultTableModel questionModel = (DefaultTableModel) tblOption.getModel();
        questionModel.setRowCount(0); // Clear existing rows

        List<Option> options = optionController.listOptions();
        for (Option option : options) {
            questionModel.addRow(new Object[]{option.getQuestionId(), option.getContent(), option.isCorrect()});
        }
    }

    private void addOption(int questionId, String content, boolean isCorrect) {
        Option option = new Option();
        option.setQuestionId(questionId);
        option.setContent(content);
        option.setCorrect(isCorrect);

        int insertResult = optionController.addOption(option);
        String message = insertResult > 0 ? "successfully" : "failed";
        JOptionPane.showMessageDialog(this, String.format("Option added %s!", message));

        loadOptionData();
        clearFields();
    }

    private void modifyOption(int questionId, String content, boolean isCorrect) {
        Option option = new Option();
        option.setQuestionId(questionId);
        option.setContent(content);
        option.setCorrect(isCorrect);

        int updateResult = optionController.modifyOption(option);
        String message = updateResult > 0 ? "successfully" : "failed";
        JOptionPane.showMessageDialog(this, String.format("Option update %s!", message));

        loadOptionData();
        clearFields();
    }

    private void deleteOption() {
        int selectedRow = tblOption.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a option to delete!");
            return;
        }

        DefaultTableModel OptionModel = (DefaultTableModel) tblOption.getModel();
        int optionId = (int) OptionModel.getValueAt(selectedRow, 0);

        int deleteResult = optionController.removeOption(optionId);
        String message = deleteResult > 0 ? "successfully" : "failed";
        JOptionPane.showMessageDialog(this, String.format("Option remove %s!", message));

        loadOptionData();
        clearFields();
    }

    private void clearFields() {
        txtQuestionId.setText("");
        txtContent.setText("");
        cbIsCorrect.setText("");
    }

    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Input Error", JOptionPane.ERROR_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox cbIsCorrect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblOption;
    private javax.swing.JTextField txtContent;
    private javax.swing.JTextField txtQuestionId;
    // End of variables declaration//GEN-END:variables
}
