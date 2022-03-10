
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		SistemaInterno si = new SistemaInterno();
		Administrador adm = new Administrador();

		adm.setSenha(333);
		g.setSenha(222);

		si.autentica(g);
		si.autentica(adm);

	}

}
