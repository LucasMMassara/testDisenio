package logica;

public class CalculoPremioPrenda {
	
	public PremioDescuentosEmision calculoPremio(Poliza poliza){
		//Nuevo premio
		PremioDescuentosEmision premio = new PremioDescuentosEmision();
		//Set de los atributos usando los metodos de calculo de la clase
		premio.setPrima(calculoPrima(poliza));
		premio.setBonificacionPorPago(calculoBonificacionPorPagoSemestral(poliza));
		premio.setDerechoDeEmision(calculoDerechoEmision(poliza));
		premio.setDescuentoPorUnidades(calculoDescuentoPorUnidades(poliza));
		//retornamos el premio
		return premio;
	}
	
	//Para los calculos hay que obtener los datos de la base de datos, datos generales, valor medida seguridad y valor siniestros.
	//Eso no deberian ser atributos???? O lo modelamos invocandolos en los metodos?
	//Ademas despues hay que asociar eso que obtuvimos a los datos CalculoPoliza
	
	public Double calculoPrima(Poliza poliza) {
		//TODO hacer el calculo
		return 0.0;
	}
	
	public Double calculoBonificacionPorPagoSemestral(Poliza poliza) {
		//TODO hacer el calculo
		return 0.0;
	}
	
	public Double calculoDerechoEmision(Poliza poliza) {
		//TODO hacer calculo
		return 0.0;
	}
	
	public Double calculoDescuentoPorUnidades(Poliza poliza) {
		//TODO hacer calculo
		return 0.0;
	}

}
