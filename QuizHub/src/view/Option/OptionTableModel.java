package view.Option;

import javax.swing.table.DefaultTableModel;

public class OptionTableModel extends DefaultTableModel {

    public OptionTableModel() {
        super(new String[]{"OptionId", "Content", "Question Name", "Is Correct"}, 0);
    }

    public void addOption(int optionId, String content, String questionName, boolean isCorrect) {
        super.addRow(new Object[]{optionId, content, questionName, isCorrect ? "Yes" : "No" });
    }

    public int getOptionId(int row) {
        return (Integer) getValueAt(row, 0); // Ensure that the type returned is Integer
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return column != 0; // Prevent editing of the hidden column
    }
}
