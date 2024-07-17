package com.enums.enums;

public class IformeRegiao {

    public enum Regiao {
        NORTE(new String[] { "AC", "AP", "AM", "PA", "RO", "RR", "TO" }),
        NORDESTE(new String[] { "AL", "BA", "CE", "MA", "PB", "PE", "PI", "RN", "SE" }),
        CENTRO_OESTE(new String[] { "DF", "GO", "MT", "MS" }),
        SUDESTE(new String[] { "ES", "MG", "RJ", "SP" }),
        SUL(new String[] { "PR", "RS", "SC" });

        private final String[] estados;

        Regiao(String[] estados) {
            this.estados = estados;
        }

        public String[] getEstados() {
            return estados;
        }

        public static IformeRegiao fromString(String regiao) {
            try {
                return IformeRegiao.valueOf(regiao.toUpperCase().replace("-", "_"));
            } catch (IllegalArgumentException e) {
                return null;
            }
        }
    }

    public static IformeRegiao valueOf(String replace) {

        throw new UnsupportedOperationException("Unimplemented method 'valueOf'");
    }

    public String[] getEstados() {

        throw new UnsupportedOperationException("Unimplemented method 'getEstados'");
    }

}
