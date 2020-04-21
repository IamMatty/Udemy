package Array.exercice01;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);
	 
	 int numero = sc.nextInt();
	 double[] vetor = new double[numero];
	 
	 for (int i = 0; i < numero; i++) {
		 vetor[i] = sc.nextDouble();
	 }
	 
	 double sum = 0.0;
	 for (int i = 0; i < numero; i++) {
		sum += vetor[i];
	}
	 
	double total = sum / numero;
	System.out.printf("Total: %.2f%n"+total);
	 
	 sc.close();
	}

}
