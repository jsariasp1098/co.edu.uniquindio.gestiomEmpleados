package co.edu.unquindio;

import co.edu.unquindio.model.Empleado;
import co.edu.unquindio.model.Empresa;
import co.edu.unquindio.model.Proyecto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Empresa Empresa1;
        Empresa1 = inicializarDatos();
        List<Proyecto> proyectos = new ArrayList<>();
        proyectos = asignarProyectos(Empresa1);
        mostrarProyectosEmpleados(proyectos);

        //listEmpleados();
    }

    private static void mostrarProyectosEmpleados(List<Proyecto> proyectos) {
        for (Proyecto pro: proyectos) {
            System.out.println("El empleado:"+pro.getEmpladoAsignado().getNombre()+" tiene asigando el Proyecto: "+pro.getNombre());
        }
    }

    private static Empresa inicializarDatos() {
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

       // System.out.println(empleado3.getNombre());

        Empresa1.getListEmpleado().add(empleado1);
        Empresa1.getListEmpleado().add(empleado2);
        Empresa1.getListEmpleado().add(empleado3);

//        for (Empleado e: Empresa1.getListEmpleado()) {
//            System.out.println(e.getNombre());
//        }
       // System.out.println(Empresa1.getListEmpleado());
        return Empresa1;
    }

    public static List<Proyecto> asignarProyectos(Empresa empresa1){

        Proyecto proyecto1 = new Proyecto();
        proyecto1.setCodigoProyecto("123");
        proyecto1.setNombre("Infraestructura Red");
        Proyecto proyecto2 = new Proyecto();
        proyecto2.setCodigoProyecto("122");
        proyecto2.setNombre("Backup Servicios");
        Proyecto proyecto3 = new Proyecto();
        proyecto3.setCodigoProyecto("123");
        proyecto3.setNombre("Manejo Correos");

        List<Proyecto> proyectos = new ArrayList<>();
        proyectos.add(proyecto1);
        proyectos.add(proyecto2);
        proyectos.add(proyecto3);

//        for (Proyecto pro : proyectos) {
//            pro.setEmpladoAsignado(empresa1.getListEmpleado().get(i));
//            proyectos.add(pro);
//            i ++;
//        }
        for (int i=0; i< proyectos.size(); i ++) {
            Proyecto pro = proyectos.get(i);
            pro.setEmpladoAsignado(empresa1.getListEmpleado().get(i));
        }
//        for (Proyecto pro: proyectos) {
//            System.out.println(pro.getEmpladoAsignado().getNombre());
//        }
        return proyectos;
    }

}