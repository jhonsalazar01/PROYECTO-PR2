package Vista;

import java.util.Scanner;

import Logic.dataTreatment;

/**
 * @author Dilan Bohórquez
 * @author Andres Sanabria
 * @author Jhon Salazar
 * @version 1.0
 */
public class Menu {
	/**
	 * Método que sirve para detener momentaneamente el programa para darle una
	 * mejor interaccion entre cada método.
	 */
	public static void timer() {

		try {
			Thread.sleep(1800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método en el cual están contenidos todos los métodos mediante un switch el
	 * cual permite manejar en menú.
	 */
	public static void console() {

		Scanner sc = new Scanner(System.in);

		int opc = 1;
		while (opc == 1) {

			System.out.println("\n" + "\t:::::::::::::::::::\n" + "\t::     Menú      ::\n" + "\t:::::::::::::::::::"
					+ "\n\nSeleccione una de las siguientes opciones: \n");

			System.out.println("1.Convertir en nombre Propio el contenido de una cadena\n"
					+ "2.Buscar cadena de caracteres\n" + "3.Contar Vocales\n" + "4.Año nuevo\n"
					+ "5.Llenar caracteres\n" + "6.Borrar caracteres\n" + "7.Intersección\n" + "8.Eliminar repetidos\n"
					+ "9.Contar Palabras\n" + "10.Validar dirección de correo electrónico\n" + "11.Salir\n");

			System.out.println("Digite la opción");
			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {

			case 1:
				System.out.println("1.Convertir en nombre Propio el contenido de una cadena\n");
				System.out.println("Ingrese la cadena de caracteres ");
				System.out.println(
						"La cadena convertida a nombre propio es:\n" + dataTreatment.ownName(sc.nextLine() + ""));
				timer();
				break;

			case 2:
				System.out.println("2.Buscar cadena de caracteres\n");
				System.out.println("Ingrese la cadena de caracteres \n");
				String searchrepeated = sc.nextLine();
				System.out.println("Cadena a buscar \n");
				String searchrepeated1 = sc.nextLine();
				System.out.println("La palabra a buscar en la cadena esta "
						+ dataTreatment.searchRepeated(searchrepeated, searchrepeated1) + " veces");
				timer();
				break;

			case 3:
				System.out.println("3.Contar Vocales\n");
				System.out.println("Ingrese la cadena de texto");
				String word = sc.nextLine();
				System.out.println("La cantidad de vocales que tiene la cadena de texto es de "
						+ dataTreatment.countVowels(word) + " vocales");
				timer();

				break;

			case 4:
				System.out.println("4.Año nuevo\n");
				System.out.println("Ingrese la hora para calcular lo que resta en el formato 00:00-->23:59");
				String sCadena = sc.nextLine();
				System.out.println("La cantidad de minutos que faltan es para las 23:59 es de "
						+ dataTreatment.halfMinutes(sCadena) + " minutos");
				timer();
				break;

			case 5:
				System.out.println("5.Llenar caracteres\n");
				System.out.println("Ingrese la cadena de texto");
				String msj = sc.nextLine();
				System.out.println("Ingrese el caracter a añadir");
				char car = sc.next().charAt(0);
				System.out.println("Ingrese la cantidad de repeticiones del caracter");
				int numrepe = sc.nextInt();
				System.out.println("Por donde desea agregar el caracter derecha o izquierda\n1.Derecha\n2.Izquierda");
				int orientation = sc.nextInt();
				System.out.println("La cadena ingresada con los datos adicionales es:\n"
						+ dataTreatment.fillCharacters(msj, car, numrepe, orientation));

				timer();
				sc.nextLine();
				break;

			case 6:
				System.out.println("6.Borrar caracteres\n");
				System.out.println("Ingrese la cadena de Texto");
				String MyString = sc.nextLine();

				System.out.println("Ingrese el caracter a borrar");
				String word6 = sc.nextLine();

				System.out.println(
						"La cadena ingresada sin el caracter específico es: \n" + dataTreatment.erase(word6, MyString));
				timer();
				sc.nextLine();
				break;

			case 7:
				System.out.println("7.Intersección\n");
				System.out.println("Ingese la cadena de texto 1");
				String wordA = sc.nextLine();
				System.out.println("Ingrese la cadena de texto 2");
				String wordB = sc.nextLine();
				System.out.println("Los caracteres en común son:" + dataTreatment.intersection(wordA, wordB));
				timer();
				sc.nextLine();
				break;

			case 8:
				System.out.println("8.Eliminar repetidos\n");
				System.out.println("Ingrese la cadena \n");
				System.out.println("La cadena ingresada sin caracteres repetidos es:\n"
						+ dataTreatment.removeRepeats(sc.nextLine()));
				timer();

				break;

			case 9:
				System.out.println("9.Contar Palabras\n");
				String asd = sc.nextLine();
				System.out.println(
						"La cadena de caracteres ingresada tiene " + dataTreatment.countWords(asd) + " palabras");
				timer();

				break;

			case 10:
				System.out.println("10.Validar dirección de correo electrónico\n");

				if (dataTreatment.validateEmail(sc.nextLine())) {
					System.out.println("El email es válido");
				} else {
					System.out.println("El email es invalido");
				}
				timer();

				break;

			case 11:
				System.out.println("El programa ha Finalizado");
				System.exit(0);
				break;
			}

		}

	}
}
