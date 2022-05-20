public class Impresion {

    private Dispositivo dispositivo;
    private float resolucion;
    private boolean color;

    public Impresion(){}

    public Impresion(Dispositivo dispositivo, float resolucion, boolean color) {
        this.dispositivo = dispositivo;
        this.resolucion = resolucion;
        this.color = color;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public float getResolucion() {
        return resolucion;
    }

    public void setResolucion(float resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }
}
