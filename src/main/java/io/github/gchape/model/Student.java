package io.github.gchape.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Student_SEQ")
    @SequenceGenerator(name = "Student_SEQ")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    @Enumerated(EnumType.ORDINAL)
    private StudentState state;

    public StudentState getState() {
        return state;
    }

    public void setState(StudentState state) {
        this.state = state;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }
}
