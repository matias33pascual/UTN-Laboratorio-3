package com.utn.borrador;

import java.util.*;

class MiPersona {
    public int id;

    public MiPersona(int id) {
        this.id = id;
    }
}

public class Borrador {

    public static void init() {
        MiPersona persona1 = new MiPersona(0);
        MiPersona persona2 = new MiPersona(1);
        MiPersona persona3 = new MiPersona(2);
        MiPersona persona4 = new MiPersona(3);

        List<MiPersona> lista = new ArrayList<>();

        lista.add(persona3);
        lista.add(persona4);
        lista.add(persona1);
        lista.add(persona2);

        for(var persona : lista) {
            System.out.println(persona.id);
        }

        lista.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((MiPersona)o1).id - ((MiPersona)o2).id;
            }
        });

        for(var persona : lista) {
            System.out.println(persona.id);
        }

        Map<Integer, String> map = new HashMap<>();




    }

}
