package Exercícios_07_12_2023;

import java.util.Scanner;

public class exerc8 {

	public static void main(String[] args) {
		int codigo;
		float saldo=1000.00f, saque, deposito;
		Scanner ler = new Scanner(System.in);
	
	
		System.out.println("\n\t\tOperações Bancárias:");
		System.out.println("\n1- Saldo");
		System.out.println("\n2- Saque");
		System.out.println("\n3- Depósito");
		System.out.println("\nDigite o Código da operação báncaria :");
		codigo = ler.nextInt();
		
		switch (codigo) {
		case 1: 
			System.out.println("\nOperação - Saldo"+"\nSaldo: R$ "+ saldo);
			break;
		case 2: 
			System.out.println("\nInforme o valor a ser sacado:");	
			saque = ler.nextFloat();
			if(saque>saldo){
				System.out.println("\nOperação - Saque"+"\nSaldo Insuficiente!");	
			}else {
				System.out.println("\nOperação - Saque"+"\nNovo saldo: R$ "+(saldo-saque));	
			}
			break;
		case 3: 
			System.out.println("\nInforme o valor a ser depositado:");	
			deposito = ler.nextFloat();
			System.out.println("\nOperação - Depósito"+"\nNovo saldo: R$ "+(saldo+deposito));	
			break;
			default:
			System.out.println("\nOeração Inválida!!!");
			}
	
		}
		
		
	}

