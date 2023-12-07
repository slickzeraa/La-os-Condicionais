package Exercícios_07_12_2023;
import java.util.Scanner;

public class exerc1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int a, b, c, res;
		
		System.out.println("\nDigite o número A:");
		a = leia.nextInt();
		System.out.println("\nDigite o número B:");
		b = leia.nextInt();
		System.out.println("\nDigite o número C:");
		c = leia.nextInt();

		if(a+b > c){
			System.out.println("\nA Soma de " + a+" + "+ b + " é Maior do que " + c);
		}else if(a+b < c){
			System.out.println("\nA Soma de " + a+" + " + b + " é Menor do que " + c);
		}else if(a+b == c){
			System.out.println("\nA Soma de " + a+" + " + b + " é igual a " + c);
		}
		
		
	}

}
