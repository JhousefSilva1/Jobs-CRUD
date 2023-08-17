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
    @Column(name = "U_id_Courses")
    private int id;

    @Column(name = "U_Coursesname")
    private String name;

    @Column(name = "U_Coursessigla")
    private String sigla;

    // Constructors, getters, and setters
}
