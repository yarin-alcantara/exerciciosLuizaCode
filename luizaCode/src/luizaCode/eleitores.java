package luizaCode;

import java.util.Scanner;

public class eleitores {
	
	//Escreva um algoritmo para ler o numero total de eleitores de um municipio, o numero de votos brancos,
	//nulos e válidos. Calcular e escrever  o percentual  que cada um representa em relação ao total
	//de eleitores.
	
	public static void main(String[] args) {
		
		int eleitores, vBrancos, vNulos, vValidos;
		float percentualVotos;
		
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Olá, digite o numero de eleitores: ");
			eleitores=ler.nextInt();
			System.out.println("Qual o número de votos válidos: ");
			vValidos=ler.nextInt();
			System.out.println("Qual o número de votos brancos: ");
			vBrancos=ler.nextInt();
			System.out.println("Qual o número de votos nulos: ");
			vNulos=ler.nextInt();
		}
		System.out.println();
		percentualVotos=(vValidos*100)/eleitores;
		System.out.println("A porcentagem de votos Válidos é de: "+percentualVotos+"%");
		percentualVotos=(vBrancos*100)/eleitores;
		System.out.println("A porcentagem de votos brancos é de: "+percentualVotos+"%");
		percentualVotos=(vNulos*100)/eleitores;
		System.out.println("A porcentagem de votos nulos é de: "+percentualVotos+"%");
		
		

	}

}
