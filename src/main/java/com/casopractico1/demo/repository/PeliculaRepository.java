package com.casopractico1.demo.repository;

import com.casopractico1.demo.entity.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Steven
 */
@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula,Long> {}
