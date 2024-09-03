package Principal;

import java.util.Scanner;
import GestorDeLogica.GestorDeInventario;
import Logica.Perecedero;
import Logica.NoPerecedero;
import Logica.Producto;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

    // Crear un objeto Scanner para leer la entrada del usuario
        Scanner in = new Scanner(System.in);

        // Especificar el tamaño del inventario temporal
        int tamañoInventarioTemporal = 100; // Puedes ajustar este valor según tus necesidades

        // Crear un objeto GestorDeInventario para manejar las operaciones del inventario
        GestorDeInventario gestorDeInventario = new GestorDeInventario(tamañoInventarioTemporal);

        // Variable para almacenar la opción seleccionada por el usuario7
        
        int opcion = 0;
        
        //El try catch
        try {
            do {
                // Mostrar el menú de opciones al usuario
                System.out.println("\nMenú de los productos: ");
                System.out.println("1. Agregar Producto Perecedero");
                System.out.println("2. Agregar Producto No Perecedero");
                System.out.println("3. Modificar productos por ID");
                System.out.println("4. Eliminar producto por ID");
                System.out.println("5. Buscar producto por ID");
                System.out.println("6. Mostrar inventario");
                System.out.println("7. Salir.");
                System.out.print("Seleccione una opción: ");

                // Leer la opción seleccionada
                try {
                    opcion = in.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Opción no válida, por favor ingrese un número.");
                    in.next(); // Consumir la entrada no válida
                    continue; // Regresar al menú
                }

                // Manejar la opción seleccionada usando una estructura switch
                switch (opcion) {

                    case 1:
                        System.out.println("Siga las Instrucciones para agregar producto perecedero.");

                        // Solicitar y leer los datos del producto perecedero
                        System.out.print("Id del producto perecedero: ");
                        int id = in.nextInt();

                        System.out.print("Nombre del producto perecedero: ");
                        in.nextLine();  // Consumir el salto de línea
                        String nombre = in.nextLine();

                        System.out.print("Precio del producto perecedero: ");
                        double precio = in.nextDouble();

                        System.out.print("Cantidad actual en el inventario perecedero: ");
                        int stock = in.nextInt();

                        System.out.print("Fecha de Vencimiento: ");
                        in.nextLine();  // Consumir el salto de línea
                        String FechaVencimiento = in.nextLine();

                        System.out.print("Temperatura: ");
                        int TemperaturaDelalmacen = in.nextInt();

                        // Agregar el producto perecedero al inventario
                        gestorDeInventario.AgregarProducto(new Perecedero(id, nombre, precio, stock, FechaVencimiento, TemperaturaDelalmacen));
                        System.out.println("Producto perecedero añadido correctamente.");
                        break;

                    case 2:
                        System.out.println("Siga las Instrucciones para agregar producto no perecedero.");

                        // Solicitar y leer los datos del producto no perecedero
                        System.out.print("Id del producto: ");
                        id = in.nextInt();

                        System.out.print("Nombre del producto No perecedero: ");
                        in.nextLine();  // Consumir el salto de línea
                        nombre = in.nextLine();

                        System.out.print("Precio del producto No perecedero: ");
                        precio = in.nextDouble();

                        System.out.print("Cantidad actual en el inventario No perecedero: ");
                        stock = in.nextInt();

                        System.out.print("Cantidad de meses de garantía del producto No Perecedero: ");
                        int garantia = in.nextInt();

                        // Agregar el producto no perecedero al inventario
                        gestorDeInventario.AgregarProducto(new NoPerecedero(id, nombre, precio, stock, garantia));
                        System.out.println("¡Producto No Perecedero agregado!");
                        break;

                    case 3:
                        // Modificar un producto existente por ID
                        System.out.print("Ingrese el ID del producto a modificar: ");
                        int modID = in.nextInt();
                        gestorDeInventario.ModificarProducto(modID); // Llamar al método modificar
                        break;

                    case 4:
                        // Eliminar un producto por ID
                        System.out.print("Ingrese el ID del producto que desea eliminar: ");
                        id = in.nextInt();
                        gestorDeInventario.eliminarProducto(id);
                        break;

                    case 5:
                        // Buscar un producto por ID
                        System.out.print("Ingrese el ID del producto que desea buscar: ");
                        id = in.nextInt();
                        Producto producto = gestorDeInventario.BuscarProductoID(id);
                        gestorDeInventario.MostrarProductoEspecifico(producto); // Mostrar el producto si existe
                        break;

                    case 6:
                        // Mostrar el inventario actual
                        System.out.println("Inventario actual:");
                        gestorDeInventario.GenerarInforme(); // Llamada al método sin parámetros
                        break;

                    case 7:
                        // Salir del programa
                        System.out.println("Saliendo del programa...");
                        in.close();
                        System.exit(0);
                        break;

                    default:
                        // Manejar el caso en que la opción seleccionada no sea válida
                        System.out.println("Opción no válida, intente de nuevo.");
                }
            } while (opcion != 7); // Repetir hasta que el usuario seleccione salir

        } catch (Exception e) {
            // Capturar cualquier excepción y evitar que el programa se cierre inesperadamente
            System.out.println("Ocurrió un error: " + e.getMessage());
            in.next(); // Consumir la entrada inválida
        }
    }
}
