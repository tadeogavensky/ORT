package alumno;

public class Test {

	public static void main(String[] args) {
		ORT ort = new ORT();

		Alumno a1 = new Alumno("Juan Perez", 24);
		Alumno a2 = new Alumno("Ana Lopez", 23);
		Alumno a3 = new Alumno("Pedro Gomez", 25);
		Alumno a4 = new Alumno("Maria Garcia", 22);
		Alumno a5 = new Alumno("Juan Perez", 24);

		ort.agregarAlumno(a1.getNombre(), a1.getEdad());
		ort.agregarAlumno(a2.getNombre(), a2.getEdad());
		ort.agregarAlumno(a3.getNombre(), a3.getEdad());
		ort.agregarAlumno(a4.getNombre(), a4.getEdad());
		ort.agregarAlumno(a5.getNombre(), a5.getEdad());

		ort.mostrarAlumnos();

		System.out.println();

		ort.eliminarAlumno("Juan Perez");

		ort.mostrarAlumnos();

		System.out.println();

		ort.modificarAlumno("Ana Lopez", "Ana Maria Lopez", 24);

	}

}
