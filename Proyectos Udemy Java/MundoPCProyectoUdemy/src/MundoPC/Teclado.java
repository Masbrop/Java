package MundoPC;
public class Teclado extends DispositivoEntrada{

    private int idTeclado;
    private static int contadorTeclados;

    public Teclado (String tipoEntrada, String marca){
        super(tipoEntrada,marca);
        contadorTeclados++;
        idTeclado = contadorTeclados;
    }

    public String toString(){
        return super.toString() + "Id Teclado: " + idTeclado;
    }
}
