package examen2PatronesDiseno.app.examen2patronesdiseno.E5;
import java.util.Random;

public class Prendido implements IEstado{

    @Override
    public void handler(Celular celular) throws InterruptedException{
        System.out.println("El Celular esta Prendido");
        celular.setProgramasAbiertos(new Random().nextInt(10));
        System.out.println("programas abiertos ->" + celular.getProgramasAbiertos());
        System.out.println("Memoria ->" + celular.getMemoria());
        System.out.println("RAM ->" + celular.getRAM());
        double currentValue = celular.getCPU();
        while (currentValue < 100){
            Thread.sleep(5000);
            currentValue = currentValue + (double) celular.getProgramasAbiertos() * 5;
            System.out.println("uso de recursos ->" + celular.getCPU());
        }
        System.out.println("Los recursos llegaron al 100%");
    }
    
}
