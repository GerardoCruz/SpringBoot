package com.gerardo.users.Controller;

import java.util.List;

import com.gerardo.users.Entity.Habilidad;
import com.gerardo.users.Service.HabilidadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class HabilidadController {
    
    @Autowired
    HabilidadService habilidadService;

    @GetMapping("/habilidad")
    public List<Habilidad> getHabilidades(){
        return habilidadService.getHabilidades();
    }

    @GetMapping("habilidad/{idHabilidad}")
    public Habilidad getHabilidad(@PathVariable int idHabilidad){
        return habilidadService.getHabilidad(idHabilidad);
    }

    @PostMapping("/habilidad")
    public String addHabilidad(@RequestBody Habilidad habilidad){
        habilidadService.addHabilidad(habilidad);
        return "Saved";
    }
}