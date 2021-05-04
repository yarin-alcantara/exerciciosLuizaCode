package luizaCode;

import java.util.Scanner;

public class anosEmDias {

	public static void main(String[] args) {
	   
		int anos, meses, dias, diasTotal;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Me diga sua idade em anos, meses em dias!");
			System.out.println("Quantos anos: ");
			anos=ler.nextInt();
			System.out.println("Quantos meses: ");
			meses=ler.nextInt();
			System.out.println("Quantos dias: ");
			dias=ler.nextInt();
		}
		diasTotal=(anos*365)+(meses*30)+dias;
		
		System.out.println("O total de dias é: "+diasTotal);

	}

}
