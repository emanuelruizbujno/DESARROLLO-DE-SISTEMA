public class Paquete {
    private float peso;
    private float tamaño;
    private boolean fragil;
    private Integer ID;

    public Paquete() {
    }

    public Paquete(float peso, float tamaño, boolean fragil, Integer ID) {
        this.peso = peso;
        this.tamaño = tamaño;
        this.fragil = fragil;
        this.ID = ID;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
}
