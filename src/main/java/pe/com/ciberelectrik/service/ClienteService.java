package pe.com.ciberelectrik.service;

import java.util.List;
import java.util.Optional;
import pe.com.ciberelectrik.entity.Cliente;

public interface ClienteService {
    List<Cliente> findAll();
    List<Cliente> findAllCustom();
    Optional<Cliente> findById(Long id);
    List<Cliente> finaByName(String nombre);
    Cliente add(Cliente cl);
    Cliente update(Cliente cl);
    Cliente delete(Cliente cl);
}
