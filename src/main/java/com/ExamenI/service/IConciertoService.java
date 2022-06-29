/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ExamenI.service;

import com.ExamenI.entity.Concierto;
import java.util.List;

/**
 *
 * @author josea
 */
public interface IConciertoService {
    public List<Concierto> getAllConcierto();
    public Concierto getConciertoById (long id);
    public void saveConcierto(Concierto concierto);
    public void delete (long id);
    
}
