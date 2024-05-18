package ar.unrn.model;

public class SeguroMedico implements Seguro {
	private double costo;

	public SeguroMedico(double costo) {
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
