package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leerTeclado = new Scanner(System.in);

        String nombreApellidoCliente;
        String tipoCliente;
        int cantidadArticulos;
        double precioTotal;


        System.out.println("*********************");
        System.out.println("Bienvenido a MODA EXPRESS");
        System.out.println("**********************");

        System.out.print("Ingresa tu nombre y apellido: ");
        nombreApellidoCliente = leerTeclado.nextLine();

        System.out.print("Que tipo de cliente eres: ");
        tipoCliente = leerTeclado.nextLine();

        System.out.print("Cuantos articulos desea comprar?: ");
        cantidadArticulos = leerTeclado.nextInt();

        System.out.print("Introduce el precio total de la compra sin descuento: ");
        precioTotal = leerTeclado.nextDouble();

        double descuento = 0;

        if (tipoCliente.equalsIgnoreCase("Regular")) {
            if (cantidadArticulos >=1 && cantidadArticulos <=3){
                descuento = 0.05;
            }else if (cantidadArticulos >=4 && cantidadArticulos <=6){
                descuento = 0.10;
            }else if (cantidadArticulos >6){
                descuento = 0.15;
            }
        }else if (tipoCliente.equalsIgnoreCase("VIP")){
            if (cantidadArticulos >=1 && cantidadArticulos <=3){
                descuento = 0.10;
            }else if (cantidadArticulos >=4 && cantidadArticulos <=6){
                descuento = 0.15;
            }else if (cantidadArticulos >6){
                descuento = 0.20;
            }
        }

        double precioConDescuento = precioTotal * descuento;
        double totalPagar = precioTotal - precioConDescuento;

        System.out.println("Querido cliente " + nombreApellidoCliente);
        System.out.println("Su descuento fue de: "+ descuento + "%");
        System.out.println("su descuento es de: $" + precioConDescuento);
        System.out.println("Total a pagar: $" + totalPagar);





    }
}