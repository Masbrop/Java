import java.util.Scanner;

public class Minimo_tres {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantas tripletas desea ingresar: ");
        int repeticion = Integer.parseInt(scanner.nextLine());
        int valores[] = new int[3];
        int resultado[] = new int[repeticion];

        for(int i = 0; i < repeticion; i++){
            System.out.println("Ingrese el valor de vector " + (i+1));
            for(int j = 0; j <= 2; j++){
                System.out.println("Ingrese el valor de la posicion " + (j+1));
                valores[j] = Integer.parseInt(scanner.nextLine());

                if(valores[0] > valores[1] && valores[0] > valores[2]){
                    resultado[i] = valores[0];
                }
                else if(valores[1] > valores[2] ){
                    resultado[i] = valores[1];
                }
                else{
                    resultado[i] = valores[2];
                }
            }
        }

        for(int i = 0; i <repeticion; i++){
            System.out.println(resultado[i]);
        }
    }
}
