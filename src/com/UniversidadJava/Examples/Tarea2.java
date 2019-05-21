package com.UniversidadJava.Examples;

import java.util.Scanner;

public class Tarea2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona el titulo del Libro: ");
        var titulo = scanner.nextLine();

        System.out.println("Proporciona el autor del libro: ");
        //scanner.next();
        var autor = scanner.nextLine();

        System.out.println(titulo + " fue escrito por " + autor);
    }
}
