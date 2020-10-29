import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {


        /*int vec []  = new int [4];

        vec[0] = 1;
        vec[1] = 2;
        vec[2] = 3;
        vec[3] = 4;
        vec[4] = 5;
         */


       /* Scanner scanner = new Scanner (System.in);
        int vec1[] = new int [4];

        for (int i = 0; i < vec1.length; i++){
            System.out.println("Digite el numero de la posición " + i);
            vec1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("El resultado es : ");
        for (int i = 0; i < vec1.length; i++){
            System.out.println(vec1[i]);
        }
        */

        /* Scanner scanner = new Scanner (System.in);
        int vec1[] = new int [10];
        int suma = 0;

        for (int i = 0; i < vec1.length; i++){
            System.out.println("Digite el numero de la posición " + i);
            vec1[i] = Integer.parseInt(scanner.nextLine());
            suma += vec1[i];
        }
        System.out.println("El resultado es : " + suma);
         */

       /* Scanner scanner = new Scanner (System.in);
        int vec1[] = new int [2];
        int busqueda = 0;

        for (int i = 0; i < vec1.length; i++){
            System.out.println("Digite el numero de la posición " + i);
            vec1[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Que elemento desea buscar ? ");
        busqueda = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < vec1.length; i++){
            if (busqueda == vec1[i]){
                System.out.println("El elemento ha sido encontrado con exito en la posición : " + i );
            }
            else if (i == 1){
                System.out.println("No se encuentra el valor ingresado");
            }
        }
        */

       /* EJEMPLO DONDE SE DEBEN USAR FUNCIONESS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        */
        Scanner scanner = new Scanner (System.in);

        String nombres [] = new String [2];
        int longitud[] = new int [2];

        for (int i = 0; i < nombres.length; i++){
            System.out.println("Digite el nombrede la posición " + i);
            nombres[i] = scanner.nextLine();
        }
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres.length);
        }


       /* Scanner scanner = new Scanner (System.in);
       int vec1 [] = new int [3];
       final int maximo = 5;

        for (int i = 0; i < vec1.length;i++){
            System.out.println("Proporciones el numero de la posicion " + i);
            vec1[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < vec1.length; i++){
            if (vec1[i] > maximo){
                System.out.println("Este numero es mayor que 5 y su posicion es : " + i);
            }
        }
        */

       /* Scanner scanner = new Scanner (System.in);
       int vecImpar [] = new int [51];

       for(int i = 1; i < vecImpar.length; i++){
            vecImpar[i] = 2*i-1;
       }
       for (int i = 1; i < vecImpar.length; i++){
           System.out.println(vecImpar[i]);
       }
        */

        /* Scanner scanner = new Scanner (System.in);

       int tamaño = 0;
       int confirmacion=0;
       System.out.println("Digite el tamaño del vector : ");
       tamaño = Integer.parseInt(scanner.nextLine());

       int vec1[] = new int [tamaño];

       for (int i = 0; i < vec1.length; i++){
           System.out.println("Digite el numero de la posicion : " + i);
           vec1[i] = Integer.parseInt(scanner.nextLine());

           for (int j = 0; j <vec1.length; j++){
               if (vec1[i] == vec1[j]){
                   confirmacion++youtube
               ;
               }

               if (confirmacion == 2){
                   System.out.println("No se pueden repetir numeros");
                   vec1[i] = 0;
               }
           }

       }
        for (int i = 0; i < vec1.length; i++){
            System.out.println(vec1[i]);
        }

         */

    }

}
