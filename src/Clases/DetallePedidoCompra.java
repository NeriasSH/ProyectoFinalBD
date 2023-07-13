/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author FAMILIA SH
 */
public class DetallePedidoCompra {

    String IdProducto;
    String IdPedidoCompra;
    String PrecioUnidad;
    String Cantidad;
    String Descuento;

    public DetallePedidoCompra(String IdProducto, String IdPedidoCompra, String PrecioUnidad, String Cantidad, String Descuento) {
        this.IdProducto = IdProducto;
        this.IdPedidoCompra = IdPedidoCompra;
        this.PrecioUnidad = PrecioUnidad;
        this.Cantidad = Cantidad;
        this.Descuento = Descuento;
    }

    public String getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(String IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getIdPedidoCompra() {
        return IdPedidoCompra;
    }

    public void setIdPedidoCompra(String IdPedidoCompra) {
        this.IdPedidoCompra = IdPedidoCompra;
    }

    public String getPrecioUnidad() {
        return PrecioUnidad;
    }

    public void setPrecioUnidad(String PrecioUnidad) {
        this.PrecioUnidad = PrecioUnidad;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getDescuento() {
        return Descuento;
    }

    public void setDescuento(String Descuento) {
        this.Descuento = Descuento;
    }

  
    

}
