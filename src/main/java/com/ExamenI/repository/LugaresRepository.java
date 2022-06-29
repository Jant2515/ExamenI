/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ExamenI.repository;

import com.ExamenI.entity.Lugares;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author josea
 */
@Repository
public interface LugaresRepository extends CrudRepository<Lugares,Long>{
}

