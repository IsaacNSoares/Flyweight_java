package org.example;

import java.util.HashMap;
import java.util.Map;

public class ProdutoFactory {
    private static Map<String, Produto> produtos = new HashMap<>();

    public static Produto getProduto(String descricao, String ncm) {
        Produto produto = produtos.get(descricao);
        if (produto == null) {
            produto = new Produto(descricao, ncm);
            produtos.put(descricao, produto);
        }
        return produto;
    }

    public static int getTotalProdutos() {
        return produtos.size();
    }
}