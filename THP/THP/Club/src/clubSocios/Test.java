package clubSocios;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Socio s1 = new Socio(1, "Juan Perez", new Fecha(1, 1, 2020), TipoSocio.VITALICIO);
		Socio s2 = new Socio(2, "Maria Lopez", new Fecha(1, 1, 2020), TipoSocio.VITALICIO);
		Socio s3 = new Socio(3, "Carlos Gomez", new Fecha(1, 1, 2020), TipoSocio.TRADICIONAL);
		Socio s4 = new Socio(4, "Ana Rodriguez", new Fecha(1, 1, 2020), TipoSocio.TRADICIONAL);
		Socio s5 = new Socio(5, "Pedro Martinez", new Fecha(1, 1, 2020), TipoSocio.TRADICIONAL);
		Socio s6 = new Socio(6, "Silvia Fernandez", new Fecha(1, 1, 2020), TipoSocio.VITALICIO);
		Socio s7 = new Socio(7, "Jorge Perez", new Fecha(1, 1, 2020), TipoSocio.VIP);
		Socio s8 = new Socio(8, "Marta Lopez", new Fecha(1, 1, 2020), TipoSocio.VIP);
		Socio s9 = new Socio(9, "Raul Gomez", new Fecha(1, 1, 2020), TipoSocio.VIP);

		CasaClub club = new CasaClub();

		club.agregarSocio(s1);
		club.agregarSocio(s2);
		club.agregarSocio(s3);
		club.agregarSocio(s4);
		club.agregarSocio(s5);
		club.agregarSocio(s6);
		club.agregarSocio(s7);
		club.agregarSocio(s8);
		club.agregarSocio(s9);

		club.listarSocios();

		ArrayList<Socio> sociosVitalicios = club.listarSociosVitalicios();

		System.out.println("Socios vitalicios:");
		for (Socio s : sociosVitalicios) {
			System.out.println(s.toString());

		}

	}
}
