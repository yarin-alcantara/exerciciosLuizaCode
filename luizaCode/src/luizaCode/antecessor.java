package luizaCode;

import java.util.Scanner;

public class antecessor {
     /*Escreva um algoritmo  para ler um valor e escrever o seu antecessor*/
	
	public static void main(String[] args) {
		
		int num;

		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite um numero: ");
			num=ler.nextInt();
		}
		num--;
		System.out.println("O numero antecessor é: "+num--);
	}

}
