package com.TaskFlow.controllers;

import com.TaskFlow.models.Tarea;
import com.TaskFlow.services.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TareaController {
    @Autowired
    private TareaService tareaService;

    @GetMapping
    public List<Tarea> obtenerTodasLasTareas() {
        return tareaService.obtenerTodasLasTareas();
    }

    @PostMapping
    public Tarea guardarTarea(@RequestBody Tarea tarea) {
        return tareaService.guardarTarea(tarea);
    }

    @DeleteMapping("/{id}")
    public void eliminarTarea(@PathVariable Long id) {
        tareaService.eliminarTarea(id);
    }
}
