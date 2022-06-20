package pe.com.ciberelectrik.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Empleado")
@Table(name="t_empleado")

public class Empleado implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="codemp")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long codigo;
    @Column(name="nomemp")
    private String nombre;
    @Column(name="apepemp")
    private String apellidoPaterno;
    @Column(name="apememp")
    private String apellidoMaterno;
    @Column(name="dniemp")
    private int dni;
    @Column(name="diremp")
    private String direccion;
    @Column(name="telemp")
    private int telefono;
    @Column(name="celemp")
    private int celular;
    @Column(name="coremp")
    private String correo;
    @Column(name="sexemp")
    private String sexo;
    @Column(name="usuemp")
    private String usuario;
    @Column(name="claemp")
    private String clave;
    @Column(name="estemp")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="coddis", nullable=false)
    private Distrito distrito;
    @ManyToOne
    @JoinColumn(name="codper", nullable=false)
    private Perfil perfil;
}
