package org.example;

public class ItemNotaFiscal {

    private int quantidade;
    private Produto produtoRef;

    public ItemNotaFiscal(int quantidade, Produto produtoRef) {
        this.quantidade = quantidade;
        this.produtoRef = produtoRef;
    }

    public String obterItem() {
        return "ItemNotaFiscal{" +
                "quantidade=" + this.quantidade +
                ", descricao='" + produtoRef.getDescricao() + '\'' +
                ", ncm='" + produtoRef.getNcm() + '\'' +
                '}';
    }
}