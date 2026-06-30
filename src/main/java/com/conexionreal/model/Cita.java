package com.conexionreal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

/**
 * Clase que representa una cita médica del sistema Conexión Real.
 */
@Entity
public class Cita {

    // Identificador único de la cita
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Datos del paciente
    private String paciente;

    // Médico asignado
    private String medico;

    // Fecha de la cita
    private String fecha;

    // Hora de la cita
    private String hora;


    // Constructor vacío requerido por JPA
    public Cita() {

    }


    public Long getId() {
        return id;
    }


    public String getPaciente() {
        return paciente;
    }


    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }


    public String getMedico() {
        return medico;
    }


    public void setMedico(String medico) {
        this.medico = medico;
    }


    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public String getHora() {
        return hora;
    }


    public void setHora(String hora) {
        this.hora = hora;
    }
}
