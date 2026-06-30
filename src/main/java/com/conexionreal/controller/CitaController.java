package com.conexionreal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.conexionreal.model.Cita;
import com.conexionreal.service.CitaService;


/**
 * Controlador encargado de manejar
 * las solicitudes relacionadas con las citas médicas.
 */
@RestController
@RequestMapping("/citas")
public class CitaController {


    // Conexión con el servicio de citas
    @Autowired
    private CitaService citaService;


    /**
     * Método para registrar una nueva cita médica.
     *
     * @param cita información enviada por el usuario
     * @return cita registrada
     */
    @PostMapping
    public Cita registrarCita(@RequestBody Cita cita) {

        return citaService.guardarCita(cita);

    }

}
