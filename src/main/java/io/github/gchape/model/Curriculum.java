package io.github.gchape.model;

import jakarta.persistence.*;

@Entity
@Table(name = "curriculum")
public class Curriculum {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Curriculum_SEQ")
    @SequenceGenerator(name = "Curriculum_SEQ")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String description;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Course course;

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
