package com.gerardo.users.Service;

import java.util.List;

import com.gerardo.users.DAO.AptitudDAO;
import com.gerardo.users.Entity.Aptitud;

import org.springframework.beans.factory.annotation.Autowired;

public class AptitudService {
    
    @Autowired
    AptitudDAO aptitudDAO;

    public List<Aptitud> getAptitudes(){
        return aptitudDAO.getAptitudes();
    }

    public Aptitud getAptitud(int idAptitud){
        return aptitudDAO.getAptitud(idAptitud);
    }

    public void addAptitud(Aptitud aptitud){
        aptitudDAO.addAptitud(aptitud);
    }
}