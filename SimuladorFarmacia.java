public class SimuladorFarmacia {
    String medicamento;
    double precio;
    double totalsindescuento;
    double descuento;
    double total;
    int piezas;
    boolean aplicardescuento;

    public void mostrarInformacion() {
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + piezas);
        System.out.println("Precio Unitario: $" + precio);
        System.out.println("Total sin descuento: $" + totalsindescuento);
        System.out.println("¿Aplica el descuento? " + aplicardescuento);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: $" + total);

    }
}