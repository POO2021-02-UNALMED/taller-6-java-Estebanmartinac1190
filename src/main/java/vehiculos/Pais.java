package vehiculos;
import java.util.Hashtable;
import java.util.ArrayList;
public class Pais {
	//ATRIBUTOS 
    private String nombre;
    
    //GET 
    public String getNombre() {
        return nombre;
    }
    //SET 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
    
    public Pais(String nombre) {
        this.nombre = nombre;
    } 
    public static Pais paisMasVendedor() {
        ArrayList<Vehiculo> vehiculos = Vehiculo.getVehiculos();
        Hashtable<Pais, Integer> paisHash = new Hashtable<>();
        Pais elig=null;
        for (Vehiculo vehiculo : vehiculos) {
            elig = vehiculo.getFabricante().getPais();
            if (paisHash.containsKey(elig)) {
                paisHash.put(elig, paisHash.get(elig) + 1);
            }
            else {
                paisHash.put(elig, 1);
            }
        }
        int may = paisHash.get(vehiculos.get(0).getFabricante().getPais());
        Pais masimi = vehiculos.get(0).getFabricante().getPais();
        for (Pais pais : paisHash.keySet()) {
            int cantidad = paisHash.get(pais);
            if (cantidad > may){
                may= cantidad;
                masimi = pais;
            }
        }
        return masimi;
    }

}