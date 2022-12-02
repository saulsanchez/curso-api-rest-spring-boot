package com.saulsanchez.universidad.universidadbackend.servicios.contratos;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Pabellon;

public interface PabellonDAO extends GenericoDAO<Pabellon> {

    Iterable<Pabellon> buscarPabellonesPorLocalidad(String localidad);

    Iterable<Pabellon> buscarPabellonesPorNombre(String nombre);
}
