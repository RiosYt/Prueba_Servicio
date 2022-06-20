
package pe.com.ciberelectrik.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.ciberelectrik.entity.Perfil;


public interface PerfilRepository extends JpaRepository<Perfil, Long> {
    @Query("select p from Perfil p where p.estado='1'")
    List<Perfil> findAllCustom();

    @Query("select p from Perfil p where upper(p.nombre) like upper(:nombre) and p.estado='1'")
    List<Perfil> findByName(@Param("nombre") String nombre);
}
