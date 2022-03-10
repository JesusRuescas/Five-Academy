
public abstract class Funcionario { // Abstrato pois todo funcionario tem um cargo, um funcionario n�o � apenas um
									// funcionario.

	private String nome;
	private String cpf;
	private double salario;

	public abstract double getBonificacao(); // M�todo sem bloco de c�digo, pois n�o h� implementa��o!

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
