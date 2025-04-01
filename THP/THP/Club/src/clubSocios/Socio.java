package clubSocios;

public class Socio {
	private int nroSocio;
	private String nombreCompleto;
	private Fecha fechaAlta;
	private TipoSocio tipo;

	public Socio(int nroSocio, String nombreCompleto, Fecha fechaAlta, TipoSocio tipo) {
		this.nroSocio = nroSocio;
		this.nombreCompleto = nombreCompleto;
		this.fechaAlta = fechaAlta;
		this.tipo = tipo;
	}

	public boolean mismoNro(int nro) {
		boolean mismo = false;
		if (this.nroSocio == nro) {
			mismo = true;
		}

		return mismo;
	}

	public int getNroSocio() {
		return nroSocio;
	}

	public TipoSocio getTipo() {
		return tipo;
	}

	public void setNroSocio(int nroSocio) {
		this.nroSocio = nroSocio;
	}

	public boolean esVitalicio() {
		return this.tipo == TipoSocio.VITALICIO;
	}

	@Override
	public String toString() {
		return "Socio [nroSocio=" + nroSocio + ", nombreCompleto=" + nombreCompleto + ", fechaAlta=" + fechaAlta
				+ ", tipo=" + tipo + "]";
	}

}
