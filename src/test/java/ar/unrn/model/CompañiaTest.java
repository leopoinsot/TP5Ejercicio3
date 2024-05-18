package ar.unrn.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompañiaTest {

	@org.junit.jupiter.api.Test
	void calcularCostoTotalDePaquetesTest() {
		var seguroVida = new SeguroDeVida(1000);
		var seguroAutoMovilistico = new SeguroAutoMovilistico(200);
		var seguroDeHogar = new SeguroDeHogar(500);
		var seguroMedico = new SeguroMedico(1500);

		var paquete1 = new PaqueteDeSeguros(5, seguroVida,
				seguroAutoMovilistico, seguroDeHogar, seguroMedico);

		var paquete2 = new PaqueteDeSeguros(5, seguroVida);

		var paquete3 = new PaqueteDeSeguros(5, seguroVida, seguroAutoMovilistico, paquete2);

		var compañia = new Compañia(paquete1, paquete3);
		assertEquals(5082.5, compañia.calcularCostoTotalDePaquetes());
	}
	
	@org.junit.jupiter.api.Test
	void calcularCostoDeUnPaqueteTest() {
		var seguroVida = new SeguroDeVida(1000);
		var seguroAutoMovilistico = new SeguroAutoMovilistico(200);
		var seguroDeHogar = new SeguroDeHogar(500);
		var seguroMedico = new SeguroMedico(1500);

		var paquete1 = new PaqueteDeSeguros(5, seguroVida,
				seguroAutoMovilistico, seguroDeHogar, seguroMedico);

		var compañia = new Compañia(paquete1);
		assertEquals(3040.0, compañia.calcularCostoTotalDePaquetes());
	}
}