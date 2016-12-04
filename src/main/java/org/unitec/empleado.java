package org.unitec;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import org.unitec.departamento;
/**
 *
 * @author T-107
 */
@Entity
@Table(name="empleado_x")
public class empleado{
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name="id_depa")
    private departamento depa;
    private String nombre;

    public empleado(departamento depa, String nombre) {
    
        this.depa = depa;
        this.nombre = nombre;
    }

    public empleado() {
    }
    
  public departamento getDepa() {
        return depa;
    }

    public void setDepa(departamento depa) {
        this.depa = depa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
