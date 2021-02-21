package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para representar a un curso escolar
 * @author Andrea
 * @version 1.0
 **/

public class Curso {

	private List<Persona> listaAlumnos;

	/**
	 * Elimina un alumno a partir de su dni
	 * @param dni DNI del alumno que se quiere eliminar 
	 * @throws Exception Excepcion si la longuitud del DNI no es la correcta
	 **/
	public void eliminarAlumno(String dni) throws Exception {
		if (dni.length() == 9) {// comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); // solo hace falta el dni
		} else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}

	/**
	 * Añade un alumno al curso
	 * @param p Persona a añadir al curso
	 **/
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}

	/**
	 * Comprueba si un alumno esta registrado en curso
	 * @param dni El DNI del alumno a comprobar
	 * @return Devulve True si el alumno se han encontrado, false en caso contrario
	 **/
	public Boolean estaRegistrado(String dni) {
		int i = 0;
		Boolean encontrado = false;
		while (!encontrado && i < listaAlumnos.size()) {
			if (listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}

	/**
	 * Inicializa el curso
	 **/
	public Curso() {
		listaAlumnos = new ArrayList<Persona>();
	}

	/**
	 * Devulve el numero de alumnos que tiene el curso
	 * @return Numero de alumnos que tiene el curso
	 **/
	public Integer numeroAlumnos() {
		return listaAlumnos.size();
	}

	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
