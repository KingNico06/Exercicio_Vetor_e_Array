package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String[] palavras = {"Carro", "Beleza", "Sol", "Emoção", "Correr", "Vencer"};
        String[] resultado = new String[palavras.length];
        int totalRestantes = 0;

        System.out.print("Digite a letra para remover palavras que a contêm: ");
        char letra = scanner.next().charAt(0);

        System.out.println("Lista de palavras após remoção:");
        for (String palavra : palavras) {
            if (!palavra.toLowerCase().contains(String.valueOf(letra).toLowerCase())) {
                resultado[totalRestantes] = palavra;
                System.out.println(palavra);
                totalRestantes++;
            }
        }

        scanner.close();
    }
}
