package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<>();

	void adicionarItens(String nome, double preco, int qtd) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtd));
	}

	double obterValorTotal() {
		double total = 0;

		for (Item item : itens) {

			total += item.quantidade * item.produto.preco;
		}

		return total;

	}
}
