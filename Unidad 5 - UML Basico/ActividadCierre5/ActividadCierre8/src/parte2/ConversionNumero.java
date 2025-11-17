/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2;

/**
 *
 * @author Tadeo
 */
import java.util.Scanner;

public class ConversionNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            int n = Integer.parseInt(sc.nextLine());

            System.out.println("Número ingresado: " + n);

        } catch (NumberFormatException e) {
            System.out.println("Error: No ingresó un número válido.");
        }
    }
}
