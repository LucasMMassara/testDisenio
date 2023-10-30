package gestores;
import dto.VehiculoDTO;
import logica.Vehiculo;

public class GestorVehiculo {
	
    public Boolean validarDatos(VehiculoDTO vehiculo) {
            return true;
    }

    public Vehiculo newVehiculo(VehiculoDTO vehiculo) {
            return new Vehiculo(vehiculo);
    }

}
