package examen2PatronesDiseno.app.examen2patronesdiseno.E5;

public class Celular {
    private int programasAbiertos;
    public int getProgramasAbiertos() {
        return programasAbiertos;
    }
    public void setProgramasAbiertos(int programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }
    private String memoria;
    public String getMemoria() {
        return memoria;
    }
    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }
    private String RAM;
    public String getRAM() {
        return RAM;
    }
    public void setRAM(String rAM) {
        RAM = rAM;
    }
    private double CPU;
    public double getCPU() {
        return CPU;
    }
    public void setCPU(double cPU) {
        CPU = cPU;
    }
    private IEstado state;
    public IEstado getState() {
        return state;
    }
    public void setState(IEstado state) {
        this.state = state;
    }

    public Celular(){
        state = new Apagado();
        memoria = "8GB";
        RAM = "4GB";
    }

    public void request(){
        this.state.handler(this);
    }

}
