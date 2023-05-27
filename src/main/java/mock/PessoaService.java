package mock;

 
import integracao.BancoDados;
import integracao.Pessoa;

public class PessoaService {

	ValidaPessoa validaPessoa = new ValidaPessoa();
	BancoDados bancoDados = new BancoDados();
	
	public PessoaService(BancoDados bancoDados) {
		this.bancoDados = bancoDados;
	}
	
	public int salvarPessoa(Pessoa pessoa) {
		System.out.println("executando salvarpessoa");
		boolean retvalidacao =
				validaPessoa.validar(pessoa);
		if(retvalidacao == true) {
			return bancoDados.insertPessoa(pessoa);
		}else {
			return -1;
		}
	}
	
}
