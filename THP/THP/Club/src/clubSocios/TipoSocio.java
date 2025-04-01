package clubSocios;

public enum TipoSocio {
	VITALICIO(0.10), TRADICIONAL(0.08), VIP(0.18);

	private double valor;

	TipoSocio(double valor) {
		this.valor = valor;
	}

	public double obtenerDescuento() {
		return valor;
	}

}
