public class Vuelo {
    final String codigoVuelo;
    String destino;
    String horaSalida;
    Pasajero asientoReservado = null;


    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
    }

    boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null){
            asientoReservado = p;
            return true;
        }
        return false;
    }

    boolean reservarAsiento(String nombre, String pasaporte) {
        if (asientoReservado == null){
            asientoReservado = new Pasajero(nombre, pasaporte);
            return true;
        }
        return false;
    }
    void cancelarReserva(){
        asientoReservado = null;
    }
    String obtenerItinerario(){
        String nombrePasajero = (asientoReservado != null) ? asientoReservado.nombre + "\nPasaporte: " + asientoReservado.pasaporte : "Sin reserva";
        return String.format("""
                ✈️Itinerario del vuelo:
                Código: %s
                Destino: %s
                Hora de salida: %s
                Pasajero: %s
                """, codigoVuelo, destino, horaSalida, nombrePasajero);
    }
}