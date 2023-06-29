/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Clases.Cargo;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ListarDatos {
    
    Conexion c = new Conexion();
    
    public  ArrayList<Cargo> Cargo (){
         
          ArrayList<Cargo>lista =new ArrayList();
         try{
            c.ps=c.con.prepareStatement("SELECT * FROM cargo");
            
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new Cargo (c.rs.getString(1), c.rs.getString(2)));
            }
            
        }catch(Exception e){
        }
         return lista;
    }
    
}
