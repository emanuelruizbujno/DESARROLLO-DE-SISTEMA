import java.util.ArrayList;

public class Impresora {

    private ArrayList<Dispositivo> dispositivos;
    private ArrayList<Impresion> impresiones;
    private static Impresora impresora;

    public  static Impresora getImpresora(ArrayList<Dispositivo> dispositivos,ArrayList<Impresion> impresiones) {

        if (impresora==null) {

            impresora=new Impresora(dispositivos,impresiones);
        }
        return impresora;
    }

    private Impresora(ArrayList<Dispositivo> dispositivos,ArrayList<Impresion> impresiones){

        this.dispositivos = dispositivos;
        this.impresiones = impresiones;

    }

   
}
