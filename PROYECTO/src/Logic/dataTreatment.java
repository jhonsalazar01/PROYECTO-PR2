package Logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Dilan Bohórquez.
 * @author Andres Sanabria.
 * @author Jhon Salazar.
 * @version 1.0.
 */
public class dataTreatment {
	/**
	 * Método que sirve para contar el número de palabras que contiene una cadena de
	 * caracteres de tipo String.
	 * 
	 * @param chain Cadena de caracteres.
	 * @return Número de palabras que contiene el String.
	 */
	public static int countWords(String chain) {
		int meter = 1, position;
		chain = chain.trim();
		chain = chain.replaceAll("\\s{2,}", " ");
		if (chain.isEmpty()) {
			meter = 0;
		} else {
			position = chain.indexOf(" ");
			while (position != -1) {
				meter++;
				position = chain.indexOf(" ", position + 1);
			}
		}
		return meter;

	}

	/**
	 * Método que sirve para añadir un determinado tipo de caracteres a una cadena
	 * tipo String.
	 * 
	 * @param chain       String que contiene las palabras o frases.
	 * @param charToAdd   Caracter a añadir a la cadena String.
	 * @param repetition  Número de veces que se repite el caracter en la cadena.
	 * @param orientation Indica si el caracter se añade por derecha o izquierda del
	 *                    String.
	 * @return Cadena de caracteres con el número de caracteres y el caracter por
	 *         derecha o izquierda.
	 */
	public static String fillCharacters(String chain, char charToAdd, int repetition, int orientation) {
		chain = chain.replaceAll("\\s{2,}", " ");

		for (int i = 0; i < repetition; i++) {
			if (orientation == 1) {
				chain = chain + charToAdd;
			} else {
				chain = charToAdd + chain;
			}
		}
		return chain;
	}

	/**
	 * Método que sirve para cambiar a nombre propio un arreglo de tipo String.
	 * 
	 * @param name String que contiene la cadena de caracteres.
	 * @return String en el cual muestra el String a nombre propio.
	 */
	public static String ownName(String name) {
		name = name.replaceAll("\\s{2,}", " ");
		StringBuffer strbf = new StringBuffer();
		Matcher match = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(name);
		while (match.find()) {
			match.appendReplacement(strbf, match.group(1).toUpperCase() + match.group(2).toLowerCase());
		}
		name = match.appendTail(strbf).toString();
		return name;

	}

	/**
	 * Métoso que sirve para borrar un caracter de una cadena de tipo String.
	 * 
	 * @param word     Caracter a borrar en el String.
	 * @param MyString String que contiene caracteres ingresados por teclado.
	 * @return String sin los caracteres que se eliminaron.
	 */
	public static String erase(String word, String MyString) {

		MyString = MyString.replace(word, "");

		return MyString;
	}

	/**
	 * Método que sirve para contar la cantidad de vocales que contiene una cadena
	 * de tipo String.
	 * 
	 * @param word Cadena de caracteres.
	 * @return Número de vocales que contiene el String.
	 */
	public static int countVowels(String word) {
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

	/**
	 * Método que valida si un email ingresado es valido o no.
	 * 
	 * @param correo String con la direccion de correo a verificar.
	 * @return Validación del correo.
	 */
	public static boolean validateEmail(String correo) {

		boolean validate = false;
		Pattern pattern = Pattern.compile(
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

		Matcher mather = pattern.matcher(correo);

		if (mather.find() == true) {
			validate = true;
		} else {
			validate = false;
		}
		return validate;

	}

	/**
	 * Método que sirve para buscar el contenido de una cadena en otra.
	 * 
	 * @param searchrepeated  Cadena donde se busca.
	 * @param searchrepeated1 Cadena a buscar.
	 * @return Número de veces que se encuntra la cadena.
	 */
	public static int searchRepeated(String searchrepeated, String searchrepeated1) {
		int meter = 0;
		String[] words = searchrepeated.split(" ");
		for (int s = 0; s < words.length; s++) {
			if (words[s].equalsIgnoreCase(searchrepeated1)) {
				meter += 1;
			}

		}
		return meter;
	}

	/**
	 * Método que sirve para contar la cantidad de minutos que faltan para las
	 * 23:59.
	 * 
	 * @param sCadena Cadena que recibe la hora.
	 * @return entero que indica la cantidad de minutos que faltan.
	 */
	public static int halfMinutes(String sCadena) {
		int sHourF = 23;
		int sMinF = 59;
		int sSubCadenaHour = Integer.parseInt(sCadena.substring(0, 2));
		int sSubCadenaMin = Integer.parseInt(sCadena.substring(3, 5));
		int hour = ((sHourF - sSubCadenaHour) * 60) + (sMinF - sSubCadenaMin);
		return hour;
	}

	/**
	 * Método que elimina los caracteres repetido de un String y solo deja uno de
	 * ellos.
	 * 
	 * @param chain Cadena de texto que se recibe.
	 * @return cadena de texto sin los caracteres que estan repetidos.
	 */
	public static String removeRepeats(String chain) {

		StringBuilder st = new StringBuilder();
		for (int i = 0; i < chain.length(); i++) {
			if (chain.indexOf(chain.charAt(i)) == i) {
				st.append(chain.charAt(i));
			}
		}
		return st.toString();
	}

	/**
	 * Método que sirve para saber los caracteres en común de dos cadenas String.
	 * 
	 * @param chainA cadena de texto uno.
	 * @param chainB cadena de texto dos.
	 * @return letras en común de las dos cadenas de texto.
	 */
	public static String intersection(String chainA, String chainB) {
		chainA = chainA.toLowerCase();
		chainB = chainB.toLowerCase();
		String common = "";

		for (int i = 0; i < chainA.length(); i++) {
			for (int j = 0; j < chainB.length(); j++) {
				if (chainA.charAt(i) == chainB.charAt(j)) {

					common += chainA.charAt(i) + " ";
					break;
				}

			}
		}
		return common;
	}

}
