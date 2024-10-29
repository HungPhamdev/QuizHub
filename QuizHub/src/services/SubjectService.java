package services;

import java.util.List;
import model.Subject;
import repositories.SubjectRepository;


public class SubjectService {
    private SubjectRepository subjectRepository;

    public SubjectService() {
        this.subjectRepository = new SubjectRepository();
    }

    public int createSubject(Subject subject) {
        return subjectRepository.createSubject(subject);
    }

    public int updateSubject(Subject subject) {
        return subjectRepository.updateSubject(subject);
    }

    public List<Subject> getAllSubjects() {
        return subjectRepository.getAllSubjects();
    }

    public int deleteSubject(int id) {
        return subjectRepository.deleteSubject(id);
    }
}
