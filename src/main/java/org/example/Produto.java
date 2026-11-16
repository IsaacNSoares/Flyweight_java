package org.example;

public class Produto {

    private String descricao;
    private String ncm;

    public Produto(String descricao, String ncm) {
        this.descricao = descricao;
        this.ncm = ncm;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNcm() {
        return ncm;
    }
}