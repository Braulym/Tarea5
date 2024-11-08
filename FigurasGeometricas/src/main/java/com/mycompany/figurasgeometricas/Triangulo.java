/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

// Subclase Triángulo
public class Triangulo extends Formas {
    private double angulo;

    // Constructor
    public Triangulo(String color, double angulo) {
        super(color);
        this.angulo = angulo;
    }

    // Método para dibujar un Triángulo
    @Override
    public void dibujar() {
        System.out.println("Dibujando un Triangulo");
    }

    // Método para calcular el área (detalle no implementado)
    public void calcularArea() {
        System.out.println("Calculo del area del triangulo ()");
    }
}
