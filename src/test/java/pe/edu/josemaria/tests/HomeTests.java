package pe.edu.josemaria.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pe.edu.josemaria.Home;

public class HomeTests {

	private Home home;
	
	@Before
	public void setUp() throws Exception {
		home = new Home();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSuma() {
		double a = 3;
		double b = 4;
		double resultado = home.suma(a, b);
		assertEquals(7, resultado, 0.01);
	}
	
	@Test
	public void testResta() {
		double a = 6;
		double b = 4;
		double resultado = home.restar(a, b);
		assertEquals(2, resultado, 0.01);
	}
	
	@Test
	public void testMultiplicacion() {
		double a = 6;
		double b = 4;
		double resultado = home.multiplivar(a, b);
		assertEquals(24, resultado, 0.01);
	}
	
	@Test
	public void testDivision() {
		double a = 60;
		double b = 5;
		double resultado = home.dividir(a, b);
		assertEquals(12, resultado, 0.01);
	}

}
