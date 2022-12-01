package com.saulsanchez.universidad.universidadbackend.servicios.implementaciones;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Persona;
import com.saulsanchez.universidad.universidadbackend.repositorios.AlumnoRepository;
import com.saulsanchez.universidad.universidadbackend.repositorios.PersonaRepository;
import com.saulsanchez.universidad.universidadbackend.servicios.contratos.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AlumnoDAOImpl extends PersonaDAOImpl implements AlumnoDAO {

    @Autowired
    public AlumnoDAOImpl(@Qualifier("repositorioAlumnos") PersonaRepository repository) {
        super(repository);
    }

    @Override
    public Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombre) {
        return ((AlumnoRepository)repository).buscarAlumnosPorNombreCarrera(nombre);
    }
}
