package com.saulsanchez.universidad.universidadbackend;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Aula;
import com.saulsanchez.universidad.universidadbackend.servicios.contratos.AulaDAO;
import com.saulsanchez.universidad.universidadbackend.servicios.contratos.PabellonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AulasCommand implements CommandLineRunner {

    @Autowired
    private AulaDAO aulaDAO;
    @Autowired
    private PabellonDAO pabellonDAO;

    @Override
    public void run(String... args) throws Exception {

        /*Aula aula = new Aula(null, 1, "4x9", 30, Pizarron.PIZARRA_TIZA);
        Aula aula2 = new Aula(null, 2, "4x7", 23, Pizarron.PIZARRA_BLANCA);
        Aula aula3 = new Aula(null, 3, "7x4", 39, Pizarron.PIZARRA_BLANCA);
        Aula aula4 = new Aula(null, 4, "3x4", 45, Pizarron.PIZARRA_TIZA);
        Aula aula5 = new Aula(null, 5, "4x2", 12, Pizarron.PIZARRA_TIZA);

        aulaDAO.save(aula);
        aulaDAO.save(aula2);
        aulaDAO.save(aula3);
        aulaDAO.save(aula4);
        aulaDAO.save(aula5);*/

        /*Iterable<Aula> aulas = aulaDAO.buscarAulaPorTipoPizarron(Pizarron.PIZARRA_BLANCA);
        aulas.forEach(System.out::println);*/

        /*Direccion direccionFernandoAlonso = new Direccion("San Pascual", "12", "03658", "2", "2", "Lanzarote");
        Pabellon pabellonFernandoAlonso = new Pabellon(null, 200d, "Fernando Alonso", direccionFernandoAlonso);

        Direccion direccionRafaelNadal = new Direccion("Maracaná", "45", "65587", "2", "1", "Madrid");
        Pabellon pabellonRafaelNadal = new Pabellon(null, 200d, "Rafael Nadal", direccionRafaelNadal);

        pabellonDAO.save(pabellonFernandoAlonso);
        pabellonDAO.save(pabellonRafaelNadal);*/

        /*Optional<Pabellon> pabellonRafaelNadal = pabellonDAO.findById(1);
        Optional<Pabellon> pabellonFernandoAlonso = pabellonDAO.findById(2);
        Iterable<Aula> aulas = aulaDAO.findAll();

        aulas.forEach(aula -> {
            if (aula.getId() % 2 == 0) {
                aula.setPabellon(pabellonRafaelNadal.get());
            } else {
                aula.setPabellon(pabellonFernandoAlonso.get());
            }
            aulaDAO.save(aula);
        });*/

        Iterable<Aula> aulasRafaelNadal = aulaDAO.buscarAulasPorPabellon("Rafael Nadal");
        System.out.println("Aulas del pabellón Rafael Nadal");
        aulasRafaelNadal.forEach(System.out::println);

        Iterable<Aula> aulasFernandoAlonso = aulaDAO.buscarAulasPorPabellon("Fernando Alonso");
        System.out.println("Aulas del pabellón Fernando Alonso");
        aulasFernandoAlonso.forEach(System.out::println);

    }
}
