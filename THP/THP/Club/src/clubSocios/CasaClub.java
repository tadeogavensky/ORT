package clubSocios;

import java.util.ArrayList;

public class CasaClub {
	private ArrayList<Socio> socios;

	public static final int CUOTA = 1000;

	public CasaClub() {
		this.socios = new ArrayList<>();
	}

	public void agregarSocio(Socio s) {
		Socio socioExistente = this.buscarSocio(s.getNroSocio());

		if (s != null && socioExistente == null) {
			socios.add(s);
		} else {
			System.out.println("El socio ya existe!");
		}
	}

	private Socio buscarSocio(int nroSocio) {
		Socio socioEncontrado = null;
		int i = 0;

		while (i < socios.size() && socioEncontrado == null) {
			if (socios.get(i).mismoNro(nroSocio)) {
				socioEncontrado = socios.get(i);
			}
			i++;
		}

		return socioEncontrado;
	}

	public ArrayList<Socio> listarSociosVitalicios() {
		ArrayList<Socio> sociosVitalicios = new ArrayList<Socio>();

		for (Socio socio : this.socios) {
			if (socio.esVitalicio()) {
				sociosVitalicios.add(socio);
			}
		}

		return sociosVitalicios;

	}

	public void listarSocios() {
		for (Socio socio : socios) {
			System.out.println(socio.toString());
		}
	}

	public boolean eliminarSocio(int nro) {

		boolean eliminado = false;
		Socio socioExistente = this.buscarSocio(nro);

		if (socioExistente != null) {
			this.socios.remove(socioExistente);
		}

		return eliminado;
	}

	private double obtenerValorCuota(Socio s) {
		return CUOTA - (CUOTA * s.getTipo().obtenerDescuento());
	}
}
