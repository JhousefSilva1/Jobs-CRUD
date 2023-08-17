package bo.ucb.edu.jobs.Persistence.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "U_Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "U_id_Student")
    private int id;

    @Column(name = "U_Studentname")
    private String name;

    @Column(name = "U_Studentsurname")
    private String surname;

    // Constructors, getters, and setters
}