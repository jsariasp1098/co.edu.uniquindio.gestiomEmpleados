package co.edu.unquindio.model;

public class empresa {
    private String nombre;
    private String idEmpresa;
    private String direccion;
    public empresa() {
    }
    public empresa(String nombre, String idEmpresa, String direccion) {
        this.nombre = nombre;
        this.idEmpresa = idEmpresa;
        this.direccion = direccion;
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
