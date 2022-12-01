package com.saulsanchez.universidad.universidadbackend;

import com.saulsanchez.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import com.saulsanchez.universidad.universidadbackend.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AlumnosCommand implements CommandLineRunner {

    @Autowired
    @Qualifier("alumnoDAOImpl")
    private PersonaDAO personaDAO;
    @Autowired
    private CarreraDAO carreraDAO;

    @Override
    public void run(String... args) throws Exception {

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
