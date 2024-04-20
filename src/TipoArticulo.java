abstract class TipoArticulo extends Articulos {
    int MostrarArticulos;
    double precio;
    private String TipoDispositivo;

    String descripcionArticulo;

    public TipoArticulo(int precio, String tipoDispositivo) {
        super( precio);
        this.precio = precio;
        this.TipoDispositivo = tipoDispositivo;
    }

    public TipoArticulo(Object mostrarArticulos){
        super(0.0);
    }

    @Override
    public Object mostrarDatos() {
        System.out.println("TipoArticulo: " + TipoDispositivo());
        System.out.println("descripcion: " + descripcionArticulo());
        System.out.println("Precio: : " + precio);

        return null;
    }

    private String TipoDispositivo() {
        System.out.println("Articulo Seleccionado");
        return null;
    }

    private String descripcionArticulo() {
        System.out.println("Descripcion: ");
        return null;
    }



}

