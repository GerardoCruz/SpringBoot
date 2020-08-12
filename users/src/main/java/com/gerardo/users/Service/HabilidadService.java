package com.gerardo.users.Service;

import java.util.List;

import com.gerardo.users.DAO.HabilidadDAO;
import com.gerardo.users.Entity.Habilidad;

import org.springframework.beans.factory.annotation.Autowired;

public class HabilidadService {

    @Autowired
    HabilidadDAO habilidadDAO;
    
    public List<Habilidad> getHabilidades(){
        return habilidadDAO.getHabilidades();
    }

    public Habilidad getHabilidad(int idHabilidad){
        return habilidadDAO.getHabilidad(idHabilidad);
    }

    public void addHabilidad(Habilidad habilidad){
        habilidadDAO.addHabilidad(habilidad);
    }
}