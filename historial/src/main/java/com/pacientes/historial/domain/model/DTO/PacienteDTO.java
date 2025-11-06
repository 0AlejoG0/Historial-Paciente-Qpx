package com.pacientes.historial.domain.model.DTO;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

public class PacienteDTO {

    private String nombre;
    private Integer edad;
    private String historial;
    private String tratamiento;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date fechaRegistro;
    public PacienteDTO() {}

    public PacienteDTO(String nombre, Integer edad, String historial, String tratamiento, Date fechaRegistro) {
        this.nombre = nombre;
        this.edad = edad;
        this.historial = historial;
        this.tratamiento = tratamiento;
        this.fechaRegistro = fechaRegistro;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Integer getEdad() { return edad; }
    public void setEdad(Integer edad) { this.edad = edad; }

    public String getHistorial() { return historial; }
    public void setHistorial(String historial) { this.historial = historial; }

    public String getTratamiento() { return tratamiento; }
    public void setTratamiento(String tratamiento) { this.tratamiento = tratamiento; }

    public Date getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(Date fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    public void setId(Long id) {
    }
}


