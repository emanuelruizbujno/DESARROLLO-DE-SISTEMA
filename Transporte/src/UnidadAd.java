import java.util.ArrayList;

public class UnidadAd extends General{
    private Integer ambulanciaTotal;
    private ArrayList<General> bases;
    private float tiempoMedioTotal;

    public UnidadAd() {
        this.bases = new ArrayList<>();
    }

    public UnidadAd(String nombre, Integer personal) {
        super(nombre, personal);
    }

    public UnidadAd(String nombre, Integer personal, Integer ambulanciaTotal, ArrayList<General> bases, float tiempoMedioTotal) {
        super(nombre, personal);
        this.ambulanciaTotal = ambulanciaTotal;
        this.bases = bases;
        this.tiempoMedioTotal = tiempoMedioTotal;
    }

    public Integer getAmbulanciaTotal() {
        return ambulanciaTotal;
    }

    public void setAmbulanciaTotal(Integer ambulanciaTotal) {
        this.ambulanciaTotal = ambulanciaTotal;
    }

    public ArrayList<General> getBases() {
        return bases;
    }

    public void setBases(ArrayList<General> bases) {
        this.bases = bases;
    }

    public float getTiempoMedioTotal() {
        return tiempoMedioTotal;
    }

    public void setTiempoMedioTotal(float tiempoMedioTotal) {
        this.tiempoMedioTotal = tiempoMedioTotal;
    }

    public float calcularTiempoPromedio(){
         for(General base: bases){

         }
        return 1.f;
    }
}
