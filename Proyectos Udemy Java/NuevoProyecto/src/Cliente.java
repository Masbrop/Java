public class Cliente extends Persona{
    private int idCliente;
    private String fechaRegistro;
    private boolean vip;
    private static int contadorClientes;

    public Cliente (String fechaRegistro, boolean vip){
        this.idCliente = ++contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public String toString() {
        return super.toString() + "Cliente{" +
                "idCliente=" + idCliente +
                ", fechaRegistro=" + fechaRegistro +
                ", vip=" + vip +
                '}';
    }
}
