package luizaCode;

import java.util.Scanner;

public class carroCusto {

	public static void main(String[] args) throws InterruptedException {
		
		float carroFabrica, percentual, impostos, carroPreco;
		
		percentual = 28;
		impostos = 45;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Ol�, vamos calcular o pre�o final do carro!");
			Thread.sleep(3000);
			System.out.println("Me diga o valor de custo de f�brica do carro: ");
			carroFabrica=ler.nextFloat();
		}
		carroPreco=carroFabrica+(carroFabrica*((percentual/100)+(impostos/100)));
		
		System.out.println("O pre�o do carro para o consumidor ser� de: "+carroPreco);
		
	}

}
