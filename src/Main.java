import modelo.Cliente;
import modelo.Vendedor;
import servicio.ClienteServicio;
import servicio.VendedorServicio;


public class Main {
    public static void main(String[] args) {

        VendedorServicio vs=new VendedorServicio();
        ClienteServicio clis=new ClienteServicio();


        // ttres vendedores, john,anna y peter
        Vendedor john=new Vendedor();
        john.setNombre("john");
        john.setRut("55555-5");
        john.setCantidadVenta(55555);
        john.setComision(0.1);

        vs.mostrar(john);

        Vendedor anna=new Vendedor("Anna","2222-2",50000,0.2);

        Vendedor peter=new Vendedor("Peter","5555555-3");

        Cliente cli1=new Cliente();
        cli1.setNombre("Susan");
        cli1.setCorreo("susan@gmail.com");
        cli1.setFono("232333-333");
        cli1.setDeuda(555);

        clis.mostrar(cli1);

    }
}