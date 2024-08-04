package com.TaskFlow.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaVencimiento;
    private String prioridad;
    private boolean completada;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario asignadoA;

    // Getters y Setters
}
