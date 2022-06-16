package ed22_ud12_Ejercicio3_Factura;

import ed22_ud12_Ejercicio3_Factura.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {
    private Producto p1;
    @BeforeEach
    public void initEach(){
        p1 = new Producto("lechuga",1.40f, 5);
    }
    
    
    @Test
    @DisplayName("Calcula precio total")
    void precioTotal() {
        assertEquals(1.40f,p1.precioTotal());
    }
    
    
    @Test
    @DisplayName("Obtiene nombre producto")
    void getNombre(){
        assertEquals("lechuga",p1.getNombre());
    }
    
    
    @Test
    @DisplayName("Obtiene cantidad producto")
    void getPrecio(){
        assertEquals(1.40f,p1.getPrecio());
    }
    
    
    @Test
    @DisplayName("Obtiene cantidad producto")
    void getCantidad(){
        assertEquals(5,p1.getCantidad());
    }
}