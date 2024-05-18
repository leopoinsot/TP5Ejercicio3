package ar.unrn.model;

import java.util.ArrayList;
import java.util.List;

public class Compañia {
	List<Seguro> seguros = new ArrayList<>();

	public Compañia(PaqueteDeSeguros... seguros) {
		this.seguros = List.of(seguros);
	}

	public double calcularCostoTotalDePaquetes() {
		double montoTotal = 0;
		for (Seguro seguro : seguros) {
			montoTotal = montoTotal + seguro.costoDePaquete();
		}
		return montoTotal;
	}
}