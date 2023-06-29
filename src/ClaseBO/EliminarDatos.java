/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseBO;

/**
 *
 * @author USUARIO
 */
public class EliminarDatos {
    Conexion c = new Conexion();
    
    public void Cargo (String xidpro){
         try{
            c.ps=c.con.prepareStatement("DELETE FROM cargo WHERE IdCargo=?");
            c.ps.setString(1, xidpro);
            c.ps.executeUpdate();
        }catch(Exception e){
        }
    }
    
}
