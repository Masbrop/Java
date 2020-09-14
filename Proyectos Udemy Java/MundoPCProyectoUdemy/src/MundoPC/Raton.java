package MundoPC;
public class Raton extends DispositivoEntrada {

    private int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada,marca);
        contadorRatones++;
        idRaton = contadorRatones;
    }

    public String toString(){
        return "Id Raton: " + idRaton;
    }
}
