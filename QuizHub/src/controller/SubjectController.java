package controller;

import java.util.List;
import model.Subject;
import services.SubjectService;

public class SubjectController {

    private SubjectService subjectService;

    public SubjectController() {
        this.subjectService = new SubjectService();
    }

    public int addSubject(Subject subject) {
        return subjectService.createSubject(subject);
    }

    public int modifySubject(Subject subject) {
        return subjectService.updateSubject(subject);
    }

    public List<Subject> listSubjects() {
        return subjectService.getAllSubjects();
    }

    public int removeSubject(int id) {
        return subjectService.deleteSubject(id);
    }
    
    public boolean isSubjectNameExists(String subjectName) {
        return subjectService.isSubjectNameExists(subjectName);
    }
}
