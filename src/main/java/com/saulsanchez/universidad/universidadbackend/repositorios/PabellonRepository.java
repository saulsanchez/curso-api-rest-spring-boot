package com.saulsanchez.universidad.universidadbackend.repositorios;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Pabellon;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("repositorioPabellones")
public interface PabellonRepository extends CrudRepository<Pabellon, Integer> {

    @Query("select p from Pabellon p where p.direccion.localidad = ?1")
    Iterable<Pabellon> buscarPabellonesPorLocalidad(String localidad);
    @Query("select p from Pabellon p where LOWER(p.nombre) like LOWER(concat('%', ?1, '%'))")
    Iterable<Pabellon> buscarPabellonesPorNombre(String nombre);
}
