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
@Entity(name="Distrito")
@Table(name="t_distrito")


public class Distrito implements Serializable{
    private static final long serialVersion=1L;
    @Id//define la clave primaria
    @Column(name="coddis") //nombre de los campos de la tabla
    @GeneratedValue(strategy=GenerationType.IDENTITY)//autoincremento
    private long codigo;
    @Column(name="nomdis")
    private String nombre;
    @Column(name="estdis")
    private boolean estado;
}
