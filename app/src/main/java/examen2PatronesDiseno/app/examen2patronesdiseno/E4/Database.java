package examen2PatronesDiseno.app.examen2patronesdiseno.E4;

import strategy.template.IStrategy;

import java.util.ArrayList;
import java.util.List;

public class Database {
    List<Libro> libros = new ArrayList<>();
    IStrategy strategy;

    public Database() {}

    public void addLibros(Libro libro){
        libros.add(libro);
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void ordenar(){
        strategy.execute();
    }
}
