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
    private int id;

    @Column(name = "U_StudentName")
    private String name;

    @Column(name = "U_StudentSurname")
    private String surname;

    // Constructors, getters, and setters
}