package ort.edu.ar.thp.par2;

import java.util.ArrayList;

class Sede {
	private String nombre;
	private ArrayList<Sala> salas;

	public Sede(String nombre) {
		this.setNombre(nombre);
		this.salas = new ArrayList<>();
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarSala(String nombre,double precioAdicional) {
		Sala sala;
		if (nombre != null && precioAdicional > 0) {
			sala = new Sala(nombre,precioAdicional);
			this.salas.add(sala);
		}
	}

	private Sala buscarSala(String nombreSala) {
		Sala salaEncontrada = null;
		Sala salaActual;
		int i = 0;
		while (i < this.salas.size() && salaEncontrada == null) {
			salaActual = this.salas.get(i);
			if (salaActual.esMismaDescripcion(nombreSala) && salaActual.estaDisponible())
				salaEncontrada = salaActual;
			else
				i++;
		}
		return salaEncontrada;
	}

	public Ticket reservarSala(Socio socio, String nombreSala) {
		Ticket ticket = null;
		double importe = 0;
		Sala sala = this.buscarSala(nombreSala);
		if (sala != null) {
			sala.reservar(socio);
			importe = calcularImporte(socio, sala.getPrecioAdicional());
			ticket = new Ticket(this, sala, importe);
		}
		return ticket;
	}

	private double calcularImporte(Socio socio, double importeSala) {
		double importe = importeSala;
		if (!socio.estaAlDia())
			importe += CowORTking.TARIFA_BASE_MENSUAL;
		return importe;
	}

	public boolean esMismoNombre(String nombre) {
		return this.nombre.equals(nombre);
	}

	@Override
	public String toString() {
		return "Sede [nombre=" + nombre + "]";
	}	
	
}