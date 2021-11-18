package Vista;

import java.util.Scanner;

import Logic.dataTreatment;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opc = 1;
		while (opc == 1) {
			System.out.println("\n" + "\t:::::::::::::::::::\n" + "\t::     Men�      ::\n" + "\t:::::::::::::::::::"
					+ "\n\nSeleccione una de las siguientes opciones: \n");

			System.out.println("1.Convertir en nombre Propio el contenido de una cadena\n"
					+ "2.Buscar cadena de caracteres\n" + "3.Contar Vocales\n" + "4.A�o nuevo\n"
					+ "5.Llenar caracteres\n" + "6.Borrar caracteres\n" + "7.Intersecci�n\n" + "8.Eliminar repetidos\n"
					+ "9.Contar Palabras\n" + "10.Validar direcci�n de correo electr�nico\n" + "11.Salir\n");

			System.out.println("Digite la opci�n");
			int menu = Integer.parseInt(sc.nextLine());
		
			switch (menu) {

			// Convertir en nombre Propio el contenido de una cadena
			case 1:
				System.out.println("1.Convertir en nombre Propio el contenido de una cadena\n");
				System.out.println("Ingrese la cadena de caracteres ");
				System.out.println(dataTreatment.ownName(sc.nextLine() + "\n\nEspere....."));
				try {
					Thread.sleep(3500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			// Buscar cadena de caracteres
			case 2:
				System.out.println("2.Buscar cadena de caracteres\n");
				break;

			// Contar Vocales
			case 3:
				System.out.println("3.Contar Vocales\n");
				System.out.println("Ingrese la cadena de texto");
				String word = sc.nextLine();
				System.out.println(dataTreatment.countVowels(word));

				// A�o nuevo
			case 4:
				System.out.println("4.A�o nuevo\n");
				break;

			// Llenar caracteres
			case 5:
				System.out.println("5.Llenar caracteres\n");
				System.out.println("Ingrese la cadena de texto");
				String msj = sc.nextLine();
				System.out.println("Ingrese el caracter a a�adir");
				char car = sc.next().charAt(0);
				System.out.println("Ingrese la cantidad de repeticiones del caracter");
				int numrepe = sc.nextInt();
				System.out.println("Por donde desea agregar el caracter derecha o izquierda\n1.Derecha\n2.Izquierda");
				int orientation = sc.nextInt();
				System.out.println(dataTreatment.llenarCaracteres(msj, car, numrepe, orientation));
				// orientation)
				break;
			// Borrar caracteres
			case 6:
				System.out.println("6.Borrar caracteres\n");
				System.out.println("Ingrese la cadena de Texto");
				String MyString = sc.nextLine();

				System.out.println("Ingrese el caracter a borrar");
				String word6 = sc.nextLine();

				System.out.println(dataTreatment.erase(word6, MyString));

				break;
			// Intersecci�n
			case 7:
				System.out.println("7.Intersecci�n\n");
				break;
			// Eliminar repetidos
			case 8:
				System.out.println("8.Eliminar repetidos\n");
				System.out.println(dataTreatment.removeRepeats(sc.nextLine(), sc.next()));
				break;
			// Contar Palabras
			case 9:
				System.out.println("9.Contar Palabras\n");
				String asd = sc.nextLine();
				System.out.println(dataTreatment.countWords(asd));
				;
				break;
			// Validar direcci�n de correo electr�nico
			case 10:
				System.out.println("10.Validar direcci�n de correo electr�nico\n");
				break;
			// Salir
			case 11:
				System.exit(0);
				break;
			}
			System.out.println("\n" + "\t::::::::::::::::::::::::\n" + "\t::  �Desea continuar? ::\n"
					+ "\t::::::::::::::::::::::::"
					+ "\n\nSeleccione una de las siguientes opciones: \n\n1.Repetir Men�\n2.Salir\n");
			opc = sc.nextInt();
		}
	}

}
