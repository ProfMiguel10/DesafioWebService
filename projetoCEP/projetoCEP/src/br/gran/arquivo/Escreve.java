package br.gran.arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escreve {

	public static void escreveArq(String str) {

		try {
			
			FileWriter fw = new FileWriter("c:/gran/arq.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(str);
			bw.newLine();
			bw.close();
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
