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
    Float PrecioUnidad;
    int Cantidad;
    Float Descuento;

    public DetallePedidoCompra(String IdProducto, String IdPedidoCompra, Float PrecioUnidad, int Cantidad, Float Descuento) {
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

    public Float getPrecioUnidad() {
        return PrecioUnidad;
    }

    public void setPrecioUnidad(Float PrecioUnidad) {
        this.PrecioUnidad = PrecioUnidad;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Float getDescuento() {
        return Descuento;
    }

    public void setDescuento(Float Descuento) {
        this.Descuento = Descuento;
    }
    
    

}
