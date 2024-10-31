package view.Option;

import controller.OptionController;
import controller.QuestionController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Option;
import model.Question;
import view.MainFrame;

public class OptionManagementPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    private final OptionController optionController;
    private final QuestionController questionController;
    private int questionId;
    private String content;
    private boolean isCorrect;
    private Map<String, Integer> questionMap = new HashMap<>();

    public OptionManagementPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        optionController = new OptionController();
        questionController = new QuestionController();

        initComponents();

        loadCbbQuestions();
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
        txtContent = new javax.swing.JTextField();
        cbIsCorrect = new javax.swing.JCheckBox();
        btnBackToHome = new javax.swing.JButton();
        cbbQuestionName = new javax.swing.JComboBox<>();
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
        jLabel1.setText("Question Name:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 30));

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

        txtContent.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(txtContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 260, 30));

        cbIsCorrect.setText("Is Correct");
        cbIsCorrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIsCorrectActionPerformed(evt);
            }
        });
        jPanel2.add(cbIsCorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        btnBackToHome.setBackground(new java.awt.Color(204, 204, 204));
        btnBackToHome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBackToHome.setText("<- Back to Home");
        btnBackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToHomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnBackToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, -1, -1));

        jPanel2.add(cbbQuestionName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 260, 30));

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
        tblOption.setModel(new OptionTableModel());
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
        content = txtContent.getText();
        isCorrect = cbIsCorrect.isSelected();
        String selectedQuestionName = (String) cbbQuestionName.getSelectedItem();
        questionId = questionMap.get(selectedQuestionName);

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

        String selectedQuestionName = (String) cbbQuestionName.getSelectedItem();
        questionId = questionMap.get(selectedQuestionName);
        content = txtContent.getText();
        isCorrect = cbIsCorrect.isSelected();
        int optionId = ((OptionTableModel) tblOption.getModel()).getOptionId(selectedRow);

        if (questionId <= 0) {
            showErrorMessage("Question Id is required!");
            return;
        } else if (content.trim().isEmpty()) {
            showErrorMessage("Content is required!");
            return;
        }

        String contentInDB = this.optionController.findContentById(optionId);
        boolean isContentExists = this.optionController.isContentExists(content);
        if (!content.equals(contentInDB) && isContentExists) {
            showErrorMessage("Content is exists!");
            return;
        }

        modifyOption(optionId, questionId, content, isCorrect);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblOptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOptionMouseClicked
        int row = tblOption.getSelectedRow();
        if (row != -1) {
            txtContent.setText(tblOption.getValueAt(row, 1).toString());
            String selectedQuestionName = (String) cbbQuestionName.getSelectedItem();
            cbbQuestionName.setSelectedItem(selectedQuestionName);
            boolean isCorrectValue = (boolean) tblOption.getValueAt(row, 3);
            cbIsCorrect.setSelected(isCorrectValue);
        }
    }//GEN-LAST:event_tblOptionMouseClicked

    private void cbIsCorrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIsCorrectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbIsCorrectActionPerformed

    private void btnBackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToHomeActionPerformed
        mainFrame.showHomePanel();
    }//GEN-LAST:event_btnBackToHomeActionPerformed

    private void loadOptionData() {
        OptionTableModel optionModel = (OptionTableModel) tblOption.getModel();
        optionModel.setRowCount(0); // Clear existing rows

        List<Option> options = optionController.listOptions();
        for (Option option : options) {
            optionModel.addOption(option.getOptionId(), option.getContent(), option.getQuestionName(), option.isCorrect());
        }

        hideColumnByIndex(tblOption, 0);
    }

    private void loadCbbQuestions() {
        List<Question> questions = questionController.listQuestions(); // Assuming this fetches all subject data

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        for (Question question : questions) {
            String questionNameItem = question.getTitle();
            int questionIdItem = question.getQuestionId();

            // Add to JComboBox
            model.addElement(questionNameItem);

            // Store in the map
            questionMap.put(questionNameItem, questionIdItem);
        }

        cbbQuestionName.setModel(model);
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
        reloadQuestionMap();
    }

    private void modifyOption(int optionId, int questionId, String content, boolean isCorrect) {
        Option option = new Option();
        option.setOptionId(optionId);
        option.setQuestionId(questionId);
        option.setContent(content);
        option.setCorrect(isCorrect);

        int updateResult = optionController.modifyOption(option);
        String message = updateResult > 0 ? "successfully" : "failed";
        JOptionPane.showMessageDialog(this, String.format("Option update %s!", message));

        loadOptionData();
        clearFields();
        reloadQuestionMap();
    }

    private void deleteOption() {
        int selectedRow = tblOption.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a option to delete!");
            return;
        }

        int optionId = ((OptionTableModel) tblOption.getModel()).getOptionId(selectedRow);

        int deleteResult = optionController.removeOption(optionId);
        String message = deleteResult > 0 ? "successfully" : "failed";
        JOptionPane.showMessageDialog(this, String.format("Option remove %s!", message));

        loadOptionData();
        clearFields();
        reloadQuestionMap();
    }

    private void clearFields() {
        txtContent.setText("");
        cbIsCorrect.setText("");
        cbbQuestionName.setSelectedIndex(0);
    }

    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Input Error", JOptionPane.ERROR_MESSAGE);
    }

    private void hideColumnByIndex(javax.swing.JTable jTable, int columnIndex) {
        jTable.getColumnModel().getColumn(columnIndex).setMinWidth(0);
        jTable.getColumnModel().getColumn(columnIndex).setMaxWidth(0);
        jTable.getColumnModel().getColumn(columnIndex).setWidth(0);
    }

    private void reloadQuestionMap() {
        questionMap.clear(); // Clear existing entries
        List<Question> questions = questionController.listQuestions(); // Fetch all quizzes

        for (Question question : questions) {
            questionMap.put(question.getTitle(), question.getQuestionId());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBackToHome;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox cbIsCorrect;
    private javax.swing.JComboBox<String> cbbQuestionName;
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
    // End of variables declaration//GEN-END:variables
}
