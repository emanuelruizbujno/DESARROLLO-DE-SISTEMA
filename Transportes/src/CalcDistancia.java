public class CalcDistancia extends Calculo{
    public float Calcular(Transportista transportista){
        Envio envio = transportista.getEnvio();
        float distancia = envio.calcDistancia();

        return transportista.getTarifa() * distancia;
    }
}