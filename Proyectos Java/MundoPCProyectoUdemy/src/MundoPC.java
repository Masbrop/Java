import MundoPC.*;
import com.sun.org.apache.xpath.internal.operations.Or;

public class MundoPC {
    public static void main (String [] args){

        //Computadora toshiba
        Monitor monitorToshiba = new Monitor("toshiba", 20);
        Teclado tecladoToshiba = new Teclado("Usb","toshiba");
        Raton ratonToshiba = new Raton("usb","toshiba");
        Computadora computadoraToshiba = new Computadora("Computadora Toshiba",monitorToshiba,tecladoToshiba,ratonToshiba);

        //Computadora Dell
        Monitor monitorDell = new Monitor("dell", 20);
        Teclado tecladoDell = new Teclado("Usb","dell");
        Raton ratonDell = new Raton("usb","dell");
        Computadora computadoraDell = new Computadora("Computadora dell",monitorDell,tecladoDell,ratonDell);

        //Ordenes
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraToshiba);
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraToshiba);
        orden1.agregarComputadora(computadoraDell);

        orden1.mostrarOrden();

    }
}
