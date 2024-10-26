package application;

import entities.ContextoDeOrdenacao;
import entities.OrdenacaoBubbleSort;
import entities.OrdenacaoInsertionSort;
import entities.OrdenacaoSelectionSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        System.out.println("Digite a lista de números para ordenar (separados por espaço):");
        String[] entrada = scanner.nextLine().split(" ");
        for (String num : entrada) {
            numeros.add(Integer.parseInt(num));
        }

        System.out.println("Escolha o algoritmo de ordenação:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        int escolha = scanner.nextInt();

        ContextoDeOrdenacao contexto = new ContextoDeOrdenacao();
        switch (escolha) {
            case 1:
                contexto.setEstrategia(new OrdenacaoBubbleSort());
                break;
            case 2:
                contexto.setEstrategia(new OrdenacaoSelectionSort());
                break;
            case 3:
                contexto.setEstrategia(new OrdenacaoInsertionSort());
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        contexto.executarOrdenacao(numeros);
        System.out.println("Lista ordenada: " + numeros);

        scanner.close();
    }
}