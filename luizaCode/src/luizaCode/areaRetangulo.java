package luizaCode;

import java.util.Scanner;

public class areaRetangulo {

	public static void main(String[] args) {
	/*Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever
	 * a area do retângulo*/

		int base, altura, area;
		
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Vamos calcular a area de um retângulo!");
			System.out.println("Digite o valor da base: ");
			base=ler.nextInt();
			System.out.println("Digite o valor da altura: ");
			altura=ler.nextInt();
		}
		area=base*altura;
		System.out.println("O valor da area do retangulo é de: "+area);
	}	
}
