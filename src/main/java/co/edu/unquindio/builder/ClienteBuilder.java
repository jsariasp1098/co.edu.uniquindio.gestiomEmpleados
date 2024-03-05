package co.edu.unquindio.builder;

public class ClienteBuilder {
    private String nombre, apellido, cedula, email, direccion;
    private int edad;
    private double peso;
    private double estatura;

    public ClienteBuilder() {
    }

    public ClienteBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public ClienteBuilder apellido (String apellido){
        this.apellido = apellido;
        return this;
    }
    public ClienteBuilder cedula (String cedula){
        this.cedula = cedula;
        return this;
    }
    public ClienteBuilder email (String email){
        this.email = email;
        return this;
    }
    public ClienteBuilder direcion (String direccion){
        this.direccion = direccion;
        return this;
    }
    public ClienteBuilder edad (int edad){
        this.edad = edad;
        return this;
    }
    public ClienteBuilder peso (double peso){
        this.peso = peso;
        return this;
    }
    public ClienteBuilder estatura (double estatura){
        this.estatura = estatura;
        return this;
    }
    public Cliente Build(){
        return new Cliente(nombre, apellido, cedula, email, direccion, edad, peso, estatura);
    }
}
