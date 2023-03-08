package examen2PatronesDiseno.app.examen2patronesdiseno.E1;

public class Versionador {
    private Documento state;

    public void guardarCambio(Documento state){
        System.out.println("Guardando version de documento ->" + state.getState());
        this.state = state;
    }
    
    public Memento createCambio(){
        return new Memento(state);
    }

    public Documento revertirCambio(Memento memento){
        this.state = memento.getState();
        return state;
    }
}
