package org.unitec;

import org.hibernate.result.Output;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHibernateJpaApplication implements CommandLineRunner{
@Autowired DAODepartamento daodep;
@Autowired DAOEmpleado daoemp;
	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateJpaApplication.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Antes de hacer el insert en la entidad Departamento");
        //paso 1: creamos un objeto de tipo departamento
       // departamento depa=new departamento("ventas");
        //verificar que tengas la anotacion de inyeccion de dependencias en esta clase
        //guardar el departamento
        
       //daopep.save(depa);
        
       // tenemos que buscar el departamento al que vamos asignar al nuevo empleado
       
       //departamento dep=daopep.findOne(1l);
       
       //generamos un objetos de tipo departamento
       
       //departamento depto=new departamento(dep.getNombre());
       //empleado x=new empleado(dep, "juan");
      // daoemp.save(x);
       
       // pregunta del pizarron
       // hacer un query donde se muestre el usuario cuyo ID es 2
       // y que se muestre su nombre y el nombre del departamento
       // donde esta asignado
       
      // empleado emp=daoemp.findOne(2L);
               
     //System.out.println("query: id:"+emp.getId()+"empleado"+emp.getNombre()+"depto"+emp.getDepa().getNombre ());
        
    }

    
}
