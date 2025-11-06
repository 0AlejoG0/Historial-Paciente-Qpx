package com.pacientes.historial.domain.service;

import com.pacientes.historial.domain.model.entity.PacienteEntity;
import com.pacientes.historial.domain.repository.PacientesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PacienteService {
    private final PacientesRepository pacientesRepository;


    public PacienteService(PacientesRepository pacientesRepository) {
        this.pacientesRepository = pacientesRepository;
    }

    public List<PacienteEntity> listarPacientes() {
        return pacientesRepository.findAll();
    }


    public void crearPaciente(PacienteEntity paciente) {
        pacientesRepository.save(paciente);
    }

    //aqui agregare el resto del crud para complementar el trabajo

    public PacienteEntity buscarPorId(Long id) {
        return pacientesRepository.findById(id).orElse(null);
    }

    public PacienteEntity actualizarPaciente(Long id, PacienteEntity nuevosDatos) {
        Optional<PacienteEntity> pacienteExistente = pacientesRepository.findById(id);
        if (pacienteExistente.isPresent()) {
            PacienteEntity paciente = pacienteExistente.get();
            paciente.setNombre(nuevosDatos.getNombre());
            paciente.setEdad(nuevosDatos.getEdad());
            paciente.setHistorial(nuevosDatos.getHistorial());
            paciente.setTratamiento(nuevosDatos.getTratamiento());
            paciente.setFechaRegistro(nuevosDatos.getFechaRegistro());
            return pacientesRepository.save(paciente);
        } else {
            return null;
        }
    }

    public boolean eliminarPaciente(Long id) {
        if (pacientesRepository.existsById(id)) {
            pacientesRepository.deleteById(id);
            return true;
        }
        return false;
    }
}


