public class VisorDeNumeros {

    private int limite;
    private int valor;

    public VisorDeNumeros(){
    }

    public VisorDeNumeros (int limiteMaximo ){
        limite = limiteMaximo;
        valor = 0;
    }

    public int getValor(){
        return valor;
    }
    public void setValor(int nuevoValor){
        if ((nuevoValor >= 0) && (nuevoValor < limite)){
            this.valor = nuevoValor;
        }
    }

    public String getValorVisor (){
        if (valor < 10){
            return "0" + valor;
        }
        else
            return "" + valor;
    }

    public void incrementar (){
        valor = (valor + 1) % limite;
    }

}
