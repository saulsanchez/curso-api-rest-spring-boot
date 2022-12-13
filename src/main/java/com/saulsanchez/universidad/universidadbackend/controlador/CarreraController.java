package com.saulsanchez.universidad.universidadbackend.controlador;

import com.saulsanchez.universidad.universidadbackend.exception.BadRequestException;
import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Carrera;
import com.saulsanchez.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carreras")
public class CarreraController {

    private final CarreraDAO carreraDAO;

    @Autowired
    public CarreraController(CarreraDAO carreraDAO) {
        this.carreraDAO = carreraDAO;
    }

    @GetMapping
    public List<Carrera> obtenerTodos() {
        List<Carrera> carreras = (List<Carrera>) carreraDAO.findAll();

        if (carreras.isEmpty()) {
            throw new BadRequestException("No existen carreras");
        }

        return carreras;
    }
}
