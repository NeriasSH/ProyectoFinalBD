/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesReportes;

/**
 *
 * @author 82K2009TLM
 */
public class Compras {
    String idpedidocomp,idprod,nomprod,idproveedor,nombreempres,cantidad,preciounid,descuento,total;

    public Compras(String idpedidocomp, String idprod, String nomprod, String idproveedor, String nombreempres, String cantidad, String preciounid, String descuento, String total) {
        this.idpedidocomp = idpedidocomp;
        this.idprod = idprod;
        this.nomprod = nomprod;
        this.idproveedor = idproveedor;
        this.nombreempres = nombreempres;
        this.cantidad = cantidad;
        this.preciounid = preciounid;
        this.descuento = descuento;
        this.total = total;
    }

    public String getIdpedidocomp() {
        return idpedidocomp;
    }

    public String getIdprod() {
        return idprod;
    }

    public String getNomprod() {
        return nomprod;
    }

    public String getIdproveedor() {
        return idproveedor;
    }

    public String getNombreempres() {
        return nombreempres;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getPreciounid() {
        return preciounid;
    }

    public String getDescuento() {
        return descuento;
    }

    public String getTotal() {
        return total;
    }
    
}
