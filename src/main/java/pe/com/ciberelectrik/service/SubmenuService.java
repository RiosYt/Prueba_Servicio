package pe.com.ciberelectrik.service;

import java.util.List;
import java.util.Optional;
import pe.com.ciberelectrik.entity.Submenu;

public interface SubmenuService {
    List<Submenu> findAll();
    List<Submenu> findAllCustom();
    Optional<Submenu> findById(Long id);
    List<Submenu> findByName(String nombre);
    Submenu add(Submenu smen);
    Submenu update(Submenu smen);
    Submenu delete(Submenu smen);
}
