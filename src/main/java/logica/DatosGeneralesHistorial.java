package logica;

import java.util.Date;

public class DatosGeneralesHistorial {
	private Double ajusteKM;
	private Double ajusteHijos;
	private Double descuentoUnidadAdicional; //Este y derechoEmision me confunden, reveer el enunciado.
	private Double derechoEmision;
	private Date inicioVigencia;
	private Date finVigencia;
	
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
	public Date getInicioVigencia() {
		return inicioVigencia;
	}
	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}
	public Date getFinVigencia() {
		return finVigencia;
	}
	public void setFinVigencia(Date finVigencia) {
		this.finVigencia = finVigencia;
	}
	
	

}
