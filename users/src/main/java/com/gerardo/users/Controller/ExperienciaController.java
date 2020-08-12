package com.gerardo.users.Controller;

import java.util.List;

import com.gerardo.users.Entity.Experiencia;
import com.gerardo.users.Service.ExperienciaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController("/api")
public class ExperienciaController {
    
    @Autowired
    ExperienciaService experienciaService;

    @GetMapping("/experiencia")
    public List<Experiencia> getExperiencias(){
        return experienciaService.getExperiencias();
    }

    @GetMapping("experiencia/{idExperiencia}")
    public Experiencia getExperiencia(@PathVariable int idExperiencia){
        return experienciaService.getExperiencia(idExperiencia);
    }

    @PostMapping("/experiencia")
    public String addExperiencia(@RequestBody Experiencia experiencia){
        experienciaService.addExperiencia(experiencia);
        return "Saved";
    }
}