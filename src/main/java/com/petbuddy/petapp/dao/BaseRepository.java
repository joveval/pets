package com.petbuddy.petapp.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author Diego Mansilla on 10/25/2016.
 */

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T,ID>{
	List<T> findAll();
	<S extends T> S save(S entity);
}
