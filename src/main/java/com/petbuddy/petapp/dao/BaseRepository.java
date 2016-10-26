package com.petbuddy.petapp.dao;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * @author Diego Mansilla on 10/25/2016.
 */

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends Repository<T, ID> {
    void delete(T deleted);

    List<T> findAll();

    List<T> findOne(ID id);

    T save(T persisted);
}
