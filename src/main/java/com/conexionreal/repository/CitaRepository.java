package com.conexionreal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.conexionreal.model.Cita;

/**
 * Repositorio encargado de gestionar las operaciones
 * de almacenamiento de las citas médicas.
 */
public interface CitaRepository extends JpaRepository<Cita, Long> {

}