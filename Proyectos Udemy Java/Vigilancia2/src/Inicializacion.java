import Empleados.Celador;
import Persona.*;
public class Inicializacion {
    public static void main(String[] args) {

      Empleado celador1 = new Empleado("Juan",15,"14");
      Empleado celador2 = new Empleado("Juan",15,"14");
      Empleado celador3 = new Empleado("Juan",15,"14");
      Empleado celador4 = new Empleado("Juan",15,"14");
        Empleado celador5 = new Empleado("Juan",15,"14");
        Empleado celador6 = new Empleado("Juan",15,"14");

      Celador lista = new Celador();

      lista.agregarCelador(celador1);
      lista.agregarCelador(celador2);
      lista.agregarCelador(celador3);
      lista.agregarCelador(celador4);
      lista.agregarCelador(celador5);
      lista.agregarCelador(celador6);

    }
}
