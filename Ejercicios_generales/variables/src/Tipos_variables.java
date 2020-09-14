public class Tipos_variables {
    public static void main (String args[]){

        int miVariableEntera = 10;
        System.out.println(miVariableEntera);

        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        //var hace inferencia a tipos en Java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Nueva Cadena";
        System.out.println(miVariableCadena2);

        //Con una , se puede separar variables del mismo tipo de dato
        int num1 = 1, num2 = 2, num3 = 3;
        System.out.println(num2);

        String var1 = "Johan",
                var2 = "Juan",
                var3 = "Samuel";
        System.out.println(var3);

        //Concatenación de cadenas
        var usuario = "Johan";
        var titulo = "Ingeniero";
        var union = usuario + " " + titulo;
        System.out.println("union = " + union);

        //Concatenación de enteros y cadenas
        var i = 3;
        var j = 4;
        System.out.println(i + j); //Se realiza la suma de numeros
        System.out.println(i + j + usuario);
        System.out.println(usuario + i + j);
        System.out.println(usuario + (i + j));
    }
}
