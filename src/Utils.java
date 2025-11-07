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

    public static double validaDouble(){
        while(!sc.hasNextDouble()){
            System.out.print("El número introducido no es válido, prueba otra vez: ");
            sc.next();
        }
        return sc.nextDouble();
    }
}
