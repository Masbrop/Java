import com.gm.ventas.Producto;

public class Orden {

    private int idOrden;
    private Producto productos [];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int max_productos = 10;

    public Orden(){
        this.idOrden = ++contadorOrdenes;
        productos = new Producto[max_productos];
    }

    public void agregarProducto (Producto producto){
        productos[contadorProductos] = producto;
    }

}
