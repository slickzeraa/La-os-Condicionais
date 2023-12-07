package Exercícios_07_12_2023;

import java.util.Scanner;

public class exerc3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade;
		boolean pDoacao;

		System.out.println("\nNome do doador?");
		nome = leia.nextLine();
		System.out.println("\nQual sua idade?");
		idade = leia.nextInt();
		System.out.println("\nÉ sua primeira doação? (true/false): ");
		pDoacao = leia.nextBoolean();
		
		if(idade >=18 && idade <=59) {
			System.out.println("\n"+ nome + " está apta para doar sangue!");
		}else if (idade >=60 && idade <=69 && pDoacao == false) {
			System.out.println("\n"+ nome + " está apta para doar sangue!");
		}else {
			System.out.println("\n"+ nome + " não está apta para doar sangue!");
		}
	}

}
