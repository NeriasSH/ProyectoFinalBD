/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

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
    
    public void Categoria(String date, String date2, String date3) {
        try {
            c.ps = c.con.prepareStatement("UPDATE Categoria set NombreCategoria = ?,Descripcion = ? WHERE IdCategoria = ?");
            c.ps.setString(1, date2);
            c.ps.setString(2, date3);
            c.ps.setString(3, date);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error Modificar: "+e);
        }
    }

    public void Cliente(String date, String date2, String date3, String date4, String date5, String date6, String date7, String date8) {
        try {
            c.ps = c.con.prepareStatement("UPDATE Cliente set Primer_Apellido = ?, Segundo_Apellido = ?, Nombres = ?, Direccion = ?,Ciudad = ?,Telefono = ?,CorreoElectronico = ?  WHERE IdCliente = ?");
            c.ps.setString(1, date2);
            c.ps.setString(2, date3);
            c.ps.setString(3, date4);
            c.ps.setString(4, date5);
            c.ps.setString(5, date6);
            c.ps.setString(6, date7);
            c.ps.setString(7, date8);
            c.ps.setString(8, date);
            c.ps.executeUpdate();
        } catch (Exception e) {
                        System.out.println("Error Modificar: "+e);

        }
    }

    public void Empleado(String date, String date2, String date3, String date4, String date5, String date6, String date7) {
        try {
            c.ps = c.con.prepareStatement("UPDATE Empleado set Apellidos = ?,Nombre = ?,FechaContratacion = ?,Direccion = ?,Telefono = ?,Ciudad = ?  WHERE IdEmpleado = ?");
            
            c.ps.setString(1, date2);
            c.ps.setString(2, date3);
            c.ps.setString(3, date4);
            c.ps.setString(4, date5);
            c.ps.setString(5, date6);
            c.ps.setString(6, date7);
            c.ps.setString(7, date);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error Modificar: "+e);
        }
    }

    public void PagoEmpleado(String date, String date2, String date3) {
        try {
            c.ps = c.con.prepareStatement("UPDATE PagoEmpleado set Fecha = ?,Monto = ?  WHERE IdPago = ?");
          
            c.ps.setString(1, date2);
            c.ps.setString(2, date3);
            c.ps.setString(3, date);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error Modificar: "+e);
        }
    }

    public void EvaluacionDesempeño(String date, String date2, String date3, String date4) {
        try {
            c.ps = c.con.prepareStatement("UPDATE EvaluacionDesempeño set Fecha = ?,Resultado = ?,Comentarios = ?  WHERE IdEvaluacion = ?");
            
            c.ps.setString(1, date2);
            c.ps.setString(2, date3);
            c.ps.setString(3, date4);
             c.ps.setString(4, date);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error Modificar: "+e);
        }
    }

    public void FormaPago(String date, String date2) {
        try {
            c.ps = c.con.prepareStatement("UPDATE FormaPago set Descripcion = ?  WHERE IdFormaPago = ?");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error Modificar: "+e);
        }
    }

    public void Horario(String date, String date2, String date3) {
        try {
            c.ps = c.con.prepareStatement("UPDATE Horario set HorarioInicio = ?, HorarioFinal = ?  WHERE IdHorario = ?");
            
            c.ps.setString(1, date2);
            c.ps.setString(2, date3);
            c.ps.setString(3, date);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error Modificar: "+e);
        }
    }

    public void PedidoCompra(String date, String date2, String date3, String date4) {
        try {
            c.ps = c.con.prepareStatement("UPDATE PedidoCompra set HorarioInicio = ?, HorarioFinal = ? WHERE IdPedidoCompra = ?");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.setString(3, date3);
            c.ps.setString(4, date4);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error Modificar: "+e);
        }
    }

    public void PedidoVenta(String date, String date2, String date3) {
        try {
            c.ps = c.con.prepareStatement("UPDATE PedidoVenta set Fecha = ? ,Total = ?  WHERE IdPedidoVenta = ?");
            
            c.ps.setString(1, date2);
            c.ps.setString(2, date3);
            c.ps.setString(3, date);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error Modificar: "+e);
        }
    }

    public void Platillo(String date, String date2) {
        try {
            c.ps = c.con.prepareStatement("UPDATE Platillo set Descripcion = ?  WHERE IdPlatillo = ?");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error Modificar: "+e);
        }
    }

    public void DetallePedidoVenta(String date, String date2, String date3, String date4) {
        try {
            c.ps = c.con.prepareStatement("UPDATE DetallePedidoVenta set Descripcion = ?  WHERE IdPlatillo = ? and IdPedidoVenta = ?");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.setString(3, date3);
            c.ps.setString(4, date4);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error Modificar: "+e);
        }
    }

    public void Producto(String date, String date2, String date3, String date4, String date5) {
        try {
            c.ps = c.con.prepareStatement("UPDATE Producto set NombreProducto = ?,CantidadPorUnidad = ?,PrecioUnidad = ?,UnidadesEnExistencia = ?  WHERE IdProducto = ?");
           
            c.ps.setString(1, date2);
            c.ps.setString(2, date3);
            c.ps.setString(3, date4);
            c.ps.setString(4, date5);
            c.ps.setString(5, date);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error Modificar: "+e);
        }
    }

    public void RegistroAlmacen(String date, String date2, String date3, String date4) {
        try {
            c.ps = c.con.prepareStatement("UPDATE RegistroAlmacen set CantidadEntrada = ?,FechaEntrada = ?,FechaVencimiento = ?  WHERE IdRegistroAlmacen = ?");
            
            c.ps.setString(1, date2);
            c.ps.setString(2, date3);
            c.ps.setString(3, date4);
            c.ps.setString(4, date);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error Modificar: "+e);
        }
    }

    public void DetallePedidoCompra(String date, String date2, String date3, String date4, String date5) {
        try {
            c.ps = c.con.prepareStatement("UPDATE DetallePedidoCompra set Descripcion = ?  WHERE IdCategoria = ?");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.setString(3, date3);
            c.ps.setString(4, date4);
            c.ps.setString(5, date5);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error Modificar: "+e);
        }
    }

    public void Proveedor(String date, String date2, String date3, String date4, String date5, String date6) {
        try {
            c.ps = c.con.prepareStatement("UPDATE Proveedor set NombreEmpresa = ?,NombreContacto = ?,Direccion = ?,Telefono = ?,Pais = ?  WHERE IdProveedor = ?");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.setString(3, date3);
            c.ps.setString(4, date4);
            c.ps.setString(5, date5);
            c.ps.setString(6, date6);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error Modificar: "+e);
        }
    }

    public void TipoPago(String date, String date2) {
        try {
            c.ps = c.con.prepareStatement("UPDATE TipoPago set Descripcion = ?  WHERE IdTipoPago = ?");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error Modificar: "+e);
        }
    }

    public void ComprobantePago(String date, String date2, String date3) {
        try {
            c.ps = c.con.prepareStatement("UPDATE ComprobantePago set IGV  = ?,ImporteTotal  = ?  WHERE NroComprobante = ?");
           
            c.ps.setString(1, date2);
            c.ps.setString(2, date3);
            c.ps.setString(3, date);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error Modificar: "+e);
        }
    }

}
