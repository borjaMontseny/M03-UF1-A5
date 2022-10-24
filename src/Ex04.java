import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Es vol fer un programa per a calcular les notes dels alumnes a l'assignatura
		 * d'M3.
		 * 
		 * Les dades que ens interessen són les notes de 3 activitats, la nota de
		 * l'examen, el nombre d'hores de la UF i el nombre de faltes injustificades de
		 * l'alumne.
		 */

		// Demani a l'usuari la nota de cadascuna de les tres activitats i de l'examen.

		System.out.print("Primera nota: ");
		Scanner sc = new Scanner(System.in);
		double nota1 = sc.nextDouble();

		System.out.print("Segona nota: ");
		double nota2 = sc.nextDouble();

		System.out.print("Tercera nota: ");
		double nota3 = sc.nextDouble();

		System.out.print("Nota de l'exàmen: ");
		double notaExamen = sc.nextDouble();

		// Demani el nombre d'hores de la UF i el nombre de faltes injustificades.

		System.out.print("Quantes hores té la Unitat Formativa? ");
		int horesUF = sc.nextInt();

		System.out.print("Quantes faltes injustificades? ");
		int faltesJustificades = sc.nextInt();

		/*
		 * Creeu una única expressió que digui si l'alumne aprova (alumneAprova).
		 * 
		 * Per aprovar l'assignatura s'ha de tenir menys d'un 10% de faltes
		 * injustificades, la nota mitjana de les pràctiques ha de ser superior o igual
		 * a 4, la nota de l'examen també. A més la nota final (60% de l'examen i 40% de
		 * les activitats) ha de ser igual o superior a 5.
		 */

		double mitjanaNotes = (nota1 + nota2 + nota3) / 3;

		double notaFinal = (notaExamen * 0.6) + (mitjanaNotes * 0.4);

		// Convalidació
		System.out.print("Tens l'assignatura convalidada? ");
		String preguntaConvalidada = sc.next();
		sc.close();
		boolean convalida = (preguntaConvalidada.charAt(0) == 'S') || (preguntaConvalidada.charAt(0) == 's');

		boolean alumneAprova = ((faltesJustificades < (horesUF * 0.1)) && (mitjanaNotes > 4) && (notaExamen > 4)
				&& (notaFinal >= 5)) || convalida;

		if (alumneAprova) {
			System.out.println("\nHas aprovat la Unitat Formativa");
		} else {
			System.out.println("\nHas suspes la Unitat Formativa");
		}
		
	}

}
