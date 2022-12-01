package com.saulsanchez.universidad.universidadbackend;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Carrera;
import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Direccion;
import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Persona;
import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Profesor;
import com.saulsanchez.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import com.saulsanchez.universidad.universidadbackend.servicios.contratos.PersonaDAO;
import com.saulsanchez.universidad.universidadbackend.servicios.contratos.ProfesorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Component
public class ProfesoresCommand implements CommandLineRunner {

    @Autowired
    @Qualifier("profesorDAOImpl")
    private PersonaDAO personaDAO;
    @Autowired
    private CarreraDAO carreraDAO;

    @Override
    public void run(String... args) throws Exception {

        /*Direccion direccion = new Direccion("San Pascual", "1", "03658", "2", "2", "Alicante");
        Profesor profesor = new Profesor(null, "Don Juan", "Paz", "33322333H", direccion, new BigDecimal(2000));

        personaDAO.save(profesor);*/

        /*Optional<Carrera> ingSistemas = carreraDAO.findById(4);
        Optional<Carrera> licSistemas = carreraDAO.findById(8);

        Optional<Persona> oProfesor = personaDAO.findById(3);

        Set<Carrera> carreras = new HashSet<>();
        carreras.add(ingSistemas.get());
        carreras.add(licSistemas.get());
        System.out.println(oProfesor.toString());

        Profesor profesor = (Profesor) oProfesor.get();
        profesor.setCarreras(carreras);
        profesor.setNombre("Don Matías");

        personaDAO.save(profesor);*/

        /*Iterable<Persona> profesores = ((ProfesorDAO)personaDAO).findProfesoresByCarrera("Licenciatura en Sistemas");

        profesores.forEach(p -> System.out.println(p.toString()));*/

        /*Optional<Carrera> ingSistemas = carreraDAO.findById(4);

        Iterable<Persona> alumnos = personaDAO.findAll();
        alumnos.forEach(alumno -> ((Alumno)alumno).setCarrera(ingSistemas.get()));
        alumnos.forEach(alumno -> personaDAO.save(alumno));*/

        //Optional<Persona> alumno_1 = personaDAO.findById(1);

        /*Optional<Persona> personaNomApe = personaDAO.buscarPorNombreYApellido(alumno_1.get().getNombre(), alumno_1.get().getApellido());
        System.out.println(personaNomApe.toString());

        Optional<Persona> personaDni = personaDAO.buscarPorDni(alumno_1.get().getDni());
        System.out.println(personaDni.toString());

        Iterable<Persona> personasApellidos = personaDAO.buscarPersonaPorApellido(alumno_1.get().getApellido());
        personasApellidos.forEach(System.out::println);*/

        /*Optional<Carrera> ingSistemas = carreraDAO.findById(4);
        Iterable<Persona> alumnosCarrera = ((AlumnoDAO) personaDAO).buscarAlumnosPorNombreCarrera(ingSistemas.get().getNombre());
        alumnosCarrera.forEach(System.out::println);*/
    }
}
