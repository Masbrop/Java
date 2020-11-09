package PasoPorValor;

import Clases.Persona;

public class Paso_por_referencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Johan";
        System.out.println("Persona1 nombre = " + persona1.nombre);

        cambiaValor(persona1);
        System.out.println("Persona1 cambio de nombre = " + persona1.nombre);
    }

    public static void cambiaValor(Persona persona){
        persona.nombre = "Evelin";
    }
}
