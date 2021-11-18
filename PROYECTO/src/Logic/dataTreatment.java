package Logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dataTreatment {

	public static int countWords(String msj) {
		int contador = 1, pos;
		msj = msj.trim();
		msj = msj.replaceAll("\\s{2,}", " ");
		if (msj.isEmpty()) {
			contador = 0;
		} else {
			pos = msj.indexOf(" ");
			while (pos != -1) {
				contador++;
				pos = msj.indexOf(" ", pos + 1);
			}
		}
		return contador;

	}

	public static String llenarCaracteres(String cadena, char charToAdd, int numrepe, int orientation) {
		cadena = cadena.replaceAll("\\s{2,}", " ");
		for (int i = 0; i < numrepe; i++) {
			if (orientation == 1) {
				cadena = cadena + charToAdd;
			} else {
				cadena = charToAdd + cadena;
			}
		}
		return cadena;
	}

	public static String ownName(String name) {
		// name = "universidad pedagogica y tecnologica de colombia";
		name = name.replaceAll("\\s{2,}", " ");
		StringBuffer strbf = new StringBuffer();
		Matcher match = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(name);
		while (match.find()) {
			match.appendReplacement(strbf, match.group(1).toUpperCase() + match.group(2).toLowerCase());
		}
		name = match.appendTail(strbf).toString();
		return name;

	}

	public static String erase(String word, String MyString) {

		MyString = MyString.replace(word, "");

		return MyString;
	}

	public static String removeRepeats(String MyString, String word) {

		MyString = MyString.replace(word, "");

		return MyString;
	}

	public static int countVowels(String word) {
		// String word = "COCOA";
		word = word.replaceAll("\\s{2,}", " ");
		System.out.println(word);
		int cont = 0;
		for (int i = 0; i < word.length(); i++) {
			word.toUpperCase();
			if ((word.charAt(i) == 'a') || (word.charAt(i) == 'e') || (word.charAt(i) == 'i') || (word.charAt(i) == 'o')
					|| (word.charAt(i) == 'u')) {
				cont++;
			}
		}
		return cont;

	}
}
