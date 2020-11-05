package Volumen;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int alto, ancho, profundo;

        System.out.println("Ingrese la altura de la caja: ");
        alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el ancho de la caja: ");
        ancho = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese la profundidad de la caja: ");
        profundo = Integer.parseInt(scanner.nextLine());

        Caja caja1 = new Caja(alto,ancho,profundo);
        caja1.volumen();

    }
}
