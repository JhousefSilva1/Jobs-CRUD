package bo.ucb.edu.jobs.Service.dto;

public class CourseDTO {
    private int id;
    private String name;
    private String sigla;

    public CourseDTO() {
    }

    public CourseDTO(int id, String name, String sigla) {
        this.id = id;
        this.name = name;
        this.sigla = sigla;
    }

    // Getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "CourseDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sigla='" + sigla + '\'' +
                '}';
    }
}