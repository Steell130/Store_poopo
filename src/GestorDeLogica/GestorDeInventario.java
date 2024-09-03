package GestorDeLogica;

import Logica.Producto;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GestorDeInventario {

    // Declara una lista para almacenar los productos
    private ArrayList<Producto> ListaDeProductos; 
    private Producto[] InventarioTemporal; 
    // Índice para posición en el inventario temporal
    private int indiceInventario;

    // Constructor 
    public GestorDeInventario(int TamañoInventarioTemporal) {
        ListaDeProductos = new ArrayList<>(); // Inicializa la lista de productos
        InventarioTemporal = new Producto[TamañoInventarioTemporal]; // Inicializa el array con el tamaño especificado
        indiceInventario = 0; // Inicializa el índice en 0
    }

    // Método para agregar un nuevo producto
    public void AgregarProducto(Producto ProductoNuevo) {
        ListaDeProductos.add(ProductoNuevo); // Añade el producto nuevo a la lista
    }

    // Método para mostrar la información de todos los productos
    public void MostrarProducto() {
        for (Producto producto : ListaDeProductos) {
            producto.mostrarInformacion(); // Llama al método mostrarInformacion de cada producto
            System.out.println();
        }
    }

    // Método para mostrar la información de un producto específico
    public void MostrarProductoEspecifico(Producto producto) {
        if (producto != null) {
            producto.mostrarInformacion(); // Asumiendo que mostrarInformacion imprime todos los detalles del producto
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    // Método para eliminar un producto de la lista usando su ID
    public void eliminarProducto(int id) {
        Producto producto = BuscarProductoID(id); // Busca el producto por ID
        if (producto != null) {
            ListaDeProductos.remove(producto); // Elimina el producto de la lista si se encuentra
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("El producto con ID " + id + " NO se encontró en el inventario.");
        }
    }

    // Método para buscar un producto en la lista usando su ID
    public Producto BuscarProductoID(int id) {
        for (Producto producto : ListaDeProductos) {
            if (producto.getid() == id) {
                return producto; // Devuelve el producto si se encuentra
            }
        }
        return null; // Devuelve null si no se encuentra el producto
    }

    // Método para modificar las características de un producto existente
    public void ModificarProducto(int id) {
        Scanner in = new Scanner(System.in); // Escáner para leer la entrada del usuario
        Producto producto = BuscarProductoID(id); // Busca el producto por ID

        if (producto != null) {
            System.out.println("Producto encontrado. ¿Qué te gustaría modificar?");
            // Muestra las opciones de modificación al usuario
            System.out.println("1. ID");
            System.out.println("2. Nombre");
            System.out.println("3. Precio");
            System.out.println("4. Stock");

            try {
                int opcion = in.nextInt(); // Lee la opción seleccionada por el usuario
                in.nextLine(); // Consume la nueva línea para evitar problemas con nextLine

                // Modifica el atributo correspondiente según la opción seleccionada
                switch (opcion) {
                    case 1:
                        System.out.println("Introduce el nuevo ID:");
                        int NuevoID = in.nextInt();
                        producto.setId(NuevoID); // Modifica el ID del producto
                        break;
                    case 2:
                        System.out.println("Introduce el nuevo nombre:");
                        String NuevoNombre = in.nextLine();
                        producto.setNombre(NuevoNombre); // Modifica el nombre del producto
                        break;
                    case 3:
                        System.out.println("Introduce el nuevo precio:");
                        double NuevoPrecio = in.nextDouble();
                        producto.setPrecio(NuevoPrecio); // Modifica el precio del producto
                        break;
                    case 4:
                        System.out.println("Introduce la nueva cantidad:");
                        int NuevoStock = in.nextInt();
                        producto.setStock(NuevoStock); // Modifica el stock del producto
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }

                System.out.println("Producto modificado exitosamente.");
            } catch (InputMismatchException e) {
                // Maneja el error si el usuario ingresa un dato no válido
                System.out.println("¡Error! Ingrese un dígito válido.");
            } catch (Exception e) {
                // Maneja cualquier otro tipo de error
                System.out.println("¡Error! Modificación fallida del producto.");
            }
        } else {
            // Si el producto no se encuentra, se informa al usuario
            System.out.println("Producto no encontrado.");
        }
    }

    // Método para generar un informe del inventario
    public void GenerarInforme() {
        System.out.println("Informe del Inventario:");
        if (ListaDeProductos.isEmpty()) {
            System.out.println("No hay productos");
        } else {
            for (Producto producto : ListaDeProductos) {
                producto.mostrarInformacion();
                System.out.println("-------------------");
            }
        }
    }
}
