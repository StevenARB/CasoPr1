package com.casopractico1.demo.service;

import com.casopractico1.demo.entity.Pelicula;
import java.util.List;

/**
 *
 * @author Steven
 */
public interface IPeliculaService {
    public List<Pelicula> getAllPelicula();
    public Pelicula getPeliculaById (long id);
    public void savePelicula(Pelicula pelicula);
    public void delete (long id);
}
