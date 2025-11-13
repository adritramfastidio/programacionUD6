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
                case 3-> ejercicio3();
                case 4-> ejercicio4();
                case 5-> ejercicio5();
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
                num = Utils.validaPositivoInt(Utils.validaInt());

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

    /*2. Escribe un programa que pida el DNI y muestre por pantalla la letra asociada.
    Para ello se deberá crear una función a la que se le pase el número y devuelva la
    letra. */
        public static void ejercicio2() {
            System.out.print("Introduce el número de tu DNI: ");
            int dni = Utils.validaPositivoInt(Utils.validaInt());
            dni = dni % 23;
            letraDNI(dni);
        }
        public static void letraDNI(int num) {
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            System.out.println("La letra de tu DNI es " +  letras.charAt(num));
        }

    /*3. Realiza un programa que permita comprobar si una terna de valores enteros (3
    valores) se ajusta a la ecuación de Pitágoras: x ² + y ² = z ². El programa solicita al
    usuario los valores x, y, z. Se deberá crear una función a la que se le pase x, y, z y
    devuelva si son iguales o no. */
        public static void ejercicio3() {
            System.out.println("Esta es la ecuación de Pitágoras: x ² + y ² = z ²");
            System.out.print("Introduce el valor de x: ");
            int n1 = Utils.validaInt();
            System.out.print("Introduce el valor de y: ");
            int n2 = Utils.validaInt();
            System.out.print("Introduce el valor de z: ");
            int n3 = Utils.validaInt();

            if (cumpleEcPitagoras(n1, n2, n3)) {
                System.out.println("Se cumple la ecuación de Pitágoras para esos parametros.");
            } else {
                System.out.println("No se cumple la ecuación de Pitágoras para esos parametros.");
            }
        }
        public static boolean cumpleEcPitagoras(int n1, int n2, int n3) {
            if ((Math.pow(n1, 2) + Math.pow(n2, 2)) == (Math.pow(n3, 2))) {
                return true;
            } else {
                return false;
            }
        }

    /*4. Escribe un programa que imprima las tablas de multiplicar del 1 al 10.
    Implementa una función que reciba un número entero como parámetro e
    imprima su tabla de multiplicar. */
        public static void ejercicio4() {
            System.out.print("Introduce un número entero: ");
            int num = Utils.validaInt();
            tablaMultiplicar(num);
        }
        public static void tablaMultiplicar(int num) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
            }
        }

    /*5. Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”.
    En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo oportuno.
    Modifica el programa añadiendo otra opción llamada “Volumen”, permitiendo que el
    usuario también pueda solicitar el cálculo del volumen.
    Modifica el programa añadiendo otra opción llamada “Todas” en la que se pida el radio
    una sola vez y se muestren los tres cálculos posibles (circunferencia, área y volumen). */
        public static void ejercicio5() {
            int opc;
            do {
                opc = menu();
                switch (opc) {
                    case 1 -> System.out.println("Su circunferencia es " + circunferencia(pideRadio()));
                    case 2 -> System.out.println("Su area es " + area(pideRadio()));
                    case 3 -> System.out.println("Su volumen es " + volumen(pideRadio()));
                    case 4 -> todas();
                    case 5 -> System.out.println("Hasta la próxima!");
                    default -> System.out.println("Opción no válida.");                }
            } while (opc != 5);
        }
        public static int menu() {
            int opc;
            System.out.println("1. Circunferencia");
            System.out.println("2. Área");
            System.out.println("3. Volumen");
            System.out.println("4. Todas");
            System.out.println("5. Salir");
            System.out.println("Que acción quieres realizar?: ");
            return opc = Utils.validaInt();
        }
        public static double pideRadio() {
            System.out.print("Introduce el radio: ");
            double radio = Utils.validaDouble();
            return radio;
        }
        public static double circunferencia(double radio) {
            return (Math.PI * radio * 2);
        }
        public static double area(double radio) {
            return (Math.PI * Math.pow(radio, 2));
        }
        public static double volumen(double radio) {
            return ((4 * Math.PI * Math.pow(radio, 3)/3));
        }
        public static void todas() {
            double radio = pideRadio();
            System.out.println("Su circunferencia es " + circunferencia(radio));
            System.out.println("Su area es " + area(radio));
            System.out.println("Su volumen es " + volumen(radio));
        }
}