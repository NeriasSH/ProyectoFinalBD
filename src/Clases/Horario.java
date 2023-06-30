/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author FAMILIA SH
 */
public class Horario {
    
    String IdHorario;
    String HorarioInicio;
    String HorarioFinal       ; 

    public Horario(String IdHorario, String HorarioInicio, String HorarioFinal) {
        this.IdHorario = IdHorario;
        this.HorarioInicio = HorarioInicio;
        this.HorarioFinal = HorarioFinal;
    }

    public void setIdHorario(String IdHorario) {
        this.IdHorario = IdHorario;
    }

    public void setHorarioInicio(String HorarioInicio) {
        this.HorarioInicio = HorarioInicio;
    }

    public void setHorarioFinal(String HorarioFinal) {
        this.HorarioFinal = HorarioFinal;
    }

    public String getIdHorario() {
        return IdHorario;
    }

    public String getHorarioInicio() {
        return HorarioInicio;
    }

    public String getHorarioFinal() {
        return HorarioFinal;
    }


    
}
