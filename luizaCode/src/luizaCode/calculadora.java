package luizaCode;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
			
		float num1,num2, resultado;
		int operacao;
		
		Scanner input= new Scanner(System.in);
		System.out.println("");
		System.out.println("Ol�! Digite dois n�meros e em seguida escolha uma opera��o que deseja realizar.\n");
		
		System.out.println("Digite o primeiro n�mero: ");
		num1=input.nextFloat();
		System.out.println("Digite o segundo n�mero: ");
		num2=input.nextFloat();
		
		System.out.println("Por favor, escolha e digite o n�mero da opera��o desejada: \n"
				+ "1- Somar, 2- Subtrair, 3- Multiplicar, 4- Dividir, 5-Resto da Divis�o");
		
		operacao=input.nextInt();
		
		if(operacao == 1) {
			resultado = num1+num2;
			System.out.println("O resultado da opera��o escolhida, 1- somar , � de: "+resultado);
		}else if(operacao == 2) {
			resultado = num1-num2;
			System.out.println("O resultado da opera��o escolhida, 2- subtrair , � de: "+resultado);
		}else if(operacao == 3) {
			resultado = num1*num2;
			System.out.println("O resultado da opera��o escolhida, 3- multiplicar , � de: "+resultado);
		}else if(operacao == 4) {
			resultado = num1/num2;
			System.out.println("O resultado da opera��o escolhida, 4- dividir , � de: "+resultado);
		}else if(operacao ==5) {
			resultado = num1%num2;
			System.out.println("O resultado da opera��o escolhida, 5- resto da divis�o , � de: "+resultado);
		}else {
			System.out.println("Voc� escolheu uma opera��o inv�lida. Escolha uma opera��o entre 1 a 5!!!!");
		}
	
	}

}
