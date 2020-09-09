package modelo;

public class DGeofisico extends Desastre{
    private int intensidad;
     public void mostrarDetalles(){
         detalleDesastre();
         System.out.println("Intensidad del sismo: "+intensidad+"\n");
     }
}
