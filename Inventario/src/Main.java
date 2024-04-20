import inventario.Articulo;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static ArrayList<inventario.Articulo> listaArticulos = new ArrayList<Articulo>();

    public static void main(String[] args) {
        menuPrincipal();
    }
    public static void menuPrincipal() {
        int opc=0;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.println("----------ELECTROMART---------- ");
                System.out.println("----Bienvenido al inventario----");
                System.out.println("  1. Agregar articulo");
                System.out.println("  2.Modificar articulo");
                System.out.println("  3. Mostrar listado de todos los articulos");
                System.out.println("  4. Salir");
                opc = sc.nextInt();

                switch (opc) {
                    case 1:
                        agregarArticulo();
                        break;
                    case 2:
                        modificarPrecioArticulo();
                        break;
                    case 3:
                        mostrarListadoArticulos();
                        break;
                    case 0:
                        System.out.println("Hasta pronto");
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;
                }
            }catch (Exception e){
                System.out.println("Opcion invalida");
                menuPrincipal();
            }
        }while(opc != 4) ;

    }



    public static void agregarArticulo() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Elija el tipo de articulo: ");
            System.out.println("1. Laptop");
            System.out.println("2. Telefono Movil");
            int opc = sc.nextInt();
        System.out.println("Ingrese el id del articulo: ");
        sc.next();
        String id = sc.nextLine();
        System.out.println("Ingrese el nombre del fabricante: ");
        sc.next();
        String nombre = sc.nextLine();
        System.out.println("Ingrese el modelo");
        sc.next();
        String modelo = sc.nextLine();
        System.out.println("aniada una breve descripcion:");
        sc.next();
        String descripcion = sc.nextLine();
        System.out.println("Ingrese el precio: ");
        double precio = sc.nextDouble();
                if (opc == 1) {
                    System.out.println("Que tipo es?");
                    String tipo = sc.next();
                    System.out.println("El ordenador posee camara?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    int option = sc.nextInt();
                    boolean cam = false;
                    if (option==1){
                        cam=true;
                    }
                    Laptop laptop = new Laptop(nombre, modelo, descripcion,precio,id, tipo,cam);
                    listaArticulos.add(laptop);


                }else{
                    System.out.println("Ingrese la cantidad de memoria RAM del telefono:");
                int ram = sc.nextInt();
                    System.out.println("Ingrese la cantidad de memoria interna: ");
                    int memInterna = sc.nextInt();
                    TelefonoMovil telefonoMovil = new TelefonoMovil(nombre,modelo, descripcion,precio, id,ram, memInterna);
                    listaArticulos.add(telefonoMovil);
                }
                {
                }
        }

    private static void modificarPrecioArticulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el id del producto");
        String idS = sc.next();

        for (Articulo listaArticulo : listaArticulos) {
            if (listaArticulo.getId().equals(idS)) {
                System.out.println("Ingrese el nuevo precio");
                double precio = sc.nextDouble();

                listaArticulo.setPrecio(precio);
return;
            }
        }

    }
    private static void mostrarListadoArticulos() {
        System.out.println("Listado de articulos almacenados ");
        for (int i =0; i<listaArticulos.size();i++){
            System.out.println("------------------------------------------------------");
            System.out.println("ID: "+listaArticulos.get(i).getId());
            System.out.println("Nombre "+listaArticulos.get(i).getNombre());
            System.out.println("Modelo: "+listaArticulos.get(i).getModelo());
            System.out.println("descripcion:"+listaArticulos.get(i).getDescripcion());
            System.out.println("Precio: "+listaArticulos.get(i).getPrecio());
            if (listaArticulos.get(i) instanceof TelefonoMovil){
                TelefonoMovil telefonoMovil= (TelefonoMovil) listaArticulos.get(i);
                System.out.println("RAM: "+telefonoMovil.getRam());
                System.out.println("Memoria interna: "+telefonoMovil.getMemInterna());
            }else {
                Laptop laptop = (Laptop) listaArticulos.get(i);
                System.out.println("Tipo: "+laptop.getTipo());
                if (laptop.isCamara()){
                    System.out.println("Posee camara: Si");
                }else System.out.println("Posee camara: No");

            }
        }            System.out.println("------------------------------------------------------");

    }



}