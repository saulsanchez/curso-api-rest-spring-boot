package com.saulsanchez.universidad.universidadbackend.repositorios;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Empleado;
import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Persona;
import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Profesor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static com.saulsanchez.universidad.universidadbackend.datos.DatosDummy.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class PersonaRepositoryTest {

    @Autowired
    @Qualifier("repositorioAlumnos")
    PersonaRepository alumnosRepository;

    @Autowired
    @Qualifier("repositorioEmpleados")
    PersonaRepository empleadosRepository;

    @Autowired
    @Qualifier("repositorioProfesores")
    PersonaRepository profesoresRepository;

    @Test
    void buscarPorNombreYApellido() {
        //given
        Persona save = empleadosRepository.save(empleado01());

        //when
        Optional<Persona> expected = empleadosRepository.buscarPorNombreYApellido(empleado01().getNombre(), empleado01().getApellido());

        //then
        assertThat(expected.get()).isInstanceOf(Empleado.class);
        assertThat(expected.get()).isEqualTo(save);
    }

    @Test
    void buscarPorDni() {
        //given
        Persona save = profesoresRepository.save(profesor01());

        //when
        Optional<Persona> expected = profesoresRepository.buscarPorDni(profesor01().getDni());

        //then
        assertThat(expected.get()).isInstanceOf(Profesor.class);
        assertThat(expected.get()).isEqualTo(save);
        assertThat(expected.get().getDni()).isEqualTo(save.getDni());
    }

    @Test
    void buscarPersonaPorApellido() {
        //given
        alumnosRepository.saveAll(Arrays.asList(alumno01(), alumno02(), alumno03()));

        //when
        String apellido = "Benítez";
        List<Persona> expected = (List<Persona>) alumnosRepository.buscarPersonaPorApellido(apellido);

        //then
        assertThat(expected.size() == 2).isTrue();
    }
}