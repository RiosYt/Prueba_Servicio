package pe.com.ciberelectrik.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.Distrito;
import pe.com.ciberelectrik.repository.DistritoRepository;

@Service
public class DistritoServiceImp implements DistritoService{

    @Autowired
    private DistritoRepository distritoRepository;
    
    @Override
    public List<Distrito> findAll() {
        return distritoRepository.findAll();
    }

    @Override
    public List<Distrito> findAllCustom() {
        return distritoRepository.findAllCustom();
    }

    @Override
    public Optional<Distrito> findById(Long id) {
        return distritoRepository.findById(id);
    }

    @Override
    public List<Distrito> findByName(String nombre) {
        return distritoRepository.findByName(nombre);
    }

    @Override
    public Distrito add(Distrito d) {
        return distritoRepository.save(d);
    }

    @Override
    public Distrito update(Distrito d) {
        Distrito objDistrito = new Distrito();
        BeanUtils.copyProperties(d, objDistrito);
        return distritoRepository.save(objDistrito);
    }

    @Override
    public Distrito delete(Distrito d) {
        Distrito objDistrito = distritoRepository.getById(d.getCodigo());
        objDistrito.setEstado(false);
        return distritoRepository.save(objDistrito);
    }   
}
