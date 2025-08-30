package io.github.gchape.service;

import jakarta.persistence.EntityManager;

public abstract class CrudService<T> {
    private EntityManager em;

    public CrudService(EntityManager em) {
        this.em = em;
    }

    public T save(T entity) {
        em.persist(entity);
        return entity;
    }

    @SuppressWarnings("unchecked")
    T findById(long id) {
        return (T) em.find(Object.class, id);
    }

    void remove(T entity) {
        em.remove(entity);
    }
}
