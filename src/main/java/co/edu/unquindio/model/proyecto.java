package co.edu.unquindio.model;

public class Proyecto {
    private String nombre;
    private String codigoProyecto;
    private Empleado empladoAsignado;
    public Proyecto() {
    }
    public Proyecto(String nombre, String codigoProyecto, Empleado empladoAsignado) {
        this.nombre = nombre;
        this.codigoProyecto = codigoProyecto;
        this.empladoAsignado = empladoAsignado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigoProyecto() {
        return codigoProyecto;
    }
    public void setCodigoProyecto(String codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }
    public Empleado getEmpladoAsignado() {
        return empladoAsignado;
    }
    public void setEmpladoAsignado(Empleado empladoAsignado) {
        this.empladoAsignado = empladoAsignado;
    }
}
