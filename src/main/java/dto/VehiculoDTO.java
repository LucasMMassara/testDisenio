package dto;

import logica.AnioFabricacion;
import logica.Marca;
import logica.Modelo;

public class VehiculoDTO {
	private String id;
	private Marca marcaVehiculo;
	private Modelo modeloVehiculo;
	private AnioFabricacion anioVehiculo;
	private String numMotor;
	private String numChasis;
	private String numPatente;
	private Integer kmPorAnio;
	private Boolean guardaEnGarage;
	private Boolean tieneAlarma;
	private Boolean dispositivoRastreo;
	private Boolean tuercasAntirrobo;
}
