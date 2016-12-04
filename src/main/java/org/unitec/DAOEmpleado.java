package org.unitec;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author T-107
 */
@Transactional
public interface DAOEmpleado extends CrudRepository<empleado,Long>{
      
}
