package pe.com.ciberelectrik.service;

import java.util.List;
import java.util.Optional;
import pe.com.ciberelectrik.entity.Menu;

public interface MenuService {
    List<Menu> findAll();
    List<Menu> findAllCustom();
    Optional<Menu> findById(Long id);
    List<Menu> findByName(String nombre);
    Menu add(Menu m);
    Menu update(Menu m);
    Menu delete(Menu m);
}
