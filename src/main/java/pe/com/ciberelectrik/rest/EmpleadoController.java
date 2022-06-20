package pe.com.ciberelectrik.rest;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.ciberelectrik.entity.Empleado;
import pe.com.ciberelectrik.service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoService empleadoService;
    
    @GetMapping("/all")
    public List<Empleado> findAll(){
        return this.empleadoService.findAll();
    }
    
    @GetMapping()
    public List<Empleado> findAllCustom(){
        return this.empleadoService.findAllCustom();
    }
    
    @GetMapping("/nombre/{name}")
    public List<Empleado> findByName(@PathVariable String name){
        return this.empleadoService.findByName(name);
    }
    
    @PutMapping("/user/{usuario}&{clave}")
    public List<Empleado> findByUser(@PathVariable String usuario, @PathVariable String clave){
        return this.empleadoService.findByUser(usuario, clave);
    }
    
    @PostMapping
    public Empleado add(@RequestBody Empleado cl) {
        return empleadoService.add(cl);
    }



    @GetMapping("/{id}")
    public Optional<Empleado> findById(@PathVariable Long id) {
        return empleadoService.findById(id);
    }



    @PutMapping("/{id}")
    public Empleado update(@PathVariable Long id, @RequestBody Empleado cl) {
        cl.setCodigo(id);
        return empleadoService.update(cl);
    }

    @DeleteMapping("/{id}")
    public Empleado delete(@PathVariable Long id){
        Empleado objEmpleado=new Empleado();
        objEmpleado.setCodigo(id);
        return empleadoService.delete(Empleado.builder().codigo(id).build());
    }
}
