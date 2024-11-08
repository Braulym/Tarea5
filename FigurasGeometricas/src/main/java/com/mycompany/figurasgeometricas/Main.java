/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de cada figura
        Circulo circulo = new Circulo("Rojo", 5.0);
        Linea linea = new Linea("Azul", 10.0);
        Triangulo triangulo = new Triangulo("Verde", 45.0);
        Cuadrado cuadrado = new Cuadrado("Amarillo", 4.0);

        // Llamar a los métodos dibujar y otros específicos de cada figura
        circulo.dibujar();
        circulo.calcularRadio();

        linea.dibujar();

        triangulo.dibujar();
        triangulo.calcularArea();

        cuadrado.dibujar();
        cuadrado.calcularArea();
    }
}
