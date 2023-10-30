package logica;

import java.util.Date;

public abstract class Persona {
	private String nombre;
	private String apellido;
	private String numeroDni;
	private TipoDocumento tipodni;
	private TipoSexo sexo;
	private Date fechaNacimiento;
	private String email;
	private EstadoCivil estadoCivil;
	private Integer anioRegistro;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNumeroDni() {
		return numeroDni;
	}
	public void setNumeroDni(String numeroDni) {
		this.numeroDni = numeroDni;
	}
	public TipoDocumento getTipodni() {
		return tipodni;
	}
	public void setTipodni(TipoDocumento tipodni) {
		this.tipodni = tipodni;
	}
	public TipoSexo getSexo() {
		return sexo;
	}
	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Integer getAnioRegistro() {
		return anioRegistro;
	}
	public void setAnioRegistro(Integer anioRegistro) {
		this.anioRegistro = anioRegistro;
	}
	
}
