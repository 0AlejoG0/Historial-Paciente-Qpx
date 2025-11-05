package com.pacientes.historial.infraestructure;

import com.pacientes.historial.domain.model.entity.PacienteEntity;
import com.pacientes.historial.domain.service.PacienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;


@RestController
@RequestMapping("/historial")


public class PacienteController {
    private final PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping

    public List<PacienteEntity> listarPacientes() {
        return pacienteService.listarPacientes();
    }

    @PostMapping
    public String crearPaciente(@RequestBody PacienteEntity paciente) {
        pacienteService.crearPaciente(paciente);
        return "El paciente se ha agregado correctamente a la base de datos";
    }
}






