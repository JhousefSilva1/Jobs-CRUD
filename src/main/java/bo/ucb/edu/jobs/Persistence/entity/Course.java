package bo.ucb.edu.jobs.Persistence.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "U_Courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "U_CoursesName")
    private String name;

    @Column(name = "U_CoursesSigla")
    private String sigla;

    // Constructors, getters, and setters
}
