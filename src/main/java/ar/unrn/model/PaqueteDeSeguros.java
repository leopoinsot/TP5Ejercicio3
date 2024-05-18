package ar.unrn.model;

import java.util.ArrayList;
import java.util.List;

public class PaqueteDeSeguros implements Seguro {
	private List<Seguro> seguros = new ArrayList<>();
	private double porcentajeDescuento;

	public PaqueteDeSeguros(double porcentajeDescuento, Seguro... seguros) {
		this.seguros = List.of(seguros);
		this.porcentajeDescuento = porcentajeDescuento;
	}

	@Override
	public double costo() {
		return 0;
	}

	@Override
	public double costoDePaquete() {
		double costoTotalPaquete = 0;
		for (Seguro seguro : seguros) {
			costoTotalPaquete = costoTotalPaquete +
					seguro.costo() +
					seguro.costoDePaquete();
		}
		return costoTotalPaquete - (porcentajeDescuento / 100) * costoTotalPaquete;
	}
}