/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ExamenI.controller;

import com.ExamenI.entity.Concierto;
import com.ExamenI.entity.Lugares;
import com.ExamenI.service.ConciertoService;
import com.ExamenI.service.IConciertoService;
import com.ExamenI.service.ILugaresService;
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
 * @author josea
 */
@Controller
public class ConciertoController {
    
    @Autowired
    private IConciertoService conciertoService;
    
    @Autowired
    private ILugaresService lugaresService;
    
    @GetMapping("/concierto")
    public String index (Model model){
        List<Concierto> listaConcierto = conciertoService.getAllConcierto();
        model.addAttribute("titulo","Tabla Concierto");
        model.addAttribute("concierto",listaConcierto);
        return "concierto";
    }
    
    @GetMapping("/conciertoN")
    public String crearConcierto (Model model){
        List<Lugares> listaLugares = lugaresService.listLugares();
        model.addAttribute("concierto",new Concierto());
        model.addAttribute("lugares",listaLugares);
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarConcierto (@ModelAttribute Concierto concierto){
        conciertoService.saveConcierto(concierto);
        return "redirect:/concierto";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarConcierto (@PathVariable("id") Long idConcierto) {
        conciertoService.delete(idConcierto);
        return "redirect:/producto";
    }
}
