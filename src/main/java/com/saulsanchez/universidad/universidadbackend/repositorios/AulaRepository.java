package com.saulsanchez.universidad.universidadbackend.repositorios;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Aula;
import com.saulsanchez.universidad.universidadbackend.modelo.entidades.enumeradores.Pizarron;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Qualifier("repositorioAulas")
public interface AulaRepository extends CrudRepository<Aula, Integer> {

    @Query("select a from Aula a where a.pizarron = ?1")
    Iterable<Aula> buscarAulaPorTipoPizarron(Pizarron pizarron);

    @Query("select a from Aula a join fetch a.pabellon p where p.nombre = ?1")
    Iterable<Aula> buscarAulaPorPabellon(String pabellon);

    @Query("select a from Aula a where a.nroAula = ?1")
    Optional<Aula> buscarAulaPorNumero(Integer numAula);
}
