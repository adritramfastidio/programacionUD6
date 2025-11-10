import java.util.Scanner;

public class Utils {
    static Scanner sc = new Scanner(System.in);
    public static int validaInt(){
        while(!sc.hasNextInt()){
            System.out.print("El número introducido no es válido, prueba otra vez: ");
            sc.next();
        }
        return sc.nextInt();
    }

    public static int validaPositivoInt(int posInt){
        while(posInt < 0){
            System.out.print("El número debe ser positivo, prueba otra vez: ");
            posInt = validaInt();
        }
        return posInt;
    }

    public static double validaDouble(){
        while(!sc.hasNextDouble()){
            System.out.print("El número introducido no es válido, prueba otra vez: ");
            sc.next();
        }
        return sc.nextDouble();
    }

    public static double validaPositivoDouble(double posDou){
        while(posDou < 0){
            System.out.print("El número debe ser positivo, prueba otra vez: ");
            posDou = validaDouble();
        }
        return posDou;
    }

    public static void menuEjercicios(int a){
        System.out.println("Que quieres hacer?");
        System.out.println("1-" + a + ". Ejercicio 1-" + a);
        System.out.println( (a + 1) + ". Salir");
    }
}
