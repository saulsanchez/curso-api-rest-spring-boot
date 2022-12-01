package com.saulsanchez.universidad.universidadbackend.servicios.implementaciones;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Aula;
import com.saulsanchez.universidad.universidadbackend.modelo.entidades.enumeradores.Pizarron;
import com.saulsanchez.universidad.universidadbackend.repositorios.AulaRepository;
import com.saulsanchez.universidad.universidadbackend.servicios.contratos.AulaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AulaDAOImpl extends GenericoDAOImpl<Aula, AulaRepository> implements AulaDAO {

    @Autowired
    public AulaDAOImpl(@Qualifier("repositorioAulas") AulaRepository repository) {
        super(repository);
    }

    @Override
    public Iterable<Aula> buscarAulaPorTipoPizarron(Pizarron pizarron) {
        return repository.buscarAulaPorTipoPizarron(pizarron);
    }
}
