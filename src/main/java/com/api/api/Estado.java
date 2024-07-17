package com.api.api;

public enum Estado {
    // Região Norte
    AC(1, "Acre", "Norte"),
    AM(2, "Amazonas", "Norte"),
    AP(3, "Amapá", "Norte"),
    PA(4, "Pará", "Norte"),
    RO(5, "Rondônia", "Norte"),
    RR(6, "Roraima", "Norte"),
    TO(7, "Tocantins", "Norte"),

    // Região Nordeste
    AL(8, "Alagoas", "Nordeste"),
    BA(9, "Bahia", "Nordeste"),
    CE(10, "Ceará", "Nordeste"),
    MA(11, "Maranhão", "Nordeste"),
    PB(12, "Paraíba", "Nordeste"),
    PE(13, "Pernambuco", "Nordeste"),
    PI(14, "Piauí", "Nordeste"),
    RN(15, "Rio Grande do Norte", "Nordeste"),
    SE(16, "Sergipe", "Nordeste"),

    // Região Centro-Oeste
    DF(17, "Distrito Federal", "Centro-Oeste"),
    GO(18, "Goiás", "Centro-Oeste"),
    MT(19, "Mato Grosso", "Centro-Oeste"),
    MS(20, "Mato Grosso do Sul", "Centro-Oeste"),

    // Região Sudeste
    ES(21, "Espírito Santo", "Sudeste"),
    MG(22, "Minas Gerais", "Sudeste"),
    RJ(23, "Rio de Janeiro", "Sudeste"),
    SP(24, "São Paulo", "Sudeste"),

    // Região Sul
    PR(25, "Paraná", "Sul"),
    RS(26, "Rio Grande do Sul", "Sul"),
    SC(27, "Santa Catarina", "Sul");

    private final int numero;
    private final String nome;
    private final String regiao;

    Estado(int numero, String nome, String regiao) {
        this.numero = numero;
        this.nome = nome;
        this.regiao = regiao;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getRegiao() {
        return regiao;
    }

    public static Estado fromNumero(int numero) {
        for (Estado estado : Estado.values()) {
            if (estado.getNumero() == numero) {
                return estado;
            }
        }
        return null;
    }

    public static void listaEstadosRegião(String regiao) {
        System.out.println("Os estados da região " + regiao + " são: ");
        for (Estado estado : Estado.values()) {
            if (estado.getRegiao().equalsIgnoreCase(regiao)) {
                System.out.println(estado.getNome());

            }
        }

    }
}
