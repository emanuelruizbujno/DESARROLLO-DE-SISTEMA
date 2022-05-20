import java.util.ArrayList;

public class CalcPeso extends Calculo{
    public float Calcular(Transportista transportista){
        Envio envio = transportista.getEnvio();
        ArrayList<Paquete> paquetes = envio.getPaquetes();

        float peso = 0;

        for(Paquete paquete1 : paquetes){
            peso += paquete1.getPeso();
        }

        return  transportista.getTarifa() * peso;
    }
}
