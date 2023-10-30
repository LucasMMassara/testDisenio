package daos;

import java.util.ArrayList;
import java.util.List;

import logica.Localidad;
import logica.Pais;
import logica.Provincia;

import persistencia.LocalidadJpaController;

public class DAOLocalidad {
        
    LocalidadJpaController localidadJpa = new LocalidadJpaController();
    
    public List<Localidad> obtenerLocalidades(Provincia provincia){
	return new ArrayList<Localidad>();
    }
}