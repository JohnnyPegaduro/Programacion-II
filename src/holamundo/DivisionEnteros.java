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
public class DivisionEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un entero a: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese un entero b: ");
        int b = scanner.nextInt();
        if (b != 0) {
            int res = a / b; // división entera
            System.out.println("a / b = " + res);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}
