package luizaCode;

import java.util.Scanner;

public class primeiraAula {

	public static void main(String[] args) {
		
		double num1, num2, total;
		
		
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite o primeiro numero: ");
			num1= ler.nextInt();
			System.out.println("Digite o segundo numero: ");
			num2= ler.nextInt();
			
			total = num1/num2;
			
			System.out.println("O total é de: "+total);
			
		}

	}

}
