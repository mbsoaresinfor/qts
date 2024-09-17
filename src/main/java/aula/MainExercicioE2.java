package aula;

import javax.swing.JOptionPane;

public class MainExercicioE2 {

	public static void main(String[] args) {
		ValidadorProduto validador = new ValidadorProduto();
		BancoDadosProduto bancoDadosProduto = new BancoDadosProduto();
		while(true) {
			String op = JOptionPane.showInputDialog("1.cadastro\n2.Listagem\3.sair");
			if("1".equals(op)) {
				String texto = JOptionPane.showInputDialog("Digite o texto");
				String dadosProduto[] = validador.validarTexto(texto);
				if(dadosProduto == null) {
					JOptionPane.showMessageDialog(null, "texto é invalido");
				}else {
					 boolean nomeEValido =  validador.validarNome(dadosProduto[1]);
					 if(nomeEValido == false) {
						 JOptionPane.showMessageDialog(null, "nome invalido");
					 }else {
						 boolean precoEvalido =  validador.validarPreco(dadosProduto[2]);
						 if(precoEvalido == false) {
							 JOptionPane.showMessageDialog(null, "preco invalido");
						 }else {
							 
						 }
					 }
				}
				
			}
			if("2".equals(op)) {
				
			}
			if("3".equals(op)) {
				break;
			}

			
			
		}

	}

}
