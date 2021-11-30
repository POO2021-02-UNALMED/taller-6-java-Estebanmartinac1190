package vehiculos;
import java.util.Hashtable;
import java.util.ArrayList;

public class Fabricante {
	//ATRIBUTOS 
    private String nombre;
    private Pais pais;
    //CONSTRUCTOR
    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    //GET
    public Pais getPais() {
        return pais;
    }

    public String getNombre() {
        return nombre;
    }

    //SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    //METODO EXTRA
    public static Fabricante fabricaMayorVentas(){
        ArrayList<Vehiculo> vehiculos = Vehiculo.getVehiculos();
        Hashtable<Fabricante, Integer> paisHash = new Hashtable<>();
        Fabricante fabSeleccionado=null;


        for (Vehiculo vehiculo : vehiculos) {
            fabSeleccionado = vehiculo.getFabricante();
            if (paisHash.containsKey(fabSeleccionado)) {
                paisHash.put(fabSeleccionado, paisHash.get(fabSeleccionado) + 1);
            }
            else {
                paisHash.put(fabSeleccionado, 1);
            }
        }
        int canitidadMax = paisHash.get(vehiculos.get(0).getFabricante());
        Fabricante Max = vehiculos.get(0).getFabricante();
        for (Fabricante fab : paisHash.keySet()) {
            int cant = paisHash.get(fab);
            if (cant > canitidadMax) {
                canitidadMax = cant;
                Max = fab;
            }
        }
        return Max;
    }
