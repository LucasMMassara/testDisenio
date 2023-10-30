package dto;
import java.util.Date;
import java.util.List;
import logica.*;

public class PolizaDTO {
	private Domicilio domicilioRiesgo;
	private List<Hijo> listaHijos;
	private Cobertura cobertura;
	private Date inicioVigenciaPoliza;
	private FormaPago formaPago;
}
