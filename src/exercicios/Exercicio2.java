package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Quantos números você deseja inserir?: ");
        int quantidade = scanner.nextInt();
        
        int[] numeros = new int[quantidade];
        int soma = 0;


        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }


        double media = (double) soma / quantidade;


        System.out.println("\nLista de números inseridos:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        
        System.out.println("\n\nSoma: " + soma);
        System.out.println("\nMédia: " + media);

        scanner.close();
    }
}
