public class Principal {
    public static void main(String[] args) {

        Pasajero pasajero1 = new Pasajero("Leonel", "7842");
        Vuelo vuelo1 = new Vuelo ("BW113", "Japon", "20:30");

        if (vuelo1reservarAsiento(pasajero1)) {
            System.out.println("Reservacion exitosa para pasajero:" + pasajero1.nombre);
        } else {

            System.out.println("Reservacion no exitosa para pasajero:" + pasajero1.nombre);
        }

        System.out.println(vuelo1obtenerIntinerario());
        vuelo1.cancelarReserva();


        System.out.println("\n X Cancelando reserva...);

                System.out.println(vuelo1.obtenerIntinerario());

        vuelo1.reservarAsiento("Juana", "8532");

        System.out.println(vuelo1.obtenerIntinerario());


    }

}