package com.casopractico1.demo.service;

import com.casopractico1.demo.entity.Sala;
import com.casopractico1.demo.repository.SalaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Steven
 */
@Service
public class SalaService implements ISalaService {

    @Autowired
    private SalaRepository salaRepository;

    @Override
    public List<Sala> listCountry() {
        return (List<Sala>) salaRepository.findAll();
    }

}
