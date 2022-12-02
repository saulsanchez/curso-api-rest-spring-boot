package com.saulsanchez.universidad.universidadbackend.datos;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.*;
import com.saulsanchez.universidad.universidadbackend.modelo.entidades.enumeradores.TipoEmpleado;

import java.math.BigDecimal;

public class DatosDummy {

    public static Carrera carrera01() {
        return new Carrera(null, "Ingeniería en Sistemas", 50, 5);
    }

    public static Carrera carrera02() {
        return new Carrera(null, "Licenciatura en Sistemas", 45, 4);
    }

    public static Carrera carrera03() {
        return new Carrera(null, "Ingeniería Industrial", 60, 5);
    }

    public static Persona empleado01() {
        return new Empleado(null, "Lautaro", "López", "12354788L", new Direccion(), new BigDecimal("45780.65"), TipoEmpleado.ADMINISTRATIVO);
    }

    public static Persona empleado02() {
        return new Empleado(null, "Leandro", "López", "15478777P", new Direccion(), new BigDecimal("45780.65"), TipoEmpleado.ADMINISTRATIVO);
    }

    public static Persona profesor01() {
        return new Profesor(null, "Martin", "Lugone", "54785478R", new Direccion(), new BigDecimal("6000.65"));
    }

    public static Persona alumno01() {
        return new Alumno(null, "Jhon", "Benítez", "65478222A", new Direccion());
    }

    public static Persona alumno02() {
        return new Alumno(null, "Andrés", "Benítez", "63524179Q", new Direccion());
    }

    public static Persona alumno03() {
        return new Alumno(null, "Joaquín", "León", "93718255K", new Direccion());
    }
}
