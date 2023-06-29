/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseBO;

/**
 *
 * @author USUARIO
 */
public class InsertarDatos {
    
     Conexion c = new Conexion();
     
     public void Cargo(String xidpro, String xnompro){
        try{
            c.ps=c.con.prepareStatement("Insert into cargo values(?,?)");
            c.ps.setString(1, xidpro);
            c.ps.setString(2, xnompro);
            c.ps.executeUpdate();
        }catch(Exception e){
        }
    }
    
}
