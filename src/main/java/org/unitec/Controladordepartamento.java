/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controladordepartamento{
     @Autowired DAODepartamento daodep;
    
    @CrossOrigin
    @RequestMapping(value="/departamento/{nombre}",method=RequestMethod.GET,headers={"Accept=text/html"})//http://localhost:9999/departamento?nombre=pino
    @ResponseBody String guardardepartamento(@PathVariable String nombre){
        //generamos el objeto de tipo departamento
       departamento depa=new departamento(nombre);
       String mensaje="nada";
        try{
            daodep.save(depa);
            mensaje="departamento guardado con exito";
        }catch(Exception e){
          mensaje=e.getMessage();
        }
        return mensaje;
    }
    /*
     @RequestMapping("/actualizar-departamento")//http://localhost:9999/actualizar-departamento?id=X&nombre=pino
    @ResponseBody String actualizar(Long id, String nombre){
        String mensajito="nada";
        try{
            departamento p=daodep.findOne(id);
            p.setNombre(nombre);
            
            daodep.save(p);
            mensajito="Departamento actualizado con exito";
        }catch(Exception e){
            mensajito=e.getMessage();
        }
        return mensajito;
    }
    
     @RequestMapping("/buscardepartamento-porID")//http://localhost:9999/buscardepartamento-porID?id=X
    @ResponseBody String buscarPorID(Long id){
        String mensajito="nada";
        try{
            departamento p=daodep.findOne(id);
            mensajito=p.toString();
            
        }catch(Exception e){
            mensajito=e.getMessage();
        }
        return mensajito;
    }

 @CrossOrigin
    @RequestMapping(value ="/departamento", method=RequestMethod.GET, headers={"Accept=application/json"})//http://localhost:9999/buscar-departamentos
    @ResponseBody String buscarTodos()throws Exception{
        String mensajito="nada";
       ArrayList<departamento> departamentos= (ArrayList<departamento>) daodep.findAll();
       //usamos del paquete faster xml de jackson la clase objetmapper
        ObjectMapper maper=new ObjectMapper();
        return maper.writeValueAsString(departamentos);
        }
    
    
     @RequestMapping("/borrar-departamento")//http://localhost:9999/borrar-producto?id=13
    @ResponseBody String borrardepartamento(Long id){
        String mensajito="nada";
        try{
            daodep.delete(id);
            mensajito="se borro tu registro de departamento con exito";
        }catch(Exception e){
            mensajito=e.getMessage();
        }
        return mensajito;
    }
*/
    
            }

    
