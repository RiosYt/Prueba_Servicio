package pe.com.ciberelectrik.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.ciberelectrik.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{
    @Query("select e from Empleado e where e.estado='1'")
    List<Empleado> findAllCustom();
    
    @Query("select e from Empleado e where upper(e.nombre) like upper(:nombre) and e.estado='1'")
    List<Empleado> findByName(@Param("nombre") String nombre);
    
    @Query("select e from Empleado e where e.usuario=(:usuario) and e.clave=(:clave) and e.estado='1'")
    List<Empleado> findByUser(@Param("usuario") String usuario, @Param("clave") String clave);
}
