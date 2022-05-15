package ed22_ud12_Ejercicio3_Factura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class ProductoTest {
	
	Producto p1;
	Producto p2;
	Producto p3;

	@BeforeEach
	void setUp() throws Exception {
		this.p1 = new Producto("pan",0.50f, 1);
		this.p2 = null;
		this.p3 = p1;
	}
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@RepeatedTest(1000)
	void testIfNull() {
		assertNull(p1);
	}
	@RepeatedTest(1000)
	void testIfIsNotNull() {
		assertNotNull(p1);
	}
	@Test()
	void testSameObject() {
		assertSame(p1, p3);
	}
	@Test()
	void testNotSameObject() {
		assertNotSame(p1, p3);
	}
	@Test()
	void testIfIsTrue() {
		p1.setNombre("pan");
		assertTrue(p1.getNombre() == "pan");
	}
	@Test()
	void testIfIsFalse() {
		p1.setNombre("pepino");
		assertFalse(p1.getNombre() != "pan");
	}	

}
