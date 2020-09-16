import java.util.Scanner;

public class Sumas_en_bucles {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int tamaño = 0;
        int num = 0;

        System.out.println("--- Ingrese en tamaño de los vectores que desea sumar ---");
        tamaño = Integer.parseInt(scanner.nextLine());

        int[] vector1 = new int[tamaño];
        int[] vector2 = new int[tamaño];
        int[] resultado = new int[tamaño];

        for (int i = 0; i < tamaño; i++){
            System.out.println("Ingrese el valor numero " + (i+1) + " del vector uno");
            num = Integer.parseInt(scanner.nextLine());
            vector1[i] = num;

            System.out.println("Ingrese el valor numero " + (i+1) + " del vector dos");
            num = Integer.parseInt(scanner.nextLine());
            vector2[i] = num;

            resultado[i] = vector1[i] + vector2[i];
        }

        for (int i = 0; i < tamaño; i++){
            System.out.println("--------- El resultado es ---------");
            System.out.println(resultado[i]);
        }

    }
}
