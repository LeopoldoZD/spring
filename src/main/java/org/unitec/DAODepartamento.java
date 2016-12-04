/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface DAODepartamento extends CrudRepository<departamento, Long>{
    List<departamento> findByNombre(String nombre);
}
