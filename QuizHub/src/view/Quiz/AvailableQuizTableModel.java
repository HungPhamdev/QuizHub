package view.Quiz;

import javax.swing.table.DefaultTableModel;

public class AvailableQuizTableModel extends DefaultTableModel {

    public AvailableQuizTableModel() {
        super(new String[]{"Quiz Name", "Subject Name", "Duration", "Level", "Action"}, 0);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return column != 5; // Make only the last column editable (for buttons)
    }
}
