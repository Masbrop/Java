package MundoPC;
public class Computadora {

    private int idComputadora;
    private static int contadorComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;

    Computadora(){
        contadorComputadora++;
        idComputadora = contadorComputadora;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton ){
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    public String getNombre(){
        return  nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String toString(){
        return "Nombre del monitor: " + nombre + "   " + monitor + teclado + raton;
    }

}
