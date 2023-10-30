package gestores;

import java.util.List;

import daos.DAOLocalidad;
import logica.Marca;
import logica.Modelo;
import logica.AnioFabricacion;
import daos.DAOMarcaModelo;

public class GestorMarcaModelo {
	
	//Capaz hay que traer todo y ir filtrando a medida que elije el usuario y no hacerlo de esta manera.
	
	public List<Marca> obtenerMarcas(){
		//Consultamos al orm y devolvemos las marcas o el nombre?
		//Es para que el usuario seleccione la marca, luego el modelo y luego el año
		
		return (new DAOMarcaModelo()).obtenerMarcas();
	}
	
	public List<Modelo> obtenerModelos(Marca marca){
		//Consultamos al orm y devolvemos los modelos o el nombre?
		//Es para que el usuario seleccione el modelo y luego el año
		return (new DAOMarcaModelo()).obtenerModelos(marca);
	}
	
	public List<AnioFabricacion> obtenerAniosFabricacion(Modelo modelo){
		//Consultamos al orm y devolvemos clases o nombres?
		//Es para que el usuario seleccione el anio en base al modelo
		return (new DAOMarcaModelo()).obtenerAnioFabricacion(modelo);
	}

}
