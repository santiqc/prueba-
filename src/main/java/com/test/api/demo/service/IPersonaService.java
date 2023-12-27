package com.test.api.demo.service;

import com.test.api.demo.entities.Persona;

import java.util.List;

public interface IPersonaService {

    List<Persona> consultarPersonas();

    Persona obtenerPersonaPorId(Long id);

    Persona crearPersona(Persona persona);

    Persona actualizarPersona(Long id, Persona persona);

    void eliminarPersona(Long id);

}
