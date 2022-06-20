
package pe.com.ciberelectrik.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Perfil") //nombre de la entidad
@Table(name = "t_perfil") //nombre de la tabla

public class Perfil implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id //define la clave primaria
    @Column(name = "codper") //nombre de los campos de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)//autoincremento
    private long codigo;
    @Column(name = "nomper")
    private String nombre;
    @Column(name = "estper")
    private boolean estado;
}
