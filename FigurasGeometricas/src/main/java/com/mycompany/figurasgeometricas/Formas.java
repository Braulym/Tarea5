/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

// Superclase Formas
public class Formas {
    protected String color;

    // Constructor
    public Formas(String color) {
        this.color = color;
    }

    // Método para establecer el color
    public void establecerColor(String nuevoColor) {
        this.color = nuevoColor;
    }

    // Método para dibujar (será sobrescrito en subclases)
    public void dibujar() {
        System.out.println("Dibujando una forma");
    }
}
