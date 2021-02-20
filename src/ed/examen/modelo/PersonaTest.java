package ed.examen.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonaTest {

	Persona p = new Persona ("12345678B", "Andrea", "Cabral");
	
	@Test
	public void testPersonaStringStringString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDni() {
		assertEquals("12345678B", p.getDni());
	}

	@Test
	public void testSetDni() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetApellido1() {
		fail("Not yet implemented");
	}

}
