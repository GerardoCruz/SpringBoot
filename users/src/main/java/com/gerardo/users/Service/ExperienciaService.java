package com.gerardo.users.Service;

import java.util.List;

import com.gerardo.users.DAO.ExperienciaDAO;
import com.gerardo.users.Entity.Experiencia;

import org.springframework.beans.factory.annotation.Autowired;

public class ExperienciaService {
    
    @Autowired
    ExperienciaDAO experienciaDAO;

    public List<Experiencia> getExperiencias(){
        return experienciaDAO.getExperiencias();
    }

    public Experiencia getExperiencia(int idExperiencia){
        return experienciaDAO.getExperiencia(idExperiencia);
    }

    public void addExperiencia(Experiencia experiencia){
        experienciaDAO.addExperiencia(experiencia);
    }
}