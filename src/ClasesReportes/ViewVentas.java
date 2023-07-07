/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesReportes;

/**
 *
 * @author USUARIO
 */
public class ViewVentas {
    
    String Codig_Venta;
    String Clientes;
    String Platillo;
    String FormaPago;
    String TipoPago;
    Float Cantidad;
    Float PrecioUnitario;
    Float Total;
    Float IGV;
    Float ImporteT;

    public ViewVentas(String Codig_Venta, String Clientes, String Platillo, String FormaPago, String TipoPago, Float Cantidad, Float PrecioUnitario, Float Total, Float IGV, Float ImporteT) {
        this.Codig_Venta = Codig_Venta;
        this.Clientes = Clientes;
        this.Platillo = Platillo;
        this.FormaPago = FormaPago;
        this.TipoPago = TipoPago;
        this.Cantidad = Cantidad;
        this.PrecioUnitario = PrecioUnitario;
        this.Total = Total;
        this.IGV = IGV;
        this.ImporteT = ImporteT;
    }

    public String getCodig_Venta() {
        return Codig_Venta;
    }

    public void setCodig_Venta(String Codig_Venta) {
        this.Codig_Venta = Codig_Venta;
    }

    public String getClientes() {
        return Clientes;
    }

    public void setClientes(String Clientes) {
        this.Clientes = Clientes;
    }

    public String getPlatillo() {
        return Platillo;
    }

    public void setPlatillo(String Platillo) {
        this.Platillo = Platillo;
    }

    public String getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(String FormaPago) {
        this.FormaPago = FormaPago;
    }

    public String getTipoPago() {
        return TipoPago;
    }

    public void setTipoPago(String TipoPago) {
        this.TipoPago = TipoPago;
    }

    public Float getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Float Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Float getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(Float PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public Float getTotal() {
        return Total;
    }

    public void setTotal(Float Total) {
        this.Total = Total;
    }

    public Float getIGV() {
        return IGV;
    }

    public void setIGV(Float IGV) {
        this.IGV = IGV;
    }

    public Float getImporteT() {
        return ImporteT;
    }

    public void setImporteT(Float ImporteT) {
        this.ImporteT = ImporteT;
    }
    
    
}
