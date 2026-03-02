package com.mycompany.mavenprojectonce;

import java.util.Scanner;

public class Mavenprojectonce {

    public static void main(String[] args) {
        // 1. Crear matriz de 3 filas y 4 columnas
        int[][] asientos = new int[3][4];
        Scanner leer = new Scanner(System.in);

        // 2. Solicitar datos al usuario
        System.out.println("Ingrese fila (0 a 2):");
        int f = leer.nextInt();
        
        System.out.println("Ingrese columna (0 a 3):");
        int c = leer.nextInt();

        // 3. Marcar el asiento como ocupado (1)
        if (f >= 0 && f <= 2 && c >= 0 && c <= 3) {
            asientos[f][c] = 1;
        } else {
            System.out.println("Error: Coordenadas inválidas.");
        }

        // 4. Mostrar el estado de la sala
        System.out.println("Estado de la sala:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println();
        }
        
        leer.close(); // Esto quita el foco amarillo
    }
}   