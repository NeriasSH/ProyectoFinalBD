/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author USUARIO
 */
public class Cargo {
    
    private String IdCargo    ;          
    private String DescripcionCargo    ;

    public Cargo(String IdCargo, String DescripcionCargo) {
        this.IdCargo = IdCargo;
        this.DescripcionCargo = DescripcionCargo;
    }

    public String getIdCargo() {
        return IdCargo;
    }

    public void setIdCargo(String IdCargo) {
        this.IdCargo = IdCargo;
    }

    public String getDescripcionCargo() {
        return DescripcionCargo;
    }

    public void setDescripcionCargo(String DescripcionCargo) {
        this.DescripcionCargo = DescripcionCargo;
    }

}
