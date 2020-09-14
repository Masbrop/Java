public class Cuenta {

    private String titular;
    private double cantidad;
    private double retirar;

    public Cuenta (String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getCantidad(){
        return cantidad;
    }
    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }

    public void ingresar (double cantidad){
        if (cantidad > 0){
            this.cantidad += cantidad;
        }
    }
    public void retirar (double cantidad){
        if (cantidad > this.cantidad){
            System.out.println("Saldo insuficiente, solo se pudo retirar: " + this.cantidad);
            this.cantidad = 0;
        }
        else
            retirar = cantidad - this.cantidad;
    }

    public String toString(){
        return "Titular: " + titular + " Cantidad: " + cantidad;
    }
}
