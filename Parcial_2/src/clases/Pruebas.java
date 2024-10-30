package clases;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Pruebas {
	private Parcial calculo;
	
	@BeforeEach
	public void setUp() throws Exception {
		calculo = new Parcial();
	}
	
	@Test
	@DisplayName("Cálculo de raíces de un polinomio grado 2")
	public void pruebas() {
		assertEquals(-1, this.calculo(1.0,2.0,1.0));
	}

}
