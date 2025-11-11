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
                case 9 -> ejercicio9();
                case 10 -> ejercicio10();
                case 11 -> ejercicio11();
                case 12 -> ejercicio12();
                case 13 -> ejercicio13();
                case 14 -> ejercicio14();
                case 15 -> ejercicio15();
                case 16 -> ejercicio16();
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

    /*9. Realiza un programa que pida introducir tres valores enteros y nos diga cuál de
    ellos es el más elevado. Impleméntalo creando únicamente una función a la que
    le pasemos dos valores (no tres) y nos devuelva el máximo de los dos valores. */
        public static void ejercicio9(){
            System.out.print("Dime un número: ");
            int n1 =  Utils.validaInt();
            System.out.print("Dime otro número: ");
            int n2 =  Utils.validaInt();
            System.out.print("Dime otro número: ");
            int n3 =  Utils.validaInt();

            int temp = mayorDeDos(n1, n2);
            System.out.println("El mayor de los tres es " + mayorDeDos(temp, n3));
        }
        public static int mayorDeDos(int n1, int n2){
            if(n1 > n2){
                return n1;
            } else {
                return n2;
            }
        }

    /*10. Realiza un programa que lea una fecha introduciendo el día, mes y año por
    separado y nos diga si la fecha es correcta o no. Supondremos que todos los
    meses tienen 30 días. Se debe crear una función donde le pasemos los datos y
    devuelva si es correcta o no. */
        public static void ejercicio10(){
            System.out.print("Dime el dia: ");
            int d =  Utils.validaInt();
            System.out.print("Dime el mes: ");
            int m =  Utils.validaInt();
            System.out.print("Dime el año: ");
            int a =  Utils.validaInt();

            if(verificarFecha(d, m, a)){
                System.out.println("Es válida.");
            } else {
                System.out.println("No es válida.");
            }
        }
        public static boolean verificarFecha(int d, int m, int a){
            if(d < 1 || d > 30 || m < 1 || m > 12) {
                return false;
            } else {
                return true;
            }
        }

    /*11. Realiza un programa que escriba la tabla de multiplicar de un número
    introducido por teclado. Para ello implementa una función que reciba como
    parámetro un número entero y muestre por pantalla la tabla de multiplicar de
    dicho número. */
        public static void ejercicio11(){
            System.out.print("Dime un número: ");
            int num =  Utils.validaInt();
            tablaMultiplicar(num);
        }
        public static void tablaMultiplicar(int num){
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + (num*i));
            }
        }

    /*12. Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El
    programa debe tener una función que reciba como parámetro una cantidad en
    kilómetros y nos la devuelva en millas. */
        public static void ejercicio12(){
            System.out.print("Dime una distancia en km: ");
            double km =  Utils.validaDouble();
            System.out.println("Son " + kilometros_a_millas(km) + " millas.");
        }
        public static double kilometros_a_millas(double km){
            return km/1.60934;
        }

    /*13. Realiza un programa que calcule el porcentaje de descuento que nos han hecho
    al comprar algo. Se debe solicitar la cantidad sin descuento y la cantidad con el
    descuento aplicado. Se debe crear una función a la que le pasemos ambos
    valores y nos devuelva el descuento. */
        public static void ejercicio13(){
            System.out.print("Dime el precio sin descuento: ");
            double precio =  Utils.validaDouble();
            System.out.print("Dime el precio con descuento: ");
            double precioDesc =  Utils.validaDouble();

            System.out.println("El descuento aplicado es del " + sacarDescuento(precio, precioDesc) + "%.");
        }
        public static double sacarDescuento(double precio, double precioDesc){
            return 100 - (precioDesc * 100 / precio);
        }

    /*14. Escribe una función que muestre por pantalla un triángulo como el del ejemplo.
    Deberá recibir dos parámetros: el carácter que se desea imprimir y el número de
    líneas del triángulo. */
        public static void ejercicio14(){
            System.out.print("Dime el carácter a imprimir: ");
            char cosa =  sc.next().charAt(0);
            System.out.print("Dime el número de filas de la piramide: ");
            int filas =  Utils.validaInt();
            contruirPiramide(cosa, filas);
        }
        public static void contruirPiramide(char cosa, int n){
            int m = n;
            int cont = 0;
            int ast = 1;

            for (int i = 0; i < n; i++) {

                while(m > cont){
                    System.out.print(" ");
                    cont++;
                }
                for (int j = 0; j < ast; j++) {
                    System.out.print(cosa);
                }

                System.out.println();
                m--;
                cont = 0;
                ast += 2;
            }
        }

    /*15. Escribe un programa que cree un array de tamaño 100 con los primeros 100
    números naturales. Luego muestra la suma total y la media. Implementa una
    función que calcule la suma de un array y otra que calcule la media de un array. */
        public static void ejercicio15(){
            int num[] = new int [100];
            for (int i = 0; i < num.length; i++) {
                num[i] = i+1;
            }
            System.out.println("Su suma es " + sumaArray(num) + " y su media " + mediaArray(num));
        }
        public static int sumaArray(int[] num){
            int suma = 0;
            for (int i = 0; i < num.length; i++) {
                suma += num[i];
            }
            return suma;
        }
        public static int mediaArray(int[] num){
            return (sumaArray(num)/num.length);
        }

    /*16. Escribe un programa que cree un array del tamaño indicado por teclado y luego
    lo rellene con valores aleatorios (utiliza Math.random()). Implementa la función
    que rellena un array con valores aleatorios. */
        public static void ejercicio16(){
            System.out.print("Introduce el tamaño del array: ");
            int tamano = Utils.validaInt();
            int num[] = new int [tamano];
            llenarArrayRandom(num);
            System.out.println(Arrays.toString(num));
        }
        public static void llenarArrayRandom(int[] num){
            for (int i = 0; i < num.length; i++) {
                num[i] = (int)(Math.random()*100);
            }
        }
}
