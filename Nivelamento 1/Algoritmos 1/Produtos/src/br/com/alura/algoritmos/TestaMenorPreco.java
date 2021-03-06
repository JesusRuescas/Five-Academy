package br.com.alura.algoritmos;

public class TestaMenorPreco {

	public static void main(String[] args) {

		/* MODO 1
		 * double precos[] = new double[5]; precos[0] = 1000000; precos[1] = 46000;
		 * precos[2] = 16000; precos[3] = 46000; precos[4] = 17000;
		 * 
		 * int maisBarato = 0;
		 * 
		 * for(int atual = 0; atual <= 4; atual++) { if (precos[atual] <
		 * precos[maisBarato]) { maisBarato = atual;
		 * 
		 * }
		 * 
		 * System.out.println(maisBarato);
		 * System.out.println("O carro mais barato custa " + precos[maisBarato]);
		 * 
		 * }
	
	
		/* MODO 2
		Produto produtos[] = new Produto[5];
		produtos[0] = new Produto("Lamborghini", 1000000);
		produtos[1] = new Produto("Jipe", 46000);
		produtos[2] = new Produto("Bras?lia", 16000);
		produtos[3] = new Produto("Smart", 46000);
		produtos[4] = new Produto("Fusca", 17000);

		int maisBarato = 0;
		for (int atual = 0; atual <= 4; atual++) {
			if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = atual;
			}
		}
		System.out.println(maisBarato);
		System.out.println("O carro" + produtos[maisBarato].getNome() + " ? o mais barato, e custa" + produtos[maisBarato].getPreco());
	*/
		
		Produto produtos[] = { 
                new Produto ("Lamborghini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Bras?lia", 16000),
                new Produto("Smart", 46000),
                new Produto("Fusca", 17000)
        };

        int maisBarato = buscaMenor(produtos);
        System.out.println(maisBarato);
        System.out.println("O carro " + produtos[maisBarato].getNome()
                                      + " ? o mais barato, e custa "
                                      + produtos[maisBarato].getPreco());

    }

	  private static int buscaMenor(Produto[] produtos) {
	       int maisBarato = 0;
	       for(int atual = 0; atual <= 4; atual++) {
	           if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
	               maisBarato = atual;
	           }
	        }
	       return maisBarato;
		
		
	}

}
