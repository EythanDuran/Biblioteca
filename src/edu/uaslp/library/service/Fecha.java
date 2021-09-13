package edu.uaslp.library.service;

import java.time.LocalDate;
import java.time.Period;

public class Fecha {

    public static final int JULIO=7;
    public static final int AGOSTO=8;
    public static final int ENERO=1;
    public static final int NOVIEMBRE=11;

    private int anio;
    private int mes;
    private int dia;




    public Fecha() {
        LocalDate ffecha = LocalDate.now();
    }

    public Fecha(int anio, int mes, int dia) {
        this.anio = anio;

        if(mes>=1&&mes<=12)
        this.mes = mes;

        if((mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)&&dia<=31)
        this.dia = dia;

        else if((mes==4||mes==6||mes==9||mes==11)&&dia<=30)
            this.dia=dia;
        else if(mes==2){
            if(anio%4==0&&dia<=29)
                this.dia=dia;
            else if(dia<=28)
                this.dia=dia;
        }
    }

    public boolean  esAntes(Fecha fecha){

        return true;
    }
    public boolean  esDespues(Fecha fecha){

        return false;
    }


    public int tiempoTranscurridoenDias(Fecha fecha){

        return 0;
    }
    public int tiempoTranscurridoenAnios(Fecha fecha){
        LocalDate fechaNacimientoJuan =LocalDate.of(2011,JULIO,10);
        LocalDate hoy=LocalDate.now();
        Period period=Period.between(fechaNacimientoJuan,hoy);
        System.out.println("Diferencia en años Juan: " +period.getYears());

        LocalDate fechaNacimientoMaria =LocalDate.of(2012,ENERO,10);
        LocalDate hoy1=LocalDate.now();
        Period period1=Period.between(fechaNacimientoMaria,hoy1);
        System.out.println("Diferencia en años Maria: " +period1.getYears());
        return 0;
    }

    public String format(String formato) {
        if(Esvalido())
            return this.dia+"/"+this.mes+"/"+this.anio;
        return "fecha invalida";
    }
    public boolean Esvalido(){
        if(anio==0||mes==0||dia==0)
            return false;

        return true;
    }

    public boolean  esMismoDia(Fecha fecha){
        return false;
    }
    public void avanzaDia(int dia){}
    public void retrocedeDia(int dia){}

}

;