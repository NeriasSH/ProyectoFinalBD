/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author FAMILIA SH
 */
public class Empleado {
    String IdEmpleado;
    String Apellidos;
    String Nombre;
    String FechaContratacion;
    String Direccion;
    String Telefono;
    String Ciudad;
    String IdCargo;
    String IdHorario;

    public Empleado(String IdEmpleado, String Apellidos, String Nombre, String FechaContratacion, String Direccion, String Telefono, String Ciudad, String IdCargo, String IdHorario) {
        this.IdEmpleado = IdEmpleado;
        this.Apellidos = Apellidos;
        this.Nombre = Nombre;
        this.FechaContratacion = FechaContratacion;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Ciudad = Ciudad;
        this.IdCargo = IdCargo;
        this.IdHorario = IdHorario;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(String IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFechaContratacion() {
        return FechaContratacion;
    }

    public void setFechaContratacion(String FechaContratacion) {
        this.FechaContratacion = FechaContratacion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getIdCargo() {
        return IdCargo;
    }

    public void setIdCargo(String IdCargo) {
        this.IdCargo = IdCargo;
    }

    public String getIdHorario() {
        return IdHorario;
    }

    public void setIdHorario(String IdHorario) {
        this.IdHorario = IdHorario;
    }
    
    
}
