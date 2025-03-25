package ort.edu.ar.thp.par2;

class Socio {
    private String dni;
    private String nombreCompleto;
    private boolean alDia;

    public Socio(String dni, String nombreCompleto) {
        this.setDni(dni);
        this.setnombreCompleto(nombreCompleto);
        this.alDia = false;
    }

    private void setDni(String dni) {
    	this.dni = dni;
    }
    
    private void setnombreCompleto(String nombreCompleto) {
    	this.nombreCompleto = nombreCompleto;
    }

    public void pagarCuotaActual() {
    	this.alDia = true;
    }
    public boolean estaAlDia() {
        return alDia;
    }

	public boolean esMismoDni(String dni) {
		return this.dni.equals(dni);
	}

	@Override
	public String toString() {
		return "Socio [dni=" + dni + ", nombreCompleto=" + nombreCompleto + ", alDia=" + alDia + "]";
	}
}