package MundoPC;
public class DispositivoEntrada {
     private String tipoEntrada;
     private String marca;

   DispositivoEntrada(String tipoEntrada, String marca){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public String getipoEntrada(){
        return tipoEntrada;
    }
    public void setTipoEntrada(String tipoEntrada){
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String toString(){
        return "Tipo de entrada: " + tipoEntrada + " Marca: " + marca;
    }
}
