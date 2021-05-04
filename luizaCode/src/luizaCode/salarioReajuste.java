package luizaCode;

import java.util.Scanner;

public class salarioReajuste {

	public static void main(String[] args) {
		
		
		float sal, p, salTotal;
		
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Calculadora de reajuste salarial!");
			System.out.println("Me diga o salário: ");
			sal=ler.nextFloat();
			System.out.println("Me diga a porcentagem: ");
			p=ler.nextFloat();
		}
		salTotal=sal+(sal*p/100);
		System.out.println("O salario reajustado é de: "+salTotal);

	}

}
