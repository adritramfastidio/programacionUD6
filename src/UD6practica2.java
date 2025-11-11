import java.util.Arrays;
import java.util.Scanner;

public class UD6practica2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opc = 0;
        do {
            Utils.menuEjercicios(16);
            opc = Utils.validaInt();
            //sc.nextLine();
            switch (opc) {
                case 1 -> ejercicio1();
                case 17 -> System.out.println("Hasta la próxima!");
                default -> System.out.println("Opción no válida.");
            }
        } while (opc != 17);
    }

    /*1. Escribe un programa que pida dos números reales por teclado y muestre por
    pantalla el resultado de multiplicarlos. */
    public static void ejercicio1() {
        System.out.print("Dime un número: ");
        double n1 = Utils.validaDouble();
        System.out.print("Dime otro número: ");
        double n2 = Utils.validaDouble();

        System.out.println("Su multiplicación es: " + multiplica(n1, n2));
    }

    public static double multiplica(double n1, double n2) {
        return n1 * n2;
    }
}