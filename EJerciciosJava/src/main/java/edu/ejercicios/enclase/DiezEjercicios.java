package edu.ejercicios.enclase;
import java.util.*;
public class DiezEjercicios {

    public void Area()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo");
        double radio = scanner.nextDouble();

        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: "+ area);
    }
    public void Circunferencia ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo");
        double radio = scanner.nextDouble();

        double circun = 2 * Math.PI * radio;
        System.out.println("La circunferencia del círculo es: "+ circun);
    }
    public void Volumen (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base del cubo");
        double base = scanner.nextDouble();

        double volumen = Math.pow(base, 3);
        System.out.println("El volumen del cubo es de: "+ volumen);

    }
}
