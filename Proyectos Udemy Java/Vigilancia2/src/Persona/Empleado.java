package Persona;
public class Empleado {

    private String nombre;
    private double valorHora;
    private String fechaNacimiento;

    public Empleado (String nombre, double valorHora, String fechaNacimiento){
        this.nombre = nombre;
        this.valorHora = valorHora;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", valorHora=" + valorHora +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
