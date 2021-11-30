package vehiculos;

public class Camioneta extends Vehiculo{
	//ATRIBUTOS
    private  boolean volco;
    private static int cantidadCamioneta;
    
    //CONSTRUCTOR
    public Camioneta(String placa, int puertas, String nombre, float precio, float peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso,  "4X4", fabricante);
        this.volco = volco;
        cantidadCamioneta++;
    }
    //GET 
    public static int getCantidadCamionetas() {
        return cantidadCamioneta;
    }
    
    public boolean isVolco() {
        return volco;
    }
    //SET
    public void setVolco(boolean volco) {
        this.volco=volco;
    }
}
