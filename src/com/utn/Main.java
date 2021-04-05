/*
    UTN
    Tecnicatura Universitaria en Programacion
    Programacion y Laboratorio de computacion 3
    Comision 4
    Prof. Matias Pascual
*/

package com.utn;

import com.utn.clase1.Clase1;
import com.utn.clase2.Clase2;
import com.utn.clase3.Clase3;
import com.utn.clase4.Clase4;
import com.utn.clase5.Clase5;
import com.utn.clase6.Clase6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        final int NUMERO = 10;

        // NUMERO += 20; // error: NUMERO es una constante
        // Clase6.ADMIN = 20; // error: ADMIN es una constante

        Clase6.init();
    }
}
