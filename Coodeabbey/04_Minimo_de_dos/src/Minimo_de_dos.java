import java.util.Scanner;

public class Minimo_de_dos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int tamaño = 0, num = 0;
        System.out.println("Cuantos pares de numeros desea ingresar: ");
        tamaño = Integer.parseInt(scanner.nextLine());

        int[] vector1 = new int[tamaño];
        int[] vector2 = new int[tamaño];
        int[] resultado = new int[tamaño];

        for (int i = 0; i < tamaño; i++){
            System.out.println("Ingrese el valor " + (i+1) + " del primer vector");
            num = Integer.parseInt(scanner.nextLine());
            vector1[i] = num;

            System.out.println("Ingrese el valor " + (i+1) + " del segundo vector");
            num = Integer.parseInt(scanner.nextLine());
            vector2[i] = num;

            resultado[i] = (vector1[i] < vector2[i]) ? vector1[i] : vector2[i];
        }

        for (int i = 0; i < tamaño; i++){
            System.out.println(resultado[i]);
        }
    }
}
