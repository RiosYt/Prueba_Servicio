
package pe.com.ciberelectrik.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.Perfil;
import pe.com.ciberelectrik.repository.PerfilRepository;

@Service
public class PerfilServiceImpl implements PerfilService{
    @Autowired
    private PerfilRepository perfilRepository;

    @Override
    public List<Perfil> findAll() {
        return perfilRepository.findAll();
            }

    @Override
    public List<Perfil> findAllCustom() {
        return perfilRepository.findAllCustom();
            }

    @Override
    public Optional<Perfil> findById(Long id) {
         return perfilRepository.findById(id);
           }

    @Override
    public List<Perfil> findByName(String nombre) {
        return perfilRepository.findByName(nombre);
          }

    @Override
    public Perfil add(Perfil p) {
        return perfilRepository.save(p);
          }

    @Override
    public Perfil update(Perfil p) {
        Perfil objperfil = new Perfil();
        BeanUtils.copyProperties(p, objperfil);
        return perfilRepository.save(objperfil);
           }

    @Override
    public Perfil delete(Perfil p) {
        Perfil objperfil = perfilRepository.getById(p.getCodigo());
        objperfil.setEstado(false);
        return perfilRepository.save(objperfil);
           }
    
}
