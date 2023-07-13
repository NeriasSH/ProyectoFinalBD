/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

/**
 *
 * @author USUARIO
 */
public class InsertarDatos {

    Conexion c = new Conexion();

    public void Cargo(String xidpro, String xnompro) {
        try {
            c.ps = c.con.prepareStatement("Insert into cargo values(?,?)");
            c.ps.setString(1, xidpro);
            c.ps.setString(2, xnompro);
            c.ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void Categoria(String date, String date2, String date3) {
        try {
            c.ps = c.con.prepareStatement("Insert into Categoria values(?,?,?)");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.setString(3, date3);
            c.ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void Cliente(String date, String date2, String date3, String date4, String date5, String date6, String date7, String date8) {
        try {
            c.ps = c.con.prepareStatement("Insert into Cliente values(?,?,?,?,?,?,?,?)");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.setString(3, date3);
            c.ps.setString(4, date4);
            c.ps.setString(5, date5);
            c.ps.setString(6, date6);
            c.ps.setString(7, date7);
            c.ps.setString(8, date8);
            c.ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void Empleado(String date, String date2, String date3, String date4, String date5, String date6, String date7, String date8, String date9) {
        try {
            c.ps = c.con.prepareStatement("Insert into Empleado values(?,?,?,?,?,?,?,?,?)");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.setString(3, date3);
            c.ps.setString(4, date4);
            c.ps.setString(5, date5);
            c.ps.setString(6, date6);
            c.ps.setString(7, date7);
            c.ps.setString(8, date8);
            c.ps.setString(9, date9);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ErrorInsertar " + e);
        }
    }

    public void PagoEmpleado(String date, String date2, String date3, String date4) {
        try {
            c.ps = c.con.prepareStatement("Insert into PagoEmpleado values(?,?,?,?)");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.setString(3, date3);
            c.ps.setString(4, date4);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ErrorInsertar " + e);
        }
    }

    public void EvaluacionDesempeño(String date, String date2, String date3, String date4, String date5) {
        try {
            c.ps = c.con.prepareStatement("Insert into EvaluacionDesempeño values(?,?,?,?,?)");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.setString(3, date3);
            c.ps.setString(4, date4);
            c.ps.setString(5, date5);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ErrorInsertar " + e);
        }
    }

    public void FormaPago(String date, String date2) {
        try {
            c.ps = c.con.prepareStatement("Insert into FormaPago values(?,?)");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ErrorInsertar " + e);
        }
    }

    public void Horario(String date, String date2, String date3) {
        try {
            c.ps = c.con.prepareStatement("Insert into Horario values(?,?,?)");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.setString(3, date3);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ErrorInsertar " + e);
        }
    }

    public void PedidoCompra(String date, String date2, String date3, String date4) {
        try {
            c.ps = c.con.prepareStatement("Insert into PedidoCompra values(?,?,?,?)");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.setString(3, date3);
            c.ps.setString(4, date4);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ErrorInsertar " + e);
        }
    }

    public void PedidoVenta(String date, String date2, String date3, String date4, String date5) {
        try {
            c.ps = c.con.prepareStatement("Insert into PedidoVenta values(?,?,?,?,?)");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.setString(3, date3);
            c.ps.setString(4, date4);
            c.ps.setString(5, date5);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ErrorInsertar " + e);
        }
    }

    public void Platillo(String date, String date2) {
        try {
            c.ps = c.con.prepareStatement("Insert into Platillo values(?,?)");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ErrorInsertar " + e);
        }
    }

    public void DetallePedidoVenta(String date, String date2, String date3, String date4) {
        try {
            c.ps = c.con.prepareStatement("Insert into DetallePedidoVenta values(?,?,?,?)");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.setString(3, date3);
            c.ps.setString(4, date4);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ErrorInsertar " + e);
        }
    }

    public void Producto(String date, String date2, String date3, String date4, String date5, String date6, String date7) {
        try {
            c.ps = c.con.prepareStatement("Insert into Producto values(?,?,?,?,?,?,?)");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.setString(3, date3);
            c.ps.setString(4, date4);
            c.ps.setString(5, date5);
            c.ps.setString(6, date6);
            c.ps.setString(7, date7);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ErrorInsertar " + e);
        }
    }

    public void RegistroAlmacen(String date, String date2, String date3, String date4, String date5, String date6) {
        try {
            c.ps = c.con.prepareStatement("Insert into RegistroAlmacen values(?,?,?,?,?,?)");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.setString(3, date3);
            c.ps.setString(4, date4);
            c.ps.setString(5, date5);
            c.ps.setString(6, date6);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ErrorInsertar " + e);
        }
    }

    public void DetallePedidoCompra(String date, String date2, String date3, String date4, String date5) {
        try {
            c.ps = c.con.prepareStatement("Insert into DetallePedidoCompra values(?,?,?,?,?)");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.setString(3, date3);
            c.ps.setString(4, date4);
            c.ps.setString(5, date5);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ErrorInsertar " + e);
        }
    }

    public void Proveedor(String date, String date2, String date3, String date4, String date5, String date6) {
        try {
            c.ps = c.con.prepareStatement("Insert into Proveedor values(?,?,?,?,?,?)");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.setString(3, date3);
            c.ps.setString(4, date4);
            c.ps.setString(5, date5);
            c.ps.setString(6, date6);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ErrorInsertar " + e);
        }
    }

    public void TipoPago(String date, String date2) {
        try {
            c.ps = c.con.prepareStatement("Insert into TipoPago values(?,?)");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ErrorInsertar " + e);
        }
    }

    public void ComprobantePago(String date, String date2, String date3, String date4, String date5, String date6) {
        try {
            
            c.ps = c.con.prepareStatement("Insert into ComprobantePago values(?,?,?,?,?,?)");
            c.ps.setString(1, date);
            c.ps.setString(2, date2);
            c.ps.setString(3, date3);
            c.ps.setString(4, date4);
            c.ps.setString(5, date5);
            c.ps.setString(6, date6);
            
            c.ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("ErrorInsertar " + e);
        }
    }

}
