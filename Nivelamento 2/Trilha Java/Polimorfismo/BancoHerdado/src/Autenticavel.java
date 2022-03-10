
//Contrato autenticavel, quem assina esse contato precisa implementar o método setSenha e o método autentica

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
