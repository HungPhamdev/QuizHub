package view.Subject;

import javax.swing.table.DefaultTableModel;

public class SubjectTableModel extends DefaultTableModel {

    public SubjectTableModel() {
        super(new String[]{"SubjectId", "Subject Name", "Description"}, 0);
    }

    public void addSubject(int subjectId, String subjectName, String description) {
        super.addRow(new Object[]{subjectId, subjectName, description}); // subjectId should be an int here
    }

    public int getSubjectId(int row) {
        return (Integer) getValueAt(row, 0); // Ensure that the type returned is Integer
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return column != 0; // Prevent editing of the hidden column
    }
}
