package io.github.gchape.service;

import io.github.gchape.model.Course;
import jakarta.persistence.EntityManager;

public class CourseService extends CrudService<Course> {

    public CourseService(EntityManager em) {
        super(em);
    }
}
