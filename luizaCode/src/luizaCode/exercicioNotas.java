package luizaCode;

import java.util.Scanner;

public class exercicioNotas {

	public static void main(String[] args) {
		
		double n1, n2, n3, media;
		int falta;
		String nome;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Ol�, bem vindo!");
			System.out.println("Digite o nome do aluno: ");
			nome=ler.next();
			System.out.println("Digite a nota da primeira prova: ");
			n1=ler.nextDouble();
			System.out.println("Digite a nota da segunda prova: ");
			n2=ler.nextDouble();
			System.out.println("Digite a nota da terceira prova: ");
			n3=ler.nextDouble();
			System.out.println("Digite a porcentagem de faltas: ");
			falta=ler.nextInt();
		}
		media = (n1+n2+n3)/3;
		
		if(media >= 7 && falta <=25) {
			System.out.printf("Parab�ns, "+nome+", foi aprovado(a) com m�dia: %2.1f ",media);
		}else if (media < 7 && falta <=25) {
			System.out.printf(nome+" ,voc� foi reprovado(a)! Sua m�dia foi: %2.1f ",media);
		}else if (media >=7 && falta >25) {
			System.out.printf(nome+" ,voc� foi reprovado(a) por falta!!");
		}else {
			System.out.printf(nome+" ,voc� foi reprovado(a) por falta!!");
		}
	}
}
