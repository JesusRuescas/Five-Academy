
public abstract class Funcionario { // Abstrato pois todo funcionario tem um cargo, um funcionario não é apenas um
									// funcionario.

	private String nome;
	private String cpf;
	private double salario;

	public abstract double getBonificacao(); // Método sem bloco de código, pois não há implementação!

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
