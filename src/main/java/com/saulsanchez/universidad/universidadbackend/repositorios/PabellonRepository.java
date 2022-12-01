package com.saulsanchez.universidad.universidadbackend.repositorios;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Pabellon;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("repositorioPabellones")
public interface PabellonRepository extends CrudRepository<Pabellon, Integer> {

}
