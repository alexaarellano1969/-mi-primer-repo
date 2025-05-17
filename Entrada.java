public class Entrada {


    String Nombre;
    double Precio;

    public Entrada(String Nombre, double Precio) {
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public void mostrarInformacion() {
        System.out.println("Evento: " + Nombre);
        System.out.println("Precio: $ " + Precio);



    }
}