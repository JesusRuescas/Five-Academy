package ExemploTeste;

public class Teste {
	public static void main(String[] args) {
		FuncionarioTeste Funcionario = new FuncionarioTeste();
		FuncionarioTeste Gerente = new FuncionarioTeste();
		FuncionarioTeste Diretor = new FuncionarioTeste();

		Funcionario.setSalario(3000);
		System.out.println(Funcionario.getTipo());
		System.out.println(Funcionario.getBonificacao());

		Gerente.setTipo(1);
		Gerente.setSalario(5000);
		System.out.println(Gerente.getTipo());
		System.out.println(Gerente.getBonificacao());

		Diretor.setTipo(2);
		Diretor.setSalario(7000);
		System.out.println(Diretor.getTipo());
		System.out.println(Diretor.getBonificacao());
	}
}
