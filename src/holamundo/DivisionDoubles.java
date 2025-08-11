/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

/**
 *
 * @author Matias
 */
import java.util.Scanner;
public class DivisionDoubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número (double) a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese un número (double) b: ");
        double b = scanner.nextDouble();
        if (b != 0.0) {
            double res = a / b; // división real
            System.out.println("a / b = " + res);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}
