package Exercícios_07_12_2023;

import java.util.Scanner;

public class exerc7 {

	public static void main(String[] args) {
		String nome;
		int codigo;
		float numero1, numero2, soma, subtracao, multiplicacao, divisao;
		Scanner ler = new Scanner(System.in);
	
		System.out.println("\nDigite o primeiro número:");
		numero1 = ler.nextFloat();
		System.out.println("\nDigite o segundo número:");
		numero2 = ler.nextFloat();
		System.out.println("\n\t\tCalculadora:");
		System.out.println("\n1- Soma");
		System.out.println("\n2- Subtração");
		System.out.println("\n3- Multiplicação");
		System.out.println("\n4- Divisão");
		System.out.println("\nDigite o Código da operação matemática :");
		codigo = ler.nextInt();
		
		switch (codigo) {
		case 1: 
			soma = (numero1+numero2);
			System.out.println("\nO resultado da soma dos números é: "+numero1+" + "+numero2+"= "+soma);
			break;
		case 2: 
			subtracao = (numero1-numero2);
			System.out.println("\nO resultado da subtração dos números é: "+numero1+" - "+numero2+"= "+subtracao);
			break;
		case 3: 
			multiplicacao = (numero1*numero2);
			System.out.println("\nO resultado da multiplicação dos números é: "+numero1+" * "+numero2+"= "+multiplicacao);
			break;
		case 4: 
			divisao = (numero1/numero2);
			System.out.println("\nO resultado da divisão dos números é: "+numero1+" / "+numero2+"= "+divisao);
			break;
			default:
			System.out.println("\nOpção Inválida!!!");
		}
		
		
	}

}