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
                case 5 -> ejercicio5();
                case 6 -> ejercicio6();
                case 7 -> ejercicio7();
                case 8 -> ejercicio8();
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
    /*5. Escribe un programa que pida un valor entero en millas y muestre su equivalente
    en kilómetros. */
        public static void ejercicio5(){
            System.out.print("Dime una distancia en millas: ");
            int millas = Utils.validaInt();
            System.out.println("Son " + millas_a_kilometros(millas) + "km.");
        }
        public static double millas_a_kilometros(int millas){
            return millas*1.60934;
        }

    /*6. Escribe un programa que pida cinco precios y muestre por pantalla el precio de
    venta de cada uno tras aplicarle un 21% de IVA. */
        public static void ejercicio6(){
            double pro = 0;
            for (int i = 0; i < 5; i++) {
                System.out.print("Dime el precio del " + (i+1) + "º producto:");
                pro =  Utils.validaDouble();
                Utils.validaPositivoDouble(pro);
                System.out.println("Su precio será de " + precioConIVA(pro) + "€ con IVA.");
            }
        }
        public static double precioConIVA(double precio){
            return precio*1.21;
        }

    /*7. Escribe un programa que pida el ancho y alto de un rectángulo y muestre por
    pantalla su área y su perímetro. */
        public static void ejercicio7(){
            System.out.print("Dime el ancho del rectangulo: ");
            double base =  Utils.validaDouble();
            Utils.validaPositivoDouble(base);
            System.out.print("Dime el alto del rectangulo: ");
            double altura =  Utils.validaDouble();
            Utils.validaPositivoDouble(altura);

            System.out.println("Su perimetro será: " + perimetroRectangulo(base, altura));
            System.out.println("Su área será: " + areaRectangulo(base, altura));
        }
        public static double perimetroRectangulo(double base, double altura){
            return 2*(base*altura);
        }
        public static double areaRectangulo(double base, double altura){
            return base*altura;
        }

    /*8. Escribe un programa que pida un valor N entero y luego muestre: el sumatorio
    des 1 a N, el productorio de 1 a N y el valor intermedio entre 1 y N. */
        public static void ejercicio8(){
            System.out.print("Dime un número: ");
            int num =  Utils.validaInt();
            Utils.validaPositivoInt(num);

            System.out.println("La suma de 1 a " + num + " es: " + suma1aN(num));
            System.out.println("El producto de 1 a " + num + " es: " + producto1aN(num));
            System.out.println("El valor medio de 1 a " + num + " es: " + intermedio1aN(suma1aN(num), num));
        }
        public static int suma1aN(int n){
            int suma = 0;
            for (int i = 1; i <= n; i++) {
                suma += i;
            }
            return suma;
        }
        public static int producto1aN(int n){
            int prod = 1;
            for (int i = 1; i <= n; i++) {
                prod *= i;
            }
            return prod;
        }
        public static double intermedio1aN(int suma, int n){
            return suma/n;
        }
}
