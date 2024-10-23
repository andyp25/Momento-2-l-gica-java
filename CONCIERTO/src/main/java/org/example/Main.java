package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        String apellido;
        int costoBoleta = 450000;
        int cedula;
        int edad;
        int numeroBoletas;

        System.out.print("Ingrese su cédula: ");
        cedula = scanner.nextInt();
        System.out.print("Ingrese su nombre ");
        nombre = scanner.nextLine();
        System.out.println("y apellido");
        apellido = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();

        if (edad < 18) {
            System.out.println("Lo siento, debe tener al menos 18 años para comprar boletas.");
            return;
        }

        System.out.print("Ingrese su ciudad: ");
        scanner.nextLine();
        String ciudad = scanner.nextLine();

        System.out.print("Ingrese el número de boletas que desea adquirir: ");
        numeroBoletas = scanner.nextInt();

        if (numeroBoletas > 4) {
            System.out.println("Lo siento, solo puede comprar un máximo de 4 boletas.");
            return;
        }

        int costoTotal = numeroBoletas * costoBoleta;

        System.out.println("************************************");
        System.out.println("Resumen de la compra:");
        System.out.println("Cliente: " + nombre + " "+ apellido);
        System.out.println("Con cedula: " + cedula);
        System.out.println("Ubicado en la ciudad de: " + ciudad);
        System.out.println("Cantidad de boletas adqiridas: " + numeroBoletas);
        System.out.println("Costo total: $" + costoTotal);
        System.out.println("************************************");

    }
}