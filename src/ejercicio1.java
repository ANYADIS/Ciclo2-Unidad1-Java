import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Dame tu nombre");
        String nombre = scanner.nextLine();         
        System.out.println("Hola " + nombre);

    }

    public static String saludar(String nombre){
        return "Hola " + nombre;
    }
}
