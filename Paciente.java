package Hospital;

public class Paciente {

    String nombre;
    int edad;
    String numeroExpediente;

    public void mostrarInformacion() {
        System.out.print("Informacion del(la) paciente: ");
        System.out.print(" Paciente: " + nombre );
        System.out.print(" Edad " + edad );
        System.out.print(" Expediente: " + numeroExpediente);


    }


}