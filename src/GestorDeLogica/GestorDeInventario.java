package GestorDeLogica;

import Logica.Producto;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GestorDeInventario {

    private ArrayList<Producto> ListaDeProductos; // hay creo el arraylist
    private Producto[] InventarioTemporal; // producto lo convierto en un vector
    private int indiceInventario; // una variable :D

    public void GestorDeInentario(int TamañoInventarioTemporal) {
        ListaDeProductos = new ArrayList<>();
        InventarioTemporal = new Producto[TamañoInventarioTemporal];
        indiceInventario = 0;
    }

// metodo para agregar productos
    public void AgregarProducto(Producto ProductoNuevo) {
        ListaDeProductos.add(ProductoNuevo);
    }

// metodo de mostrar producto
    public void MostrarProducto() {

        for (Producto producto : ListaDeProductos) {
            producto.mostrarInformacion();
            System.out.println();
        }
    }

    // metodo de buscar el id del producto
    public Producto BuscarProductoID(int id) {
        for (Producto producto : ListaDeProductos) {
            if (producto.getid() == (id)) {
                return producto;
            }
        }
        return null; //Devuele el null si no es encontrado
    }

    // Método para modificar el producto
    public void ModificarProducto(int id) {
        Scanner in = new Scanner(System.in);
        Producto producto = BuscarProductoID(id);

        if (producto != null) {
            System.out.println("Producto encontrado. ¿Qué te gustaría modificar?");

            //Imprime las opciones para cambiar alguna caracteristica
            System.out.println("1. ID");
            System.out.println("2. Nombre");
            System.out.println("3. Precio");
            System.out.println("4. Stock");

            try {
                int opcion = in.nextInt();
                in.nextLine(); // Consumir la nueva línea para evitar problemas con nextLine

                switch (opcion) {
                    case 1:
                        System.out.println("Introduce el nuevo nombre:");
                        String NuevoID = in.nextLine();
                        producto.setNombre(NuevoID);
                        break;
                    case 2:
                        System.out.println("Introduce el nuevo nombre:");
                        String NuevoNombre = in.nextLine();
                        producto.setNombre(NuevoNombre);
                        break;

                    case 3:
                        System.out.println("Introduce el nuevo precio:");
                        double NuevoPrecio = in.nextDouble();
                        producto.setPrecio(NuevoPrecio);
                        break;

                    case 4:
                        System.out.println("Introduce la nueva cantidad:");
                        int NuevoStock = in.nextInt();
                        producto.setStock(NuevoStock);
                        break;

                    default:
                        System.out.println("Opción no válida.");
                        break;
                }

                System.out.println("Producto modificado exitosamente.");
            } catch (InputMismatchException e) {
                System.out.println("¡Error! Ingrese un digito valido.");
            } catch (Exception e) {
                System.out.println("¡Error! Mal modificación del producto.");

            }
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void GenerarInforme(int Stock) {
        System.out.println("Informe del Inventario:");
        if (ListaDeProductos.isEmpty()) {
            System.out.println("No hay productos");
        } else {
            for (Producto producto : ListaDeProductos) {
                System.out.println(producto);
            }
        }
    }
}
