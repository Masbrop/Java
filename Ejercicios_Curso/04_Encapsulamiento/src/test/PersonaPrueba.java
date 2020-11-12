package test;
import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Johan",5000000,false);
        System.out.println("Su nombre es: " + persona1.getNombre());
        persona1.setNombre("Johan Andres");
        System.out.println("Su nombre modificado es: " + persona1.getNombre());

        persona1.setSueldo(10000000);
        System.out.printf("Su sueldo es: " + persona1.getSueldo());
    }
}
