package com.casopractico1.demo.controller;

import com.casopractico1.demo.entity.Pelicula;
import com.casopractico1.demo.entity.Sala;
import com.casopractico1.demo.service.IPeliculaService;
import com.casopractico1.demo.service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Steven
 */
@Controller
public class PeliculaController {
    
    @Autowired
    private IPeliculaService peliculaService;

    @Autowired
    private ISalaService salaService;
    
    @GetMapping("/peliculas")
    public String index(Model model) {
        List<Pelicula> listaPelicula = peliculaService.getAllPelicula();
        model.addAttribute("titulo", "Tabla Peliculas");
        model.addAttribute("peliculas", listaPelicula);
        return "peliculas";
    }
    
    @GetMapping("/insertar")
    public String insertarPelicula(Model model) {
        List<Sala> listaSalas = salaService.listCountry();
        model.addAttribute("pelicula", new Pelicula());
        model.addAttribute("salas", listaSalas);
        return "formpelicula";
    }
    
    @PostMapping("/save")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula) {
        peliculaService.savePelicula(pelicula);
        return "redirect:/peliculas";
    }
    
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        peliculaService.delete(id);
        return "redirect:/peliculas";
    }
}
