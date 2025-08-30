package io.github.gchape.model;

import jakarta.persistence.*;

@Entity
@Table(name = "professor")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Professor_SEQ")
    @SequenceGenerator(name = "Professor_SEQ")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String firstname;

    @Column
    private String lastname;

    public Long getId() {
        return id;
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
}
