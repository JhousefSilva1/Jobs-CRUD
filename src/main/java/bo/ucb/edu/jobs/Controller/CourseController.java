package bo.ucb.edu.jobs.Controller;

import bo.ucb.edu.jobs.Persistence.entity.Course;
import bo.ucb.edu.jobs.Service.CourseService;
import bo.ucb.edu.jobs.Service.dto.CourseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/courses")
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseDTO> getAllCourses() {
        List<Course> courses = courseService.getAllCourses();
        return courses.stream()
                .map(course -> new CourseDTO(course.getId(), course.getName(), course.getSigla()))
                .collect(Collectors.toList());
    }

    //post
    @PostMapping
    public CourseDTO createCourse(@RequestBody CourseDTO courseDTO) {
        Course course = new Course();
        course.setName(courseDTO.getName());
        course.setSigla(courseDTO.getSigla());
        course = courseService.createCourse(course);
        return new CourseDTO(course.getId(), course.getName(), course.getSigla());
    }

    // Other controller methods (create, update, delete) can be defined here
}
