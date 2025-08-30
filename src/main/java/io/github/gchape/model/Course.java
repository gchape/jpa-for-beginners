package io.github.gchape.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Course_SEQ")
    @SequenceGenerator(name = "Course_SEQ")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private LocalDate enddate;

    @Column
    private String name;

    @Column
    private LocalDate startdate;

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public Long getId() {
        return id;
    }
}
