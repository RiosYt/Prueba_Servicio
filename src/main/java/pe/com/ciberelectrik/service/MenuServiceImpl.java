package pe.com.ciberelectrik.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.Menu;
import pe.com.ciberelectrik.repository.MenuRepository;

@Service
public class MenuServiceImpl implements MenuService{
    @Autowired
    private MenuRepository menuRepository;
    
    @Override
    public List<Menu> findAll() {
        return menuRepository.findAll();
    }
    
    @Override
    public List<Menu> findAllCustom() {
        return menuRepository.findAllCustom();
    }

    @Override
    public Optional<Menu> findById(Long id) {
        return menuRepository.findById(id);
    }

    @Override
    public List<Menu> findByName(String nombre) {
        return menuRepository.findByName(nombre);
    }
    
    @Override
    public Menu add(Menu m) {
        return menuRepository.save(m);
    }

    @Override
    public Menu update(Menu m) {
        Menu objMenu = new Menu();
        BeanUtils.copyProperties(m, objMenu);
        return menuRepository.save(objMenu);
    }

    @Override
    public Menu delete(Menu m) {
        Menu objMenu = menuRepository.getById(m.getCodigo());
        objMenu.setEstado(false);
        return menuRepository.save(objMenu);
    }
}
