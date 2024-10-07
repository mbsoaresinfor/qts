package aula;

public class IPVA {
	public float calcular(float valorIpva,int idade, boolean bomcondutor) {
		float desconto =0;
		if(idade >=60 && bomcondutor) {
			desconto = valorIpva * 0.30f;
		}
		else if(idade >= 40 && idade <= 59 && bomcondutor) {
			desconto = valorIpva * 0.25f;
		}else if(bomcondutor) {
			desconto = valorIpva * 0.15f;
		}else {
			desconto = 0;
		}
		
		return valorIpva - (desconto);
	}

}
