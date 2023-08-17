package bo.ucb.edu.jobs.Service;

import bo.ucb.edu.jobs.Persistence.dao.StudentRepository;
import bo.ucb.edu.jobs.Persistence.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    // Other service methods (create, update, delete) can be defined here
}
