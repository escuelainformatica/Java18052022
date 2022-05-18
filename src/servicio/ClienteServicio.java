package servicio;

import modelo.Cliente;

public class ClienteServicio
{
    public void mostrar(Cliente cli) {
        System.out.println("------");
        System.out.println("nombre: "+cli.getNombre());
        System.out.println("correo:"+cli.getCorreo());
    }
}
