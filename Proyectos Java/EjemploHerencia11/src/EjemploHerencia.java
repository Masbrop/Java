public class EjemploHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan",25000, 31);
        empleado1.setGenero('M');
        empleado1.setEdad(28);
        empleado1.setDireccion("Loma 301");
        System.out.println("empleado1 = " + empleado1);

        Cliente cliente1 = new Cliente(14, true);
        cliente1.setNombre("Pedrito");
        cliente1.setEdad(38);
        cliente1.setDireccion("Calle 103");
        System.out.println("cliente1 = " + cliente1);
    }
}
