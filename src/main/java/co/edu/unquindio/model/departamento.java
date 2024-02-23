package co.edu.unquindio.model;

import java.util.List;

public class Departamento {
    private String nombre;
    private String codigo;
    List<Empleado> listEmpleado;
    public Departamento() {
    }
    public Departamento(String nombre, String codigo, Empleado listEmpleado) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listEmpleado = (List<Empleado>) listEmpleado;
    }

    public void setListEmpleado(List<Empleado> listEmpleado) {
        this.listEmpleado = listEmpleado;
    }
    public List<Empleado> getListEmpleado() {
        return listEmpleado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
