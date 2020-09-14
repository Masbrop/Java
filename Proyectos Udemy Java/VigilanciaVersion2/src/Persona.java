public class Persona {

    private String nombre;
    private int valorHora;
    private String fechaNacimiento;

    public Persona (String nombre, int valorHora, String fechaNacimiento){
        this.nombre = nombre;
        this.valorHora = valorHora;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getValorHora() {
        return valorHora;
    }
    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String toString(){
        return "Nombre: " + nombre + " Valor hora: " + valorHora + " Fecha de nacimiento: " + fechaNacimiento;
    }
}
