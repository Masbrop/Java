import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String nombreCelador;
        int contador = 0;
        int asignarEscopeta = 0;
        boolean dar = false;
        int valor = 1;

        Celador celador1 = new Celador();
        System.out.println("Digite el nombre del celador: " + celador1.contadorCeladores);
        celador1.setNombre(scanner.nextLine()) ;
        System.out.println("Digite el valor de la hora: ");
        celador1.setValorHora(Double.parseDouble(scanner.nextLine()));
        System.out.println("Digite la fecha de nacimiento: ");
        celador1.setFechaNacimiento(scanner.nextLine());


     Secretaria asignar = new Secretaria();
     Secretaria secretaria1 = new Secretaria();

        System.out.println("Digite el nombre de la secretaria: ");
        secretaria1.setNombre(scanner.nextLine()) ;
        System.out.println("Digite el valor de la hora: ");
        secretaria1.setValorHora(Double.parseDouble(scanner.nextLine()));
        System.out.println("Digite la fecha de nacimiento: ");
        secretaria1.setFechaNacimiento(scanner.nextLine());
        System.out.println("Digite el nombre del jefe: ");
        secretaria1.setNombreJefe(scanner.nextLine());

       while (contador == 0 ) {
            System.out.println("Digite el nombre del celador que quiere asignar o quitar la escopeta: ");
            nombreCelador = scanner.nextLine();
            if (celador1.getNombre().equals(nombreCelador)) {
                System.out.println("Si deseas asignar la escopeta a " + nombreCelador + " Presiona 1" + " Si deseas quitar la escopeta a " + nombreCelador + " Persiona 0");
                asignarEscopeta = Integer.parseInt(scanner.nextLine());
                switch (asignarEscopeta){
                    case (1):
                        dar = asignar.getAsignarEscopeta();
                        System.out.println("La escpeta a sido asignada con exito !");
                        break;
                    case (0):
                        dar = asignar.quitarEscopeta();
                        System.out.println("La escopeta fue quitada con exito !");
                        break;
                    default:
                        System.out.println("Numero erroneo");
                }
            }
            else {
                System.out.println("Nombre equivocado");
            }
            System.out.println("Si desea continuar presione 1, si desea asignar o quitar otra escopeta presione 0");
            contador = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(celador1 + " Estado de la escopeta: " + dar);



    }
}

/*
  String [] n1 = {"johan","juliana"};
        boolean [] esc = new boolean [2];
        String n2;
        int asignar;
        int ciclo = 0;

        Scanner scanner = new Scanner (System.in);

        while (ciclo == 0) {
            System.out.println("Aquien desea cambiar la escopeta: ");
            n2 = scanner.nextLine();
            for (int i = 0; i < n1.length; i++) {
                if (n1[i].equals(n2)) {
                    System.out.println("Si desea asignar una escopeta presione 0, si no presione 1");
                    asignar = Integer.parseInt(scanner.nextLine());
                    for (int j = 0; j < 2; j++ ) {
                        //Podria hacerse con Switch
                        if (asignar == 0) {
                            esc[i] = true; //Aqui se manda es a llamar un metodo de otra clase, que seria setAsignarEscopeta();
                            break;
                        }
                        if (asignar == 1) {
                            esc[i] = false; //Aqui se manda es a llamar un metodo de otra clase, que seria setQuitarEscopeta();
                            break;
                        } else {
                            System.out.println("Numero erroneo");
                        }
                    }
                    break;
                }
            }
            System.out.println("Si quiere volver a asignar una escpeta a otro celador presione 0, si no presione 1 ");
            ciclo = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(n1[0] + esc[0]);
        System.out.println(n1[1] + esc[1]);
 */