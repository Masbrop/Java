package Clases;

public class Persona {
    //Atributos de la clase
    //Para lograr acceder a los atributos de la clase desde otra clase hay que declararlos publicos
    public String nombre;
    public String apellido;

    //Metodo
    public void desplegarinformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
}
