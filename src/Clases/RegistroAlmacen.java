/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author FAMILIA SH
 */
public class RegistroAlmacen {
    String IdRegistroAlmacen;
    String IdProducto;
    int CantidadEntrada;
    String FechaEntrada;
    String FechaVencimiento;
    String IdEmpleado;

    public RegistroAlmacen(String IdRegistroAlmacen, String IdProducto, int CantidadEntrada, String FechaEntrada, String FechaVencimiento, String IdEmpleado) {
        this.IdRegistroAlmacen = IdRegistroAlmacen;
        this.IdProducto = IdProducto;
        this.CantidadEntrada = CantidadEntrada;
        this.FechaEntrada = FechaEntrada;
        this.FechaVencimiento = FechaVencimiento;
        this.IdEmpleado = IdEmpleado;
    }

    public String getIdRegistroAlmacen() {
        return IdRegistroAlmacen;
    }

    public void setIdRegistroAlmacen(String IdRegistroAlmacen) {
        this.IdRegistroAlmacen = IdRegistroAlmacen;
    }

    public String getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(String IdProducto) {
        this.IdProducto = IdProducto;
    }

    public int getCantidadEntrada() {
        return CantidadEntrada;
    }

    public void setCantidadEntrada(int CantidadEntrada) {
        this.CantidadEntrada = CantidadEntrada;
    }

    public String getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(String FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }

    public String getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(String FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(String IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }
    
}
