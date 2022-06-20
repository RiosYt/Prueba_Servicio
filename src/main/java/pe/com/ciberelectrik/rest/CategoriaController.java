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
import pe.com.ciberelectrik.entity.Categoria;
import pe.com.ciberelectrik.service.CategoriaService;

@RestController //Controlador
@RequestMapping("/categoria")//Nombre que le asignamos@/

public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;
    
    //Listar    
    @GetMapping("/all") //Obtener los valores
    public List<Categoria> findAll(){
        return this.categoriaService.findAll();
    }
    
    //Listar personalizado
    @GetMapping()
    public List<Categoria> findAllCustom(){
        return this.categoriaService.findAllCustom();
    }
    
    //Registrar
    @PostMapping
    public Categoria add(@RequestBody Categoria c){
        return categoriaService.add(c);
    }
    
    //Buscar por codigo
    @GetMapping("/{id}")
    public Optional<Categoria> findById(@PathVariable Long id){
        return categoriaService.findById(id);
    }
    
    //Actualizar
    @PutMapping("/{id}")
    public Categoria update(@PathVariable Long id, @RequestBody Categoria c){
        c.setCodigo(id);
        return categoriaService.update(c);
    }
    
    //Eliminar
    @DeleteMapping("/{id}")
    public Categoria delete(@PathVariable Long id){
        Categoria objCategoria = new Categoria();
        objCategoria.setCodigo(id);
        return categoriaService.delete(Categoria.builder().codigo(id).build());
    }
}
