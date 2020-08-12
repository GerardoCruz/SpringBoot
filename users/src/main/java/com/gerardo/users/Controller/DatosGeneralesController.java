package com.gerardo.users.Controller;

import com.gerardo.users.Entity.DatosGenerales;
import com.gerardo.users.Service.DatosGeneralesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class DatosGeneralesController {

    @Autowired
    DatosGeneralesService datosGeneralesService;

    @GetMapping("/datosGenerales/{id}")
    public DatosGenerales getDatosGenerales(@PathVariable int id){
        return datosGeneralesService.getDatosGenerales(id);
    }

    @PostMapping("/datosGenerales/{idUser}")
    public String addDatosGenerales(@RequestBody DatosGenerales datosGenerales, @PathVariable int idUser){
        datosGeneralesService.addDatosGenerales(datosGenerales, idUser);
        return "Saved";
    }
    
    @PutMapping("/datosGenerales")
    public String editDatosGenerales(@RequestBody DatosGenerales datosGenerales){
        datosGeneralesService.editDatosGenerales(datosGenerales);
        return "Saved";
    }
}