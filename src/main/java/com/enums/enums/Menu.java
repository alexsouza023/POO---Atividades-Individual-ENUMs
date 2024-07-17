package com.enums.enums;

import java.util.Scanner;

public class Menu {

    public static void mostrarMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Informar UF e obter o nome do estado.");
        System.out.println("2. Informar Região e obter os estados daquela região.");
        System.out.println("Digite 'sair' para encerrar.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            mostrarMenu();
            System.out.print("Sua escolha: ");
            input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.print("Digite a sigla da UF: ");
                String sigla = scanner.nextLine();
                imprimirNomeUF(sigla);
            } else if (input.equals("2")) {
                System.out.print("Digite o nome da região: ");
                String regiao = scanner.nextLine();
                imprimirEstadosPorRegiao(regiao);
            } else if (!input.equalsIgnoreCase("sair")) {
                System.out.println("Opção inválida. Por favor, escolha 1, 2 ou 'sair'.");
            }

        } while (!input.equalsIgnoreCase("sair"));

        scanner.close();
        System.out.println("Programa encerrado.");
    }

    private static void imprimirEstadosPorRegiao(String regiao) {

        throw new UnsupportedOperationException("Unimplemented method 'imprimirEstadosPorRegiao'");
    }

    private static void imprimirNomeUF(String sigla) {

        throw new UnsupportedOperationException("Unimplemented method 'imprimirNomeUF'");
    }

}
