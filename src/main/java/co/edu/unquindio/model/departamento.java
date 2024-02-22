package co.edu.unquindio.model;

import java.util.List;

public class departamento {
    private String nombre;
    private String codigo;
    List<empleado> listEmpleado;
    public departamento() {
    }
    public departamento(String nombre, String codigo, empleado listEmpleado) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listEmpleado = (List<empleado>) listEmpleado;
    }

    public void setListEmpleado(List<empleado> listEmpleado) {
        this.listEmpleado = listEmpleado;
    }
    public List<empleado> getListEmpleado() {
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
