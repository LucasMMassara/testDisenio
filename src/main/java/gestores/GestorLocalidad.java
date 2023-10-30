package gestores;
import java.util.ArrayList;
import java.util.List;

import logica.Pais;
import logica.Provincia;
import logica.Localidad;
import daos.*;

public class GestorLocalidad{
	
	//Capaz hay que traer todo y ir filtrando a medida que elije el usuario y no hacerlo de esta manera.
	
	public List<Pais> obtenerPaises(){
		//Consultamos al dto y devolvemos los paises o los nombres?
		//Es para que el usuario seleccione el pais y luego provincia y localidad
		
		return (new DAOPais()).obtenerPaises();
	}
	
	public List<Provincia> obtenerProvincias(Pais pais){
		//Consultamos al dto y devolvemos los paises o los nombres?
		//Es para que el usuario seleccione la provincia y luego localidad
		return (new DAOProvincia()).obtenerProvincias(pais);
	}
	
	public List<Localidad> obtenerLocalidad(Provincia provincia){
		//Consultamos al dto y devolvemos los paises o los nombres?
		//Es para que el usuario seleccione la localidad
		return (new DAOLocalidad()).obtenerLocalidades(provincia);
	}
}
