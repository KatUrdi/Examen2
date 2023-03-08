package examen2PatronesDiseno.app.examen2patronesdiseno.E1;

public class Documento {
    private String nuevoCambio;
    public String getNuevoCambio() {
        return nuevoCambio;
    }
    public void setNuevoCambio(String nuevoCambio) {
        this.nuevoCambio = nuevoCambio;
    }
    private String state;
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public Documento(String nuevoCambio, String state){
        this.nuevoCambio = nuevoCambio;
        this.state = state;
    }
    
    
}
