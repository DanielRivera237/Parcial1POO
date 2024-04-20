public class ArticulosGuardados extends TipoArticulo{

    public ArticulosGuardados(int precio, String tipoDispositivo) {
        super(Integer.parseInt(tipoDispositivo));
        System.out.printf("%sMostrando los articulos guardados", mostrarDatos());
    }

    public ArticulosGuardados(Object articulos) {
        super(articulos);
    }

    @Override
    public void retirar(double precio) {

    }
}
