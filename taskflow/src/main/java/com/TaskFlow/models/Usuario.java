package com.TaskFlow.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;

    @OneToMany(mappedBy = "asignadoA")
    private List<Tarea> tareasAsignadas;

    // Getters y Setters
}
