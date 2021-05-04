package bancoLuizaCode;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class Banco {

	public static void main(String[] args) throws Exception {
		
		String nomeTitular;
		long cpf;
		int numConta;
		int numAgencia;
		int operacao;
		BigDecimal saque;
		BigDecimal deposito;
		
		
		Scanner input = new Scanner(System.in);
		
		
		Date data = new Date();
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		
		System.out.println("------ BEM VINDO(A) AO BANCO CODE ------");
		Thread.sleep(1000);
		System.out.println();
		System.out.println(" "+f.format(data)+" \n");
		Thread.sleep(1000);
		
		System.out.print("Digite seu nome: ");
		nomeTitular=input.next();
		Thread.sleep(1000);
		System.out.print("Digite seu CPF: ");
		cpf=input.nextLong();
		Thread.sleep(1000);
		System.out.print("Informe o numero da conta: ");
		numConta = input.nextInt();
		Thread.sleep(1000);
		System.out.print("Informe o numero da sua agência: ");
		numAgencia=input.nextInt();
	
		
		
		Cliente cliente = new Cliente(nomeTitular, cpf);
		Conta conta = new Conta(cliente, numConta, numAgencia);
		
		do {
		System.out.println("");	
		System.out.printf("Bem vindo(a) %s a sua conta de nº %d-%d \n", conta.getTitular().nome, conta.getNumConta(), conta.getAgencia());
		System.out.println("Qual operação deseja fazer? Digite o número da opção desejada: \n");
		System.out.println("1 - Sacar, 2 - Depositar, 3 - Consultar Saldo, 0 - Sair ");
		System.out.println("");
		operacao=input.nextInt();
		if (operacao < 0 || operacao > 3) {
			System.out.println("Erro! Digite uma opção valida! ");
		}
		
			
		if(operacao == 1){
			System.out.println("Digite o valor que deseja sacar: ");
			saque=input.nextBigDecimal();
			conta.sacar(saque);
			System.out.printf("Você sacou R$ %s \n", saque);
			
		}else if(operacao == 2) {
			System.out.println("Digite o valor que deseja depositar: ");
			deposito=input.nextBigDecimal();
			conta.depositar(deposito);
			System.out.printf("Você depositou R$ %s \n",deposito);
			System.out.printf("Seu saldo é de: R$ %s \n ", conta.getSaldoConta());
			
		}else if(operacao == 3) {
			System.out.printf("Seu saldo é de: %s \n", conta.getSaldoConta());
			
		}else {
			System.out.println();
		}
		
		}while(operacao != 0);
		
		System.out.println("Obrigada por utilizar o Banco Code, até a próxima!");
	}
	
}
