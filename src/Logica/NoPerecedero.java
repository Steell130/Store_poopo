package Logica;

public class NoPerecedero extends Producto {

    private int garantia;

    public NoPerecedero(int id, String nombre, double precio, int stock, int garantia) {
        super(id, nombre, precio, stock);
        this.garantia = garantia;
       
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Garantia de " + garantia + " Mes/es");
    }
}
