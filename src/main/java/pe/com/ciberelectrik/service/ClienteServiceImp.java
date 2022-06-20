package pe.com.ciberelectrik.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.Cliente;
import pe.com.ciberelectrik.repository.ClienteRepository;

@Service
public class ClienteServiceImp implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;
    
    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public List<Cliente> findAllCustom() {
        return clienteRepository.findAllCustom();
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public List<Cliente> finaByName(String nombre) {
        return clienteRepository.findByName(nombre);
    }

    @Override
    public Cliente add(Cliente cl) {
        return clienteRepository.save(cl);
    }

    @Override
    public Cliente update(Cliente cl) {
        Cliente objcliente = new Cliente();
        BeanUtils.copyProperties(cl, objcliente);
        return clienteRepository.save(objcliente);
    }

    @Override
    public Cliente delete(Cliente cl) {
        Cliente objcliente = clienteRepository.getById(cl.getCodigo());
        objcliente.setEstado(false);
        return clienteRepository.save(objcliente);
    }
    
}
