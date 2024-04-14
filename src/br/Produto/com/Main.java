package br.Produto.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que forneça informações para criar objetos Produto
        System.out.println("Criar Produto - Opções:");
        System.out.println("1. Nome do produto apenas");
        System.out.println("2. Nome do produto e preço");
        System.out.println("3. Nome do produto, preço e quantidade em estoque");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.print("\nDigite o nome do produto: ");
                String nome1 = scanner.nextLine();
                Produto produto1 = new Produto(nome1);
                produto1.exibirCaracteristicas();
                break;

            case 2:
                System.out.print("\nDigite o nome do produto: ");
                String nome2 = scanner.nextLine();
                System.out.print("Digite o preço do produto: R$");
                double preco2 = scanner.nextDouble();
                Produto produto2 = new Produto(nome2, preco2);
                produto2.exibirCaracteristicas();
                break;

            case 3:
                System.out.print("\nDigite o nome do produto: ");
                String nome3 = scanner.nextLine();
                System.out.print("Digite o preço do produto: R$");
                double preco3 = scanner.nextDouble();
                System.out.print("Digite a quantidade em estoque do produto: ");
                int quantidade3 = scanner.nextInt();
                Produto produto3 = new Produto(nome3, preco3, quantidade3);
                produto3.exibirCaracteristicas();
                break;

            default:
                System.out.println("\nOpção inválida.");
        }

        scanner.close();
    }
}