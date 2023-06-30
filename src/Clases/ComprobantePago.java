/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author FAMILIA SH
 */
public class ComprobantePago {

    String NroComprobante;
    String IdPedidoVenta;
    Float IGV;
    Float ImporteTotal;
    String IdFormaPago;
    String IdTipoPago;

    public ComprobantePago(String NroComprobante, String IdPedidoVenta, Float IGV, Float ImporteTotal, String IdFormaPago, String IdTipoPago) {
        this.NroComprobante = NroComprobante;
        this.IdPedidoVenta = IdPedidoVenta;
        this.IGV = IGV;
        this.ImporteTotal = ImporteTotal;
        this.IdFormaPago = IdFormaPago;
        this.IdTipoPago = IdTipoPago;
    }

    public String getNroComprobante() {
        return NroComprobante;
    }

    public void setNroComprobante(String NroComprobante) {
        this.NroComprobante = NroComprobante;
    }

    public String getIdPedidoVenta() {
        return IdPedidoVenta;
    }

    public void setIdPedidoVenta(String IdPedidoVenta) {
        this.IdPedidoVenta = IdPedidoVenta;
    }

    public Float getIGV() {
        return IGV;
    }

    public void setIGV(Float IGV) {
        this.IGV = IGV;
    }

    public Float getImporteTotal() {
        return ImporteTotal;
    }

    public void setImporteTotal(Float ImporteTotal) {
        this.ImporteTotal = ImporteTotal;
    }

    public String getIdFormaPago() {
        return IdFormaPago;
    }

    public void setIdFormaPago(String IdFormaPago) {
        this.IdFormaPago = IdFormaPago;
    }

    public String getIdTipoPago() {
        return IdTipoPago;
    }

    public void setIdTipoPago(String IdTipoPago) {
        this.IdTipoPago = IdTipoPago;
    }
    
    
}
