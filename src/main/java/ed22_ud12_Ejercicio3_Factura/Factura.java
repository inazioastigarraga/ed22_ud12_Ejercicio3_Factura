package ed22_ud12_Ejercicio3_Factura;

import java.util.ArrayList;

public class Factura {
	
	public ArrayList <Producto> productos = new ArrayList<Producto>();
	
	public void meterProducto(Producto p) {
		productos.add(p);
	}
	
	public float totalFactura() {
		float factura = 0;
		for (Producto p: productos) {
			factura += aplicarIva();
		}
		return factura;
		
	}
	public float aplicarIva() {
		float iva = 0;
		for (Producto p: productos) {
			iva = p.precioTotal()*1.21f;
		}
		return iva;
	}
	
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	

	
	

}
