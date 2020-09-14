public class Celador extends Empleados {

    private boolean escopeta;

    public Celador (String nombre,double valorHora, String fechaNacimiento){
        super(nombre, valorHora, fechaNacimiento);
       escopeta = false;
    }

}
