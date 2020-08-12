package com.gerardo.users.Controller;

import java.util.List;

import com.gerardo.users.Entity.Aptitud;
import com.gerardo.users.Service.AptitudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class AptitudController {

    @Autowired
    AptitudService aptitudService;

    @GetMapping("/aptitud")
    public List<Aptitud> getAptitudes(){
        return aptitudService.getAptitudes();
    }

    @GetMapping("/aptitud/{idAptitud}")
    public Aptitud getAptitud(@PathVariable int idAptitud){
        return aptitudService.getAptitud(idAptitud);
    }

    @PostMapping("/aptitud")
    public String addAptitud(@RequestBody Aptitud aptitud){
        aptitudService.addAptitud(aptitud);
        return "Saved";
    }
    
}