package pe.com.ciberelectrik.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.ciberelectrik.entity.Submenu;

public interface SubmenuRepository extends JpaRepository<Submenu, Long>{
    @Query("select s from Submenu s where s.estado='1'")
    List<Submenu> findAllCustom();
    
    @Query("select s from Submenu s where upper(s.nombre) like upper(:nombre) and s.estado='1'")
    List<Submenu> findByName(@Param("nombre") String nombre);
}
