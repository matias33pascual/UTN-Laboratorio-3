UTN
Tecnicatura Universitaria en Programacion
Programacion 3 y Laboratorio de computacion 3
Comision 4
Prof. Matias Pascual

En esta seccion encontrara los contenidos trabajados en 
cada clase. Los codigos estan organizados en packages,
ordenados segun su numero de clase.

BORRADOR:
    Utilizado solo para explicar contenidos en clase.

CLASE 1:
    INTRODUCCION A LA SINTAXIS DE JAVA
        * El 'Hola Mundo' en Java
        * Tipos de datos
        * Introducir datos usando la clase Scanner
        * Mostrar datos y String.format
        * Casteo para el ejercicio 1. Integer.valueOf(x)
        * Arreglos en Java

CLASE 2:
    CREANDO OBJETOS
        * getters y setters

    MODIFICADORES DE ACCESO: public, default y private.
        * Dentro de la misma clase: todos.
        * Dentro del mismo paquete: public, default.

CLASE 3:
   STATIC
        * atributos statics
        * metodos statics

   DIFERENCIAS ENTRE TIPOS PRIMITIVOS Y OBJETOS
        * Tipos primitivos
        * Objeto vs tipo primitivo
        * Objeto como parametro
        * Wrappers

CLASE 4:
    CONSTRUCTORES
        * Constructor vacio
        * Constructor con parametros
        * Poliformismo en los constructores
        * Ejemplo en la clase Autor

    STRING
        * String.format: https://www.javatpoint.com/java-string-format
        * Ejemplo de metodos
        * Arrays.toString()
        * Ejemplo de Arrays.sort() y Arrays.ToString()

    STRING BUILDER
        * https://docs.oracle.com/javase/tutorial/java/data/buffers.html
        * Utilizacion en la clase Libro para mostrar autores

CLASE 5:
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

CLASE 6:
    EJEMPLOS DE PARSE EN LOCALDATETIME
        * Pasar una fecha en String a LocalDate
        * Pasar una hora en String a LocalTime
        * Pasar una fecha y hora en String a LocalDateTime

    CONSTRUCTORES EN HERENCIA
        * Breve ejemplo con clases Persona y Empleado
        * Como utilizar clases que coinciden en sus nombres, pero estan en diferentes package

    CONSTANTES
        * atributos final

CLASE 7:
    HERENCIA
        * Herencia en UML
        * Constructores con herencia
        * Clase abstracta y metodos abstractos
        * Sobreescritura de metodos
        * Ejemplo de herencia de una clase que hereda de otra clase
        * Diferencia entre super y this
        * Modificador de acceso: protected
        * Clase Object

        Referencias utiles:

        constructores y super:
        https://www.arquitecturajava.com/java-constructores-y-super/

        clase object:
        https://javadesdecero.es/clases/object/

CLASE 8:
    THIS y SUPER EN HERENCIA DURANTE EL RUNTIME (ejecucion del programa)
        * ejemplos en clases Persona y Empleado
        * uso de metodos publicos
        * uso de metodos privados
        * uso de atributos

    REFERENCIAS POLIMORFICAS
        * ejemplo con Object y Persona
        * instance of
        * utilizando referencias y casteos

    CLASES FINAL y ABSTRACT
        * diferencia entre final y abstract
        * ejemplos de uso

CLASE 9:
    COLLECTIONS
        * List
            _ ArrayList : https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
            _ LinkedList : https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
            _ Vector : https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html
            _ Stack : https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html
            _ Map : https://docs.oracle.com/javase/8/docs/api/java/util/Map.html

        * Iterator : https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

    Referencias:
    https://www.javatpoint.com/collections-in-java#:~:text=The%20Collection%20in%20Java%20is,a%20single%20unit%20of%20objects.
    https://www.adictosaltrabajo.com/2015/09/25/introduccion-a-colecciones-en-java/
    https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html