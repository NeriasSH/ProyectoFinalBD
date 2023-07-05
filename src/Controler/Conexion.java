/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;


import Clases.Cargo;
import Clases.Empleado;
import ClasesReportes.Almacen;
import ClasesReportes.Compras;
import java.sql.*;
import java.util.ArrayList;
public class Conexion {
 Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Conexion(){
        String usu="polleria",cla="polleria",url="jdbc:oracle:thin:@//localhost:1521/XEPDB1";
        try{
            
            con=DriverManager.getConnection(url,usu,cla);
            
        } catch(Exception e){
            
            System.out.println("E: "+e);
        }
    }
    
    public void Insertar(String xidpro, String xnompro,String xcod){
        try{
            ps=con.prepareStatement("Insert into trabajador values(?,?,?)");
            ps.setString(1, xidpro);
            ps.setString(2, xnompro);
            ps.setString(3, xcod);
            ps.executeUpdate();
        }catch(Exception e){
        }
    }
    
    public void Borrar (String xidpro){
         try{
            ps=con.prepareStatement("DELETE FROM trabajador WHERE DNI=?");
            ps.setString(1, xidpro);
            ps.executeUpdate();
        }catch(Exception e){
        }
    }
    
    public void Actualizar (String xidpro, String xnompro){
         try{
            ps=con.prepareStatement("UPDATE trabajador set nombre = ?  WHERE DNI = ?");
            ps.setString(1, xnompro);
            ps.setString(2, xidpro);
            ps.executeUpdate();
        }catch(Exception e){
        }
    }
    
 
     public  ArrayList<Cargo> Listar1 (){
         
          ArrayList<Cargo>lista =new ArrayList();
         try{
            ps=con.prepareStatement("SELECT * FROM cargo");
            
            rs=ps.executeQuery();
            while(rs.next()){
                lista.add(new Cargo (rs.getString(1), rs.getString(2)));
            }
            
        }catch(Exception e){
        }
         return lista;
    }
     
     
     
     
}
     


