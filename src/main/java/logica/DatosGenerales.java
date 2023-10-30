package logica;

import java.util.List;

public class DatosGenerales {
	private Double ajusteKM;
	private Double ajusteHijos;
	private Double descuentoUnidadAdicional; //Este y derechoEmision me confunden, reveer el enunciado.
	private Double derechoEmision;
	private List<DatosGeneralesHistorial> historial;
	
	public Double getAjusteKM() {
		return ajusteKM;
	}
	public void setAjusteKM(Double ajusteKM) {
		this.ajusteKM = ajusteKM;
	}
	public Double getAjusteHijos() {
		return ajusteHijos;
	}
	public void setAjusteHijos(Double ajusteHijos) {
		this.ajusteHijos = ajusteHijos;
	}
	public Double getDescuentoUnidadAdicional() {
		return descuentoUnidadAdicional;
	}
	public void setDescuentoUnidadAdicional(Double descuentoUnidadAdicional) {
		this.descuentoUnidadAdicional = descuentoUnidadAdicional;
	}
	public Double getDerechoEmision() {
		return derechoEmision;
	}
	public void setDerechoEmision(Double derechoEmision) {
		this.derechoEmision = derechoEmision;
	}
	public List<DatosGeneralesHistorial> getHistorial() {
		return historial;
	}
	public void setHistorial(List<DatosGeneralesHistorial> historial) {
		this.historial = historial;
	}

}
