package ed.examen.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CursoTest {

	Curso c = new Curso();
	
	@Test
	public void testEliminarAlumno() {
		
		try {
			c.aniadirAlumno(new Persona ("12345678c","Pepito", "de los Palotes"));
			c.eliminarAlumno("12345678c");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertFalse(c.estaRegistrado("12345678c"));
		
		Boolean lanzarExcepcion = false;
		try {
			c.aniadirAlumno(new Persona ("12345678c","Pepito", "de los Palotes"));
			c.eliminarAlumno("123456780");
		} catch (Exception e) {
			lanzarExcepcion = true;
		}
		assertTrue(lanzarExcepcion);
	}

	@Test
	public void testAniadirAlumno() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstaRegistrado() {
		fail("Not yet implemented");
	}

	@Test
	public void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	public void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

}
