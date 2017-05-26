package com.example.repository;


import com.example.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Admin on 25/05/2017.
 */
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
