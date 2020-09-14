public class VisorDeReloj {
    private VisorDeNumeros horas;
    private VisorDeNumeros minutos;
    private String cadVisor;

    public VisorDeReloj(){
        horas = new VisorDeNumeros(24);
        minutos = new VisorDeNumeros(60);
        actualizarVisor();
    }
}
