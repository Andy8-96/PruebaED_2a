package ed.examen.modelo;

/**
 * Una clase para representar a una persona en un curso
 * @author Andrea
 * @version 1.0
 **/

public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	public Persona() {}
	
	/**
	 * Inicializa la persona
	 * @param dni DNI de la persona
	 * @param nombre Nombre de la persona 
	 * @param apellido1 El primer apellido de la persona
	 **/
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	/**
	 * Obtiene el DNI de la persona
	 * @return Devuelve el DNI
	 **/
	public String getDni() {
		return dni;
	}
	
	
	/**
	 * Comprueba que el DNI de la persona introducido es correcto, si no lanza una Excepcion
	 * @param dni DNI de la persona
	 * @throws Exception Lanza la excepcion si el ultimo caracter de DNI no es una letra
	 **/
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()-1))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	/**
	 * Obtiene el Nombre de la persona
	 * @return Devuelve el nombre
	 **/
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Modifica el nombre de la persona
	 * @param nombre Nuevo nombre a recibir de la persona
	 **/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Obtiene el primero Apellido de persona
	 * @return Devuelve el primero Apellido
	 **/
	public String getApellido1() {
		return apellido1;
	}
	
	/**
	 * Modifica el primero Apellido de la persona
	 * @param apellido1 Nuevo apellido a recibir de la persona
	 **/
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
