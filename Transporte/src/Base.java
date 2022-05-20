public class Base extends General{
    private float TiempoMedio;
    private Integer ambulancias;

    public Base(String nombre, Integer personal) {
        super(nombre, personal);
    }

    public Base() {}

    public Base(String nombre, Integer personal, float tiempoMedio, Integer ambulancias) {
        super(nombre, personal);
        TiempoMedio = tiempoMedio;
        this.ambulancias = ambulancias;
    }

    public float getTiempoMedio() {
        return TiempoMedio;
    }

    public void setTiempoMedio(float tiempoMedio) {
        TiempoMedio = tiempoMedio;
    }

    public Integer getAmbulancias() {
        return ambulancias;
    }

    public void setAmbulancias(Integer ambulancias) {
        this.ambulancias = ambulancias;
    }
}
