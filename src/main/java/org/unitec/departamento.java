package org.unitec;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departamento")
public class departamento implements Serializable{
    
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;

    public departamento() {
     
    }

    departamento(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
   
    @Override
    public String toString() {
        return "departamento{" + "id=" + id + ", nombre=" + nombre + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
   

   