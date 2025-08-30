package io.github.gchape;

import io.github.gchape.model.Professor;
import io.github.gchape.service.ProfessorService;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ProfessorServiceTest {

    private static EntityManagerFactory emf;

    @BeforeAll
    static void init() {
        emf = Persistence.createEntityManagerFactory("persistence-unit");
    }

    @Test
    void should_persist_new_professor_entity() {
        // ---
        var em = emf.createEntityManager();
        em.getTransaction().begin();

        // ---
        var professor = new Professor();
        professor.setFirstname("Jane");
        professor.setLastname("Doe");

        var p = new ProfessorService(em)
                .save(professor);

        em.getTransaction().commit();
        em.close();

        // ---
        Assertions.assertEquals(p.getId(), professor.getId());
    }
}
