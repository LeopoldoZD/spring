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
public class ControladoProducto {
    @Autowired DAOProducto dao;
    
    @CrossOrigin
    @RequestMapping(value="/producto/{nombre}/{precio}",method=RequestMethod.POST,headers={"Accept=text/html"})//http://localhost:9999/guardar-producto?nombre=rufles&precio=X
    @ResponseBody String guardarProducto(@PathVariable String nombre,@PathVariable Float precio){
        String mensajito="nada";
        try{
            dao.save(new Producto(nombre, precio));
            mensajito="producto guardado con exito";
        }catch(Exception e){
          mensajito=e.getMessage();
        }
        return mensajito;
    }
    @RequestMapping("/actualizar-producto")//http://localhost:9999/actualizar-producto?id=X&nombre=rufles&precio=X
    @ResponseBody String actualizar(Long id, String nombre, Float precio){
        String mensajito="nada";
        try{
            Producto p=      dao.findOne(id);
            p.setNombre(nombre);
            p.setPrecio(precio);
            dao.save(p);
            mensajito="Producto actualizado con exito";
        }catch(Exception e){
            mensajito=e.getMessage();
        }
        return mensajito;
    }
    @RequestMapping("/buscarproducto-porID")//http://localhost:9999/buscarproducto-porID?id=X
    @ResponseBody String buscarPorID(Long id){
        String mensajito="nada";
        try{
            Producto p=    dao.findOne(id);
            mensajito=p.toString();
            
        }catch(Exception e){
            mensajito=e.getMessage();
        }
        return mensajito;
    }
     //a)verificar la anotacion de crossorigin  
   @CrossOrigin
    @RequestMapping(value ="/producto", method=RequestMethod.GET, headers={"Accept=application/json"})
//http://localhost:9999/buscar-productos
    @ResponseBody String buscarTodos()throws Exception{
        String mensajito="nada";
       ArrayList<Producto> productos= (ArrayList<Producto>) dao.findAll();
       //usamos del paquete faster xml de jackson la clase objetmapper
        ObjectMapper maper=new ObjectMapper();
        return maper.writeValueAsString(productos);
        }
        
    

    @RequestMapping("/borrar-producto")//http://localhost:9999/borrar-producto?id=13
    @ResponseBody String borrarProducto(Long id){
        String mensajito="nada";
        try{
            dao.delete(id);
            mensajito="se borro tu registro con exito";
        }catch(Exception e){
            mensajito=e.getMessage();
        }
        return mensajito;
    }
    @RequestMapping("/buscar-pornombre")//http://localhost:9999/buscar-pornombre?nombre=X
    @ResponseBody String buscarPorNombre(String nombre){
        String mensajito="nada";
        StringBuilder builder=new StringBuilder();
        try{
           for(Producto p:dao.findByNombre(nombre)){
            builder.append("<br>"+p.toString());  
           }
           mensajito=builder.toString();
           }catch(Exception e){
                   mensajito=e.getMessage();
                   }
                
        return mensajito;
        }
    }

