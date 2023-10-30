package logica;

public class DatosVehiculo {
        
	private Float sumaAsegurada;
	private AnioFabricacion anioFabricacion;
	
	public DatosVehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DatosVehiculo(Float sumaAsegurada) {
		super();
		this.sumaAsegurada = sumaAsegurada;
	}

	public Float getSumaAsegurada() {
		return sumaAsegurada;
	}

	public void setSumaAsegurada(Float sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}

	public AnioFabricacion getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(AnioFabricacion anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	
}
