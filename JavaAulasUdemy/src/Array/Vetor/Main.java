package Array.Vetor;

import java.util.Locale;
import java.util.Scanner;

import Array.Vetor.entities.Reserva;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Reserva[] vect  = new Reserva[10];
		System.out.println("Quantidade de Reservas:");
		int studants = sc.nextInt();
		for (int i = 0; i < studants; i++) {
			System.out.println("Reserva: #"+ i +":");
			sc.nextLine();
			System.out.println("Nome do Cliente:");
			String nameCliente = sc.nextLine();
			System.out.println("Email do Cliente:");
			String emailCliente = sc.nextLine();
			System.out.println("Número do quarto:");
			int roomHotel = sc.nextInt();
			vect[roomHotel] = new Reserva(nameCliente, emailCliente, roomHotel);
		}
		System.out.println("");
		System.out.println("Quartos alugados:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println();
				System.out.printf("Quarto #%d\n",i);
				System.out.println(vect[i]);
			} else {
				System.out.println();
				System.out.printf("Quarto #%d\n", i);
				System.out.println("Quarto vázio.");
			}
		}
		sc.close();
	}
}
