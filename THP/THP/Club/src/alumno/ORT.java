package alumno;

import java.util.ArrayList;

public class ORT {
	private ArrayList<Alumno> alumnos;

	public ORT() {
		this.alumnos = new ArrayList<Alumno>();
	}

	public void agregarAlumno(String nombre, int edad) {

		Alumno alumnoExistente = this.buscarAlumno(nombre);

		if (alumnoExistente == null) {
			alumnos.add(new Alumno(nombre, edad));
		} else {
			System.out.println("El alumno " + nombre + " " + "de " + edad + " " + "ya existe");
		}
	}

	public boolean eliminarAlumno(String nombre) {

		boolean eliminado = false;
		Alumno alumnoExistente = this.buscarAlumno(nombre);

		if (alumnoExistente != null) {
			this.alumnos.remove(alumnoExistente);
		}

		return eliminado;
	}

	public void modificarAlumno(String nombre, String nuevoNombre, int nuevaEdad) {
		Alumno alumnoExistente = this.buscarAlumno(nombre);

		if (alumnoExistente != null) {
			alumnoExistente.modificarEdad(nuevaEdad);
			alumnoExistente.modificarNombre(nuevoNombre);

			System.out.println("Alumno modificado: " + alumnoExistente);
		} else {
			System.out.println("El alumno " + nombre + " no existe");
		}

	}

	public void mostrarAlumnos() {
		System.out.println("Alumnos: ");
		System.out.println();
		for (Alumno alumno : this.alumnos) {
			System.out.println(alumno.getNombre());
		}
	}

	private Alumno buscarAlumno(String nombre) {

		Alumno alumnoEncontrado = null;
		int i = 0;

		while (i < this.alumnos.size() && alumnoEncontrado == null) {
			if (this.alumnos.get(i).mismoNombre(nombre)) {
				alumnoEncontrado = this.alumnos.get(i);
			}
			i++;

		}

		return alumnoEncontrado;

	}

}
