import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        Persona persona1 = new Persona();

        System.out.println("Digite su nombre: ");
        persona1.setNombre(scanner.nextLine());
        System.out.println("Digite su edad: ");
        persona1.setEdad(Integer.parseInt(scanner.nextLine()));
        System.out.println("Digite su peso: ");
        persona1.setPeso(Integer.parseInt(scanner.nextLine()));
        System.out.println("Digite su altura: ");
        persona1.setAltura(Integer.parseInt(scanner.nextLine()));

        System.out.println(persona1.calcularIMC());
        System.out.println(persona1.esMayorDeEdad());
        System.out.println(persona1.toString());

        Persona persona2 = new Persona();

        System.out.println("Digite su nombre: ");
        persona1.setNombre(scanner.nextLine());
        System.out.println("Digite su edad: ");
        persona1.setEdad(Integer.parseInt(scanner.nextLine()));
        System.out.println("Digite su sexo: ");
        persona1.setSexo(scanner.next().charAt(0));

        System.out.println(persona2.calcularIMC());
        System.out.println(persona2.esMayorDeEdad());
        System.out.println(persona2.toString());

    }
}
