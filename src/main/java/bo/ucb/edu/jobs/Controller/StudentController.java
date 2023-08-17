package bo.ucb.edu.jobs.Controller;
import bo.ucb.edu.jobs.Persistence.entity.Student;
import bo.ucb.edu.jobs.Service.StudentService;
import bo.ucb.edu.jobs.Service.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<StudentDTO> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return students.stream()
                .map(student -> new StudentDTO(student.getId(), student.getName(), student.getSurname()))
                .collect(Collectors.toList());
    }

    //post
    @PostMapping
    public StudentDTO createStudent(@RequestBody StudentDTO studentDTO) {
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setSurname(studentDTO.getSurname());
        student = studentService.createStudent(student);
        return new StudentDTO(student.getId(), student.getName(), student.getSurname());
    }

    // Other controller methods (create, update, delete) can be defined here
}
