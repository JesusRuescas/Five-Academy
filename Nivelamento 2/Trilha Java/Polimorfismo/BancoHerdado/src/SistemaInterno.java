
public class SistemaInterno {
	private int senha = 222;

	public void autentica(Autenticavel at) {
		boolean atutenticou = at.autentica(this.senha);

		if (atutenticou) {
			System.out.println("Pode entrar no sistema! ");
		} else {

			System.out.println("Não pode entrar no sistema! ");
		}

	}

}
