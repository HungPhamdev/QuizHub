package view.Question;

import javax.swing.table.DefaultTableModel;

public class QuestionTableModel extends DefaultTableModel {

    public QuestionTableModel() {
        super(new String[]{"QuestionId", "Title", "Question Type", "Quiz Name"}, 0);
    }

    public void addQuestion(int questionId, String title, String questionType, String quizName) {
        super.addRow(new Object[]{questionId, title, questionType, quizName});
    }

    public int getQuestionId(int row) {
        return (Integer) getValueAt(row, 0); // Ensure that the type returned is Integer
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return column != 0; // Prevent editing of the hidden column
    }
}
