package bo.ucb.edu.jobs.Persistence.dao;

import bo.ucb.edu.jobs.Persistence.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // Additional custom queries can be defined here
}
