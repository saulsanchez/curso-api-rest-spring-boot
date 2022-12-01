package com.saulsanchez.universidad.universidadbackend;

import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Direccion;
import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Empleado;
import com.saulsanchez.universidad.universidadbackend.modelo.entidades.Persona;
import com.saulsanchez.universidad.universidadbackend.modelo.entidades.enumeradores.TipoEmpleado;
import com.saulsanchez.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import com.saulsanchez.universidad.universidadbackend.servicios.contratos.EmpleadoDAO;
import com.saulsanchez.universidad.universidadbackend.servicios.contratos.PersonaDAO;
import com.saulsanchez.universidad.universidadbackend.servicios.contratos.ProfesorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class EmpleadosCommand implements CommandLineRunner {

    @Autowired
    @Qualifier("empleadoDAOImpl")
    private PersonaDAO personaDAO;

    @Override
    public void run(String... args) throws Exception {

        /*Direccion direccion = new Direccion("Tibi", "18", "03658", "2", "2", "Ibi");
        Empleado empleado = new Empleado(null, "Miguel", "Salinas", "15455555E", direccion, new BigDecimal(1500), TipoEmpleado.MANTENIMIENTO);

        Direccion direccion2 = new Direccion("Pizarro", "38", "03658", "2", "2", "San Vicente");
        Empleado empleado2 = new Empleado(null, "Manuel", "Ruiz", "48488855L", direccion2, new BigDecimal(1510), TipoEmpleado.ADMINISTRATIVO);

        personaDAO.save(empleado);
        personaDAO.save(empleado2);*/

        /*Iterable<Persona> empleados = ((EmpleadoDAO) personaDAO).findEmpleadoByTipoEmpleado(TipoEmpleado.ADMINISTRATIVO);
        empleados.forEach(System.out::println);*/
    }
}
