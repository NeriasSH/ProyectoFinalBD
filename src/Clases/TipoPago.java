/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author FAMILIA SH
 */
public class TipoPago {

    String IdTipoPago;
    String Descripción;

    public TipoPago(String IdTipoPago, String Descripción) {
        this.IdTipoPago = IdTipoPago;
        this.Descripción = Descripción;
    }

    public String getIdTipoPago() {
        return IdTipoPago;
    }

    public void setIdTipoPago(String IdTipoPago) {
        this.IdTipoPago = IdTipoPago;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }

    
}
