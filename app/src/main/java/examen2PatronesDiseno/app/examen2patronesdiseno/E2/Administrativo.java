package examen2PatronesDiseno.app.examen2patronesdiseno.E2;

public class Administrativo extends Persona {

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

    @Override
    public void send (String msg, String tipoMensaje){
        mediator.send(msg, tipoMensaje, this);
    }

    @Override
    public void receive(String msg){
        System.out.println("El Mensaje fue recibido por un administrativo " + nombre + "->" + msg);
    }

    public void setTipoPersona(String string) {
    }
}
