package luizaCode;

import java.util.Scanner;

public class eleitores {
	
	//Escreva um algoritmo para ler o numero total de eleitores de um municipio, o numero de votos brancos,
	//nulos e v�lidos. Calcular e escrever  o percentual  que cada um representa em rela��o ao total
	//de eleitores.
	
	public static void main(String[] args) {
		
		int eleitores, vBrancos, vNulos, vValidos;
		float percentualVotos;
		
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Ol�, digite o numero de eleitores: ");
			eleitores=ler.nextInt();
			System.out.println("Qual o n�mero de votos v�lidos: ");
			vValidos=ler.nextInt();
			System.out.println("Qual o n�mero de votos brancos: ");
			vBrancos=ler.nextInt();
			System.out.println("Qual o n�mero de votos nulos: ");
			vNulos=ler.nextInt();
		}
		System.out.println();
		percentualVotos=(vValidos*100)/eleitores;
		System.out.println("A porcentagem de votos V�lidos � de: "+percentualVotos+"%");
		percentualVotos=(vBrancos*100)/eleitores;
		System.out.println("A porcentagem de votos brancos � de: "+percentualVotos+"%");
		percentualVotos=(vNulos*100)/eleitores;
		System.out.println("A porcentagem de votos nulos � de: "+percentualVotos+"%");
		
		

	}

}
