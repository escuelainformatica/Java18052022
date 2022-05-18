package modelo;

public class Vendedor {
    // los campos no pueden ser publicos, tienen que ser privados.
    private String nombre;
    private String rut;
    private int cantidadVenta;
    private double comision;
    // con el boton derecho -> generate

    // refactorizar

    public Vendedor() {
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setRut(String rut) {
        this.rut=rut;
    }
    public String getRut() {
        return rut;
    }
    public void setCantidadVenta(int cantidadVenta) {
        this.cantidadVenta=cantidadVenta;
    }
    public int getCantidadVenta() {
        return cantidadVenta;
    }
    public void setComision(double comision) {
        this.comision=comision;
    }
    public double getComision() {
        return comision;
    }


    public Vendedor(String nombre, String rut, int cantidadVenta, double comision) {
        this.nombre = nombre;
        this.rut = rut;
        this.cantidadVenta = cantidadVenta;
        this.comision = comision;
    }

    public Vendedor(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }
}
