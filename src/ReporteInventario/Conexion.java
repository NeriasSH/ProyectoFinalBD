/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReporteInventario;

/**
 *
 * @author 82K2009TLM
 */
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
            System.out.println("Error:"+e);
        }
    }
    public void Consulta(String sql1){
        try{
        ps=con.prepareStatement(sql1);
        ps.executeUpdate();
        }catch(Exception e){
            
        }
    }
    
    
    public ArrayList<Almacen> Listar2(String sql3){
        ArrayList<Almacen>lista=new ArrayList();
        try{
            ps=con.prepareStatement(sql3);
            rs=ps.executeQuery();
            while(rs.next()){
                lista.add(new Almacen (rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
            }
        }catch(Exception e){}
        return lista;
    }
    
    public ArrayList<Compras> Listar3(String sql3){
        ArrayList<Compras>lista=new ArrayList();
        try{
            ps=con.prepareStatement(sql3);
            rs=ps.executeQuery();
            while(rs.next()){
                lista.add(new Compras (rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)));
            }
        }catch(Exception e){}
        return lista;
    }
    
    //Esto es una prueba
}
