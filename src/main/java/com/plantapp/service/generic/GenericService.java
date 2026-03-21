package com.plantapp.service.generic;

import java.util.List;

public interface GenericService<T, ID> {

    T create(T entity);

    T update(ID id, T entity);

    T getById(ID id);

    List<T> getAll();

    void softDelete(ID id);
}