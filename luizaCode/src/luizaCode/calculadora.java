package luizaCode;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
			
		float num1,num2, resultado;
		int operacao;
		
		Scanner input= new Scanner(System.in);
		System.out.println("");
		System.out.println("Olá! Digite dois números e em seguida escolha uma operação que deseja realizar.\n");
		
		System.out.println("Digite o primeiro número: ");
		num1=input.nextFloat();
		System.out.println("Digite o segundo número: ");
		num2=input.nextFloat();
		
		System.out.println("Por favor, escolha e digite o número da operação desejada: \n"
				+ "1- Somar, 2- Subtrair, 3- Multiplicar, 4- Dividir, 5-Resto da Divisão");
		
		operacao=input.nextInt();
		
		if(operacao == 1) {
			resultado = num1+num2;
			System.out.println("O resultado da operação escolhida, 1- somar , é de: "+resultado);
		}else if(operacao == 2) {
			resultado = num1-num2;
			System.out.println("O resultado da operação escolhida, 2- subtrair , é de: "+resultado);
		}else if(operacao == 3) {
			resultado = num1*num2;
			System.out.println("O resultado da operação escolhida, 3- multiplicar , é de: "+resultado);
		}else if(operacao == 4) {
			resultado = num1/num2;
			System.out.println("O resultado da operação escolhida, 4- dividir , é de: "+resultado);
		}else if(operacao ==5) {
			resultado = num1%num2;
			System.out.println("O resultado da operação escolhida, 5- resto da divisão , é de: "+resultado);
		}else {
			System.out.println("Você escolheu uma operação inválida. Escolha uma operação entre 1 a 5!!!!");
		}
	
	}

}
