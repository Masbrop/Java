package Volumen;

public class Caja {

    int ancho, alto, profundo;

    public Caja(){
        System.out.println("inizializacion del constructor");
    }

    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;

    }

    public void volumen(){
        int volumen = this.ancho * this.alto * this.profundo;
        System.out.println("El volumen de la caja es: " + volumen);
    }
}
