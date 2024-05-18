package ar.unrn.model;

public class SeguroAutoMovilistico implements Seguro {
	private double costo;

	public SeguroAutoMovilistico(double costo) {
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
