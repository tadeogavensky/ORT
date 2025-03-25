package ort.edu.ar.thp.par2;

class Sala {
	private String nombre;
	private double precioAdicional;
	private Socio reservante;

	public Sala(String nombre, double precioAdicional) {
		this.setNombre(nombre);
		this.setPrecioAdicional(precioAdicional);
		this.reservante = null;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setPrecioAdicional(double precioAdicional) {
		this.precioAdicional = precioAdicional;
	}

	public double getPrecioAdicional() {
		return precioAdicional;
	}

	public void reservar(Socio socio) {
		this.reservante = socio;
	}

	public boolean esMismaDescripcion(String descripcion) {
		return this.nombre.equals(descripcion);
	}

	public boolean estaDisponible() {
		return this.reservante == null;
	}

	@Override
	public String toString() {
		return "Servicio [nombre=" + nombre + ", precioAdicional=" + precioAdicional + ", reservadoPor=" + reservante
				+ "]";
	}

}