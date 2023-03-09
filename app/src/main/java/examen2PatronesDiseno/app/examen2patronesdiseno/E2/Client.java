package examen2PatronesDiseno.app.examen2patronesdiseno.E2;

public class Client{public static void main(String [] args) {
    ConcreteChat chat = new ConcreteChat();

    Estudiante e1 = new Estudiante(chat);
    e1.setTipoPersona("estudiante");
    e1.setNombre("Flavia");

    Estudiante e2 = new Estudiante(chat);
    e2.setTipoPersona("estudiante");
    e2.setNombre("Maya");

    Docente d1 = new Docente(chat);
    d1.setTipoPersona("docente");
    d1.setNombre("Oscar");

    Docente d2 = new Docente(chat);
    d2.setTipoPersona("docente");
    d2.setNombre("Mauricio");

    Administrativo a1 = new Administrativo(chat);
    a1.setTipoPersona("administrativo");
    a1.setNombre("Carla");

    Administrativo a2 = new Administrativo(chat);
    a2.setTipoPersona("administrativo");
    a2.setNombre("Andres");

    chat.addToChat(e1);
    chat.addToChat(e2);
    chat.addToChat(d1);
    chat.addToChat(d2);
    chat.addToChat(a1);
    chat.addToChat(a2);

    // Los estudiantes podran decidir si su mensaje es enviado a todos, o solo a los docentes o solo a los administrativos

    e1.send("este mensaje es para todos" , "grupal");
    e1.send("este mensaje es para los docentes" , "docentes");
    //aqui solo los docentes envian ensajes a  estudiantes

    d2.send("este mensaje es para los estudiantes" , "estudiantes");

    // los admins envian mensajes a todos

    a2.send("este mensaje es para todos" , "grupal");

} 
}
