package com.saulsanchez.universidad.universidadbackend.datos;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Carrera;

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
}
