package examen2PatronesDiseno.app.examen2patronesdiseno.E5;

public class Client {
    public static void main(String [] args) {
        Celular celular = new Celuar();

        celular.setState(new Reiniciar());
        celular.request();

        celular.setState(new Apagado());
        celular.request();

        celular.setState(new Prendido());
        celular.request();


    }
}
