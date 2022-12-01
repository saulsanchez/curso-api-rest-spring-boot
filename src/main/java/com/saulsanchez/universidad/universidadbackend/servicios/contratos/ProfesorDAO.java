package com.saulsanchez.universidad.universidadbackend.servicios.contratos;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Persona;

public interface ProfesorDAO extends PersonaDAO {

    Iterable<Persona> findProfesoresByCarrera(String carrera);
}
