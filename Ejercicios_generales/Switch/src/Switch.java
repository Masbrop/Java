import java.util.Scanner;

public class Switch {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int ciclo = 0;
        int operacion = 0;
        int eleccion = 0;
        int num1 = 0;
        int num2 = 0;

        while (ciclo == 0){

            if (eleccion == 0){
                System.out.println("-----Ingrese 2 numeros enteros-----");
                System.out.println("Primer numero: ");
                num1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Segundo numero: ");
                num2 = Integer.parseInt(scanner.nextLine());
            }

            System.out.println("------Ingrese el valor correspondiente a la operacion que requiere------ \n"
                                + "1. Suma \n" + "2. Resta \n" + "3. Multiplicacion \n" + "4. Division \n");
            eleccion = Integer.parseInt(scanner.nextLine());

            switch(eleccion){
                case 1:
                    operacion = num1 + num2;
                    break;
                case 2:
                    operacion = num1 - num2;
                    break;
                case 3:
                    operacion = num1 * num2;
                    break;
                case 4:
                    if (num2 > 0 && num1 > 0){
                        operacion = num1 / num2;
                    }
                    else if (num1 == 0 && num2 == 0){
                        System.out.println("///Operacion indeterminada///");
                    }
                    else if (num2 == 0){
                        System.out.println("No es posible dividir un numero por 0");
                    }
                    break;
                default:
                    System.out.println("El valor no es valido");
                }
            System.out.println("");
            System.out.println("El resultado de la operacion es :" + operacion);
            System.out.println("");
            ciclo += 1;

                while (ciclo == 1){
                    System.out.println("------Ingrese el valor correspondiente a la operacion que requiere------ \n"
                                        + "1. Si quiere hacer una nueva operacion \n"
                                        + "2. Si quiere digitar nuevos numeros \n"
                                        + "3. Si quiere salir del sistema" );
                    operacion = Integer.parseInt(scanner.nextLine());


                        switch(operacion){
                            case 1:
                                ciclo = 0;
                                eleccion = 1;
                                break;
                            case 2:
                                ciclo = 0;
                                eleccion = 0;
                                break;
                            case 3:
                                ciclo = 2;
                                break;
                            default:
                                System.out.println("El numero introducido no es valido");
                                ciclo = 1;

                        }
                }
        }
    }
}
