package PasoPorValor;

public class PasoPorValor {
    public static void main(String[] args) {
        //Variable local
        int x  =10;

        System.out.println("x = " + x);

        cambioValor(x);

        System.out.println("x Nuevo valor = " + x);
    }

    public static void cambioValor(int arg1){
        System.out.println("Argumento = " + arg1);
        //No se puede modificar el valor de la variable local desde este metodo
        arg1 = 15;
    }
}
