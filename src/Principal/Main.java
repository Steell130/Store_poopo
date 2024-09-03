

package Principal;

import java.util.Scanner;
import GestorDeLogica.GestorDeInventario;
import Logica.Perecedero;
import Logica.NoPerecedero;
import Logica.Producto;


public class Main {
    Scanner in = new Scanner(System.in);
    GestorDeInventario gestorDeInventario = new GestorDeInventario();
    int opciones;
    try {
    do {
        System.out.println("\n Menu: ");
        System.out.println("Seleccione una opcion");
        System.out.println("1. Añadir un producto.");
        System.out.println("2. Mostrar productos");
        System.out.println("3. Buscar un producti por medio del ID");
        System.out.println("4. Modificar producto.");
        System.out.println("5. Eliminar producto por ID.");
        System.out.println("6. Salir.");
 
    
    switch (opciones){
        
        case 1: 
            System.out.println("Siga las Instrucciones.");
        
            //pido los datos 
            System.out.println("Id del producto: ");
            int id = in.nextInt();
            
            System.out.println("Nombre del producto: ");
            String nombre = in.next();
            
            System.out.println("Precio del producto: ");
            double precio = in.nextDouble();
            
            System.out.println("Cantidad actual en el inventario: ");
            int stock = in.nextInt();
            
            System.out.println("Fecha de Vencimiento: ");
            String FechaVencimiento = in.next();
            
            System.out.println("Temperatura: ");
            int TemperaturaDelalmacen = in.nextInt();
            
            GestorDeLogica.GestorDeInventario(new Perecedero(id, nombre, precio, stock, FechaVencimiento, TemperaturaDelalmacen));
            
        }
    }
}
    
    
    
    

    public static void main(String[] args) {

    }
    
}
