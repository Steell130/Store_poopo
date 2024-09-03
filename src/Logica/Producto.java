
package Logica;

import java.util.Scanner;

public class Producto {
    
    static Scanner in = new Scanner(System.in);
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
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
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void mostrarInformacion() {
        System.out.println("ID del producto: " + id);
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio del Producto: " + precio);
        System.out.println("Cantidad del Producto: " + stock);
    }
}


