package br.gran.cep;

import java.io.BufferedReader;
import java.io.IOException;

public class JSONtoString {
    public static String converteJsonEmString(BufferedReader buffereReader) throws IOException {
        String resposta, jsonString = "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonString += resposta;
        }
        return jsonString;
    }

}