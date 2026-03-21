package com.plantapp.service.generic;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plantapp.entity.BaseEntity;
import com.plantapp.repository.base.BaseRepository;

import java.util.List;

public class GenericServiceImpl<T extends BaseEntity, ID> implements GenericService<T, ID> {

    private final JpaRepository<T, ID> repository;

    public GenericServiceImpl(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public T create(T entity) {
        return repository.save(entity);
    }

    @Override
    public T update(ID id, T entity) {
        T existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Record not found"));

        entity.setId((Integer) id); // works for your case
        return repository.save(entity);
    }

    @Override
    public T getById(ID id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Record not found"));
    }

    @Override
    public List<T> getAll() {
        return ((BaseRepository<T, ID>) repository).findByDeleteFlagFalse();
    }

    @Override
    public void softDelete(ID id) {
        T entity = getById(id);
        entity.setDeleteFlag(true);
        repository.save(entity);
    }
}
