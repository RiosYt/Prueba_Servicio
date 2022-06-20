
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
import pe.com.ciberelectrik.entity.Perfil;
import pe.com.ciberelectrik.service.PerfilService;

@RestController
@RequestMapping("/perfil")
public class PerfilController {
    @Autowired
    private PerfilService perfilService;

    //Listar todo
    @GetMapping("/all")
    public List<Perfil> findAll() {
        return this.perfilService.findAll();
    }

    //Listar personalizado
    @GetMapping("")
    public List<Perfil> findAllCustom() {
        return this.perfilService.findAllCustom();
    }

    //registrar
    @PostMapping
    public Perfil add(@RequestBody Perfil p) {
        return perfilService.add(p);

    }

    //buscar por codigo
    @GetMapping("/{id}")
    public Optional<Perfil> findById(@PathVariable Long id) {
        return perfilService.findById(id);
    }

    //actualizar
    @PutMapping("/{id}")
    public Perfil update(@PathVariable Long id, @RequestBody Perfil p) {
        p.setCodigo(id);
        return perfilService.update(p);
    }

    //eliminar
    @DeleteMapping("/{id}")
    public Perfil delete(@PathVariable Long id) {
        
        return perfilService.delete(Perfil.builder().codigo(id).build());
    }
}
