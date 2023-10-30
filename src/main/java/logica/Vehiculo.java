package logica;

import dto.VehiculoDTO;

public class Vehiculo {
	private String numMotor;
	private String numChasis;
	private Integer kmPorAnio;
	private Boolean guardaEnGarage;
	private Boolean alarma;
	private Boolean dispositivoRastreo;
	private Boolean tuercasAntirobo;
	private String patente;
	private EstadisticaRoboVehiculo estRobo;
	private AnioFabricacion anioFabricacionVehiculo;
	
	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Vehiculo(VehiculoDTO vehiculo){
		//TODO completar con DTO
		super();
	}

	public Vehiculo(String numMotor, String numChasis, Integer kmPorAnio, Boolean guardaEnGarage, Boolean alarma,
			Boolean dispositivoRastreo, Boolean tuercasAntirobo, String patente) {
		super();
		this.numMotor = numMotor;
		this.numChasis = numChasis;
		this.kmPorAnio = kmPorAnio;
		this.guardaEnGarage = guardaEnGarage;
		this.alarma = alarma;
		this.dispositivoRastreo = dispositivoRastreo;
		this.tuercasAntirobo = tuercasAntirobo;
		this.patente = patente;
	}
	public String getNumMotor() {
		return numMotor;
	}
	public void setNumMotor(String numMotor) {
		this.numMotor = numMotor;
	}
	public String getNumChasis() {
		return numChasis;
	}
	public void setNumChasis(String numChasis) {
		this.numChasis = numChasis;
	}
	public Integer getKmPorAnio() {
		return kmPorAnio;
	}
	public void setKmPorAnio(Integer kmPorAnio) {
		this.kmPorAnio = kmPorAnio;
	}
	public Boolean getGuardaEnGarage() {
		return guardaEnGarage;
	}
	public void setGuardaEnGarage(Boolean guardaEnGarage) {
		this.guardaEnGarage = guardaEnGarage;
	}
	public Boolean getAlarma() {
		return alarma;
	}
	public void setAlarma(Boolean alarma) {
		this.alarma = alarma;
	}
	public Boolean getDispositivoRastreo() {
		return dispositivoRastreo;
	}
	public void setDispositivoRastreo(Boolean dispositivoRastreo) {
		this.dispositivoRastreo = dispositivoRastreo;
	}
	public Boolean getTuercasAntirobo() {
		return tuercasAntirobo;
	}
	public void setTuercasAntirobo(Boolean tuercasAntirobo) {
		this.tuercasAntirobo = tuercasAntirobo;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}

	public EstadisticaRoboVehiculo getEstRobo() {
		return estRobo;
	}

	public void setEstRobo(EstadisticaRoboVehiculo estRobo) {
		this.estRobo = estRobo;
	}

	public AnioFabricacion getAnioFabricacionVehiculo() {
		return anioFabricacionVehiculo;
	}

	public void setAnioFabricacionVehiculo(AnioFabricacion anioFabricacionVehiculo) {
		this.anioFabricacionVehiculo = anioFabricacionVehiculo;
	}
	
}
