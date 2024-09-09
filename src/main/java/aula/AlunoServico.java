package aula;

import java.util.ArrayList;

public class AlunoServico {

	ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
	
	public boolean salvar(Aluno aluno) {
		if(aluno == null) {
			return false;
		}
		if(aluno.nome.isEmpty() || aluno.nome.length() < 5 ||
				aluno.nome.length() > 50) {
			return false;
		}
		if(aluno.idade < 1 || aluno.idade > 150) {
			return false;
		}
		if(aluno.mes < 1 || aluno.mes > 12) {
			return false;
		}
		if(aluno.ano < 1900 || aluno.ano > 2024) {
			return false;
		}
		
		listaAluno.add(aluno);
		return true;		
		
	}
	
	public String listar() {
		StringBuilder relatorio = new StringBuilder();
		for(Aluno aluno : listaAluno) {
			relatorio.append("Nome: ");
			relatorio.append(aluno.nome);
			relatorio.append(", ");
			relatorio.append(aluno.idade);
			relatorio.append(", ");
			if(aluno.idade >= 18) {
				relatorio.append("é maior de idade");
			}else {
				relatorio.append("é menor de idade");
			}
			relatorio.append("\n");
		}
		return relatorio.toString();
	}
	
}
