public class Principal {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada( "Concierto de Tewnty One Pilots", 800.00);
        Entrada entrada2 = new Entrada("Obra de teatro el lago de los cisnes", 450.50);
        Entrada entrada3 = new Entrada("Cine de terror", 150.00);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
        entrada3.mostrarInformacion();

    }
}