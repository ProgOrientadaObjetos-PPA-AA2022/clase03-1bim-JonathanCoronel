/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutable05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();

        System.out.println("Ingrese el Nombre");
        String nombre = entrada.nextLine();
        h1.establecerNombre(nombre);

        System.out.println("Ingrese el Numero de camas");
        int numero = entrada.nextInt();
        h1.establecerNumeroCamas(numero);

        System.out.println("Ingrese el presupuesto 1");
        double valor1 = entrada.nextDouble();
        h1.establecerPresupuesto(valor1);
        entrada.nextLine();

        System.out.println("Ingrese el Nombre");
        nombre = entrada.nextLine();
        h2.establecerNombre(nombre);

        System.out.println("Ingrese el Numero de camas");
        numero = entrada.nextInt();
        h2.establecerNumeroCamas(numero);

        System.out.println("Ingrese el presupuesto 2");
        valor1 = entrada.nextDouble();
        h2.establecerPresupuesto(valor1);
        entrada.nextLine();

        System.out.println("Ingrese el Nombre");
        nombre = entrada.nextLine();
        h3.establecerNombre(nombre);

        System.out.println("Ingrese el Numero de camas");
        numero = entrada.nextInt();
        h3.establecerNumeroCamas(numero);

        System.out.println("Ingrese el presupuesto 3");
        valor1 = entrada.nextDouble();
        h3.establecerPresupuesto(valor1);

        double suma = h1.obtenerPresupuesto() + h2.obtenerPresupuesto()
                + h3.obtenerPresupuesto();
        int suma2 = h1.obtenerNumeroCamas() + h2.obtenerNumeroCamas()
                + h3.obtenerNumeroCamas();

        System.out.printf("La suma de presupuestos es %.2f\n", suma);
        System.out.printf("La suma del numero de camas es %d\n", suma2);
        System.out.println("Los hospitales ingresados fueron:");
        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(),
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        System.out.printf("%s - %d - %.2f\n", h2.obtenerNombre(),
                h2.obtenerNumeroCamas(), h2.obtenerPresupuesto());
        System.out.printf("%s - %d - %.2f\n", h3.obtenerNombre(),
                h3.obtenerNumeroCamas(), h3.obtenerPresupuesto());
    }
}
