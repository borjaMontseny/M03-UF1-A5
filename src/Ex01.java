import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Edad: ");
		Scanner sc = new Scanner(System.in);
		int edad = sc.nextInt();

		boolean esMayorDeEdad = edad >= 18;

		if (esMayorDeEdad) {
			System.out.println("Puedes entrar");
		} else {
			System.out.println("No puedes entrar");
		}

	}

}
