/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author FAMILIA SH
 */
public class Formapago {
    String IdFormaPago;
    String Descripcion;

    public Formapago(String IdFormaPago, String Descripcion) {
        this.IdFormaPago = IdFormaPago;
        this.Descripcion = Descripcion;
    }

    public String getIdFormaPago() {
        return IdFormaPago;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setIdFormaPago(String IdFormaPago) {
        this.IdFormaPago = IdFormaPago;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
}
