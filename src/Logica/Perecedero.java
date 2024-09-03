package Logica;

import java.util.Scanner;

public class Perecedero extends Producto {

    static Scanner in = new Scanner(System.in);

    private String FechaVencimiento; // Fecha de vencimiento del producto
    private int TemperaturaDelalmacen; // Temperatura de almacenamiento en grados Celsius

    // Constructor para inicializar un producto perecedero
    public Perecedero(int id, String nombre, double precio, int stock, String FechaVencimiento, int TemperaturaDelalmacen) {
        super(id, nombre, precio, stock); // Llama al constructor de la clase base Producto

        try {
            if (!FechaVencimiento.matches("\\d{4}-\\d{2}-\\d{2}")) { // Verifica el formato de la fecha (YYYY-MM-DD)
                throw new IllegalArgumentException("Formato de fecha incorrecto. Debe ser YYYY-MM-DD.");
            }
            this.FechaVencimiento = FechaVencimiento;
        } catch (IllegalArgumentException e) {
            System.out.println("Error al establecer la fecha de vencimiento: " + e.getMessage());
            this.FechaVencimiento = "0000-00-00"; // Valor por defecto si hay error
        }

        try {
            if (TemperaturaDelalmacen < -100 || TemperaturaDelalmacen > 100) { // Rango de temperatura permitido
                throw new IllegalArgumentException("Temperatura fuera de rango (-100 a 100 ºC).");
            }
            this.TemperaturaDelalmacen = TemperaturaDelalmacen;
        } catch (IllegalArgumentException e) {
            System.out.println("Error al establecer la temperatura: " + e.getMessage());
            this.TemperaturaDelalmacen = 0; // Valor por defecto si hay error
        }
    }

    public String getFechaVencimiento() {
        return FechaVencimiento;
    }

    public int getTemperaturaDelalmacen() {
        return TemperaturaDelalmacen;
    }

    public void setFechaVencimiento(String FechaVencimiento) {
        try {
            if (!FechaVencimiento.matches("\\d{4}-\\d{2}-\\d{2}")) {
                throw new IllegalArgumentException("Formato de fecha incorrecto. Debe ser YYYY-MM-DD.");
            }
            this.FechaVencimiento = FechaVencimiento;
        } catch (IllegalArgumentException e) {
            System.out.println("Error al establecer la fecha de vencimiento: " + e.getMessage());
        }
    }

    public void setTemperaturaDelalmacen(int TemperaturaDelalmacen) {
        try {
            if (TemperaturaDelalmacen < -100 || TemperaturaDelalmacen > 100) {
                throw new IllegalArgumentException("Temperatura fuera de rango (-100 a 100 ºC).");
            }
            this.TemperaturaDelalmacen = TemperaturaDelalmacen;
        } catch (IllegalArgumentException e) {
            System.out.println("Error al establecer la temperatura: " + e.getMessage());
        }
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Caducidad del producto: " + FechaVencimiento);
        System.out.println("Temperatura del almacén: " + TemperaturaDelalmacen + " ºC");
    }
}
