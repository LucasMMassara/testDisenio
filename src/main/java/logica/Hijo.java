package logica;
import java.util.Date;

public class Hijo {
	private Date fechaNac;
	private TipoSexo sexo;
	private EstadoCivil estadoCivil;
	public Hijo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hijo(Date fechaNac, TipoSexo sexo, EstadoCivil estadoCivil) {
		super();
		this.fechaNac = fechaNac;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public TipoSexo getSexo() {
		return sexo;
	}
	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
}
