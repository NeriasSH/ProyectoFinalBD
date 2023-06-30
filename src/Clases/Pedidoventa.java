/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author FAMILIA SH
 */
public class Pedidoventa {
    
    String IdPedidoVenta;
    String Fecha;
    String IdCliente;
    Float Total;
    String IdEmpleado;

    public Pedidoventa(String IdPedidoVenta, String Fecha, String IdCliente, Float Total, String IdEmpleado) {
        this.IdPedidoVenta = IdPedidoVenta;
        this.Fecha = Fecha;
        this.IdCliente = IdCliente;
        this.Total = Total;
        this.IdEmpleado = IdEmpleado;
    }

    public String getIdPedidoVenta() {
        return IdPedidoVenta;
    }

    public void setIdPedidoVenta(String IdPedidoVenta) {
        this.IdPedidoVenta = IdPedidoVenta;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(String IdCliente) {
        this.IdCliente = IdCliente;
    }

    public Float getTotal() {
        return Total;
    }

    public void setTotal(Float Total) {
        this.Total = Total;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(String IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

   
    
    
    
}
