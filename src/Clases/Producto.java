/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author FAMILIA SH
 */
public class Producto {

    String IdProducto;
    String NombreProducto;
    String CantidadPorUnidad;
    String PrecioUnidad;
    String IdProveedor;
    String IdCategoria;
    String UnidadesEnExistencia;

    public Producto(String IdProducto, String NombreProducto, String CantidadPorUnidad, String PrecioUnidad, String IdProveedor, String IdCategoria, String UnidadesEnExistencia) {
        this.IdProducto = IdProducto;
        this.NombreProducto = NombreProducto;
        this.CantidadPorUnidad = CantidadPorUnidad;
        this.PrecioUnidad = PrecioUnidad;
        this.IdProveedor = IdProveedor;
        this.IdCategoria = IdCategoria;
        this.UnidadesEnExistencia = UnidadesEnExistencia;
    }

    public String getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(String IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public String getCantidadPorUnidad() {
        return CantidadPorUnidad;
    }

    public void setCantidadPorUnidad(String CantidadPorUnidad) {
        this.CantidadPorUnidad = CantidadPorUnidad;
    }

    public String getPrecioUnidad() {
        return PrecioUnidad;
    }

    public void setPrecioUnidad(String PrecioUnidad) {
        this.PrecioUnidad = PrecioUnidad;
    }

    public String getIdProveedor() {
        return IdProveedor;
    }

    public void setIdProveedor(String IdProveedor) {
        this.IdProveedor = IdProveedor;
    }

    public String getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(String IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public String getUnidadesEnExistencia() {
        return UnidadesEnExistencia;
    }

    public void setUnidadesEnExistencia(String UnidadesEnExistencia) {
        this.UnidadesEnExistencia = UnidadesEnExistencia;
    }

  

    
}
