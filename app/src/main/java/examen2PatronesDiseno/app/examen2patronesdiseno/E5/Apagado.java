package examen2PatronesDiseno.app.examen2patronesdiseno.E5;

public class Apagado implements IEstado {
    
    @Override
    public void handler(Celular celular){
        celular.setProgramasAbiertos(0);
        celular.setCPU(0);
        System.out.println("El Celular esta apagado");
        System.out.println("programas abiertos ->" + celular.getProgramasAbiertos());
        System.out.println("uso de recursos ->" + celular.getCPU());
        System.out.println("Memoria ->" + celular.getMemoria());
        System.out.println("RAM ->" + celular.getRAM());
    }
}
