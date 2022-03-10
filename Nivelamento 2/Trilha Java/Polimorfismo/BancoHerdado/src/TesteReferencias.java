
public class TesteReferencias {

	public static void main(String[] args) {
		Funcionario g1 = new Gerente();
		Funcionario e1 = new EditorVideo();
		Funcionario d1 = new Designer();

		g1.setNome("Jesus");
		g1.setSalario(5000);

		e1.setNome("Ruescas");
		e1.setSalario(2500);

		d1.setNome("Junior");
		d1.setSalario(2000);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registro(g1);
		controle.registro(e1);
		controle.registro(d1);

		System.out.println(controle.getSoma());

	}

}
