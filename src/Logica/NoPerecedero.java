package Logica;

// Clase que representa un producto no perecedero, hereda de la clase Producto
public class NoPerecedero extends Producto {

    // Atributo específico para productos no perecederos: garantía en meses
    private int garantia;

    // Constructor para inicializar un producto no perecedero
    public NoPerecedero(int id, String nombre, double precio, int stock, int garantia) {
        super(id, nombre, precio, stock); // Llama al constructor de la clase base Producto para inicializar los atributos comunes

        try {
            if (garantia < 0) {
                throw new IllegalArgumentException("La garantía no puede ser negativa.");
            }
            this.garantia = garantia; // Inicializa el atributo de garantía
        } catch (IllegalArgumentException e) {
            System.out.println("Error al establecer la garantía: " + e.getMessage());
            this.garantia = 0; // Establecer un valor por defecto en caso de error
        }
    }

    // Getter para obtener el valor de la garantía
    public int getGarantia() {
        return garantia;
    }

    // Setter para establecer el valor de la garantía
    public void setGarantia(int garantia) {
        if (garantia < 0) {
            throw new IllegalArgumentException("La garantía no puede ser negativa.");
        }
        this.garantia = garantia;
    }

    // Sobrescribe el método mostrarInformacion de la clase base Producto
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método mostrarInformacion de la clase base para mostrar la información común
        System.out.println("Garantía de " + garantia + " Mes/es"); // Muestra la garantía específica del producto no perecedero
    }
}
