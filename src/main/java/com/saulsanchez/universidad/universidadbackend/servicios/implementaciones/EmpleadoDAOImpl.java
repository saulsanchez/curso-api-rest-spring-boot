package com.saulsanchez.universidad.universidadbackend.servicios.implementaciones;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Empleado;
import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Persona;
import com.saulsanchez.universidad.universidadbackend.modelo.entidades.enumeradores.TipoEmpleado;
import com.saulsanchez.universidad.universidadbackend.repositorios.EmpleadoRepository;
import com.saulsanchez.universidad.universidadbackend.repositorios.PersonaRepository;
import com.saulsanchez.universidad.universidadbackend.repositorios.ProfesorRepository;
import com.saulsanchez.universidad.universidadbackend.servicios.contratos.EmpleadoDAO;
import com.saulsanchez.universidad.universidadbackend.servicios.contratos.ProfesorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoDAOImpl extends PersonaDAOImpl implements EmpleadoDAO {

    @Autowired
    public EmpleadoDAOImpl(@Qualifier("repositorioEmpleados") PersonaRepository repository) {
        super(repository);
    }

    @Override
    public Iterable<Persona> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado) {
        return ((EmpleadoRepository)repository).findEmpleadoByTipoEmpleado(tipoEmpleado);
    }
}
