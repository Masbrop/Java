public class Celador {
    private boolean escopeta;
    private Persona celadores [];
    private int contCelador = -1;

    public Celador (){
        ++contCelador;
        celadores = new Persona[2];
    }

    public void añadirCelador(Persona celador){
        celadores [contCelador] = celador;
    }
}
