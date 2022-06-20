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
@Entity(name = "Menu")
@Table(name = "t_menu")

public class Menu implements Serializable{
    private static final long serialVersion=1L;
    @Id//define la clave primaria
    @Column(name="codmen") //nombre de los campos de la tabla
    @GeneratedValue(strategy=GenerationType.IDENTITY)//autoincremento
    private long codigo;
    @Column(name="nommen")
    private String nombre;
    @Column(name="urlmen")
    private String url;
    @Column(name="icomen")
    private String icon;
    @Column(name="estmen")
    private boolean estado;

}
