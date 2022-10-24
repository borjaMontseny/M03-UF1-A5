import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Demana a l'usuari si és estudiant o no
		System.out.println("Ets estudiant? ");
		Scanner sc = new Scanner(System.in);
		String preguntaEstudiant = sc.next();

		// Si ens ha dit que si/Si/SI, ho guardem en un booleà
		boolean esEstudiant = (preguntaEstudiant.charAt(0) == 'S') || (preguntaEstudiant.charAt(0) == 's');

		// Comprovem edat i ho guardem
		System.out.print("Edat: ");
		int edad = sc.nextInt();
		boolean major25 = edad >= 25;

		// Demana a l'usuari si és professor o no i en cas de ser professor demana si va
		// amb el grup classe o no. A més a més en qualsevol dels casos ha de demanar
		// l'edat que té l'usuari.

		// Preguntem si és professor
		if (!esEstudiant) {
			System.out.print("Ets professor? ");
			String preguntaProfessor = sc.next();
			boolean esProfessor = (preguntaProfessor.charAt(0) == 'S') || (preguntaProfessor.charAt(0) == 's');

		}
		sc.close();

		/*
		 * Crea una expressió a partir de les condicions d'entrada gratuïta al museu i
		 * desa-la en una variable booleana anomenada potEntrarSensePagar.
		 */

		boolean potEntrarSensePagar = (esEstudiant && !major25);

		/*
		 * Crea una estructura de control condicional utilitzant la variable booleana
		 * potEntrarSensePagar i fes que en la part de l'if digui a l'usuari que no pot
		 * entrar i en la part de l'else digui a l'usuari que sí que pot entrar.
		 */

		if (!potEntrarSensePagar) {
			System.out.println("El preu de la entrada són 10€. Benvingut");

		} else if (potEntrarSensePagar) {
			System.out.println("Entrada gratuïta. Benvingut");
		}

	}

}
