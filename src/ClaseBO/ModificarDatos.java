/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseBO;

/**
 *
 * @author USUARIO
 */
public class ModificarDatos {
    
    Conexion c = new Conexion();
    
    public void Cargo (String xidpro, String xnompro){
         try{
            c.ps=c.con.prepareStatement("UPDATE cargo set DescripcionCargo = ?  WHERE IdCargo = ?");
            c.ps.setString(1, xnompro);
            c.ps.setString(2, xidpro);
            c.ps.executeUpdate();
        }catch(Exception e){
        }
    }
    
}
