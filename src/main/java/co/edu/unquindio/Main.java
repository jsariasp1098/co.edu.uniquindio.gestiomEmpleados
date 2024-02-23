package co.edu.unquindio;

import co.edu.unquindio.model.Empleado;
import co.edu.unquindio.model.Empresa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        inicializarDatos();

        //listEmpleados();
    }

    private static void inicializarDatos() {
        Empresa Empresa1 = new Empresa();

        Empleado empleado1 = new Empleado();
        empleado1.setID("1235363");
        empleado1.setNombre("Juan");

        Empleado empleado2 = new Empleado();
        empleado2.setID("8888855");
        empleado2.setNombre("Andres");

        Empleado empleado3 = new Empleado();
        empleado3.setID("66632254");
        empleado3.setNombre("steven");

        System.out.println(empleado3.getNombre());

        Empresa1.getListEmpleado().add(empleado1);

        System.out.println(Empresa1.getListEmpleado());

    }
}