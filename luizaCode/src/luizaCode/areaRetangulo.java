package luizaCode;

import java.util.Scanner;

public class areaRetangulo {

	public static void main(String[] args) {
	/*Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e escrever
	 * a area do ret�ngulo*/

		int base, altura, area;
		
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Vamos calcular a area de um ret�ngulo!");
			System.out.println("Digite o valor da base: ");
			base=ler.nextInt();
			System.out.println("Digite o valor da altura: ");
			altura=ler.nextInt();
		}
		area=base*altura;
		System.out.println("O valor da area do retangulo � de: "+area);
	}	
}
