package Entidades;

public class Sistema {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("João Augusto");
		Compra compra1 = new Compra();
		compra1.adicionarItens("Computador", 2500, 1);
		compra1.adicionarItens("Impressora", 500, 1);

		Compra compra2 = new Compra();
		compra2.adicionarItens("Caneta", 8.50, 10);
		compra2.adicionarItens("Notebook", 1500, 1);

		c1.adicionarCompra(compra1);
		c1.adicionarCompra(compra2);
		System.out.println(c1.obterValorTotal());

	}
}
