package com.utn.borrador;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Borrador {
    private int hora;
    private int minuto;
    private int segundo;

    public static void init() {
        //Empleado empleado = new Empleado();

        String fecha = "2021-04-12";

        LocalDate nuevaFecha = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("y-M-d"));

        System.out.println(nuevaFecha.toString());
    }



}
