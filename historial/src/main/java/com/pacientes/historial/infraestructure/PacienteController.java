package com.pacientes.historial.infraestructure;

import com.pacientes.historial.domain.model.DTO.PacienteDTO;
import com.pacientes.historial.domain.model.entity.PacienteEntity;
import com.pacientes.historial.domain.service.PacienteService;
import org.springframework.web.bind.annotation.*;


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
    public String crearPaciente(@RequestBody PacienteDTO pacienteDTO) {
        PacienteEntity paciente = new PacienteEntity();
        paciente.setNombre(pacienteDTO.getNombre());
        paciente.setEdad(pacienteDTO.getEdad());
        paciente.setHistorial(pacienteDTO.getHistorial());
        paciente.setTratamiento(pacienteDTO.getTratamiento());
        paciente.setFechaRegistro(pacienteDTO.getFechaRegistro());

        pacienteService.crearPaciente(paciente);
        return "Paciente agregado correctamente a la base de datos";
    }

    //aqui agregare el resto del crud para complementar el trabajo

    @GetMapping("/{id}")
    public PacienteEntity buscarPacientePorId(@PathVariable Long id) {
        return pacienteService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public String actualizarPaciente(@PathVariable Long id, @RequestBody PacienteDTO pacienteDTO) {
        PacienteEntity nuevosDatos = new PacienteEntity();
        nuevosDatos.setNombre(pacienteDTO.getNombre());
        nuevosDatos.setEdad(pacienteDTO.getEdad());
        nuevosDatos.setHistorial(pacienteDTO.getHistorial());
        nuevosDatos.setTratamiento(pacienteDTO.getTratamiento());
        nuevosDatos.setFechaRegistro(pacienteDTO.getFechaRegistro());

        PacienteEntity actualizado = pacienteService.actualizarPaciente(id, nuevosDatos);
        if (actualizado != null) {
            return "Paciente actualizado corrextamente";
        } else {
            return "No se encontró paciente que tenga ese ID " + id;
        }
    }

    @DeleteMapping("/{id}")
    public String eliminarPaciente(@PathVariable Long id) {
        boolean eliminado = pacienteService.eliminarPaciente(id);
        if (eliminado) {
            return "Paciente eliminado correctamente";
        } else {
            return "No se encontró paciente que tenga ese ID " + id;
        }
    }
}






