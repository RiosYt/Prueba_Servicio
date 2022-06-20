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
import pe.com.ciberelectrik.entity.Submenu;
import pe.com.ciberelectrik.service.SubmenuServiceImpl;

@RestController
@RequestMapping("/submenu")

public class SubmenuController {
    @Autowired
    private SubmenuServiceImpl submenuService;
    
    //Listar    
    @GetMapping("/all") //Obtener los valores
    public List<Submenu> findAll(){
        return this.submenuService.findAll();
    }
    
    //Listar personalizado
    @GetMapping()
    public List<Submenu> findAllCustom(){
        return this.submenuService.findAllCustom();
    }
    
    //Registrar
    @PostMapping
    public Submenu add(@RequestBody Submenu smen){
        return submenuService.add(smen);
    }
    
    //Buscar por codigo
    @GetMapping("/{id}")
    public Optional<Submenu> findById(@PathVariable Long id){
        return submenuService.findById(id);
    }
    
    //Actualizar
    @PutMapping("/{id}")
    public Submenu update(@PathVariable Long id, @RequestBody Submenu smen){
        smen.setCodigo(id);
        return submenuService.update(smen);
    }
    
    //Eliminar
    @DeleteMapping("/{id}")
    public Submenu delete(@PathVariable Long id){
        return submenuService.delete(Submenu.builder().codigo(id).build());
    }
}
