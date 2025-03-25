package ort.edu.ar.thp.par2;

public class Test {

	public static void main(String[] args) {
		CowORTking sistema = new CowORTking();

		// Crear y registrar usuarios
		sistema.registrarNuevoSocio("12345678", "Juan Perez");
		sistema.registrarNuevoSocio("87654321", "Maria Gomez");
		sistema.registrarNuevoSocio("87654321", "Maria Gomez");

		// Crear sede y agregar salas
		sistema.agregarSede("Sede Central");
		sistema.agregarSede("Caballito");
		sistema.agregarSede("Belgrano");
		sistema.agregarSala("Sede Central", "Sala con proyector", 30000);
		sistema.agregarSala("Caballito", "Sala de reuniones", 30000);
		sistema.agregarSala("Caballito", "Sala de reuniones", 30000);
		sistema.agregarSala("Belgrano", "Sala de reuniones", 30000);
		sistema.agregarSala("Belgrano", "Sala con proyector", 20000);
		sistema.agregarSala("Belgrado", "Sala con proyector", 20000);

		// Reservar salas
		reservarSala(sistema, "12345678", "Sede Central", "Sala con proyector");
		reservarSala(sistema, "87654321", "Belgrano", "Sala de reuniones");
		reservarSala(sistema, "87654321", "Caballito", "Sala de reuniones");
		reservarSala(sistema, "87654321", "Sede Central", "Sala con proyector");
	}

	private static void reservarSala(CowORTking sistema, String dni, String sede, String sala) {
		Ticket ticket = sistema.reservarSala(dni, sede, sala);
		if (ticket != null) {
			System.out.println("Reserva realizada:");
			System.out.println(ticket);
		}

	}

}