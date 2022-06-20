package pe.com.ciberelectrik.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.Empleado;
import pe.com.ciberelectrik.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
    @Autowired
    private EmpleadoRepository empleadoRepository;
    
    @Override
    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    @Override
    public List<Empleado> findAllCustom() {
        return empleadoRepository.findAllCustom();
    }

    @Override
    public Optional<Empleado> findById(Long id) {
        return empleadoRepository.findById(id);
    }

    @Override
    public List<Empleado> findByName(String nombre) {
        return empleadoRepository.findByName(nombre);
    }
    
    @Override
    public List<Empleado> findByUser(String usuario, String clave) {
        return empleadoRepository.findByUser(usuario, clave);
    }

    @Override
    public Empleado add(Empleado cl) {
        return empleadoRepository.save(cl);
    }

    @Override
    public Empleado update(Empleado cl) {
        Empleado objEmpleado = new Empleado();
        BeanUtils.copyProperties(cl, objEmpleado);
        return empleadoRepository.save(objEmpleado);
    }

    @Override
    public Empleado delete(Empleado cl) {
        Empleado objEmpleado = empleadoRepository.getById(cl.getCodigo());
        objEmpleado.setEstado(false);
        return empleadoRepository.save(objEmpleado);
    }  

}
