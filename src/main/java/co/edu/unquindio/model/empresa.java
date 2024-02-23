package co.edu.unquindio.model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String idEmpresa;
    private String direccion;
    private List<Empleado> listEmpleado  = new ArrayList<>();
    public Empresa() {
    }
    public Empresa(String nombre, String idEmpresa, String direccion, List<Empleado> listEmpleado) {
        this.nombre = nombre;
        this.idEmpresa = idEmpresa;
        this.direccion = direccion;
        this.listEmpleado = listEmpleado;
    }

    public List<Empleado> getListEmpleado() {
        return listEmpleado;
    }

    public void setListEmpleado() {
        this.listEmpleado = listEmpleado;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }
    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
