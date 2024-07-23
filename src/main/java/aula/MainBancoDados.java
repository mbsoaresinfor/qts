package aula;

public class MainBancoDados {

	public static void main(String[] args) {

		// Execucao do banco de dados.
		
		BancoDados banco = new BancoDados();

		// crio pessoa para salvar
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("pedro");
		pessoa1.setIdade(40);
		pessoa1.setSalario(500);
		banco.insertPessoa(pessoa1);

		// crio outra pessoa para salvar
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("maria");
		pessoa2.setIdade(50);
		pessoa2.setSalario(200);
		banco.insertPessoa(pessoa2);

		// LISTA DO BANCO
		for (Pessoa p : banco.listPessoa()) {
			System.out.println("-------------------------------");
			System.out.println("Pessoa id " + p.getId());
			System.out.println("Pessoa nome " + p.getNome());
			System.out.println("Pessoa idade " + p.getIdade());
			System.out.println("Pessoa salario " + p.getSalario());
			System.out.println("-------------------------------");
		}

		// ATUALIZA AS PESSOAS
		pessoa1.setIdade(90);
		banco.updatePessoa(pessoa1);
		pessoa2.setIdade(130);
		banco.updatePessoa(pessoa2);

		// LISTA DO BANCO
		for (Pessoa p : banco.listPessoa()) {
			System.out.println("-------------------------------");
			System.out.println("Pessoa id " + p.getId());
			System.out.println("Pessoa nome " + p.getNome());
			System.out.println("Pessoa idade " + p.getIdade());
			System.out.println("Pessoa salario " + p.getSalario());
			System.out.println("-------------------------------");
		}

		// DELETA NO BANCO AS PESSOAS
		banco.deletePessoa(pessoa1.getId());
		banco.deletePessoa(pessoa2.getId());

		// LISTA DO BANCO
		for (Pessoa p : banco.listPessoa()) {
			System.out.println("-------------------------------");
			System.out.println("Pessoa id " + p.getId());
			System.out.println("Pessoa nome " + p.getNome());
			System.out.println("Pessoa idade " + p.getIdade());
			System.out.println("Pessoa salario " + p.getSalario());
			System.out.println("-------------------------------");
		}
	}

}
