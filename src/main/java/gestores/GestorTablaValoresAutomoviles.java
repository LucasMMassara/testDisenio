package gestores;

import logica.Marca;
import logica.Modelo;
import logica.AnioFabricacion;

import daos.DAOMarcaModelo;

public class GestorTablaValoresAutomoviles {
    
    //Crear DatosVehiculo y asignarle las cosas;
    
    private Double obtenerSumaAsegurada(Marca marca, Modelo modelo, AnioFabricacion anio){
        DAOMarcaModelo dao = new DAOMarcaModelo();
        return obtenerSumaAsegurada(marca,modelo,anio);
    }
    
    
}
