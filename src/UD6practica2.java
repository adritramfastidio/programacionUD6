import java.util.Arrays;
import java.util.Scanner;

public class UD6practica2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opc = 0;
        do {
            Utils.menuEjercicios(8);
            opc = Utils.validaInt();
            //sc.nextLine();
            switch (opc) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 9 -> System.out.println("Hasta la próxima!");
                default -> System.out.println("Opción no válida.");
            }
        } while (opc != 9);
    }

    /*1. Escribe un programa que pida dos números reales por teclado y muestre por
    pantalla el resultado de multiplicarlos. */
        public static void ejercicio1() {
            int num;
            System.out.println("Introduce un número para saber si es primo. Introduce 0 para salir.");
            do{
                System.out.print("Dime un número: ");
                num = Utils.validaInt();
                Utils.validaPositivoInt(num);
                if(esPrimo(num)){
                    System.out.println(num + " es primo.");
                } else {
                    System.out.println(num + " no es primo.");
                }
            } while (num != 0);
        }
        public static boolean esPrimo(int num) {
            if (num == 1) {
                return false;
            } else if (num == 2) {
                return true;
            } else {
                for (int i = 2; i * i <= num; i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }

    /*Escribe un programa que pida el DNI y muestre por pantalla la letra asociada.
    Para ello se deberá crear una función a la que se le pase el número y devuelva la
    letra. */
        public static void ejercicio2() {
            int num;
            System.out.println(56321122 % 23);
            do{
                System.out.print("Dime un número: ");
                num = Utils.validaInt();
                Utils.validaPositivoInt(num);
                if(esPrimo(num)){
                    System.out.println(num + " es primo.");
                } else {
                    System.out.println(num + " no es primo.");
                }
            } while (num != 0);
        }
        public static void letraDNI(int num) {
            switch (num % 23) {
                case 1 -> ejercicio1();
                case 9 -> System.out.println("Hasta la próxima!");
                default -> System.out.println("Opción no válida.");
            }
        }
}