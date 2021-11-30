package vehiculos;
import java.util.ArrayList;
public class Vehiculo {
	//ATRIBUTOS 
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private float precio;
	private float peso;
	private String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculo;
	private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
	
	//CONSTRUCTOR 
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, float peso, float precio, String traccion, Fabricante fabricante) {
	this.nombre = nombre;
        this.precio = precio;
	this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.peso = peso;
        cantidadVehiculo++;
        vehiculos.add(this);
        this.fabricante = fabricante;
        this.traccion = traccion;   
	}
	
	//GETS 
	public static ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
	}
	
	public String getPlaca() {
        return placa;
    }
	
	public static int getCantidadVehiculo() {
	    return cantidadVehiculo;
	}
	 
	public int getPuertas() {
	    return puertas;
	}
	 
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	 
	public float getPrecio() {
	    return precio;
	}
	 
	public float getPeso() {
	    return peso;
	}
	  
	public Fabricante getFabricante() {
	    return fabricante;
	}
	  
	public String getTraccion() {
	    return traccion;
	 }
	  
	public static int getCantidadVehiculos() {
	     return cantidadVehiculo;
	 }
	
	//SETS 
	
	public void setPlaca(String placa) {
		this.placa=placa;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public static void setCantidadVehiculos(int cantidadVehiculo) {
		Vehiculo.cantidadVehiculo = cantidadVehiculo; 
	}
	
	//METODOS EXTRA 
	
	public static String vehiculosPorTipo(){
        return  "Automoviles: " + Automovil.getCantidadAutomoviles() +
                "\nCamionetas: " + Camioneta.getCantidadCamionetas() +
                "\nCamiones: " + Camion.getCantidadCamiones();	
}
}
