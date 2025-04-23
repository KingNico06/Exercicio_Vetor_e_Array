package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = {10, 20, 5, 6, 9, 5, 20, 6};
        

        int[] pares = new int[numeros.length];
        int totalPares = 0;

        System.out.println("Números pares encontrados:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[totalPares] = numeros[i];
                System.out.println(numeros[i]);
                totalPares++;
            }
        }

        System.out.println("Total de números pares: " + totalPares);

        scanner.close();
    }
}
