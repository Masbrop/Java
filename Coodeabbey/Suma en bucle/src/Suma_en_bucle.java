import java.util.Scanner;

public class Suma_en_bucle {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int suma = 0;

        System.out.println("Cuantos numeros desea sumar: ");
        int repeticiones = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < repeticiones; i++){
            System.out.println("Ingrese un numero: ");
            numero = Integer.parseInt(scanner.nextLine());
            suma = suma+numero;
        }
        System.out.println("La suma de sus numeros es: " + suma);
    }
}
