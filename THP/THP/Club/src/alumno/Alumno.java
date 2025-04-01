package alumno;

public class Alumno {
	private String nombre;
	private int edad;

	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public boolean mismoNombre(String nombre) {
		return this.nombre.equals(nombre);
	}

	public boolean mismaEdad(int edad) {
		return this.edad == edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void modificarNombre(String nombre) {

		this.nombre = nombre;
	}

	public void modificarEdad(int edad) {

		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + "]";
	}
}
