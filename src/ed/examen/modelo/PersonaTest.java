package ed.examen.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonaTest {

	Persona p = new Persona("12345678B", "Andrea", "Cabral");

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
		// clase valida
		try {
			p.setDni("87654321d");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("87654321d", p.getDni());

		Boolean lanzaExcepcion = false;
		try {
			p.setDni("012345678");
		} catch (Exception e) {
			lanzaExcepcion= true;
		}
		assertTrue(lanzaExcepcion);
	}

	@Test
	public void testGetNombre() {
		assertEquals("Andrea", p.getNombre());
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
