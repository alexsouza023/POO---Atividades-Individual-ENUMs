package com.enums.enums;

import java.util.Scanner;

public class UFs {

    public class Main {
        // Definindo o ENUM para as UFs
        public enum UF {
            AC("Acre"),
            AL("Alagoas"),
            AP("Amapá"),
            AM("Amazonas"),
            BA("Bahia"),
            CE("Ceará"),
            DF("Distrito Federal"),
            ES("Espírito Santo"),
            GO("Goiás"),
            MA("Maranhão"),
            MT("Mato Grosso"),
            MS("Mato Grosso do Sul"),
            MG("Minas Gerais"),
            PA("Pará"),
            PB("Paraíba"),
            PR("Paraná"),
            PE("Pernambuco"),
            PI("Piauí"),
            RJ("Rio de Janeiro"),
            RN("Rio Grande do Norte"),
            RS("Rio Grande do Sul"),
            RO("Rondônia"),
            RR("Roraima"),
            SC("Santa Catarina"),
            SP("São Paulo"),
            SE("Sergipe"),
            TO("Tocantins");

            private final String nomeCompleto;

            UF(String nomeCompleto) {
                this.nomeCompleto = nomeCompleto;
            }

            public String getNomeCompleto() {
                return nomeCompleto;
            }
        }

        public static void imprimirNomeUF(String sigla) {
            try {
                UF uf = UF.valueOf(sigla.toUpperCase());
                System.out.println("A sigla " + sigla + " corresponde ao estado " + uf.getNomeCompleto() + ".");
            } catch (IllegalArgumentException e) {
                System.out.println("Sigla inválida. Por favor, insira uma sigla válida.");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a sigla de uma UF: ");
            String sigla = scanner.next();

            imprimirNomeUF(sigla);

            scanner.close();
        }

        @Override
        public String toString() {
            return "Main []";
        }
    }

}
