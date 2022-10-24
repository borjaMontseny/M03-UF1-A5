import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Hora: ");
		Scanner sc = new Scanner(System.in);
		int hora = sc.nextInt();

		System.out.print("Temperatura: ");
		int temperatura = sc.nextInt();

		System.out.print("Litres de Pluja: ");
		double litresPluja = sc.nextDouble();

		sc.close();

		boolean bonDia = (temperatura > 20) && (litresPluja < 2);

		boolean estaBe = !(hora > 22) || (temperatura < 5);

		boolean sortirBici = ((hora < 21) || (litresPluja < 0.5)) && (temperatura >= 20);

		System.out.println("\nFa bon dia = " + bonDia);
		System.out.println("Es pot sortir = " + estaBe);
		System.out.println("Es pot sortir en bici = " + sortirBici);

	}

}
