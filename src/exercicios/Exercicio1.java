package exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        String[] nomes = {"Luigi", "Sarah"};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a letra para filtrar os nomes: ");
        char letra = scanner.next().charAt(0);

        int contador = 0;
        System.out.println("\nNomes encontrados que começam com \"" + letra + "\":");
        
        for (String nome : nomes) {
            if (nome.charAt(0) == letra) {
                System.out.println(nome);
                contador++;
            }
        }

        System.out.println("\nTotal de nomes encontrados: " + contador);
        
        scanner.close();
    }
}
