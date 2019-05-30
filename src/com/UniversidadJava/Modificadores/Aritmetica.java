package com.UniversidadJava.Modificadores;

public class Aritmetica
{
    int varA,varB;

    /* INICIO CONSTRUCTORES */
    Aritmetica()
    {

    }

    Aritmetica(int varA, int varB)
    {
        this.varA = varA;
        this.varB = varB;
    }

    /* FIN CONSTRUCTORES */

    // METODO DE SUMAR
    int suma()
    {
        return  varA + varB;
    }

    // METODO DE RESTAR
    int restar()
    {
        return varA - varB;

    }

    // METOD DE MULTIPLICAR
    int multiplica()
    {
        return varA * varB;
    }

    int divide()
    {
        return varA / varB;
    }
}
