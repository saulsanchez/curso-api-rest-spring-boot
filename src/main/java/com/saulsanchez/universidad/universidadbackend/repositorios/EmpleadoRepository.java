package com.saulsanchez.universidad.universidadbackend.repositorios;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Persona;
import com.saulsanchez.universidad.universidadbackend.modelo.entidades.enumeradores.TipoEmpleado;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("repositorioEmpleados")
public interface EmpleadoRepository extends PersonaRepository {

    @Query("select e from Empleado e where e.tipoEmpleado = ?1")
    Iterable<Persona> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado);
}
