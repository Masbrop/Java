import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.security.x509.DNSName;

import java.util.Random;

public class Persona {

    private String nombre = "";
    private int edad = 0;
    private char sexo = 'H';
    private int peso = 0;
    private int altura = 0;
    private double IMC = 0;
    private boolean mayor = true;

    public Persona (){
    }

    public static void generaDNI(){
        int DNI;
        int resultadoA;
        int resultadoB;
        int resultado;
        String letras [] = {"A","B","C","D","E","F","G","H","I","J","K","L","N","M"};
        Random r = new Random();
        DNI = r.nextInt(99999999);
        resultadoA = DNI/14;
        resultadoB = resultadoA * 14;
        resultado = DNI - resultadoB;
        System.out.println(DNI + " - " + letras[resultado]);
    }

    public Persona (String nombre, int edad, char sexo){
        this.nombre = nombre ;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona (int peso, int altura){
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre (){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double calcularIMC(){
        IMC = peso/Math.pow(altura, 3);
        if (IMC < 20){
            System.out.println("Usted esta en un peso ideal");
            return -1;
        }
        if (IMC >= 20 && IMC <= 25 ){
            System.out.println("Usted esta por debajo de su peso ideal ");
            return 0;
        }
        else
            System.out.println("Usted tiene sobrepeso");
            return 1;

    }

    public boolean esMayorDeEdad(){
        if (edad >= 18){
            mayor = true;
            return mayor;
        }
       else
           return mayor;
    }

    private char comprobarSexo(){
       if (sexo == 'M'){
           sexo = 'M';
       }
       else
           sexo = 'H';
       return sexo;
    }

    public String toString(){
        return  "Nombre " + nombre + " Edad " + edad + " Sexo " + sexo + " Peso " + peso + " Altura " + altura + " IMC " + IMC;
    }


}
