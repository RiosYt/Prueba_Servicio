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
import pe.com.ciberelectrik.entity.Producto;
import pe.com.ciberelectrik.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;
    
    @GetMapping("/all")
    public List<Producto> findAll(){
        return this.productoService.findAll();
    }
    
    @GetMapping()
    public List<Producto> findAllCustom(){
        return this.productoService.findAllCustom();
    }
    
    @PostMapping
    public Producto add(@RequestBody Producto p) {
        return productoService.add(p);
    }



    @GetMapping("/{id}")
    public Optional<Producto> findById(@PathVariable Long id) {
        return productoService.findById(id);
    }



    @PutMapping("/{id}")
    public Producto update(@PathVariable Long id, @RequestBody Producto c) {
        c.setCodigo(id);
        return productoService.update(c);
    }

    @DeleteMapping("/{id}")
    public Producto delete(@PathVariable Long id){
        Producto objproducto=new Producto();
        objproducto.setCodigo(id);
        return productoService.delete(Producto.builder().codigo(id).build());
    }
}
