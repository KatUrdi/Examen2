package examen2PatronesDiseno.app.examen2patronesdiseno.E3;

public interface IFacebook {
    void suscribir(Usuario observer);

void detach(Usuario observer);

void notifyObservers(String msg, String tipo);

    
}