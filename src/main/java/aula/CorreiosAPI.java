package aula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class CorreiosAPI {
	
	public Endereco buscaCep (String cep) throws Exception {
        String enderecoURL = "https://viacep.com.br/ws/" + cep + "/json/";
        URL url = new URL(enderecoURL);
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("GET");
        conexao.setDoInput(true);
        try {
            BufferedReader buff = new BufferedReader(new InputStreamReader((conexao.getInputStream()), "utf-8"));

            String convertJsonString = 
            		converteJsonEmString(buff);
            Gson gson = new Gson();
            Endereco endereco = gson.fromJson(convertJsonString, Endereco.class);
            return endereco;

        } catch (Exception msgErro) {
            throw  new Exception("Erro de conexão- status Code [" + conexao.getResponseCode() + "]. " + msgErro.toString()); 
        }

    }
 
 
 private  String converteJsonEmString(BufferedReader buffereReader) throws IOException {
        String resposta, jsonString = "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonString += resposta;
        }
        return jsonString;
    }
}
