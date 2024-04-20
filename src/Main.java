import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<TipoArticulo> precio = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Object Articulos;
    private double TipoArticulo;

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            ejecutarOpcion(opcion);
        } while (opcion != 9);
    }

    private static void mostrarMenu() {
        System.out.println("\n-- MENU --");
        System.out.println("1. Digite el tipo articulo: ");
        System.out.println("2. Especifique el modelo");
        System.out.println("3. descripcion del articulo");
        System.out.println("4. Mostrar lista de articulos");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                AgregarTipoArticulo();
                break;
            case 2:
                Especificacion();
                break;
            case 3:
                Descripcion();
                break;
            case 4:
                MostrarArticulos();
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opcion invalida. Por favor, seleccione una opcion valida.");
        }
    }


    private static void MostrarArticulos() {
            System.out.println("Ingrese el articulo a buscar");
            int numeroCuenta = scanner.nextInt();
            Articulos(new ArticulosGuardados(Articulos));
            System.out.println("este articulo ya ha sido vendido");


    }

    private static void Articulos(ArticulosGuardados articulosGuardados) {
    }


    private static void Descripcion() {
        System.out.print("descripcion de dispositivo: ");
        int Descripcion  = scanner.nextInt();
        Object articulos = Articulos;
        System.out.println("articulo guardado:.");
    }

    private static void Especificacion() {
        System.out.print("Especifique modelo deseado: ");
        int Especificaciones  = scanner.nextInt();
        Object articulos = Articulos;
        System.out.println("articulo guardado:.");
    }

    public static Object AgregarTipoArticulo() {
        System.out.println("Digite el tipo de articulo: ");
        int tipoArticulo = scanner.nextInt();

        tipoArticulo(new double[tipoArticulo],(Articulos) {
            String ArticulosGuardados;

            Object articulos = Articulos;
            public Object mostrarDatos
                return null;

        }
        System.out.println("Cantidad a pagar");
    }

    }