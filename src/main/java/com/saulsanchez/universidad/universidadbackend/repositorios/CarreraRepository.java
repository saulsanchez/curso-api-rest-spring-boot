package com.saulsanchez.universidad.universidadbackend.repositorios;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Carrera;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CarreraRepository extends CrudRepository<Carrera, Integer> {

//    @Query("select c from Carrera c where c.nombre like %?1%")
    Iterable<Carrera> findCarrerasByNombreContains(String nombre);
//    @Query("select c from Carrera c where upper(c.nombre) like upper(%?1%)")
    Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombre);
//    @Query("select c from Carrera c where c.cantidadAnios > ?1")
    Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidadAnios);

    @Query("select c from Carrera c join fetch c.profesores p where p.nombre = ?1 and p.apellido = ?2")
    Iterable<Carrera> buscarCarrerasPorProfesorNombreYApellido(String nombre, String apellido);
}
