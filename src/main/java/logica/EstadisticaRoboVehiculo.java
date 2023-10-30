package logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name="estadistica_robo")

public class EstadisticaRoboVehiculo {
        
        @Id
        @GeneratedValue
	private String id;
        
	private Double porcentajeIndicador;
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date inicioVigencia;
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date finVigencia;
        
        @OneToOne(mappedBy="estad")
	private Modelo modeloVehiculo; //Matchear con modelo

	public Double getPorcentajeIndicador() {
		return porcentajeIndicador;
	}
	public void setPorcentajeIndicador(Double porcentajeIndicador) {
		this.porcentajeIndicador = porcentajeIndicador;
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
	public Modelo getModeloVehiculo() {
		return modeloVehiculo;
	}
	public void setModeloVehiculo(Modelo modeloVehiculo) {
		this.modeloVehiculo = modeloVehiculo;
	}

}
