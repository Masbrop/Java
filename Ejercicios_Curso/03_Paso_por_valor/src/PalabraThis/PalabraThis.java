package PalabraThis;

public class PalabraThis {
    public static void main(String[] args){
        Persona persona = new Persona("Johan","Castrillon");

    }
}

class Persona{
    String nombre;
    String apellido;

    Persona(String nombre, String apellido){
        //super(); Llamada al constructor de la clase Padre (object) esta llamada se infiere sola

        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona utilizando this: " + this.nombre + " " + this.apellido);

        //Imprimir imprimir = new Imprimir(); es lo mismo que tener
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("Persona desde imprimir: " + persona);
        System.out.println("Impresion del objeto actual (this): " + this);
    }
}