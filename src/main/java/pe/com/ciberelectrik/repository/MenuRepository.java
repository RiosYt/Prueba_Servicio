package pe.com.ciberelectrik.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.ciberelectrik.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long>{
    @Query("select m from Menu m where m.estado='1'")
    List<Menu> findAllCustom();
    
    @Query("select m from Menu m where upper(m.nombre) like upper(:nombre) and m.estado='1'")
    List<Menu> findByName(@Param("nombre") String nombre);
}
