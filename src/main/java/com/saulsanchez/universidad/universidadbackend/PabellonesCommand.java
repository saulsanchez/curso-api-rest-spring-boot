package com.saulsanchez.universidad.universidadbackend;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Pabellon;
import com.saulsanchez.universidad.universidadbackend.servicios.contratos.PabellonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PabellonesCommand implements CommandLineRunner {

    @Autowired
    private PabellonDAO pabellonDAO;

    @Override
    public void run(String... args) throws Exception {

        /*Direccion direccionIkerCasillas = new Direccion("Bailén", "77", "66584", "1", "3", "Madrid");
        Pabellon pabellonIkerCasillas = new Pabellon(null, 2000d, "Iker Casillas", direccionIkerCasillas);

        pabellonDAO.save(pabellonIkerCasillas);*/

        /*Iterable<Pabellon> pabellones = pabellonDAO.buscarPabellonesPorLocalidad("Madrid");
        pabellones.forEach(System.out::println);*/

        Iterable<Pabellon> pabellones = pabellonDAO.buscarPabellonesPorNombre("K");
        pabellones.forEach(System.out::println);

    }
}
