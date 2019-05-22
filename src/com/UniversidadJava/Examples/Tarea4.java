package com.UniversidadJava.Examples;

import java.util.Scanner;

public class Tarea4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa el ancho del rectangulo");
        int ancho = Integer.parseInt(scanner.nextLine());
        System.out.println("ingresa el alto del rectangulo");
        int alto = Integer.parseInt(scanner.nextLine());

        System.out.println("Area: " + (ancho*alto));
        System.out.println("Perimetro: " + ((ancho + alto)*2));
    }
}
