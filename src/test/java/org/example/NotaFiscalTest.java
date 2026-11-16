package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NotaFiscalTest {

    @Test
    void deveRetornarItensNotaFiscal() {
        NotaFiscal nf = new NotaFiscal();
        nf.adicionarItem(2, "Coca-Cola 2L", "22021000");
        nf.adicionarItem(1, "Coca-Cola 2L", "22021000");
        nf.adicionarItem(5, "Farinha de Trigo 1kg", "11010010");
        nf.adicionarItem(3, "Biscoito Recheado", "19053100");

        List<String> saida = Arrays.asList(
                "ItemNotaFiscal{quantidade=2, descricao='Coca-Cola 2L', ncm='22021000'}",
                "ItemNotaFiscal{quantidade=1, descricao='Coca-Cola 2L', ncm='22021000'}",
                "ItemNotaFiscal{quantidade=5, descricao='Farinha de Trigo 1kg', ncm='11010010'}",
                "ItemNotaFiscal{quantidade=3, descricao='Biscoito Recheado', ncm='19053100'}");

        assertEquals(saida, nf.obterItens());
    }

    @Test
    void deveRetornarTotalProdutosUnicosEmMemoria() {
        NotaFiscal nf = new NotaFiscal();
        nf.adicionarItem(2, "Coca-Cola 2L", "22021000");
        nf.adicionarItem(1, "Coca-Cola 2L", "22021000");
        nf.adicionarItem(5, "Farinha de Trigo 1kg", "11010010");
        nf.adicionarItem(3, "Biscoito Recheado", "19053100");

        // Foram passados 4 itens no leitor de código de barras, mas apenas 3 produtos únicos
        // devem estar carregados na RAM (a Coca-Cola é reaproveitada).
        assertEquals(3, ProdutoFactory.getTotalProdutos());
    }

}