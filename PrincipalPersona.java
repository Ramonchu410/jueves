/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema8;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Susana Rosa <susana.rosa@murciaeduca.es>
 */
public class PrincipalPersona {

    public static void main(String[] args) {
        Persona p1 = new Persona("Jaime", 18, 180);
        Persona p2 = new Persona("Luis", 13, 170);
        Persona p3 = new Persona("Amparo", 46, 150);
        Persona[] lista = {p1, p2, p3};
        System.out.println(Arrays.toString(lista));
        Arrays.sort(lista);
        System.out.println(Arrays.toString(lista));
        Arrays.sort(lista, new OrdenarPersonaEdad());
        System.out.println(Arrays.toString(lista));
        //Arrays.sort(lista, new OrdenarPersonaAltura());
        Arrays.sort(lista, new Comparator<Persona>() {
            public int compare(Persona o1, Persona o2) {
                if (o1.getAltura() < o2.getAltura()) {
                    return -1;
                } else if (o1.getAltura() > o2.getAltura()) {
                    return 1;
                }
                return 0;
            }
        });
        System.out.println(Arrays.toString(lista));

    }
}
