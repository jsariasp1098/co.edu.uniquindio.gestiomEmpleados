package co.edu.unquindio.model;

public class Empleado {
    private String nombre;
    private String ID;
    Departamento idDepartamento;

    public Empleado(String nombre, String ID, Departamento idDepartamento) {
        this.nombre = nombre;
        this.ID = ID;
        this.idDepartamento = idDepartamento;
    }

    public Empleado() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public Departamento getIdDepartamento() {
        return idDepartamento;
    }
    public void setIdDepartamento(Departamento idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
}
