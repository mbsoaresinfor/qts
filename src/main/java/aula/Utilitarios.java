package aula;

public class Utilitarios {

	public static boolean eNumero(String valor) {
		try {
			Double.parseDouble(valor);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
}
