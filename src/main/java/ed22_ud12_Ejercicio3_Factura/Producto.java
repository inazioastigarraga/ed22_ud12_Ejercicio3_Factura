package ed22_ud12_Ejercicio3_Factura;

/**
 * Simple class representing a purchase
 * @author inazi
 *
 */

public class Producto {

	private String nombre;
	private float precio;
	private int cantidad;
	
	/**
	 * 
	 * @param nombre precio cantidad
	 */
	
	public Producto(String nombre, float precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public float precioTotal() {
		return precio * cantidad;
	}
	
	public String toString() {
		return "Has encargado "+cantidad+"de "+nombre+", cada uno/a cuesta "+precio;
	}
	
	/**
	 * Getter of nombre
	 * @return String
	 */
	
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Set nombre
	 * @param nombre
	 */
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Getter of precio
	 * @return float
	 */
	
	public float getPrecio() {
		return precio;
	}
	
	/**
	 * Set precio
	 * @param precio
	 */
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	/**
	 * Getter of cantidad
	 * @return int
	 */
	
	public int getCantidad() {
		return cantidad;
	}
	
	/**
	 * Set cantidad
	 * @param cantidad
	 */
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


}
