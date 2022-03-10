
//Gerente é um funcionario que harda da class Funcionaro e assina o contrato autenticavel(interface)
public class Gerente extends Funcionario implements Autenticavel {
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do Gerente");
		return super.getSalario(); // usamos super pois as declarações são da classe mãe
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);

	}

}
