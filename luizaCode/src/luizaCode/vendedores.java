package luizaCode;

import java.util.Scanner;

public class vendedores {
	 
	/*Uma revenderora de carros usados paga a seus funcion�rios vendedores um salario fixo por m�s, 
	 * mais uma comiss�o tamb�m fixa para cada carro vendido e mais 5% do valor das vendas  por ele
	 * efetuada. Escrever um algoritmo que leia o numero de carros por ele vendidos, o valor total de suas
	 * vendas, o salario fixo e o valor que ele recebe por carro vendido. Calcule e escreva o sal�rio final
	 * do vendedor.
	 */
	
	public static void main(String[] args) {
		
		
		float salFixo, vVendas, comiFixa, comiVenda, salFinal;
		int  carroVendido;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite seu sal�rio Fixo: ");
			salFixo=ler.nextFloat();
			System.out.println("Me diga a quantidade de carros que vendeu esse m�s: ");
			carroVendido=ler.nextInt();
			System.out.println("Me diga a valor de suas vendas desse m�s: ");
			vVendas=ler.nextFloat();
		}
		comiFixa=100;
		comiVenda=0.05f;
		
		salFinal=salFixo+(carroVendido*comiFixa)+(carroVendido*(vVendas*comiVenda));
		System.out.println();
		System.out.printf("Seu sal�rio final � de: "+salFinal+" reais");
		

	}

}
