package co.edu.unquindio.builder;

import co.edu.unquindio.builder.Cliente;

public class Main {
    public static void main(String[] args) {

        crearClienteBasico();
    }
    public static void crearClienteBasico(){
        Cliente clienteBasico = Cliente.builder().nombre("Steven").apellido("Ruiz").cedula("1233456").Build();
            System.out.println("Cliente con datos basicos es: Nombre: "+clienteBasico.getNombre() + " Apellido: " +
                    clienteBasico.getApellido() + " Cedula: "+ clienteBasico.getCedula());
    }


}
