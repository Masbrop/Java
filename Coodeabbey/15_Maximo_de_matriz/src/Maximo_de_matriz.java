import java.util.Scanner;

public class Maximo_de_matriz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos valores desea ingresar al vector");
        int tamaño = Integer.parseInt(scanner.nextLine());
        int vector[] = new int[tamaño];
        int maximo = 0;

        for(int i = 0; i < tamaño; i++){
            if(vector[i] > maximo){
                maximo = vector[i];
            }
        }

        System.out.println("El valor mayor del vector es: " + maximo);
    }
}
