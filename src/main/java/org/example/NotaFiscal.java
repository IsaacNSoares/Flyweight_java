package org.example;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {

    private List<ItemNotaFiscal> itens = new ArrayList<>();

    public void adicionarItem(int quantidade, String descricaoProduto, String ncm) {
        Produto produto = ProdutoFactory.getProduto(descricaoProduto, ncm);
        ItemNotaFiscal item = new ItemNotaFiscal(quantidade, produto);
        itens.add(item);
    }

    public List<String> obterItens() {
        List<String> saida = new ArrayList<String>();
        for (ItemNotaFiscal item : this.itens) {
            saida.add(item.obterItem());
        }
        return saida;
    }
}