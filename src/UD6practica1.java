import java.util.Arrays;
import java.util.Scanner;

public class UD6practica1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opc = 0;
        do {
            Utils.menuEjercicios(16);
            opc = Utils.validaInt();
            //sc.nextLine();
            switch (opc) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 17 -> System.out.println("Hasta la próxima!");
                default -> System.out.println("Opción no válida.");
            }
        } while (opc != 17);
    }

    /*1. Escribe un programa que pida dos números reales por teclado y muestre por
    pantalla el resultado de multiplicarlos. */
        public static void ejercicio1(){
            System.out.print("Dime un número: ");
            double n1 = Utils.validaDouble();
            System.out.print("Dime otro número: ");
            double n2 = Utils.validaDouble();

            System.out.println("Su multiplicación es: " + multiplica(n1, n2));
        }
        public static double multiplica(double n1, double n2){
            return n1 * n2;
        }

    /*2. Escribe un programa que pida la edad por teclado y muestre por pantalla si eres
    mayor de edad o no. */
        public static void ejercicio2(){
            System.out.print("Introduce tu edad: ");
            int edad = Utils.validaInt();

            if (esMayorEdad(edad)){
                System.out.println("Eres mayor de edad.");
            } else  {
                System.out.println("Eres menor de edad.");
            }
        }
        public static boolean esMayorEdad(int a){
            if (a < 18){
                return false;
            } else  {
                return true;
            }
        }

    /*3. Escribe un programa que pida dos números enteros por teclado y muestre por
    pantalla cual es el mínimo. */
        public static void ejercicio3(){
            System.out.print("Dime un número: ");
            int n1 = Utils.validaInt();
            System.out.print("Dime otro número: ");
            int n2 = Utils.validaInt();

            System.out.println("El menor es " + minimo(n1, n2));
        }
        public static int minimo(int a, int b){
            if (a < b){
                return a;
            } else {
                return b;
            }
        }

    /*4. Escribe un programa que pida un número entero por teclado y muestre por
    pantalla si es positivo, negativo o cero. */
        public static void ejercicio4(){
            System.out.print("Dime un número: ");
            int n1 = Utils.validaInt();

            if (dimeSigno(n1) == -1){
                System.out.println("El número es negativo.");
            } else if(dimeSigno(n1) == 0){
                System.out.println("El número es 0");
            } else {
                System.out.println("El número es positivo.");
            }
        }
        public static int dimeSigno(int a){
            if(a < 0){
                return -1;
            } else if(a == 0){
                return 0;
            } else {
                return 1;
            }
        }


}
