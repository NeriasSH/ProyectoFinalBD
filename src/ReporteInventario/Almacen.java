/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReporteInventario;

/**
 *
 * @author 82K2009TLM
 */
public class Almacen {
    String idprod,nombprod,cantporunidad,preciounidad,fechavencimiento,unidadexistencia,cantidadentrada;

    public Almacen(String idprod, String nombprod, String cantporunidad, String preciounidad, String fechavencimiento, String unidadexistencia, String cantidadentrada) {
        this.idprod = idprod;
        this.nombprod = nombprod;
        this.cantporunidad = cantporunidad;
        this.preciounidad = preciounidad;
        this.fechavencimiento = fechavencimiento;
        this.unidadexistencia = unidadexistencia;
        this.cantidadentrada = cantidadentrada;
    }

    public String getIdprod() {
        return idprod;
    }

    public String getNombprod() {
        return nombprod;
    }

    public String getCantporunidad() {
        return cantporunidad;
    }

    public String getPreciounidad() {
        return preciounidad;
    }

    public String getFechavencimiento() {
        return fechavencimiento;
    }

    public String getUnidadexistencia() {
        return unidadexistencia;
    }

    public String getCantidadentrada() {
        return cantidadentrada;
    }
    
}
