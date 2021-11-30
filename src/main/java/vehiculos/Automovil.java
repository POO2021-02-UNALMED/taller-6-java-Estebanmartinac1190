package vehiculos;
import java.util.ArrayList;
public class Automovil extends Vehiculo{
    //ATRIBUTOS
	protected static int cantidadAutomovil;
    private int puestos;
    
    //CONSTRUCTOR
    public Automovil(String placa, String nombre, float precio, float peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso,  "FWD", fabricante);
        this.puestos = puestos;
        cantidadAutomovil++;
    }
    
    //GET 
    public int getPuestos() {
        return puestos;
    }
    
    public static int getCantidadAutomoviles() {
        return cantidadAutomovil;
    }
      
    
    //SET    
    public static void setCantidadAutomoviles(int cantidadAutomovil) {
        Automovil.cantidadAutomovil = cantidadAutomovil;
    }
    
    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
    
}
