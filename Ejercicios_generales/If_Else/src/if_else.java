import java.util.Scanner;

public class if_else {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        int ciclo = 0;
        String estacion = "";

        while (ciclo == 0) {
            System.out.println("Ingrese un mes del año: ");
            int mes = Integer.parseInt(scanner.nextLine());

            if (mes > 0 && mes < 13){
                if (mes == 1 || mes == 2 || mes == 12){
                    estacion = "Invierno";
                }
                else if (mes == 3 || mes == 4 || mes == 5){
                    estacion = "Primavera";
                }
                else if (mes == 6 || mes == 7 || mes == 8){
                    estacion = "Verano";
                }
                else if (mes == 9 || mes == 10 || mes == 11){
                    estacion = "Otonio";
                }
                System.out.println("La estacion es " + estacion);
                ciclo = 1;
            }
            else {
                System.out.println("----------El mes ingresado no es valido----------");
                ciclo = 0;
            }
        }


    }
}
