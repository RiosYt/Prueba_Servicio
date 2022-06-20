package pe.com.ciberelectrik.rest;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.ciberelectrik.entity.Cliente;
import pe.com.ciberelectrik.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/all")
    public List<Cliente> findAll(){
        return this.clienteService.findAll();
    }
    
    @GetMapping()
    public List<Cliente> findAllCustom(){
        return this.clienteService.findAllCustom();
    }
    
    @PostMapping
    public Cliente add(@RequestBody Cliente cl) {
        return clienteService.add(cl);
    }



    @GetMapping("/{id}")
    public Optional<Cliente> findById(@PathVariable Long id) {
        return clienteService.findById(id);
    }



    @PutMapping("/{id}")
    public Cliente update(@PathVariable Long id, @RequestBody Cliente cl) {
        cl.setCodigo(id);
        return clienteService.update(cl);
    }

    @DeleteMapping("/{id}")
    public Cliente delete(@PathVariable Long id){
        Cliente objcliente=new Cliente();
        objcliente.setCodigo(id);
        return clienteService.delete(Cliente.builder().codigo(id).build());
    }
}
