public class Inicio {
    public static void main(String[] args) {

        Empleados [] listaCeladores = {new Celador("john",14,"14"), new Celador("juan",13,"15")};

        for (int i = 0 ; i < listaCeladores.length ; i++){
                System.out.println(listaCeladores[i]);
        }


    }
}
