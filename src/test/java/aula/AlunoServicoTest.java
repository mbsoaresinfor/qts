package aula;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class AlunoServicoTest {

	AlunoServico alunoServico = new AlunoServico();
	
	@Test
	public void testListar() {
		// arrange
		Aluno aluno1 = new Aluno();
		aluno1.nome = "maria";
		aluno1.idade = 18;
		aluno1.mes=1;
		aluno1.ano= 2000;
		Aluno aluno2 = new Aluno();
		aluno2.nome = "jose da silva";
		aluno2.idade = 45;
		aluno2.mes=1;
		aluno2.ano= 2000;
		alunoServico.salvar(aluno1);
		alunoServico.salvar(aluno2);
		String resultaEsperado = "Nome: maria, 18, é maior de idade\n"
				+ "Nome: jose da silva, 45, é maior de idade\n";
		
		// ack
		String resultado = alunoServico.listar();
		
		// assert
		Assert.assertEquals(resultaEsperado, resultado);
		
	}
	
}
