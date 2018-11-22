//
// Instrucciones de compilación:
// javac -cp .:./hamcrest-core-1.3.jar:./junit-4.12.jar MinTest.java
//

import static org.junit.Assert.*; // En este paquete están los métodos assertTrue, assertEquals, assertNull, fail, etc.
import org.junit.*;
import java.util.*;

public class EmbotelladoraTest
{

	// // Test con precio entero (0 céntimos)
	// @Test
	// public void testForZeroDecimal ()
	// {
	// 	assertTrue("testForZeroDecimal_Error",		// Se imprimirá este msg si test falla
	// 		42.0 == DescuentoBlackFriday.PrecioFinal(60.0));
	// }
	//
	// //Test con precio orignal decimal (céntimos != 0)
	// @Test
	// public void testForDecimal()
	// {
	// 	assertTrue("testForDecimal_Error",		// Se imprimirá este msg si test falla
	// 		41.93 == DescuentoBlackFriday.PrecioFinal(59.90));
	// }

	//Test con botellas pequenas negativas
	@Test (expected = IllegalArgumentException.class) // Este test decora la anotación @Test con la clase de la excepción esperada.
	public void testForNegativePequenas()
	{
		Embotelladora.calculaBotellasPequenas(-10,10,10);
	}

	//Test con botellas grandes negativas
	@Test (expected = IllegalArgumentException.class)
	public void testForNegativeGrandes()
	{
		Embotelladora.calculaBotellasPequenas(10,-10,10);
	}

	//Test con litros totales < 0
	@Test (expected = IllegalArgumentException.class)
	public void testForNegativeTotal()
	{
		Embotelladora.calculaBotellasPequenas(10,10,-10);
	}

	//Test con pequenas=grandes=0
	@Test (expected = IllegalArgumentException.class)
	public void testForZeroTotal()
	{
		Embotelladora.calculaBotellasPequenas(0,0,10);
	}

	// Test con precio original válido
	@Test
	public void testForValidCombination()
	{
		assertTrue("testForValidCombination_Error", 2 == Embotelladora.calculaBotellasPequenas(10,1,7));
	}

	// Test con precio original válido
	@Test
	public void testForInvalidCombination()
	{
		assertTrue("testForInvalidCombination_Error", -1 == Embotelladora.calculaBotellasPequenas(1,1,7));
	}
}
