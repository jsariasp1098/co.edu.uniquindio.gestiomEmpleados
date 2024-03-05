package co.edu.unquindio.builder;

public class Cliente {
    private String nombre, apellido, cedula, email, direccion;
    private int edad;
    private double peso;
    private double estatura;
    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String cedula, String email, String direccion, int edad, double peso, double estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.email = email;
        this.direccion = direccion;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public static ClienteBuilder builder(){
        return new ClienteBuilder();
    }
}
