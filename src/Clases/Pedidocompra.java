/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author FAMILIA SH
 */
public class Pedidocompra {
    
    String IdPedidoCompra;
    String FechaPedido;
    String FechaEntrega;
    String Total;

    public Pedidocompra(String IdPedidoCompra, String FechaPedido, String FechaEntrega, String Total) {
        this.IdPedidoCompra = IdPedidoCompra;
        this.FechaPedido = FechaPedido;
        this.FechaEntrega = FechaEntrega;
        this.Total = Total;
    }

    public String getIdPedidoCompra() {
        return IdPedidoCompra;
    }

    public void setIdPedidoCompra(String IdPedidoCompra) {
        this.IdPedidoCompra = IdPedidoCompra;
    }

    public String getFechaPedido() {
        return FechaPedido;
    }

    public void setFechaPedido(String FechaPedido) {
        this.FechaPedido = FechaPedido;
    }

    public String getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(String FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    

   
    
    
}
