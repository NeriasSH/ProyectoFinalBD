/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author FAMILIA SH
 */
public class DetallePedidoVenta {

    String IdPlatillo;
    String IdPedidoVenta;
    int Cantidad;
    Float PrecioUnitario;

    public DetallePedidoVenta(String IdPlatillo, String IdPedidoVenta, int Cantidad, Float PrecioUnitario) {
        this.IdPlatillo = IdPlatillo;
        this.IdPedidoVenta = IdPedidoVenta;
        this.Cantidad = Cantidad;
        this.PrecioUnitario = PrecioUnitario;
    }

    public String getIdPlatillo() {
        return IdPlatillo;
    }

    public void setIdPlatillo(String IdPlatillo) {
        this.IdPlatillo = IdPlatillo;
    }

    public String getIdPedidoVenta() {
        return IdPedidoVenta;
    }

    public void setIdPedidoVenta(String IdPedidoVenta) {
        this.IdPedidoVenta = IdPedidoVenta;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Float getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(Float PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    

}
