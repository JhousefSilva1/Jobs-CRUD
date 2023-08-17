package bo.ucb.edu.jobs.Service;

import bo.ucb.edu.jobs.Persistence.dao.CourseRepository;
import bo.ucb.edu.jobs.Persistence.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    // Other service methods (create, update, delete) can be defined here
}
