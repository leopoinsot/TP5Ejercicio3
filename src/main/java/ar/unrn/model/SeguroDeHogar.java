package ar.unrn.model;

public class SeguroDeHogar implements Seguro {
	private double costo;

	public SeguroDeHogar(double costo) {
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
