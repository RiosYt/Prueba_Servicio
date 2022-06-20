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
import pe.com.ciberelectrik.entity.Distrito;
import pe.com.ciberelectrik.service.DistritoService;



@RestController
@RequestMapping("/distrito")

public class DistritoController {
    @Autowired
    private DistritoService distritoService;
    
    //Listar    
    @GetMapping("/all") //Obtener los valores
    public List<Distrito> findAll(){
        return this.distritoService.findAll();
    }
    
    //Listar personalizado
    @GetMapping()
    public List<Distrito> findAllCustom(){
        return this.distritoService.findAllCustom();
    }
    
    //Registrar
    @PostMapping
    public Distrito add(@RequestBody Distrito d){
        return distritoService.add(d);
    }
    
    //Buscar por codigo
    @GetMapping("/{id}")
    public Optional<Distrito> findById(@PathVariable Long id){
        return distritoService.findById(id);
    }
    
    //Actualizar
    @PutMapping("/{id}")
    public Distrito update(@PathVariable Long id, @RequestBody Distrito d){
        d.setCodigo(id);
        return distritoService.update(d);
    }
    
    //Eliminar
    @DeleteMapping("/{id}")
    public Distrito delete(@PathVariable Long id){
        return distritoService.delete(Distrito.builder().codigo(id).build());
    }
}
