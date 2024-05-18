package ar.unrn.model;

public class SeguroDeVida implements Seguro {
	private double costo;

	public SeguroDeVida(double costo) {
		this.costo = costo;
	}

	@Override
	public double costo() {
		return costo;
	}

	@Override
	public double costoDePaquete() {
		return 0;
	}
}
