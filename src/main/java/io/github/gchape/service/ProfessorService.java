package io.github.gchape.service;

import io.github.gchape.model.Professor;
import jakarta.persistence.EntityManager;

public class ProfessorService extends CrudService<Professor> {

    public ProfessorService(EntityManager em) {
        super(em);
    }
}
