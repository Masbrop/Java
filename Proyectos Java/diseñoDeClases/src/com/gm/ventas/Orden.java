package com.gm.ventas;
public class Orden {

    private int idOrden;
    private Producto productos [];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 1;

    public Orden (){
        this.idOrden = ++contadorOrdenes;
        productos = new Producto[MAX_PRODUCTOS];
    }

        public void agregarProducto(Producto producto){
            //si los productos agregados no supera el maximo de productos el nuevo producto se añade al arreglo
            if(contadorProductos < MAX_PRODUCTOS){
                //AGREGAMO EL NUEVO PRODUCTO E INCREMENTAMOS EL CONTADOR
                productos[contadorProductos] = producto;
            }

        else
            System.out.println("Se ha superado el maximo de productos" + MAX_PRODUCTOS);
    }

    public double calcularTotal (){
        double total = 0;
        for (int i = 0; i < contadorProductos; i++){
            total +=productos[i].getPrecio(); //total = total + producto
        }
        return total;
    }

    public void mostrarOrden (){
        System.out.println("orden : " + idOrden);
        System.out.println("total de la orden : " + calcularTotal());
        System.out.println("Productos en la orden : ");
        for(int i = 0; i < contadorProductos; i++){
            System.out.println(productos[i]);
        }
    }
}
