import java.util.ArrayList;

public class Envio {
    private String Destinatario;
    private String Destino;
    private ArrayList<Paquete> paquetes;

    public Envio() {
    }

    public Envio(String destinatario, String destino, ArrayList<Paquete> paquetes) {
        Destinatario = destinatario;
        Destino = destino;
        this.paquetes = paquetes;
    }

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String destinatario) {
        Destinatario = destinatario;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public float calcDistancia(){
        return 23.5f;
    }
}
