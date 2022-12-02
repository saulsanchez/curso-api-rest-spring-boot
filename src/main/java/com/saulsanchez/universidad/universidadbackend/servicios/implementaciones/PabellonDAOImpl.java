package com.saulsanchez.universidad.universidadbackend.servicios.implementaciones;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Pabellon;
import com.saulsanchez.universidad.universidadbackend.repositorios.PabellonRepository;
import com.saulsanchez.universidad.universidadbackend.servicios.contratos.PabellonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PabellonDAOImpl extends GenericoDAOImpl<Pabellon, PabellonRepository> implements PabellonDAO {

    @Autowired
    public PabellonDAOImpl(@Qualifier("repositorioPabellones") PabellonRepository repository) {
        super(repository);
    }

    @Override
    public Iterable<Pabellon> buscarPabellonesPorLocalidad(String localidad) {
        return repository.buscarPabellonesPorLocalidad(localidad);
    }
}
