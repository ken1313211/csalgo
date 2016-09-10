/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euclid;

import java.util.Scanner;

/**
 *
 * @author kggarcia
 */
public class Euclid {

    /**
     * @param args the command line arguments
     */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here

        int input = 0;
        int input2 = 0;
        int remainder = 0;
        System.out.println("Enter first number:");
        input = scanner.nextInt();
        System.out.println("Enter second number:");
        input2 = scanner.nextInt();

        do {
            if (input2 > input) {
                remainder = input2 % input;
            } else {
                remainder = input % input2;
            }

            input = input2;
            input2 = remainder;

        } while (input2 != 0);

        System.out.println("GCD is: " + input);

    }

}
