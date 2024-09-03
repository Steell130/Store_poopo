package Logica;

import java.util.Scanner;

public class Producto {
    
    static Scanner in = new Scanner(System.in);
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    // Constructor con manejo de excepciones
    public Producto(int id, String nombre, double precio, int stock) {
        try {
            setId(id); // Utiliza los setters que tienen manejo de excepciones
            setNombre(nombre);
            setPrecio(precio);
            setStock(stock);
        } catch (Exception e) {
            System.out.println("Error al crear el producto: " + e.getMessage());
        }
    }

    public int getid() {
        return id;
    }

    public String getnombre() {
        return nombre;
    }

    public double getprecio() {
        return precio;
    }

    public int getstock() {
        return stock;
    }

    public void setId(int id) {
        try {
            if (id <= 0) {
                throw new IllegalArgumentException("El ID debe ser un número positivo.");
            }
            this.id = id;
        } catch (IllegalArgumentException e) {
            System.out.println("Error al establecer el ID: " + e.getMessage());
        }
    }

    public void setNombre(String nombre) {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre no puede estar vacío.");
            }
            this.nombre = nombre;
        } catch (IllegalArgumentException e) {
            System.out.println("Error al establecer el nombre: " + e.getMessage());
        }
    }

    public void setPrecio(double precio) {
        try {
            if (precio < 0) {
                throw new IllegalArgumentException("El precio no puede ser negativo.");
            }
            this.precio = precio;
        } catch (IllegalArgumentException e) {
            System.out.println("Error al establecer el precio: " + e.getMessage());
        }
    }

    public void setStock(int stock) {
        try {
            if (stock < 0) {
                throw new IllegalArgumentException("El stock no puede ser negativo.");
            }
            this.stock = stock;
        } catch (IllegalArgumentException e) {
            System.out.println("Error al establecer el stock: " + e.getMessage());
        }
    }

    public void mostrarInformacion() {
        System.out.println("ID del producto: " + id);
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio del Producto: " + precio);
        System.out.println("Cantidad del Producto: " + stock);
    }
}
