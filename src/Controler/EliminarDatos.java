/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

/**
 *
 * @author USUARIO
 */
public class EliminarDatos {
    Conexion c = new Conexion();
    
    public void Cargo (String xidpro){
         try{
            c.ps=c.con.prepareStatement("DELETE FROM cargo WHERE IdCargo =?");
            c.ps.setString(1, xidpro);
            c.ps.executeUpdate();
        }catch(Exception e){
             System.out.println("ErrorEliminar "+e);
        }
    }
    public void Categoria (String xidpro){
         try{
            c.ps=c.con.prepareStatement("DELETE FROM Categoria WHERE IdCategoria=?");
            c.ps.setString(1, xidpro);
            c.ps.executeUpdate();
        }catch(Exception e){
        }
    }
    public void Cliente (String xidpro){
         try{
            c.ps=c.con.prepareStatement("DELETE FROM Cliente WHERE IdCliente=?");
            c.ps.setString(1, xidpro);
            c.ps.executeUpdate();
        }catch(Exception e){
        }
    }
    public void Empleado (String xidpro){
         try{
            c.ps=c.con.prepareStatement("DELETE FROM Empleado WHERE IdEmpleado=?");
            c.ps.setString(1, xidpro);
            c.ps.executeUpdate();
        }catch(Exception e){
        }
    }
    public void PagoEmpleado (String xidpro){
         try{
            c.ps=c.con.prepareStatement("DELETE FROM PagoEmpleado WHERE IdPago=?");
            c.ps.setString(1, xidpro);
            c.ps.executeUpdate();
        }catch(Exception e){
        }
    }
    public void EvaluacionDesempeño (String xidpro){
         try{
            c.ps=c.con.prepareStatement("DELETE FROM EvaluacionDesempeño WHERE IdEvaluacion=?");
            c.ps.setString(1, xidpro);
            c.ps.executeUpdate();
        }catch(Exception e){
        }
    }
    public void FormaPago (String xidpro){
         try{
            c.ps=c.con.prepareStatement("DELETE FROM FormaPago WHERE FormaPago=?");
            c.ps.setString(1, xidpro);
            c.ps.executeUpdate();
        }catch(Exception e){
        }
    }
    public void Horario (String xidpro){
         try{
            c.ps=c.con.prepareStatement("DELETE FROM Horario WHERE IdHorario=?");
            c.ps.setString(1, xidpro);
            c.ps.executeUpdate();
        }catch(Exception e){
        }
    }
    public void PedidoCompra (String xidpro){
         try{
            c.ps=c.con.prepareStatement("DELETE FROM PedidoCompra WHERE IdPedidoCompra=?");
            c.ps.setString(1, xidpro);
            c.ps.executeUpdate();
        }catch(Exception e){
        }
    }
    public void PedidoVenta (String xidpro){
         try{
            c.ps=c.con.prepareStatement("DELETE FROM PedidoVenta WHERE IdPedidoVenta=?");
            c.ps.setString(1, xidpro);
            c.ps.executeUpdate();
        }catch(Exception e){
        }
    }
    public void Platillo (String xidpro){
         try{
            c.ps=c.con.prepareStatement("DELETE FROM Platillo WHERE IdPlatillo=?");
            c.ps.setString(1, xidpro);
            c.ps.executeUpdate();
        }catch(Exception e){
        }
    }
    public void DetallePedidoVenta (String xidpro){
         try{
            c.ps=c.con.prepareStatement("DELETE FROM DetallePedidoVenta WHERE IdPlatillo=?");
            c.ps.setString(1, xidpro);
            c.ps.executeUpdate();
        }catch(Exception e){
        }
    }
    public void Producto (String xidpro){
         try{
            c.ps=c.con.prepareStatement("DELETE FROM Producto WHERE IdProducto=?");
            c.ps.setString(1, xidpro);
            c.ps.executeUpdate();
        }catch(Exception e){
        }
    }
    public void RegistroAlmacen (String xidpro){
         try{
            c.ps=c.con.prepareStatement("DELETE FROM RegistroAlmacen WHERE IdRegistroAlmacen=?");
            c.ps.setString(1, xidpro);
            c.ps.executeUpdate();
        }catch(Exception e){
        }
    }
    public void DetallePedidoCompra (String xidpro){
         try{
            c.ps=c.con.prepareStatement("DELETE FROM DetallePedidoCompra WHERE IdPedidoCompra=?");
            c.ps.setString(1, xidpro);
            c.ps.executeUpdate();
        }catch(Exception e){
        }
    }
    public void Proveedor (String xidpro){
         try{
            c.ps=c.con.prepareStatement("DELETE FROM Proveedor WHERE IdProveedor=?");
            c.ps.setString(1, xidpro);
            c.ps.executeUpdate();
        }catch(Exception e){
        }
    }
    public void TipoPago (String xidpro){
         try{
            c.ps=c.con.prepareStatement("DELETE FROM TipoPago WHERE IdTipoPago=?");
            c.ps.setString(1, xidpro);
            c.ps.executeUpdate();
        }catch(Exception e){
        }
    }
    public void ComprobantePago (String xidpro){
         try{
            c.ps=c.con.prepareStatement("DELETE FROM ComprobantePago WHERE NroComprobante=?");
            c.ps.setString(1, xidpro);
            c.ps.executeUpdate();
        }catch(Exception e){
        }
    }
  
    
    
    
}
