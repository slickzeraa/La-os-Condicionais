package Exercícios_07_12_2023;

import java.util.Scanner;

public class exerc5 {

	public static void main(String[] args) {
		int item, qntd;
		float cq =10, xs=15, xb=18, bauru=12, refri=8, suco=13;
		Scanner ler = new Scanner(System.in);
	
		System.out.println("\n\t\tMenu de opções");
		System.out.println("\n1- Cachorro quente");
		System.out.println("\n2- X-Salada");
		System.out.println("\n3- X-Bacon");
		System.out.println("\n4- Bauru");
		System.out.println("\n5- Refrigerante");
		System.out.println("\n6- Suco de laranja");
		System.out.println("\nDigite a sua opção");
		item = ler.nextInt();
		
		switch (item) {
		case 1: 
			System.out.println("\nQuantos Cachorros quente?");
			qntd= ler.nextInt();
			System.out.println("\nProduto: Cachorro Quente"+"\nValor total: R$ "+ cq*qntd);
			break;
		case 2:
			System.out.println("\nQuantos X-Saladas?");
			qntd= ler.nextInt();
			System.out.println("\nProduto: X-Salada"+"\nValor total: R$ "+ xs*qntd);
			break;
		case 3:
			System.out.println("\nQuantos X-Bacons?");
			qntd= ler.nextInt();
			System.out.println("\nProduto: X-Bacon"+"\nValor total: R$ "+ xb*qntd);
			break;
		case 4:
			System.out.println("\nQuantos Baurus?");
			qntd= ler.nextInt();
			System.out.println("\nProduto: Bauru"+"\nValor total: R$ "+ bauru*qntd);
			break;
		case 5:
			System.out.println("\nQuantos Refrigerantes?");
			qntd= ler.nextInt();
			System.out.println("\nProduto: Refrigerante"+"\nValor total: R$ "+ refri*qntd);
			break;
		case 6:
			System.out.println("\nQuantos Sucos de laranja?");
			qntd= ler.nextInt();
			System.out.println("\nProduto: Suco de laranja"+"\nValor total: R$ "+ suco*qntd);
			break;
			default:
			System.out.println("\nOpção Inválida!!!");
		}
		
		
	}

}