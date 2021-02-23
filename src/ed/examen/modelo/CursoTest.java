package ed.examen.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CursoTest {

	Curso c = new Curso();
	Persona p = new Persona ("12345678c","Pepito", "de los Palotes");
	
	@Test
	public void testEliminarAlumno() {
		
		try {
			c.eliminarAlumno("12345678c");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertFalse(c.estaRegistrado("12345678c"));
		
		Boolean lanzarExcepcion = false;
		try {
			c.eliminarAlumno("123456780");
		} catch (Exception e) {
			lanzarExcepcion = true;
		}
		assertTrue(lanzarExcepcion);
	}

	@Test
	public void testAniadirAlumno() {
		c.aniadirAlumno(p);
		assertTrue(c.estaRegistrado("12345678c"));
	}

	@Test
	public void testEstaRegistrado() {
		c.aniadirAlumno(p);
		assertTrue(c.estaRegistrado("12345678c"));
		
		assertFalse(c.estaRegistrado("87654321v"));
	}

	@Test
	public void testCurso() {
		Curso c = new Curso();
		assertTrue(c.numeroAlumnos()==0);
	}

	@Test
	public void testNumeroAlumnos() {
		
		assertTrue(c.numeroAlumnos()==0);
		
	}

}
