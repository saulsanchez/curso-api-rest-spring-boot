package com.saulsanchez.universidad.universidadbackend;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Carrera;
import com.saulsanchez.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CarreraComandos implements CommandLineRunner {

    @Autowired
    private CarreraDAO servicio;

    @Override
    public void run(String... args) throws Exception {

        /*Carrera ingSistemas = new Carrera(null, "Ingeniería en Sistemas", 60, 5);
        Carrera ingIndustrial = new Carrera(null, "Ingeniería Industrial", 55, 5);
        Carrera ingAlimentos = new Carrera(null, "Ingeniería en Alimentos", 53, 5);
        Carrera ingElectronica = new Carrera(null, "Ingeniería Electrónica", 45, 5);
        Carrera licSistemas = new Carrera(null, "Licenciatura en Sistemas", 40, 4);
        Carrera licTurismo = new Carrera(null, "Licenciatura en Turismo", 42, 4);
        Carrera licYoga = new Carrera(null, "Licenciatura en Yoga", 25, 3);
        Carrera licRecursos = new Carrera(null, "Licenciatura en Recursos Humanos", 33, 3);

        servicio.save(ingSistemas);
        servicio.save(ingIndustrial);
        servicio.save(ingAlimentos);
        servicio.save(ingElectronica);
        servicio.save(licSistemas);
        servicio.save(licTurismo);
        servicio.save(licYoga);
        servicio.save(licRecursos);*/

        /*List<Carrera> carreras = (List<Carrera>) servicio.findCarrerasByNombreContains("Sistemas");
        carreras.forEach(System.out::println);

        List<Carrera> carrerasIgnoreCase1 = (List<Carrera>) servicio.findCarrerasByNombreContainsIgnoreCase("SISTEMAS");
        List<Carrera> carrerasIgnoreCase2 = (List<Carrera>) servicio.findCarrerasByNombreContainsIgnoreCase("sistemas");
        carrerasIgnoreCase1.forEach(System.out::println);
        carrerasIgnoreCase2.forEach(System.out::println);*/

        /*List<Carrera> carrerasPorAnio = (List<Carrera>) servicio.findCarrerasByCantidadAniosAfter(3);
        carrerasPorAnio.forEach(System.out::println);*/

        /*List<Carrera> carreras = (List<Carrera>) servicio.buscarCarrerasPorProfesorNombreYApellido("Don Juan", "Martín");
        carreras.forEach(carrera -> System.out.println(carrera.toString()));*/
    }
}
