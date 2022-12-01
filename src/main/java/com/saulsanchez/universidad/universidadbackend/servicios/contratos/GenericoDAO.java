package com.saulsanchez.universidad.universidadbackend.servicios.contratos;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Carrera;

import java.util.Optional;

public interface GenericoDAO <E> {

    Optional<E> findById(Integer id);
    E save(E entidad);
    Iterable<E> findAll();
    void deleteById(Integer id);
}
