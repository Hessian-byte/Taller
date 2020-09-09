package modelo;

public class DHidrologico extends Desastre{
    private String origenDelAgua;

    public void mostrarDetalles(){
        detalleDesastre();
        System.out.println("Origen del agua: "+origenDelAgua+"\n");
    }
}
