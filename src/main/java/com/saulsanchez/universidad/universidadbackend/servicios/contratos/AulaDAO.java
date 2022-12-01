package com.saulsanchez.universidad.universidadbackend.servicios.contratos;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Aula;
import com.saulsanchez.universidad.universidadbackend.modelo.entidades.enumeradores.Pizarron;

public interface AulaDAO extends GenericoDAO<Aula> {

    Iterable<Aula> buscarAulaPorTipoPizarron(Pizarron pizarron);
}
