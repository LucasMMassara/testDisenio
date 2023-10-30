package logica;

import java.util.List;

public class ValorMedidaSeguridad {
	private Double valorGarage;
	private Double alarma;
	private Double dispRastreo;
	private Double tuercasAntirrobo;
	private List<ValorMedidaSeguridadHistorial> historial;
	
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
	public List<ValorMedidaSeguridadHistorial> getHistorial() {
		return historial;
	}
	public void setHistorial(List<ValorMedidaSeguridadHistorial> historial) {
		this.historial = historial;
	}

}
