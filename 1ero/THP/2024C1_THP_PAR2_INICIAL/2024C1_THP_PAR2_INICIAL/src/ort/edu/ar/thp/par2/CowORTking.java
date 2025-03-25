package ort.edu.ar.thp.par2;

import java.util.ArrayList;

/**
 * Clase principal que representa a la empresa que alquila las salas/oficians
 * temporarias a sus socios.
 */
class CowORTking {
	public static final double TARIFA_BASE_MENSUAL = 15000;
	private ArrayList<Socio> socios;
	private ArrayList<Sede> sedes;

	public CowORTking() {
		this.socios = new ArrayList<>();
		this.sedes = new ArrayList<>();
	}

	/**
	 * Agrega una sala a una sede. La sede debe existir.
	 * @param nombreSede
	 * @param descripcionSala
	 * @param precioAdicional
	 */
	public void agregarSala(String nombreSede, String descripcionSala, double precioAdicional) {
		Sede sede = this.buscarSede(nombreSede);
		if (sede != null)
			sede.agregarSala(descripcionSala, precioAdicional);
		else
			System.out.println("Sede '" + nombreSede + "' no encontrada.");
	}

	/**
	 * Registra una sede siempre y cuando no exista una con el mismo nombre.
	 * @param nombreSede
	 */
	public void agregarSede(String nombreSede) {
		Sede sede = buscarSede(nombreSede);
		if (sede == null) {
			sede = new Sede(nombreSede);
			this.sedes.add(sede);
		}
	}

	private Sede buscarSede(String nombreSede) {
		Sede elementoEncontrado = null;
		int i = 0;
		while (i < this.sedes.size() && !this.sedes.get(i).esMismoNombre(nombreSede)) {
			i++;
		}
		if (i < this.sedes.size()) {
			elementoEncontrado = this.sedes.get(i);
		}
		return elementoEncontrado;
	}

	private Socio buscarSocio(String dni) {
		Socio elementoEncontrado = null;
		int i = 0;
		while (i < this.socios.size() && !this.socios.get(i).esMismoDni(dni)) {
			i++;
		}
		if (i < this.socios.size()) {
			elementoEncontrado = this.socios.get(i);
		}
		return elementoEncontrado;
	}

	/**
	 * Permite registrar un nuevo socio siempre y cuando no se haya registrado previamente.
	 * @param dni
	 * @param nombreCompleto
	 */
	public void registrarNuevoSocio(String dni, String nombreCompleto) {
		Socio socio = this.buscarSocio(dni);
		if (socio == null) {
			this.socios.add(new Socio(dni, nombreCompleto));
			System.out.println("Socio registrado correctamente.");
		} else {
			System.out.println("El socio con dni " + dni + " fue registrado previamente.");
		}
	}

	/**
	 * Reserva una sala para un socio.
	 * 
	 * @param dni
	 * @param nombreSede
	 * @param descripcionSala
	 * @return Devuelve el ticket comprobante de la reserva.
	 */
	public Ticket reservarSala(String dni, String nombreSede, String descripcionSala) {
		Ticket ticket = null;
		Socio socio = this.buscarSocio(dni);

		if (socio == null) {
			System.out.println("Socio '" + dni + "' no existe.");
		} else {
			Sede sede = this.buscarSede(nombreSede);
			if (sede == null) {
				System.out.println("Sede '" + nombreSede + "' no encontrada.");
			} else {
				ticket = sede.reservarSala(socio, descripcionSala);
				if (ticket == null) {
					System.out.println("Sala '" + descripcionSala + "' no disponible en " + nombreSede + ".");
				}
			}
		}
		return ticket;
	}
}