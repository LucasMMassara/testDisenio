package daos;

import java.util.ArrayList;
import java.util.List;
import logica.Pais;
import persistencia.PaisJpaController;

public class DAOPais {
    
    PaisJpaController paisJpa = new PaisJpaController();

    public DAOPais() {
        
    }
    
    public List<Pais> obtenerPaises(){
        //consulta al orm
        return new ArrayList<Pais>();
    }
    
}
