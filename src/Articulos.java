import java.util.Arrays;

abstract class Articulos {
    protected String telefonos;
    protected String laptops;
    protected String bocinas;
    protected String cargadoes;

    protected double precio;
    protected String descripcion;
    protected int ContadorArticulos;

    public Articulos(double numeroCuenta) {
        this.precio = precio;
        this.descripcion();
    }

    public Articulos(Object articulos) {

    }

    void descripcion() {
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio += precio;
            ++this.precio;
            System.out.println("digite el dispositivo de ineteres .");
        } else {
            System.out.println("El precio es: .");
        }
    }

    public abstract void retirar(double cantidad);

    public void Articulo(double precio, int MostrarArticulos) {
        if (precio > 0 && this.precio >= precio) {
            this.precio -= precio * (1 + MostrarArticulos);
            this.ContadorArticulos++;
            System.out.println("articulo Seleccionado.");
        } else {
            System.out.println("precio a pagar. .");
        }
    }

    public abstract Object mostrarDatos();

    public double obtenerPrecio() {
        return this.precio;
    }

    public String TipoArticulo() {
        return this.telefonos;

    }

}