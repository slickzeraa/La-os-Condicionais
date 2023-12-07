package Exercícios_07_12_2023;

import java.util.Scanner;

public class exerc6 {

	public static void main(String[] args) {
		String nome;
		int cargo;
		float salario, salarioNovo;
		Scanner ler = new Scanner(System.in);
	
		System.out.println("\nNome do colaborador?");
		nome = ler.nextLine();
		System.out.println("\n\t\tCargos:");
		System.out.println("\n1- Gerente");
		System.out.println("\n2- Vendedor");
		System.out.println("\n3- Supervisor");
		System.out.println("\n4- Motorista");
		System.out.println("\n5- Estoquista");
		System.out.println("\n6- Técnico de TI");
		System.out.println("\nDigite o seu cargo:");
		cargo = ler.nextInt();
		System.out.println("\nQual o seu salário atual?");
		salario = ler.nextFloat();
		
		switch (cargo) {
		case 1: 
			salarioNovo = (salario+(salario*10/100));
			System.out.println("\nNome do colaborador: "+nome+"\nCargo: Gerente "+ "\nNovo salário: R$ "+salarioNovo);
			break;
		case 2: 
			salarioNovo = (salario+(salario*7/100));
			System.out.println("\nNome do colaborador: "+nome+"\nCargo: Vendedor "+ "\nNovo salário: R$ "+salarioNovo);
			break;
		case 3: 
			salarioNovo = (salario+(salario*9/100));
			System.out.println("\nNome do colaborador: "+nome+"\nCargo: Supervisor "+ "\nNovo salário: R$ "+salarioNovo);
			break;
		case 4: 
			salarioNovo = (salario+(salario*6/100));
			System.out.println("\nNome do colaborador: "+nome+"\nCargo: Motorista "+ "\nNovo salário: R$ "+salarioNovo);
			break;
		case 5: 
			salarioNovo = (salario+(salario*5/100));
			System.out.println("\nNome do colaborador: "+nome+"\nCargo: Estoquista "+ "\nNovo salário: R$ "+salarioNovo);
			break;
		case 6: 
			salarioNovo = (salario+(salario*8/100));
			System.out.println("\nNome do colaborador: "+nome+"\nCargo: Técnico de TI "+ "\nNovo salário: R$ "+salarioNovo);
			break;
			default:
			System.out.println("\nOpção Inválida!!!");
		}
		
		
	}

}