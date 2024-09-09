package aula;

public class DataMatrix {

	public boolean validar(String dado) {
		if(dado == null) {
			return false;
		}
		
		if(dado.length() != 31) {
			return false;
		}
		String codMed = dado.substring(0, 14);
		String dtProducao = dado.substring(14, 20);
		String serial = dado.substring(20, 25);
		String lote = dado.substring(26, 31);
		if(eNumero(dtProducao) == false) {
			return false;
		}
		if(eNumero(lote) == false) {
			return false;
		}
		
		return true;
	}
	
	private boolean eNumero(String dado) {
		try {
			Float.parseFloat(dado);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}
