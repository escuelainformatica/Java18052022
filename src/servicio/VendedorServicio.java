package servicio;

import modelo.Vendedor;

public class VendedorServicio {

    public void mostrar(Vendedor argumento) {
        System.out.println("------------------");
        System.out.println("Nombre vendedor:"+argumento.getNombre());
        System.out.println("Rut:"+argumento.getRut());
    }
}
