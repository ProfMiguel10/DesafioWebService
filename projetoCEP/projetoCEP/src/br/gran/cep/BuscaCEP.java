package br.gran.cep;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class BuscaCEP {
	public static Endereco buscaCep(String cep) throws Exception {
		String URL = "https://viacep.com.br/ws/" + cep + "/json/";
		URL url = new URL(URL);
		HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
		conexao.setRequestMethod("GET");
		conexao.setDoInput(true);
		try {
			BufferedReader buff = new BufferedReader(new InputStreamReader((conexao.getInputStream()), "utf-8"));
			String convertJsonString = JSONtoString.converteJsonEmString(buff);
			Gson gson = new Gson();
			Endereco endereco = gson.fromJson(convertJsonString, Endereco.class);
			return endereco;
		} catch (Exception msgErro) {
			throw new Exception(
					"Erro de conexão: [" + conexao.getResponseCode() + "]. " + msgErro.toString());
		}
	}
}