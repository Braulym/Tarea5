/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

// Subclase Línea
public class Linea extends Formas {
    private double largo;

    // Constructor
    public Linea(String color, double largo) {
        super(color);
        this.largo = largo;
    }

    // Método para dibujar una Línea
    @Override
    public void dibujar() {
        System.out.println("Dibujando una Linea");
    }
}
