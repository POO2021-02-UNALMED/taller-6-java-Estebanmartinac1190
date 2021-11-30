package vehiculos;

public class Camion extends Vehiculo{
	//ATRIBUTOS
    private static int cantidaCamion;
    private int ejes;
    
    //CONSTRUCTOR 
    public Camion(String placa, String nombre, float precio, float peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2",  fabricante);
        this.ejes = ejes;
        cantidaCamion++;
    }
    
    //GET
    public int getEjes() {
        return ejes;
    }

    public static int getCantidadCamiones() {
        return cantidaCamion;
    }
    
    //SET
    
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

}