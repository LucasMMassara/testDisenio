package logica;

import java.util.Date;

public class ValorMedidaSeguridadHistorial {
	private Double valorGarage;
	private Double alarma;
	private Double dispRastreo;
	private Double tuercasAntirrobo;
	private Date inicioVigencia;
	private Date finVigencia;
	
	public Double getValorGarage() {
		return valorGarage;
	}
	public void setValorGarage(Double valorGarage) {
		this.valorGarage = valorGarage;
	}
	public Double getAlarma() {
		return alarma;
	}
	public void setAlarma(Double alarma) {
		this.alarma = alarma;
	}
	public Double getDispRastreo() {
		return dispRastreo;
	}
	public void setDispRastreo(Double dispRastreo) {
		this.dispRastreo = dispRastreo;
	}
	public Double getTuercasAntirrobo() {
		return tuercasAntirrobo;
	}
	public void setTuercasAntirrobo(Double tuercasAntirrobo) {
		this.tuercasAntirrobo = tuercasAntirrobo;
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
