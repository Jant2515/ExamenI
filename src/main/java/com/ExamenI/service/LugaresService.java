/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ExamenI.service;

import com.ExamenI.entity.Lugares;
import com.ExamenI.repository.LugaresRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author josea
 */
@Service
public class LugaresService implements ILugaresService {

    @Autowired
    private LugaresRepository lugaresRepository;

    @Override
    public List<Lugares> listLugares() {
        return (List<Lugares>) lugaresRepository.findAll();
    }
}
