package examen2PatronesDiseno.app.examen2patronesdiseno.E2;

public class Administrativo {

    private String nombre;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Administrativo (IChat mediator){
        super(mediator);

    }

    @override

    
    
}