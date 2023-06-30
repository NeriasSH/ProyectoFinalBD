/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author FAMILIA SH
 */
public class Pagoempleado {
    String IdPago;
    String Fecha;
    Float Monto;
    String IdEmpleado;

    public Pagoempleado(String IdPago, String Fecha, Float Monto, String IdEmpleado) {
        this.IdPago = IdPago;
        this.Fecha = Fecha;
        this.Monto = Monto;
        this.IdEmpleado = IdEmpleado;
    }

    public String getIdPago() {
        return IdPago;
    }

    public void setIdPago(String IdPago) {
        this.IdPago = IdPago;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public Float getMonto() {
        return Monto;
    }

    public void setMonto(Float Monto) {
        this.Monto = Monto;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(String IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

   

   
    
}
