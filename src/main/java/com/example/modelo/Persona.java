package com.example.modelo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Admin on 25/05/2017.
 */
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
}
