package ort.edu.ar.thp.par2;

class Ticket {
	private Sede sede;
	private Sala sala;
	private double importe;

	public Ticket(Sede sede, Sala sala, double importe) {
		this.setSede(sede);
		this.setSala(sala);
		this.setImporte(importe);
	}

	private void setSede(Sede sede) {
		this.sede = sede;
	}

	private void setSala(Sala sala) {
		this.sala = sala;
	}
	
	private void setImporte(double importe) {
		this.importe = importe;
	}
	
	@Override
	public String toString() {
		return "Ticket [sede=" + sede + ", sala=" + sala + ", importe=" + importe + "]";
	}
}