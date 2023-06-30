/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author FAMILIA SH
 */
public class Platillo {
    
    String IdPlatillo;
    String Descripcion;

    public Platillo(String IdPlatillo, String Descripcion) {
        this.IdPlatillo = IdPlatillo;
        this.Descripcion = Descripcion;
    }

    public String getIdPlatillo() {
        return IdPlatillo;
    }

    public void setIdPlatillo(String IdPlatillo) {
        this.IdPlatillo = IdPlatillo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
}
