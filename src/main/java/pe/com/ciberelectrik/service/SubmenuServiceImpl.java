package pe.com.ciberelectrik.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.Submenu;
import pe.com.ciberelectrik.repository.SubmenuRepository;

@Service
public class SubmenuServiceImpl implements SubmenuService{
    @Autowired
    private SubmenuRepository submenuRepository;
    
    @Override
    public List<Submenu> findAll() {
        return submenuRepository.findAll();
    }
    
    @Override
    public List<Submenu> findAllCustom() {
        return submenuRepository.findAllCustom();
    }

    @Override
    public Optional<Submenu> findById(Long id) {
        return submenuRepository.findById(id);
    }

    @Override
    public List<Submenu> findByName(String nombre) {
        return submenuRepository.findByName(nombre);
    }
    
    @Override
    public Submenu add(Submenu smen) {
        return submenuRepository.save(smen);
    }

    @Override
    public Submenu update(Submenu smen) {
        Submenu objSubmenu = new Submenu();
        BeanUtils.copyProperties(smen, objSubmenu);
        return submenuRepository.save(objSubmenu);
    }

    @Override
    public Submenu delete(Submenu smen) {
        Submenu objSubmenu = submenuRepository.getById(smen.getCodigo());
        objSubmenu.setEstado(false);
        return submenuRepository.save(objSubmenu);
    }
}
