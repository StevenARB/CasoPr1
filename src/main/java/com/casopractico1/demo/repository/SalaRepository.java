package com.casopractico1.demo.repository;

import com.casopractico1.demo.entity.Sala;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Steven
 */
@Repository
public interface SalaRepository extends CrudRepository<Sala,Long> {}
