package aula;

public class ValidadorProduto {

	public String[] validarTexto(String texto) {
		if(texto == null) {
			return null;
		}
		//abc1;tv samsung;1250xyz
		String[] dados = texto.split(";");
		// 1 = dados[0] 
		// tv samsung = dados[1]
		// 1250 = dados[2]
		if(dados.length != 3) {
			return null;
		}else {
			return dados;
		}
	}
	
	public boolean validarNome(String nome) {
		if(nome.isEmpty()) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean validarPreco(String preco) {
		try {
			Float.parseFloat(preco);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
}
