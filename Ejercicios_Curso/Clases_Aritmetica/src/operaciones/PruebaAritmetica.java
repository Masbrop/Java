package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 1;
        aritmetica1.b = 2;
        aritmetica1.sumar();

        //Se puede almacenar el valor del return en una variable
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println(resultado);

        //O se puede imprimir directamente el valor del return
        System.out.println(aritmetica1.sumarConRetorno());

        //Un metodo que recibe argumentos
        System.out.println(aritmetica1.sumarConArgumentos(2,2));

        //Llamada al constructor vacio
        Aritmetica aritmetica_1 = new Aritmetica();
        System.out.println("Aritmetica a: " + aritmetica_1.a);
        System.out.println("Aritmetica b: " + aritmetica_1.b);

        //Llamada al constructor con argumentos
        Aritmetica aritmetica_2 = new Aritmetica(2,4);
        System.out.println("Aritmetica a: " + aritmetica_2.a);
        System.out.println("Aritmetica b: " + aritmetica_2.b);

    }
}
