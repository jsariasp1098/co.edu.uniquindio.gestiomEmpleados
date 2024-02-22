package co.edu.unquindio.model;

public class empleado {
    private String nombre;
    private String ID;
    private departamento idDepartamento;
    public empleado(String nombre, String ID, String departamento) {
    }
    public empleado(String nombre, String ID, departamento idDepartamento) {
        this.nombre = nombre;
        this.ID = ID;
        this.idDepartamento = idDepartamento;
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
    public departamento getIdDepartamento() {
        return idDepartamento;
    }
    public void setIdDepartamento(departamento idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
}
