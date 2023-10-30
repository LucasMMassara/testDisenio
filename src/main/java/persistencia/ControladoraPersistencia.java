package persistencia;

import logica.Cliente;

public class ControladoraPersistencia {
    //Se encarga de controlar todas las jpa controller, 1 por cada clase jpa.
    //En realidad esto va en los daos.
    ClienteJpaController clienteJpa = new ClienteJpaController();
    DepartamentoJpaController departamentoJpa = new DepartamentoJpaController();
    DomicilioJpaController domicilioJpa  = new DomicilioJpaController();
    IndicadorRiesgoJpaController indicadorJpa = new IndicadorRiesgoJpaController();
    LocalidadJpaController localidadJpa = new LocalidadJpaController();
    PaisJpaController paisJpa = new PaisJpaController();
    ProvinciaJpaController provinciaJpa = new ProvinciaJpaController();

    public void crearCliente(Cliente cliente) throws Exception { //Lo de la excepcion ni idea.
        clienteJpa.create(cliente);
    }
}
