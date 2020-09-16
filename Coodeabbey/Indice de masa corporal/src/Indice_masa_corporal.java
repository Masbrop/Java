import java.util.Scanner;

public class Indice_masa_corporal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int ciclo = 0;
        int peso = 0;
        double altura = 0;
        double IMC = 0;

        System.out.println("Cuantas veces desea medir su IMC: ");
        ciclo = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < ciclo; i++){
            System.out.println("Por favor ingrese su peso (KG): ");
            peso = Integer.parseInt(scanner.nextLine());
            System.out.println("Por favor ingrese su altura (metros):");
            altura = Double.parseDouble(scanner.nextLine());

            IMC = peso / (Math.pow(altura,2));

            if (IMC < 18.5){
                System.out.println("Su IMC es bajo");
            }
            else if (IMC >= 18.5 && IMC <= 25.0){
                System.out.println("Su IMC es normal");
            }
            else if (IMC >= 25.0 && IMC <= 30.0){
                System.out.println("Su IMC esta por encima de lo normal");
            }
            else System.out.println("Su IMC es muy alto");
        }
    }
}
