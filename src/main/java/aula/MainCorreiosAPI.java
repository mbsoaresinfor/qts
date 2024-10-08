package aula;

public class MainCorreiosAPI {

	public static void main(String[] args) throws Exception {

		CorreiosAPI correiosAPI = new CorreiosAPI();
		Endereco end = correiosAPI.buscaCep("90520010");
		System.out.println(end.getLogradouro());

	}

}
