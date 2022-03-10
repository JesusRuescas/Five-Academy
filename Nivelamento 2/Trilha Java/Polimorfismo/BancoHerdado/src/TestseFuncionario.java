
public class TestseFuncionario {

	public static void main(String[] args) {

		Funcionario Jesus = new Gerente();
		Cliente cliente = new Cliente();

		Jesus.setNome("Jesus Ruescas Junior");
		Jesus.setCpf("123.400.289-22");
		Jesus.setSalario(2600);

		System.out.println(Jesus.getNome());
		System.out.println(Jesus.getBonificacao());

	}

}
