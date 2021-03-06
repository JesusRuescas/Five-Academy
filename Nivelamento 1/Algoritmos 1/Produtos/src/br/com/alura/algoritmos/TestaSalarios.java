package br.com.alura.algoritmos;

public class TestaSalarios {

	public static void main(String[] args) {
		
		Salarios salario[] = { 
                new Salarios ("Fernando", 3200),
                new Salarios("Alfredo", 6000),
                new Salarios("Fl?vio", 5000),
                new Salarios("Marcela", 2200),
        };
		
		
		int maiorSalario = buscaMaior(salario);
		 System.out.println(maiorSalario);
	     System.out.println("O salario " + salario[maiorSalario].getNome()
	                                      + " ? maior "
	                                      + salario[maiorSalario].getSalario());
		
		
        int menorSalario = buscaMenor(salario);
        System.out.println(menorSalario);
        System.out.println("O salario " + salario[menorSalario].getNome()
                                      + " ? o menor "
                                      + salario[menorSalario].getSalario());

    }
	
	 private static int buscaMaior(Salarios[] salario) {
	       int maiorSalario = 0;
	       for(int atual = 0; atual <= 3; atual++) {
	           if(salario[atual].getSalario() > salario[maiorSalario].getSalario()) {
	               maiorSalario = atual;
	           }
	        }
	       return maiorSalario;

	}

	  private static int buscaMenor(Salarios[] salario) {
	       int menorSalario = 0;
	       for(int atual = 0; atual <= 3; atual++) {
	           if(salario[atual].getSalario() < salario[menorSalario].getSalario()) {
	               menorSalario = atual;
	           }
	        }
	       return menorSalario;

	}

}
