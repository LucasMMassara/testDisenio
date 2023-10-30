package daos;

import java.util.ArrayList;
import java.util.List;
import logica.Marca;
import logica.Modelo;
import logica.AnioFabricacion;

public class DAOMarcaModelo {
	
	public List<Marca> obtenerMarcas(){
		//TODO orm
		return new ArrayList<Marca>();
	}
	
	public List<Modelo> obtenerModelos(Marca marca){
		//TODO orm
		return new ArrayList<Modelo>();
	}
	
	public List<AnioFabricacion> obtenerAnioFabricacion(Modelo modelo){
		//TODO orm
		return new ArrayList<AnioFabricacion>();
	}

}
