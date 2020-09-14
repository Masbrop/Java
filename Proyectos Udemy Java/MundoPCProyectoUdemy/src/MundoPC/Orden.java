package MundoPC;
public class Orden {

    private int idOrden;
    private Computadora computadora [];
    private static int contadorOrdenes;
    private int contadorComputadoras = 0;
    private static final int maxComputadoras = 3;

   public Orden(){
        contadorOrdenes++;
        idOrden = contadorOrdenes;
        computadora = new Computadora[maxComputadoras];
    }

    public void agregarComputadora (Computadora computador){

        if (contadorComputadoras < maxComputadoras){
            computadora[contadorComputadoras] = computador;
            contadorComputadoras++;
        }
        else
            System.out.println("Se ha superado el maximo de computadoras");
    }
    public void mostrarOrden(){
        System.out.println("Orden: " + idOrden);
        System.out.println("Productos de la orden: " );
        for (int i = 0; i < contadorComputadoras; i++){
            System.out.println(computadora[i]);
        }
    }

}
