package logica;

public class PremioDescuentosEmision {
	//TODO Hay que modificar el diagrama y agregar premio con todos los descuentos asociados a la poliza
	private Double prima;
	private Double derechoDeEmision;
	private Double descuentoPorUnidades;
	private Double bonificacionPorPago;
	
	public PremioDescuentosEmision(){
		super();
	}
	
	public Double getPrima() {
		return prima;
	}
	public void setPrima(Double prima) {
		this.prima = prima;
	}
	public Double getDerechoDeEmision() {
		return derechoDeEmision;
	}
	public void setDerechoDeEmision(Double derechoDeEmision) {
		this.derechoDeEmision = derechoDeEmision;
	}
	public Double getDescuentoPorUnidades() {
		return descuentoPorUnidades;
	}
	public void setDescuentoPorUnidades(Double descuentoPorUnidades) {
		this.descuentoPorUnidades = descuentoPorUnidades;
	}
	public Double getBonificacionPorPago() {
		return bonificacionPorPago;
	}
	public void setBonificacionPorPago(Double bonificacionPorPago) {
		this.bonificacionPorPago = bonificacionPorPago;
	}
}
