package com.example.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * Created by Admin on 25/05/2017.
 */
@Setter
@Getter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Version
    private BigInteger version;
    private String  name;
    private String email;
}
