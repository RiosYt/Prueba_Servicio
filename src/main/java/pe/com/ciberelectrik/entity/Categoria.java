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
@Entity(name="Categoria")//Nombre de la entidad
@Table(name="t_categoria")//Nombre de la tabla

public class Categoria implements Serializable{
    private static final long serialVersion=1L;
    @Id//define la clave primaria
    @Column(name="codcat") //nombre de los campos de la tabla
    @GeneratedValue(strategy=GenerationType.IDENTITY)//autoincremento
    private long codigo;
    @Column(name="nomcat")
    private String nombre;
    @Column(name="estcat")
    private boolean estado;    
}
