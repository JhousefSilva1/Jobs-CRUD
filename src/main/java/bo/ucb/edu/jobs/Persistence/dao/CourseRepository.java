package bo.ucb.edu.jobs.Persistence.dao;

import bo.ucb.edu.jobs.Persistence.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    // Additional custom queries can be defined here
}