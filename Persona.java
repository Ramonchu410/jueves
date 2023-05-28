/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema8;

/**
 *
 * @author Susana Rosa <susana.rosa@murciaeduca.es>
 */
public class Persona implements Comparable<Persona>{
    private String nombre;
    private int edad;
    private float altura;

    
    public Persona(String nombre, int edad, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + '}';
    }

    @Override
    public int compareTo(Persona o) {
        return this.nombre.compareTo(o.nombre);

    }
    
}
