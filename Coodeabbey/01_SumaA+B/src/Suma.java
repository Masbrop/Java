import java.util.Scanner;

public class Suma {
    public static void main(String[] args){

        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        int num1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese el segundo valor: ");
        int num2 = Integer.parseInt(consola.nextLine());
        int suma = num1 + num2;

        System.out.println("La suma es: "+ suma);
    }
}
