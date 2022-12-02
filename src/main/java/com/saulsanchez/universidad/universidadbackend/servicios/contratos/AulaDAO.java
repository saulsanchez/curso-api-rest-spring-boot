package com.saulsanchez.universidad.universidadbackend.servicios.contratos;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Aula;
import com.saulsanchez.universidad.universidadbackend.modelo.entidades.enumeradores.Pizarron;

import java.util.Optional;

public interface AulaDAO extends GenericoDAO<Aula> {

    Iterable<Aula> buscarAulaPorTipoPizarron(Pizarron pizarron);

    Iterable<Aula> buscarAulasPorPabellon(String pabellon);

    Optional<Aula> buscarAulaPorNumero(Integer numAula);
}
