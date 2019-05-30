package com.UniversidadJava.Modificadores;

public class ImplemetaAritmetica
{
    public static void main(String[] args)
    {
        int valor1 = 6;
        int valor2 = 3;

        System.out.println("Primer valor: " + valor1 + "\nSegundo Valor: " + valor2);

        Aritmetica operacicones = new Aritmetica(valor1, valor2);

        System.out.println("Imprimiendo resultado de las  operaciones");
        System.out.println("Suma: " + operacicones.suma());
        System.out.println("Resta: " + operacicones.restar());
        System.out.println("Multiplicación: " + operacicones.multiplica());
        System.out.println("Division: " + operacicones.divide());

    }
}
