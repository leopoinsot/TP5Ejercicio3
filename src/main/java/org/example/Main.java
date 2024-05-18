package org.example;

import ar.unrn.model.*;

public class Main {
	public static void main(String[] args) {
		var seguroVida = new SeguroDeVida(1000);
		var seguroAutoMovilistico = new SeguroAutoMovilistico(200);
		var seguroDeHogar = new SeguroDeHogar(500);
		var seguroMedico = new SeguroMedico(1500);

		var paquete1 = new PaqueteDeSeguros(5, seguroVida,
				seguroAutoMovilistico, seguroDeHogar, seguroMedico);

		var paquete2 = new PaqueteDeSeguros(5, seguroVida);

		var paquete3 = new PaqueteDeSeguros(5, seguroVida, seguroAutoMovilistico, paquete2);

		var compañia = new Compañia(paquete1, paquete3);

		System.out.println(compañia.calcularCostoTotalDePaquetes());
	}
}