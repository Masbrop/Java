public class Secretaria extends Persona {
    private String nombreJefe;
    public boolean escopeta;

    public Secretaria (){
        super();
    }

    public String getNombreJefe (){
        return nombreJefe;
    }
    public void setNombreJefe(String nombreJefe){
        this.nombreJefe = nombreJefe;
    }


   //

    public boolean getAsignarEscopeta (){
        return this.escopeta = false;
    }
    public void setAsignarEscopeta (String nombreCelador){
        this.escopeta = true;
    }


    public boolean quitarEscopeta (){
       return this.escopeta = false;
    }

   //

    public String toString(){
        return super.toString() + " Nombre de jefe: " + nombreJefe;
    }
}
