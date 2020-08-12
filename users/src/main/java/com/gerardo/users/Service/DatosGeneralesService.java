package com.gerardo.users.Service;

import com.gerardo.users.DAO.DatosGeneralesDAO;
import com.gerardo.users.Entity.DatosGenerales;

import org.springframework.beans.factory.annotation.Autowired;

public class DatosGeneralesService {
    
    @Autowired
    DatosGeneralesDAO datosGeneralesDAO;

    public DatosGenerales getDatosGenerales(int idDatosGenerales){
        return datosGeneralesDAO.getDatosGenerales(idDatosGenerales);
    }

    public void addDatosGenerales(DatosGenerales datosGenerales, int idUser){
        datosGeneralesDAO.addDatosGenerales(datosGenerales, idUser);
    }

    public void editDatosGenerales(DatosGenerales datosGenerales){
        datosGeneralesDAO.editDatosGenerales(datosGenerales);
    }
}