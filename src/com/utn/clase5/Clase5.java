/*
    Clase 5

    ORGANIZAR REGIONES EN EL CODIGO
        * Region

    FOR vs FOREACH
        * Diferencias en la asignacion

    LOCALDATE
        * Utilizacion
        * Metodo now()
        * Metodo plus()
        * Ejemplo de otros metodos

        explicacion de java y el tiempo
        https://javautodidacta.es/tiempo-en-java-localdate-localtime/

        documentacion de referencia de LocalDate
        https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html

        documentacion de referencia de DateTimeFormatter
        https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

    UUID
        * Concepto
        * Utilizacion
        * substring para acortar el numero. Propuesto por alumno

        Explicacion y documentacion de referencia
        https://www.baeldung.com/java-uuid
        https://docs.oracle.com/javase/7/docs/api/java/util/UUID.html

    UML
        * Asociacion y composicion en UML
        * Breve explicacion de herencia en UML
        * Ejemplo con clases libro y autor

        Explicacion de como hacer un diagrama UML y breve explicacion de los conceptos
        herencia y composicion
        https://www.youtube.com/watch?v=Z0yLerU0g-Q&ab_channel=LucidchartEspa%C3%B1ol

    HERENCIA
        * Introduccion a herencia
 */

package com.utn.clase5;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;
import java.util.UUID;

public class Clase5 {
    public static void init() {
        Libro libro = new Libro();
        System.out.println(libro.toString());
    }

    public static void forVsForeach() {
        // el objetivo es cambiar todos los nombres por usuario

        String[] nombres = {"matias","daniel","pascual","mat"};

        // utilizando foreach
        for (String nombre : nombres) {
            nombre = "usuario";
        }

        // comprobamos que la asignacion no ocurre
        System.out.println("con for: " + '\n' + Arrays.toString(nombres));

        // utilizando for
        for(int i = 0; i < nombres.length; i++) {
            nombres[i] = "usuario";
        }

        // ocurre la asignacion
        System.out.println('\n' + "con foreach: " + '\n' + Arrays.toString(nombres));
    }

    public static void region() {
        // region aca comienza una region

        // este codigo sera colapsado
        // este codigo sera colapsado
        // este codigo sera colapsado
        // este codigo sera colapsado
        // este codigo sera colapsado

        // endregion
    }

    public static void localDateTime() {
        // LOCALDATE, LOCALTIME, LOCALDATETIME

        // no podemos instanciarlas porque sus
        // constructores son privados

        // LocalDateTime ejemplo = new LocalDateTime(); // error

        // utilizamos el metodo now() para saber :

        // hora actual
        LocalTime horaActual = LocalTime.now();

        // dia actual
        LocalDate diaActual = LocalDate.now();

        // hora y dia actuales
        LocalDateTime diaHoraActual = LocalDateTime.now();

        // mostramos los valores
        System.out.println("hora: " + horaActual);
        System.out.println("dia: " + diaActual);
        System.out.println("dia y hora: " + diaHoraActual);

        // no hay que mezclar los tipos de dato
        // LocalDateTime ejemplo = LocalTime.now(); // error

        // --------------------------------------------------

        // DANDO FORMATO A LA FECHA PARA MOSTRARLA

        // usando el formato ISO

        LocalDateTime fecha = LocalDateTime.now();

        // ejemplo usando el formato ISO para LocalDateTime
        DateTimeFormatter formatterISO = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        // usamos el metodo format de fecha y le pasamos el formatter como parametro
        System.out.println("con formatter ISO: " + fecha.format(formatterISO));

        // --------------------------------------------------

        // usando el formato ofPatterns

        // creamos un patron
        DateTimeFormatter formatterOfPatterns = DateTimeFormatter.ofPattern("d/M/u , h:m:s a");
        // no podemos usar letras que no sean parte del patron o tendremos un error
        // para escribir texto dentro del patron, debemos utilizar comillas simples
        // ver ejemplo de parse, mas abajo

        // mostramos usando ese formato
        System.out.println(fecha.format(formatterOfPatterns));

        // --------------------------------------------------

        // usando parse

        // parse nos permite convertir una cadena de texto a una fecha

        // utilizamos comillas simples para separar el texto de las letras del patron
        DateTimeFormatter formatterParse = DateTimeFormatter.ofPattern("'hoy es:' d/M/u. 'Son las' h:m a");

        // supongamos que tenemos una fecha en formato string
        String fechaString = fecha.toString();

        // podemos utilizar parse para convertir esa fecha en un objeto LocalDateTime
        LocalDateTime nuevaFecha = LocalDateTime.parse(fechaString);
        System.out.println("Fecha creada desde String: " + nuevaFecha);

        // ahora podemos mostrar esa fecha usando otro formato
        System.out.println("Usando parse: " + nuevaFecha.format(formatterParse));
    }

    public static void plus() {
        LocalDateTime fecha = LocalDateTime.now();

        // agregando dias
        fecha.plusDays(10);

        // agregando meses
        fecha.plusMonths(2);

        // podemos agregar muchos otros valores utilizando sus metodos
        // si escribimos fecha.plus , el autocompletado nos muestra todas
        // las opciones que tenemos para agregarle a la fecha
    }

    public static void otrosMetodos() {
        // SABER QUE FECHA VIENE ANTES QUE OTRA

        LocalDateTime fecha = LocalDateTime.now();
        LocalDateTime fecha2 = LocalDateTime.now().plusDays(2);

        if (fecha.isBefore(fecha2)) {
            System.out.println(fecha.format(DateTimeFormatter.ofPattern("d/M/u")) +
                    " es anterior a " +
                    fecha2.format(DateTimeFormatter.ofPattern("d/M/u"))
            );
        } else {
            System.out.println(fecha.format(DateTimeFormatter.ofPattern("d/M/u")) +
                    " es posterior a " +
                    fecha2.format(DateTimeFormatter.ofPattern("d/M/u"))
            );
        }

        // -------------------------------------------------------------------------

        // OBTENER EL DIA DE LA FECHA
        System.out.println("hoy es " + fecha.getDayOfMonth());

        // OBTENER EL MES DE LA FECHA
        System.out.println("de " + fecha.getMonth());
    }

    public static void uuid() {
        // nos da un valor de 128 bits que es unico y nos permite diferenciar objetos entre si
        UUID uuid = UUID.randomUUID();

        System.out.println("uuid: " + uuid);

        // acortando el valor a los primeros 10 caracteres
        System.out.println("uuid acortado: " + uuid.toString().substring(0, 10));

        // otras cosas que podemos hacer con el formato del uuid
        System.out.println("cambiando el formato: " + uuid.toString().substring(0,10).toUpperCase(Locale.ROOT).replace('-', '0'));
    }
}
