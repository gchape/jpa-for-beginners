package io.github.gchape.service;

import io.github.gchape.model.Curriculum;
import jakarta.persistence.EntityManager;

public class CurriculumService extends CrudService<Curriculum> {

    public CurriculumService(EntityManager em) {
        super(em);
    }
}
