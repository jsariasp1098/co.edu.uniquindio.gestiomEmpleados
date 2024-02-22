package co.edu.unquindio.model;

public class proyecto {
    private String nombre;
    private String codigoProyecto;
    private String empladoAsignado;

    public proyecto() {
    }

    public proyecto(String nombre, String codigoProyecto, String empladoAsignado) {
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

    public String getEmpladoAsignado() {
        return empladoAsignado;
    }

    public void setEmpladoAsignado(String empladoAsignado) {
        this.empladoAsignado = empladoAsignado;
    }
}
