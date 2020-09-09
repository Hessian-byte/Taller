package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Desastre {
    protected ArrayList<Persona> personasAfectadas;
    protected Date fecha;
    protected Ubicacion ubicacion;
    protected int radioAreaAfectada;

    protected void detalleDesastre(){
        System.out.println("Personas afectadas:\n");
        for(int i = 0;i< personasAfectadas.size();i++){
            System.out.println(personasAfectadas.get(i).getNombre()+"\n");
        }
        System.out.println("Fecha: "+fecha+"\n");
        System.out.println("Ubicación: "+ubicacion.getLugar().getNombre()+", "+ubicacion.getLugar().getPais()+", "+ubicacion.getLatitud()+", "+ubicacion.getLongitud()+"\n");
        System.out.println("Radio del area afectada: "+radioAreaAfectada+"\n");

    }
    protected void listaDesaparecidos(){
        for(int i = 0;i< personasAfectadas.size();i++){
            System.out.println(personasAfectadas.get(i).getNombre()+"\n");
            System.out.println(personasAfectadas.get(i).getEdad()+"\n");
            System.out.println(personasAfectadas.get(i).getCiudadResidencia().getNombre()+"\n");
        }
    }
    protected void actualizarListaDesaparecidos(Persona persona){
        personasAfectadas.add(persona);
    }

}
