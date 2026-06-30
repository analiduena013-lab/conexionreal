package com.conexionreal.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.conexionreal.model.Cita;
import com.conexionreal.repository.CitaRepository;


/**
 * Clase encargada de manejar la lógica
 * del módulo de citas médicas.
 */
@Service
public class CitaService {


    // Conexión con el repositorio de citas
    @Autowired
    private CitaRepository citaRepository;


    /**
     * Método encargado de guardar una nueva cita médica.
     *
     * @param cita información de la cita a registrar
     * @return cita guardada en la base de datos
     */
    public Cita guardarCita(Cita cita) {

        return citaRepository.save(cita);

    }

}
