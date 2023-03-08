package examen2PatronesDiseno.app.examen2patronesdiseno.E1;

public class Memento {
    private Documento state;

    public Memento(Documento concreteObject){
        state = concreteObject;
    }

    public Documento getState(){
        return state;
    }
}
