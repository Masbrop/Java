package operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;

    //Definicion de constructor vacio, el compilador lo hace de manera automatica
    //Se llama como la clase, es como un Metodo especial para poder crear objetos
    public Aritmetica(){
        System.out.println("Ejecutando constructor vacio");
    }

    //Sobrecarga de constructores
    //Agregar dos o mas constructores dentro de una misma clase
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
    }

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
    public int sumarConArgumentos(int a, int b){
        //El this señaliza que es un atributo de la clase y no una variable local
        this.a = a;
        this.b = b;
        //return a + b;
        //Reutilizar metodos
        return this.sumarConRetorno();
    }
}
