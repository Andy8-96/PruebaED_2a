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
		c.aniadirAlumno(new Persona ("12345678c","Pepito", "de los Palotes"));
		assertTrue(c.estaRegistrado("12345678c"));
	}

	@Test
	public void testEstaRegistrado() {
		c.aniadirAlumno(new Persona ("12345678c","Pepito", "de los Palotes"));
		assertTrue(c.estaRegistrado("12345678c"));
		
		assertFalse(c.estaRegistrado("87654321v"));
	}

	@Test
	public void testCurso() {
		
	}

	@Test
	public void testNumeroAlumnos() {
		
		assertTrue(c.numeroAlumnos()==0);
		
	}

}
