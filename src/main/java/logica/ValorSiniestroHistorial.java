package logica;

import java.util.Date;

public class ValorSiniestroHistorial {
	
	private Double sinSiniestro;
	private Double unSiniestro;
	private Double dosSiniestros;
	private Double masDeDosSiniestros;
	private Date inicioVigencia;
	private Date finVigencia;
	
	public Double getUnSiniestro() {
		return unSiniestro;
	}
	public void setUnSiniestro(Double unSiniestro) {
		this.unSiniestro = unSiniestro;
	}
	public Double getSinSiniestro() {
		return sinSiniestro;
	}
	public void setSinSiniestro(Double sinSiniestro) {
		this.sinSiniestro = sinSiniestro;
	}
	public Double getDosSiniestros() {
		return dosSiniestros;
	}
	public void setDosSiniestros(Double dosSiniestros) {
		this.dosSiniestros = dosSiniestros;
	}
	public Double getMasDeDosSiniestros() {
		return masDeDosSiniestros;
	}
	public void setMasDeDosSiniestros(Double masDeDosSiniestros) {
		this.masDeDosSiniestros = masDeDosSiniestros;
	}
	public Date getFinVigencia() {
		return finVigencia;
	}
	public void setFinVigencia(Date finVigencia) {
		this.finVigencia = finVigencia;
	}
	public Date getInicioVigencia() {
		return inicioVigencia;
	}
	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

}
