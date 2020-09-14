public class Celador extends Persona {

   public static int contadorCeladores = 0;

    public Celador(){
        super ();
        contadorCeladores++;
    }

    public String toString (){
        return super.toString() ;
    }

}
