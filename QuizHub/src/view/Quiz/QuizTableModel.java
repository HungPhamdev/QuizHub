package view.Quiz;

import javax.swing.table.DefaultTableModel;

public class QuizTableModel extends DefaultTableModel {

    public QuizTableModel() {
        super(new String[]{"QuizId", "Title", "Subject Name", "Level"}, 0);
    }

    public void addQuiz(int quizId, String title, String subjectName, String level) {
        super.addRow(new Object[]{quizId, title, subjectName, level});
    }

    public int getQuizId(int row) {
        return (Integer) getValueAt(row, 0); // Ensure that the type returned is Integer
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return column != 0; // Prevent editing of the hidden column
    }
}
