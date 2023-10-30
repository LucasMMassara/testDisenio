package logica;
import java.util.Date;
import java.util.List;

public class Poliza {
	
	private Float premio;
	private Float descuento;
	private Float derechoDeEmision;
	private TipoPago formaDePago;
	private CantidadSiniestros cantidadSiniestros;
	private Date inicioVigencia;
	private Date finVigencia;
	private String numPoliza;
	private Date fechaEmision;
	
	//Hay que ver los atributos que pasan a la nueva entidad premioDescuentosEmision
	
	//atributos de relacion
	
	private Vehiculo vehiculoAsegurado;
	private List<Cuota> cuotas;
	private List<Hijo> hijosDeclarados;
	private List<Modificacion> modificaciones;
	private PorcentajeCobertura cobertura;
	private IndicadorRiesgo riesgoLocalidad;
	private Cliente clientePoliza;
	private DatosCalculoPoliza datosUtilizadosCalculo;
	
	//metodos de atributos base
	
	public Poliza() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Poliza(Float premio, Float descuento, Float derechoDeEmision, TipoPago formaDePago,
			CantidadSiniestros cantidadSiniestros, Date inicioVigencia, Date finVigencia, String numPoliza,
			Date fechaEmision) {
		super();
		this.premio = premio;
		this.descuento = descuento;
		this.derechoDeEmision = derechoDeEmision;
		this.formaDePago = formaDePago;
		this.cantidadSiniestros = cantidadSiniestros;
		this.inicioVigencia = inicioVigencia;
		this.finVigencia = finVigencia;
		this.numPoliza = numPoliza;
		this.fechaEmision = fechaEmision;
	}
	public Float getPremio() {
		return premio;
	}
	public void setPremio(Float premio) {
		this.premio = premio;
	}
	public Float getDescuento() {
		return descuento;
	}
	public void setDescuento(Float descuento) {
		this.descuento = descuento;
	}
	public Float getDerechoDeEmision() {
		return derechoDeEmision;
	}
	public void setDerechoDeEmision(Float derechoDeEmision) {
		this.derechoDeEmision = derechoDeEmision;
	}
	public TipoPago getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(TipoPago formaDePago) {
		this.formaDePago = formaDePago;
	}
	public CantidadSiniestros getCantidadSiniestros() {
		return cantidadSiniestros;
	}
	public void setCantidadSiniestros(CantidadSiniestros cantidadSiniestros) {
		this.cantidadSiniestros = cantidadSiniestros;
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
	public String getNumPoliza() {
		return numPoliza;
	}
	public void setNumPoliza(String numPoliza) {
		this.numPoliza = numPoliza;
	}
	public Date getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	
	//metodos de atributos de relaciones
	
	public Vehiculo getVehiculoAsegurado() {
		return vehiculoAsegurado;
	}
	public void setVehiculoAsegurado(Vehiculo vehiculoAsegurado) {
		this.vehiculoAsegurado = vehiculoAsegurado;
	}
	public List<Cuota> getCuotas() {
		return cuotas;
	}
	public void setCuotas(List<Cuota> cuotas) {
		this.cuotas = cuotas;
	}
	public List<Modificacion> getModificaciones() {
		return modificaciones;
	}
	public void setModificaciones(List<Modificacion> modificaciones) {
		this.modificaciones = modificaciones;
	}
	public List<Hijo> getHijosDeclarados() {
		return hijosDeclarados;
	}
	public void setHijosDeclarados(List<Hijo> hijosDeclarados) {
		this.hijosDeclarados = hijosDeclarados;
	}
	public PorcentajeCobertura getCobertura() {
		return cobertura;
	}
	public void setCobertura(PorcentajeCobertura cobertura) {
		this.cobertura = cobertura;
	}
	public IndicadorRiesgo getRiesgoLocalidad() {
		return riesgoLocalidad;
	}
	public void setRiesgoLocalidad(IndicadorRiesgo riesgoLocalidad) {
		this.riesgoLocalidad = riesgoLocalidad;
	}
	public Cliente getClientePoliza() {
		return clientePoliza;
	}
	public void setClientePoliza(Cliente clientePoliza) {
		this.clientePoliza = clientePoliza;
	}
	public DatosCalculoPoliza getDatosUtilizadosCalculo() {
		return datosUtilizadosCalculo;
	}
	public void setDatosUtilizadosCalculo(DatosCalculoPoliza datosUtilizadosCalculo) {
		this.datosUtilizadosCalculo = datosUtilizadosCalculo;
	}
	
}
