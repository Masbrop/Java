import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int selector = 0;
        int ciclo = 0;
        double ingresar = 0;
        double retirar = 0;

        Cuenta cuenta1 = new Cuenta ("Juan",150);

        while (ciclo == 0){
            System.out.println("Si desea ingresar dinero presione 1, si desea retirar dinero presione 2");
            selector = Integer.parseInt(scanner.nextLine());

            switch (selector){
                case 1:
                    System.out.println("Digite el valor que desea ingresar");
                    cuenta1.ingresar(Double.parseDouble(scanner.nextLine()));
                    break;
                case 2:
                    System.out.println("Digite el valor que desea retirar");
                    cuenta1.retirar(Double.parseDouble(scanner.nextLine()));
                    break;
                default:
                    System.out.println("Numero equivocado");
            }
            System.out.println("Su saldo es de: " + cuenta1.getCantidad());
            System.out.println("Si desea realizar otra transacción presione 0, de lo contrario presione 1");
            ciclo = Integer.parseInt(scanner.nextLine());
        }


    }
}
