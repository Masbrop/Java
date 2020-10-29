public class Persona {

    private String nombre;
    private double valorHora;
    private String fechaNacimiento;

    public Persona (){
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }

    public String getFechaNacimiento(){
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public String toString(){
        return "Nombre: " + nombre + " Valor hora: " + valorHora + " Fecha de nacimiento: " + fechaNacimiento;
    }
}
