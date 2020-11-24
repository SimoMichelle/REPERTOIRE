import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatriceTest {

	@Test
	public void testSomme() {
		
		// Arrange
		int a = 2;
		int b = 3;
		int c=-2;
		int d=-2;
		int f=2000000000;
		
		Calculatrice calculator = new Calculatrice();
// Act
		//int somme = calculator.somme(a, b);
		//int somme1=calculator.somme(b,c);
		//int somme2=calculator.somme(c,d);
		int somme3=calculator.somme(f,f);
		
		
// Assert
		//assertEquals(5, somme);
		//assertEquals(1, somme1);
		//assertEquals(-4, somme2);
		assertEquals("Le resultat de la somme des deux entiers depasse le nombre de bit reservé au type int", somme3);
		
	}

}
