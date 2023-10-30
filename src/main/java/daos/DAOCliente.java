package daos;

import java.util.ArrayList;
import logica.Cliente;
import java.util.List;
import dto.ClienteDTO;
import persistencia.ControladoraPersistencia;


public class DAOCliente {
    
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
	
	public DAOCliente() {
		super();
	}
        
        public void guardarCliente(Cliente cliente) throws Exception{
            controlPersis.crearCliente(cliente);
        }
	
	public List<Cliente> buscarClientes(Cliente datosCliente){
		//Completar con ORM
		return new ArrayList<Cliente>();
	}
	
	public Cliente buscarClienteUnico(Cliente datosCliente) {
		//Es para buscar el cliente en la base de datos 
		return new Cliente();
	}

}
