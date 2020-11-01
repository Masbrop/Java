package operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;

    //Metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println(resultado);
    }

    public int sumarConRetorno(){
        int resultado = a + b;
        return resultado;
    }

    //Metodo que recibe argumentos
    public int sumarConArgumentos(int arg1, int arg2){
        a = arg1;
        b = arg2;
        //return a + b;
        //Reutilizar metodos
        return sumarConRetorno();
    }
}
