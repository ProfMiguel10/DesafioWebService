package br.gran.cep;

import java.util.Scanner;

import br.gran.arquivo.Escreve;

public class Principal {

	public static void main(String[] args) throws Exception {
		System.out.print("Informe seu CEP: ");
		Scanner in = new Scanner(System.in);
		String cep = in.nextLine();
		Endereco endereco = BuscaCEP.buscaCep(cep);

		Escreve.escreveArq("CEP Consultado: " + cep + ";Complemento: " + endereco.getComplemento() + ";Logradouro: "
				+ endereco.getLogradouro() + ";Bairro: " + endereco.getBairro() + ";Logradouro: "
				+ endereco.getLogradouro() + ";Localidade: " + endereco.getLocalidade() + ";DDD: " + endereco.getDdd() + ";UF: " + endereco.getUf() );
		in.close();

	}
}
