package br.com.alura.algoritmos;

public class TestaOrdenacao {

	public static void main(String[] args) {
		Produto produtos[] = { new Produto("Lamborghini", 1000000), new Produto("Jipe", 46000),
				new Produto("Bras?lia", 16000), new Produto("Smart", 46000), new Produto("Fusca", 17000) };

		// SelectionSort(produtos, produtos.length);
		NovoSort(produtos, produtos.length);
		imprime(produtos);
	}

	private static void imprime(Produto[] produtos) {
		for (Produto produto : produtos) {
			System.out.println(produto.getNome() + " custa " + produto.getPreco());
		}
	}

	private static void NovoSort(Produto[] produtos, int tamanho) {
		for (int atual = 0; atual < tamanho; atual++) {
			int analise = atual;
			while (analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {

				System.out.println("Estou trocando " + analise + " com " + (analise - 1));
				System.out.println();
				Produto produtoAnalise = produtos[analise];
				Produto produtoAnaliseMenos1 = produtos[analise - 1];
				System.out.println("Estou trocando o " + produtoAnalise.getNome() + " com " + produtoAnaliseMenos1.getNome());
				System.out.println();
				produtos[analise] = produtoAnaliseMenos1;
				produtos[analise - 1] = produtoAnalise;
				analise--;
			}
			imprime(produtos);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		}

	}
	/*
	 * private static void SelectionSort(Produto[] produtos, int tamanho) {
	 * 
	 * for (int atual = 0; atual < produtos.length - 1; atual++) { // Utilizamos -1
	 * pois o ultimo elemento n?o importa, pois j? est? ordenado (opcional)
	 * System.out.println("Estou no elemento " + atual);
	 * 
	 * int menor = buscaMenor(produtos, atual, tamanho - 1); // -1 Para pegar o
	 * tamanho correto do Array,poderiamos usar produtos.length mas criamos a
	 * variavel tamanho
	 * 
	 * System.out.println("Trocando o " + atual + " com o " + menor);
	 * 
	 * Produto produtoAtual = produtos[atual]; Produto produtoMenor =
	 * produtos[menor]; produtos[atual] = produtoMenor; produtos[menor] =
	 * produtoAtual;
	 * 
	 * System.out.println("Trocando o " +produtoAtual.getNome() + " "
	 * +produtoMenor.getNome()); } }
	 * 
	 * private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
	 * int maisBarato = inicio; for (int atual = inicio; atual <= termino; atual++)
	 * { // Aqui procuramos <= referente ao ultimo elemento if
	 * (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) { maisBarato =
	 * atual; } } return maisBarato;
	 * 
	 * }
	 */
}