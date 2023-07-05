/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Clases.*;
import ClasesReportes.Almacen;
import ClasesReportes.Compras;
import ClasesReportes.ViewVentas;
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
    
    public  ArrayList<Categoria> Categoria (){
         
          ArrayList<Categoria>lista =new ArrayList();
         try{
            c.ps=c.con.prepareStatement("SELECT * FROM Categoria");
            
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new Categoria (c.rs.getString(1),c.rs.getString(2),c.rs.getString(3)));
            }
            
        }catch(Exception e){
        }
         return lista;
    }
    
    public  ArrayList<Cliente> Cliente (){
         
          ArrayList<Cliente>lista =new ArrayList();
         try{
            c.ps=c.con.prepareStatement("SELECT * FROM Cliente");
            
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new Cliente (c.rs.getString(1),c.rs.getString(2),c.rs.getString(3),c.rs.getString(4),c.rs.getString(5),c.rs.getString(6),c.rs.getString(7),c.rs.getString(8)));
            }
            
        }catch(Exception e){
            
             System.out.println("ErrorListado: "+e);
        }
         return lista;
    }
    
    public  ArrayList<Empleado> Empleado (){
         
          ArrayList<Empleado>lista =new ArrayList();
         try{
            c.ps=c.con.prepareStatement("SELECT * FROM Empleado");
            
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new Empleado (c.rs.getString(1), c.rs.getString(2), c.rs.getString(3), c.rs.getString(4), c.rs.getString(5), c.rs.getString(6), c.rs.getString(7), c.rs.getString(8), c.rs.getString(9)));
            }
            
        }catch(Exception e){
            
             System.out.println("ErrorListado: "+e);
        }
         return lista;
    }
    
    public  ArrayList<Pagoempleado> PagoEmpleado (){
         
          ArrayList<Pagoempleado>lista =new ArrayList();
         try{
            c.ps=c.con.prepareStatement("SELECT * FROM PagoEmpleado");
            
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new Pagoempleado (c.rs.getString(1), c.rs.getString(2),c.rs.getFloat(3),c.rs.getString(4)));
            }
            
        }catch(Exception e){
            
             System.out.println("ErrorListado: "+e);
        }
         return lista;
    }
    
    public  ArrayList<EvaluacionDesempeño> EvaluacionDesempeño (){
         
          ArrayList<EvaluacionDesempeño>lista =new ArrayList();
         try{
            c.ps=c.con.prepareStatement("SELECT * FROM EvaluacionDesempeño");
            
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new EvaluacionDesempeño (c.rs.getString(1), c.rs.getString(2), c.rs.getString(3), c.rs.getString(4), c.rs.getString(5)));
            }
            
        }catch(Exception e){
            
             System.out.println("ErrorListado: "+e);
        }
         return lista;
    }
    
    public  ArrayList<Formapago> FormaPago (){
         
          ArrayList<Formapago>lista =new ArrayList();
         try{
            c.ps=c.con.prepareStatement("SELECT * FROM FormaPago");
            
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new Formapago (c.rs.getString(1), c.rs.getString(2)));
            }
            
        }catch(Exception e){
            
             System.out.println("ErrorListado: "+e);
        }
         return lista;
    }
    
    public  ArrayList<Horario> Horario (){
         
          ArrayList<Horario>lista =new ArrayList();
         try{
            c.ps=c.con.prepareStatement("SELECT * FROM Horario");
            
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new Horario (c.rs.getString(1), c.rs.getString(2), c.rs.getString(3)));
            }
            
        }catch(Exception e){
            
             System.out.println("ErrorListado: "+e);
        }
         return lista;
    }
    
    public  ArrayList<Pedidocompra> PedidoCompra (){
         
          ArrayList<Pedidocompra>lista =new ArrayList();
         try{
            c.ps=c.con.prepareStatement("SELECT * FROM PedidoCompra");
            
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new Pedidocompra (c.rs.getString(1), c.rs.getString(2),c.rs.getString(3),c.rs.getFloat(4)));
            }
            
        }catch(Exception e){
            
             System.out.println("ErrorListado: "+e);
        }
         return lista;
    }
    
    public  ArrayList<Pedidoventa> PedidoVenta (){
         
          ArrayList<Pedidoventa>lista =new ArrayList();
         try{
            c.ps=c.con.prepareStatement("SELECT * FROM PedidoVenta");
            
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new Pedidoventa (c.rs.getString(1), c.rs.getString(2), c.rs.getString(3),c.rs.getFloat(4), c.rs.getString(5)));
            }
            
        }catch(Exception e){
            
             System.out.println("ErrorListado: "+e);
        }
         return lista;
    }
    
    public  ArrayList<Platillo> Platillo (){
         
          ArrayList<Platillo>lista =new ArrayList();
         try{
            c.ps=c.con.prepareStatement("SELECT * FROM Platillo");
            
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new Platillo (c.rs.getString(1), c.rs.getString(2)));
            }
            
        }catch(Exception e){
            
             System.out.println("ErrorListado: "+e);
        }
         return lista;
    }
    
    public  ArrayList<DetallePedidoVenta> DetallePedidoVenta (){
         
          ArrayList<DetallePedidoVenta>lista =new ArrayList();
         try{
            c.ps=c.con.prepareStatement("SELECT * FROM DetallePedidoVenta");
            
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new DetallePedidoVenta (c.rs.getString(1), c.rs.getString(2),c.rs.getInt(3),c.rs.getFloat(4)));
            }
            
        }catch(Exception e){
            
             System.out.println("ErrorListado: "+e);
        }
         return lista;
    }
    
    public  ArrayList<Producto> Producto (){
         
          ArrayList<Producto>lista =new ArrayList();
         try{
            c.ps=c.con.prepareStatement("SELECT * FROM Producto");
            
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new Producto (c.rs.getString(1), c.rs.getString(2),c.rs.getInt(3), c.rs.getFloat(4),c.rs.getString(5), c.rs.getString(6),c.rs.getString(7)));
            }
            
        }catch(Exception e){
            
             System.out.println("ErrorListado: "+e);
        }
         return lista;
    }
    
    public  ArrayList<RegistroAlmacen> RegistroAlmacen (){
         
          ArrayList<RegistroAlmacen>lista =new ArrayList();
         try{
            c.ps=c.con.prepareStatement("SELECT * FROM RegistroAlmacen");
            
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new RegistroAlmacen (c.rs.getString(1), c.rs.getString(2),c.rs.getInt(3),c.rs.getString(4), c.rs.getString(5),c.rs.getString(6)));
            }
            
        }catch(Exception e){
            
             System.out.println("ErrorListado: "+e);
        }
         return lista;
    }
    
    public  ArrayList<DetallePedidoCompra> DetallePedidoCompra (){
         
          ArrayList<DetallePedidoCompra>lista =new ArrayList();
         try{
            c.ps=c.con.prepareStatement("SELECT * FROM DetallePedidoCompra");
            
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new DetallePedidoCompra (c.rs.getString(1), c.rs.getString(2),c.rs.getFloat(3),c.rs.getInt(4),c.rs.getFloat(5)));
            }
            
        }catch(Exception e){
            
             System.out.println("ErrorListado: "+e);
        }
         return lista;
    }
    
    public  ArrayList<Proveedor> Proveedor (){
         
          ArrayList<Proveedor>lista =new ArrayList();
         try{
            c.ps=c.con.prepareStatement("SELECT * FROM Proveedor");
            
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new Proveedor (c.rs.getString(1), c.rs.getString(2),c.rs.getString(3), c.rs.getString(4),c.rs.getString(5), c.rs.getString(6)));
            }
            
        }catch(Exception e){
            
             System.out.println("ErrorListado: "+e);
        }
         return lista;
    }
    
    public  ArrayList<TipoPago> TipoPago (){
         
          ArrayList<TipoPago>lista =new ArrayList();
         try{
            c.ps=c.con.prepareStatement("SELECT * FROM TipoPago");
            
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new TipoPago (c.rs.getString(1), c.rs.getString(2)));
            }
            
        }catch(Exception e){
            
             System.out.println("ErrorListado: "+e);
        }
         return lista;
    }
    
    public  ArrayList<ComprobantePago> ComprobantePago (){
         
          ArrayList<ComprobantePago>lista =new ArrayList();
         try{
            c.ps=c.con.prepareStatement("SELECT * FROM ComprobantePago");
            
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new ComprobantePago (c.rs.getString(1), c.rs.getString(2),c.rs.getFloat(3),c.rs.getFloat(4),c.rs.getString(5), c.rs.getString(6)));
            }
            
        }catch(Exception e){
            
             System.out.println("ErrorListado: "+e);
        }
         return lista;
    }
    
         public ArrayList<Almacen> Listar2(String sql3){
        ArrayList<Almacen>lista=new ArrayList();
        try{
            c.ps=c.con.prepareStatement(sql3);
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new Almacen (c.rs.getString(1),c.rs.getString(2),c.rs.getString(3),c.rs.getString(4),c.rs.getString(5),c.rs.getString(6),c.rs.getString(7)));
            }
        }catch(Exception e){}
        return lista;
    }
    
    public ArrayList<Compras> Listar3(String sql3){
        ArrayList<Compras>lista=new ArrayList();
        try{
            c.ps=c.con.prepareStatement(sql3);
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new Compras (c.rs.getString(1),c.rs.getString(2),c.rs.getString(3),c.rs.getString(4),c.rs.getString(5),c.rs.getString(6),c.rs.getString(7),c.rs.getString(8),c.rs.getString(9)));
            }
        }catch(Exception e){}
        return lista;
    }
    
      public  ArrayList<Empleado> Listar (String sql){
         
          ArrayList<Empleado>lista =new ArrayList();
         try{
            c.ps=c.con.prepareStatement(sql);
            
            c.rs=c.ps.executeQuery();
            while(c.rs.next()){
                lista.add(new Empleado (c.rs.getString(1), c.rs.getString(2), c.rs.getString(3), c.rs.getString(4),c.rs.getString(5),
                        c.rs.getString(6), c.rs.getString(7), c.rs.getString(8), c.rs.getString(9)));
            }
            
        }catch(Exception e){System.out.println(e);
        }
         return lista;
    }
      
      public  ArrayList<ViewVentas> PVentas(String sql){
          
          ArrayList<ViewVentas>lista =new ArrayList();
          
          
          return lista;
         
    }
    
 
    
}
