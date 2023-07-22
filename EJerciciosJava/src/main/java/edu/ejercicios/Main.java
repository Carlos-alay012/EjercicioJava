package edu.ejercicios;

import edu.ejercicios.ejemplos.clsEjemplo1;
import edu.ejercicios.enclase.DiezEjercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        String varA, varB = "";
        int num = 0;
        int num1 = 0;
        try {
            BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Ingrese A: ");
            varA = lector.readLine();
            num = Integer.parseInt(varA);
            System.out.println("Ingrese B: ");
            varB = lector.readLine();
            num1 = Integer.parseInt(varB);
            System.out.println("Valor a = "+varA+"Valor B ="+varB);
        } catch (Exception ex) {
            System.out.println("Ingresó mal el dato");
        }

        clsEjemplo1 ej = new clsEjemplo1();
        ej.calculo(num, num1);

        DiezEjercicios ej1 = new DiezEjercicios();
        ej1.Area();
        ej1.Circunferencia();
        ej1.Volumen();
    }

}