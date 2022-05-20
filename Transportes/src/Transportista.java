public class Transportista{

    private String nombre;
    private float precio;
    private float tarifa;
    private Calculo metodoCalculo;
    private Envio envio;

    public Transportista() {
    }

    public Transportista(String nombre, float precio, float tarifa, Calculo metodoCalculo, Envio envio) {
        this.nombre = nombre;
        this.precio = precio;
        this.tarifa = tarifa;
        this.metodoCalculo = metodoCalculo;
        this.envio = envio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    public Calculo getMetodoCalculo() {
        return metodoCalculo;
    }

    public void setMetodoCalculo(Calculo metodoCalculo) {
        this.metodoCalculo = metodoCalculo;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }
}
