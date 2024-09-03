package Logica;

import java.util.Scanner;

public class Perecedero extends Producto {

    static Scanner in = new Scanner(System.in);
    private String FechaVencimiento;
    private int TemperaturaDelalmacen;

    public Perecedero(int id, String nombre, double precio, int stock, String FechaVencimiento, int TemperaturaDelalmacen) {

        super(id, nombre, precio, stock);
        this.FechaVencimiento = FechaVencimiento;
        this.TemperaturaDelalmacen = TemperaturaDelalmacen;
    }

    public String getFechaVencimiento() {
        return FechaVencimiento;
    }

    public int getTemperaturaDelalmacen() {
        return TemperaturaDelalmacen;
    }

    public void setFechaVencimiento(String FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }

    public void setTemperaturaDelalmacen(int TemperaturaDelalmacen) {
        this.TemperaturaDelalmacen = TemperaturaDelalmacen;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Caducidad del producto" + FechaVencimiento);
        System.out.println("Temperatura del almacen" + TemperaturaDelalmacen + "Cº"); // temperatura en celcius
    }
}
