/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

// Subclase Cuadrado
public class Cuadrado extends Formas {
    private double lado;

    // Constructor
    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    // Método para dibujar un Cuadrado
    @Override
    public void dibujar() {
        System.out.println("Dibujando un Cuadrado");
    }

    // Método para calcular el área del cuadrado
    public void calcularArea() {
        double area = lado * lado;
        System.out.println("El area del cuadrado es: " + area);
    }
}
