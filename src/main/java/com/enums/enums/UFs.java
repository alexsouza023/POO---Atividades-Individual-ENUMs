package com.enums.enums;

import java.util.Scanner;

import com.enums.enums.IformeRegiao.Regiao;

public class UFs {

    
public class Main {
    // Definindo o ENUM para as UFs
    public enum UF {
        AC("Acre", Regiao.NORTE),
        AL("Alagoas", Regiao.NORDESTE),
        AP("Amapá", Regiao.NORTE),
        AM("Amazonas", Regiao.NORTE),
        BA("Bahia", Regiao.NORDESTE),
        CE("Ceará", Regiao.NORDESTE),
        DF("Distrito Federal", Regiao.CENTRO_OESTE),
        ES("Espírito Santo", Regiao.SUDESTE),
        GO("Goiás", Regiao.CENTRO_OESTE),
        MA("Maranhão", Regiao.NORDESTE),
        MT("Mato Grosso", Regiao.CENTRO_OESTE),
        MS("Mato Grosso do Sul", Regiao.CENTRO_OESTE),
        MG("Minas Gerais", Regiao.SUDESTE),
        PA("Pará", Regiao.NORTE),
        PB("Paraíba", Regiao.NORDESTE),
        PR("Paraná", Regiao.SUL),
        PE("Pernambuco", Regiao.NORDESTE),
        PI("Piauí", Regiao.NORDESTE),
        RJ("Rio de Janeiro", Regiao.SUDESTE),
        RN("Rio Grande do Norte", Regiao.NORDESTE),
        RS("Rio Grande do Sul", Regiao.SUL),
        RO("Rondônia", Regiao.NORTE),
        RR("Roraima", Regiao.NORTE),
        SC("Santa Catarina", Regiao.SUL),
        SP("São Paulo", Regiao.SUDESTE),
        SE("Sergipe", Regiao.NORDESTE),
        TO("Tocantins", Regiao.NORTE);

        private final String nomeCompleto;
        private final Regiao regiao;

        UF(String nomeCompleto, Regiao regiao) {
            this.nomeCompleto = nomeCompleto;
            this.regiao = regiao;
        }

        public String getNomeCompleto() {
            return nomeCompleto;
        }

        public Regiao getRegiao() {
            return regiao;
        }
    }

    public static void imprimirNomeUF(String sigla) {
        try {
            UF uf = UF.valueOf(sigla.toUpperCase().trim());
            System.out.println("A sigla " + sigla + " corresponde ao estado " + uf.getNomeCompleto() + ".");
        } catch (IllegalArgumentException e) {
            System.out.println("Sigla inválida. Por favor, insira uma sigla válida.");
        }
    }

    public static void imprimirEstadosPorRegiao(String regiaoStr) {
        IformeRegiao regiao = Regiao.fromString(regiaoStr);
        if (regiao == null) {
            System.out.println("Região inválida. Por favor, insira uma região válida.");
            return;
        }

        System.out.println("Os estados da região " + regiaoStr + " são:");
        for (String sigla : regiao.getEstados()) {
            System.out.println(sigla + " - " + UF.valueOf(sigla).getNomeCompleto());
        }
    }

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
}


}


