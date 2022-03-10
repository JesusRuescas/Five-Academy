
public class Cliente implements Autenticavel {// Ao inves de usarmos extends usamos implements pois é uma interface.

	private int senha;
	private AutenticacaoUtil autenticador;

	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);

	}
}
