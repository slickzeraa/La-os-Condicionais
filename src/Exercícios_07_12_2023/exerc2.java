package Exercícios_07_12_2023;

import java.util.Scanner;

public class exerc2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n;
		
		System.out.println("\nDigite um número inteiro :");
		n = leia.nextInt();
		
		if( (n  % 2) == 0 && n >=0){
			System.out.println("\nO Número " + n +" é par e positivo.");
		}else if( (n  % 2) !=0 && n <0 ) {
			System.out.println("\nO Número " + n +" é impar e negativo.");
		}else if( (n  % 2) == 0 && n <0){
			System.out.println("\nO Número " + n +" é par e negativo.");
		}else {
			System.out.println("\nO Número " + n +" é impar e positivo.");
		}

	}

}
