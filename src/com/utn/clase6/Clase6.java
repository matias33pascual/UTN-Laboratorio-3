/*
    Clase 6

    EJEMPLOS DE PARSE EN LOCALDATETIME
        * Pasar una fecha en String a LocalDate
        * Pasar una hora en String a LocalTime
        * Pasar una fecha y hora en String a LocalDateTime

    CONSTRUCTORES EN HERENCIA
        * Breve ejemplo con clases Persona y Empleado
        * Como utilizar clases que coinciden en sus nombres, pero estan en diferentes package
 */

package com.utn.clase6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clase6 {
    public static void init() {
        multiplesNombresDeClase();
    }

    public static void ejemploLocalDateParse() {
        String fechaComoString = "12/02/1985";
        LocalDate fecha = LocalDate.parse(fechaComoString, DateTimeFormatter.ofPattern("d/M/y"));
        System.out.println(fecha);

        System.out.println(fecha.format(DateTimeFormatter.ofPattern("d/M/y")));

        // un error comun: no corresponden los numeros de la fecha con los caracteres del formato
        // LocalDate fecha = LocalDate.parse("31/06/1985", DateTimeFormatter.ofPattern("y/M/d"));

    }
    public static void ejemploLocalTimeParse() {
        String horaComoString = "15:19:01";
        LocalTime time = LocalTime.parse(horaComoString, DateTimeFormatter.ofPattern("H:m:s"));

        String horaComoStringSinSegundos = "15:19";
        LocalTime timeSinSegundos = LocalTime.parse(horaComoStringSinSegundos, DateTimeFormatter.ofPattern("H:m"));

        System.out.println(time);
        System.out.println(timeSinSegundos);

        // un error comun: pasar la hora sin segundos, pero ponemos segundos en el formatter
        //LocalTime timeConError = LocalTime.parse(horaComoStringSinSegundos, DateTimeFormatter.ofPattern("H:m:s"));
    }
    public static void ejemploLocalDateTimeParse() {
        String string = "31/06/1987 15:15";
        LocalDateTime fechaHora = LocalDateTime.parse(string, DateTimeFormatter.ofPattern("d/M/y H:m"));

        System.out.println(fechaHora);

        // error comun: no concidir los espacios en el formatter
        // String string = "31/06/1987 15:15";
        // LocalDateTime fechaHora = LocalDateTime.parse(string, DateTimeFormatter.ofPattern("d/M/yH:m"));
    }
    public static void ejemploConstructoresPadreHijo() {
        Empleado empleado = new Empleado("matias", 36, "docente");
        System.out.println(empleado);
    }
    public static void multiplesNombresDeClase() {
        Persona personaClase6 = new Persona();

        com.utn.clase3.Persona personaClase3 = new com.utn.clase3.Persona();

        com.utn.clase2.Persona personaClase2 = new com.utn.clase2.Persona();

        // consejo: escribir Persona y seleccionar del autocompletado el que queremos usar
    }
}
