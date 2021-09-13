package edu.uaslp.library.service;
import javax.swing.*;
import java.time.LocalDate;

public class Main
{
     public static void main(String []args){
          Fecha fechaNacimientoJuan = new Fecha(2011, Fecha.JULIO, 10);
          Fecha fechaIngresoJuan = new Fecha(2018, Fecha.AGOSTO, 25);

          Fecha fechaNacimientoMaria = new Fecha(2012, Fecha.ENERO, 10);
          Fecha fechaIngresoMaria = new Fecha(2017, Fecha.NOVIEMBRE, 15);

          Fecha fechaActual = new Fecha();
          LocalDate fecha=LocalDate.now();


          System.out.println("Hoy es: " + fecha);

          System.out.println("Juan nació el: " + fechaNacimientoJuan.format("dd/mm/yyyy") + ", hace " + fechaNacimientoJuan.tiempoTranscurridoenAnios(fechaActual) + " años");

          System.out.println("Maria nació el: " + fechaNacimientoMaria.format("dd/mm/yyyy") + ", hace " + fechaNacimientoMaria.tiempoTranscurridoenAnios(fechaActual) + " años");

          if(fechaNacimientoJuan.esAntes(fechaNacimientoMaria)){
               System.out.println("Juan nació " + fechaNacimientoJuan.tiempoTranscurridoenDias(fechaNacimientoMaria) +  " dias después de Maria");
          } else {
               System.out.println("Juan nació " + fechaNacimientoJuan.tiempoTranscurridoenDias(fechaNacimientoMaria) +  " dias antes de Maria");
          }

          if(fechaIngresoMaria.esDespues(fechaIngresoJuan)){
               System.out.println("Maria ingresó " + fechaNacimientoJuan.tiempoTranscurridoenDias(fechaNacimientoMaria) +  " días antes que Juan");
          } else {
               System.out.println("Maria ingresó " + fechaNacimientoJuan.tiempoTranscurridoenDias(fechaNacimientoMaria) +  " días después que Juan");
          }

          System.out.println("Desde que ingresó Juan en " + fechaIngresoJuan.format("yyyy-mm-dd") + " han pasado " + fechaActual.tiempoTranscurridoenAnios(fechaIngresoJuan) + " años");
          System.out.println("Desde que ingresó Maria en " + fechaIngresoMaria.format("yyyy-mm-dd") + " han pasado " + fechaActual.tiempoTranscurridoenAnios(fechaNacimientoMaria) + " años");
     }
}