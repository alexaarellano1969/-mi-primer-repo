//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        SimuladorFarmacia Medicamentos = new SimuladorFarmacia();
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Nombre del medicamento: ");
        Medicamentos.medicamento = Scanner.nextLine();
        System.out.println("Precio del medicamento: ");
        Medicamentos.precio = Scanner.nextDouble();
        System.out.println("Cantidad: ");
        Medicamentos.piezas = Scanner.nextInt();


        Medicamentos.totalsindescuento = Medicamentos.precio * Medicamentos.piezas;
        Medicamentos.descuento = Medicamentos.totalsindescuento * .15;
        Medicamentos.total = (Medicamentos.totalsindescuento <= 500) ? Medicamentos.totalsindescuento : Medicamentos.totalsindescuento - Medicamentos.descuento;
        Medicamentos.aplicardescuento = (Medicamentos.totalsindescuento <= 500) ? false : true;
        Medicamentos.mostrarInformacion();

        Medicamentos.mostrarInformacion();
    }

}