package mock;

import integracao.*;

public class ValidaPessoa {

	public boolean validar(Pessoa pessoa) {
		if(pessoa.getNome().equals("")) {
			return false;
		}
		
		return true;
	}
	
}
