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
import pe.com.ciberelectrik.entity.Menu;
import pe.com.ciberelectrik.service.MenuServiceImpl;

@RestController
@RequestMapping("/menu")

public class MenuController {
    @Autowired
    private MenuServiceImpl menuService;
    
    //Listar    
    @GetMapping("/all") //Obtener los valores
    public List<Menu> findAll(){
        return this.menuService.findAll();
    }
    
    //Listar personalizado
    @GetMapping()
    public List<Menu> findAllCustom(){
        return this.menuService.findAllCustom();
    }
    
    //Registrar
    @PostMapping
    public Menu add(@RequestBody Menu m){
        return menuService.add(m);
    }
    
    //Buscar por codigo
    @GetMapping("/{id}")
    public Optional<Menu> findById(@PathVariable Long id){
        return menuService.findById(id);
    }
    
    //Actualizar
    @PutMapping("/{id}")
    public Menu update(@PathVariable Long id, @RequestBody Menu m){
        m.setCodigo(id);
        return menuService.update(m);
    }
    
    //Eliminar
    @DeleteMapping("/{id}")
    public Menu delete(@PathVariable Long id){
        return menuService.delete(Menu.builder().codigo(id).build());
    }
}
