/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

// Subclase Círculo
public class Circulo extends Formas {
    private double radio;

    // Constructor
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    // Método para dibujar un Círculo
    @Override
    public void dibujar() {
        System.out.println("Dibujando un Circulo");
    }

    // Método para calcular el radio
    public void calcularRadio() {
        System.out.println("El radio del circulo es: " + radio);
    }
}
