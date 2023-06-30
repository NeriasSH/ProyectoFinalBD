/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author FAMILIA SH
 */
public class EvaluacionDesempeño {
    String IdEvaluacion;
    String Fecha;
    String Resultado;
    String Comentarios;
    String IdEmpleado;

    public EvaluacionDesempeño(String IdEvaluacion, String Fecha, String Resultado, String Comentarios, String IdEmpleado) {
        this.IdEvaluacion = IdEvaluacion;
        this.Fecha = Fecha;
        this.Resultado = Resultado;
        this.Comentarios = Comentarios;
        this.IdEmpleado = IdEmpleado;
    }

    public void setIdEvaluacion(String IdEvaluacion) {
        this.IdEvaluacion = IdEvaluacion;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setResultado(String Resultado) {
        this.Resultado = Resultado;
    }

    public void setComentarios(String Comentarios) {
        this.Comentarios = Comentarios;
    }

    public void setIdEmpleado(String IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getIdEvaluacion() {
        return IdEvaluacion;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getResultado() {
        return Resultado;
    }

    public String getComentarios() {
        return Comentarios;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }
    
    
}
